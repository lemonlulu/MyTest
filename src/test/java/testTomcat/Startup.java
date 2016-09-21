package testTomcat;

import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.apache.coyote.http11.Http11NioProtocol;

public class Startup {
    public static void main(String[] args) throws Exception {
        Connector connector = new Connector(Http11NioProtocol.class.getName());
        connector.setPort(8087);
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8087);
        tomcat.getService().addConnector(connector);
        tomcat.setConnector(connector);
        tomcat.addWebapp("", Conf.locate("../src/main/webapp"));
        tomcat.start();
        while (true) {
            Thread.sleep(1000);
        }
    }
}