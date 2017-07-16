package Listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class OnlineListener implements HttpSessionListener {
private static int count=0;
    /**
     * Default constructor. 
     */
    public OnlineListener() {
        // TODO Auto-generated constructor stub
    }

    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	count++;
    	se.getSession().getServletContext().setAttribute("count", count);
    }


    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	count--;
    	se.getSession().getServletContext().setAttribute("count", count);
    }

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		OnlineListener.count = count;
	}
	
}



