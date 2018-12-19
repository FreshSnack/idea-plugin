package com.amar.component;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author dingmx
 * @date 2018/12/20 00:04
 */
@State(name = "demo", storages = { @Storage(value = "demo.xml") })
public class DepAppComponent implements ApplicationComponent, PersistentStateComponent {
    @Override
    public void initComponent() {
        System.out.println("depAppComponent init..");
    }

    @Override
    public void disposeComponent() {
        System.out.println("depAppComponent dispose..");
    }

    @NotNull
    @Override
    public String getComponentName() {
        return this.getClass().getName();
    }

    @Nullable
    @Override
    public Object getState() {
        return null;
    }

    @Override
    public void loadState(@NotNull Object o) {

    }
}
