package testDynamicFile;

import com.netflix.config.ConfigurationManager;
import com.netflix.config.DeploymentContext;
import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;
import org.apache.commons.configuration.AbstractConfiguration;

import java.io.IOException;

/**
 * Created by lemon on 2015/5/13.
 */
public class Test {
    private static final String DEPLOYMENT_APPLICATIONID = "archaius.deployment.applicationId";
//    archaius.deployment.applicationId

    public static void main(String args[]) throws IOException {

        String applicationId = System.getProperty(DEPLOYMENT_APPLICATIONID);
        if (applicationId == null || applicationId.isEmpty()) {
            System.setProperty(DEPLOYMENT_APPLICATIONID, "registryservice");
        }

        String appName = ConfigurationManager.getDeploymentContext().getApplicationId();

        try {
            ConfigurationManager.loadCascadedPropertiesFromResources(appName);
        } catch (IOException e) {
        }

        AbstractConfiguration abstractConfiguration = ConfigurationManager.getConfigInstance();
        DeploymentContext deploymentContext = ConfigurationManager.getDeploymentContext();

        String s = ConfigurationManager.getConfigInstance().getString("service.service-info.url");

    }
}
