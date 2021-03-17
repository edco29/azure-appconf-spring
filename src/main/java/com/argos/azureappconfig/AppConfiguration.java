package com.argos.azureappconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*

    Delete this class when the authentication method is Managed Identity
 */
@Configuration
public class AppConfiguration {

    @Bean
    public AzureCredentials azureCredentials() {
        return new AzureCredentials();
    }


}
