package ancient.web.context;

import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContextEvent;

/**
 * @author Liu Dng
 * @version 1.0.0, 08/04/2021
 * @since 1.0.0
 */
public class DemoContextLoaderListener extends ContextLoaderListener {
    public DemoContextLoaderListener() {

    }

    public void contextInitialized(ServletContextEvent event) {
        super.contextInitialized(event);
    }
}
