package com.info.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class Listener
 *
 */
@WebListener
public class Listener implements ServletContextListener {


    public void contextDestroyed(ServletContextEvent arg0) 
    { 
    	System.out.println("End kjshdjl;alskksal;l");        
    }

    public void contextInitialized(ServletContextEvent arg0) 
    { 
     
    System.out.println("Start gahdjsaujdokasjspasa");  
    }
}
