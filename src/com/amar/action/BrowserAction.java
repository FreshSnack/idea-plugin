package com.amar.action;

import com.amar.icon.IconManager;
import com.amar.service.BrowserService;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.util.IconLoader;
import com.sun.javafx.application.PlatformImpl;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: mxding
 * @Date: 2018-12-27 16:17
 */
public class BrowserAction extends AnAction {

    public BrowserAction() { super(IconManager.BROWSER); }

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        SwingUtilities.invokeLater(()->{
            JFrame frame = new JFrame("JavaFX in Swing");
            JFXPanel jfxPanel = new JFXPanel();
            frame.setLayout(new BorderLayout());
            frame.add(jfxPanel, BorderLayout.CENTER);
            /*PlatformImpl.startup(()->{

            });*/
            Platform.runLater(()->{
                BrowserService browserService = ServiceManager.getService(e.getProject(), BrowserService.class);
                WebView webView = new WebView();//browserService.getWebView();
                Scene scene = new Scene(webView);
                WebEngine webEngine = webView.getEngine();
                webEngine.load("http://172.28.1.2:8087/rxtool/login");
                jfxPanel.setScene(scene);
            });
            frame.setLocationRelativeTo(null);
            frame.setSize(1000,800);
            frame.setVisible(true);
        });
    }
}
