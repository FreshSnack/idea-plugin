package com.amar.component;

import com.amar.service.CounterService;
import com.intellij.openapi.components.ProjectComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

/**
 * @author dingmx
 * @date 2018/12/19 22:17
 */
public class MyProjectComponent implements ProjectComponent {

    @Override
    public void projectOpened() {
        CounterService commandCounter = ServiceManager.getService(CounterService.class);
        System.out.println("[counterService]" + commandCounter.hashCode());
        if (commandCounter.increaseCounter() == -1) {
            StringBuilder sb = (new StringBuilder()).append("The maximum number of opened projects exceeds ");
            Messages.showMessageDialog(sb.append(String.valueOf(3)).append(" projects!").toString(), "Error", Messages.getErrorIcon());
            ProjectManager pm = ProjectManager.getInstance();
            Project[] allProjects = pm.getOpenProjects();
            Project project = allProjects[allProjects.length - 1];
            pm.closeProject(project);
        }
    }

    @Override
    public void projectClosed() {
        CounterService commandCounter = ServiceManager.getService(CounterService.class);
        System.out.println("[counterService]" + commandCounter.hashCode());
        commandCounter.decreaseCounter();
    }

    @Override
    public void initComponent() {
        System.out.println("[projectComponent]" + this.hashCode());
        System.out.println("myProjectComponent initialize..");
    }

    @Override
    public void disposeComponent() {
        System.out.println("[projectComponent]" + this.hashCode());
        System.out.println("myProjectComponent dispose..");
    }

    @NotNull
    @Override
    public String getComponentName() {
        return this.getClass().getName();
    }
}
