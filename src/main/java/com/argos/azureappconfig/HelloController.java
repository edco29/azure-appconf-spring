package com.argos.azureappconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RefreshScope()
@RestController
public class HelloController {
    private final MessageProperties properties;

    public HelloController(MessageProperties properties) {
        this.properties = properties;
    }

    @Value("${bd.port}")
    private String text ;

    @Value("${bd.servers}")
    private List<String> servers;

    @Value("${bd.password}")
    private String password;

    @GetMapping
    public String getMessage() {
        return
                "Message: " + properties.getText() +
                        "\nKey Vault message: " +
                        properties.getKeyVaultMessage() +
                        " \n" + text + "\n" + servers + "\n" + password;
    }
}