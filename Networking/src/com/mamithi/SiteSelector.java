package com.mamithi;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.applet.AppletContext;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class SiteSelector extends JApplet {
    private HashMap< String , URL> sites;
    private ArrayList< String > siteNames;
    private JList siteChooser;

    public void init(){
        sites = new HashMap<String, URL>();
        siteNames = new ArrayList< String >();

        getSitesFromHTMLParameters();

        add(new JLabel("Choose a site to browse"), BorderLayout.NORTH);

        siteChooser = new JList(siteNames.toArray());
        siteChooser.addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        Object object = siteChooser.getSelectedValue();

                        URL newDocument = sites.get(object);

                        AppletContext browser = getAppletContext();

                        browser.showDocument(newDocument);
                    }
                }
        );

        add(new JScrollPane(siteChooser), BorderLayout.CENTER);
    }

    private void getSitesFromHTMLParameters(){
        String title;
        String location;
        URL url;
        int counter = 0;

        title = getParameter("title" + counter);

        while(title != null){
            location = getParameter("location" + counter);

            try {
                url = new URL(location);
                sites.put(title, url);
                siteNames.add(title);
            } catch (MalformedURLException urlException){
                urlException.printStackTrace();
            }

            ++counter;
            title = getParameter("title" + counter);
        }
    }
}
