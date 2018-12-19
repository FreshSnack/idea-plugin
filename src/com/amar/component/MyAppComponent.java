package com.amar.component;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ApplicationComponent;
import org.jetbrains.annotations.NotNull;

/**
 * @author dingmx
 * @date 2018/12/20 00:01
 */
public class MyAppComponent implements ApplicationComponent {
    private DepAppComponent depAppComponent;

    public MyAppComponent(DepAppComponent depAppComponent) {
        super();
        this.depAppComponent = ApplicationManager.getApplication().getComponent(DepAppComponent.class);
        System.out.println(this.depAppComponent.getComponentName());
    }

    @Override
    public void initComponent() {
        System.out.println("myAppComponent init..");
    }

    @Override
    public void disposeComponent() {
        System.out.println("myAppComponent dispose..");
    }

    @NotNull
    @Override
    public String getComponentName() {
        return this.getClass().getName();
    }
}
