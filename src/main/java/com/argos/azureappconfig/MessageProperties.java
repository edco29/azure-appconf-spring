package com.argos.azureappconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="config")
public class MessageProperties {
    private String text;

    private String keyVaultMessage;

    public String getKeyVaultMessage() {
        return keyVaultMessage;
    }

    public void setKeyVaultMessage(String keyVaultMessage) {
        this.keyVaultMessage = keyVaultMessage;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text ;
    }
}
