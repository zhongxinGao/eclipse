package com.listener;


import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class Mylistener
 *
 */

public class Mylistener implements HttpSessionListener {
	private static long onlineNumber = 1;
    /**
     * Default constructor. 
     */
    public Mylistener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
    	onlineNumber += 1;
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	onlineNumber -= 1;
         // TODO Auto-generated method stub
    }

	public static long getOnlineNumber() {
		return onlineNumber;
	}

	public static void setOnlineNumber(long onlineNumber) {
		Mylistener.onlineNumber = onlineNumber;
	}
    
    
	
}
