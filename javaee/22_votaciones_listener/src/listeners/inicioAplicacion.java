package listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class inicioAplicacion
 *
 */
@WebListener
public class inicioAplicacion implements ServletContextListener {


    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	
    	//Obtenemos el ServletContext, esto se ejecutará cuando se use por primera vez el ServletContext.
    	ServletContext context = arg0.getServletContext();
    	
    	context.setAttribute("si", 1);
    	context.setAttribute("si", 0);
    	
    	
    }
	
}
