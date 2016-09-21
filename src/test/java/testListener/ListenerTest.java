package testListener;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by lemon on 2015/1/22.
 */
public class ListenerTest implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

    public static void main(String args[]) {

    }
}
