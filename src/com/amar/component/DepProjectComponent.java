package com.amar.component;

import com.intellij.openapi.components.ProjectComponent;
import org.jetbrains.annotations.NotNull;

/**
 * @author dingmx
 * @date 2018/12/20 00:21
 */
public class DepProjectComponent implements ProjectComponent {
    @Override
    public void initComponent() {
        System.out.println("depProjectComponent initialize..");
    }

    @Override
    public void disposeComponent() {
        System.out.println("depProjectComponent dispose..");
    }

    @NotNull
    @Override
    public String getComponentName() {
        return this.getClass().getName();
    }
}
