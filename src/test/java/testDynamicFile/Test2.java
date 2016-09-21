package testDynamicFile;

import com.netflix.config.*;
import org.apache.commons.configuration.AbstractConfiguration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by lemon on 2015/10/26.
 */
public class Test2 {

    private static final String DEPLOYMENT_APPLICATION_ID = "archaius.deployment.applicationId";
    private static final String DEPLOYMENT_ENV = "archaius.deployment.environment";
    private static final String DEPLOYMENT_CONFIG_ADDITIONALURL = "archaius.configurationSource.additionalUrls";

    public static void main(String args[]) throws IOException {
        InputStream inputStream = Test2.class.getResourceAsStream("/env.properties");

        Properties properties = new Properties();
        properties.load(inputStream);

        String name = properties.getProperty("name");
        String age = properties.getProperty("age");

        System.out.println(String.format("name: %s ; age: %s", name, age));
        System.out.println("-------------------我是分割线--------------------------");

        System.setProperty(DEPLOYMENT_APPLICATION_ID, "registryservice");
        System.setProperty(DEPLOYMENT_ENV, properties.getProperty(DEPLOYMENT_ENV));
        System.setProperty(DEPLOYMENT_CONFIG_ADDITIONALURL, properties.getProperty(DEPLOYMENT_CONFIG_ADDITIONALURL));

        DeploymentContext deploymentContext = ConfigurationManager.getDeploymentContext();
        AbstractConfiguration abstractConfiguration = ConfigurationManager.getConfigInstance();

        String applicationId = deploymentContext.getApplicationId();
        System.out.println(String.format("application Id: %s", applicationId));
        String applicationId2 = abstractConfiguration.getString(DEPLOYMENT_APPLICATION_ID);
        System.out.println(String.format("application2 Id: %s", applicationId));

        ConfigurationManager.loadCascadedPropertiesFromResources(applicationId);

        DynamicStringProperty ETCD_READ_SWITCH_OPEN = DynamicPropertyFactory.getInstance().getStringProperty("service.etcd.read.switch", null);
        System.out.println(ETCD_READ_SWITCH_OPEN.get());
        DynamicStringProperty SERVICE_INFO_LOOKUP_URL = DynamicPropertyFactory.getInstance().getStringProperty("service.service-info.url", null);
        System.out.println(SERVICE_INFO_LOOKUP_URL.get());
        DynamicIntProperty REGISTRATION_TTL = DynamicPropertyFactory.getInstance().getIntProperty("service.registry.ttl", 10);
        System.out.println(REGISTRATION_TTL.get());

    }
}
