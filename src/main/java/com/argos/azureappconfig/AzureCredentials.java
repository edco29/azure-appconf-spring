package com.argos.azureappconfig;

import com.azure.core.credential.TokenCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.identity.EnvironmentCredentialBuilder;
import com.microsoft.azure.spring.cloud.config.AppConfigurationCredentialProvider;
import com.microsoft.azure.spring.cloud.config.KeyVaultCredentialProvider;


public class AzureCredentials implements AppConfigurationCredentialProvider, KeyVaultCredentialProvider  {

    public final String AZURE_AD_URL ="https://login.microsoftonline.com/";


    // this   code snippet  just works  with service principal
    @Override
    public TokenCredential getKeyVaultCredential(String uri) {
        return getCredential();
    }

    @Override
    public TokenCredential getAppConfigCredential(String uri) {
        return getCredential();
    }

    private TokenCredential getCredential() {
        return new EnvironmentCredentialBuilder().authorityHost(AZURE_AD_URL).build();
    }
    /*
     enable this  code snippet in order to use managed Identity and delete the  code snippet describe above

     @Override
    public TokenCredential getKeyVaultCredential(String uri) {
        return buildCredential();
    }

    @Override
    public TokenCredential getAppConfigCredential(String uri) {
        return buildCredential();
    }


    TokenCredential buildCredential() {
        return new DefaultAzureCredentialBuilder().build();
    }
        */

}