package com.amar.icon;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

/**
 * @Author: mxding
 * @Date: 2018-12-29 15:52
 */
public class IconManager {

    public static final String ICON_PATH = "/icons/";// 图标路径

    public static Icon BROWSER = IconManager.getIcon("browser.png");

    /**
     * 根据icon name获取图标
     * @param iconName
     * @return
     */
    public static Icon getIcon(String iconName) { return IconLoader.getIcon(ICON_PATH + iconName); }

}
