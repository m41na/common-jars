package com.practicaldime.common.config;

import com.practicaldime.common.util.EmailValidator;
import com.practicaldime.common.util.EntityValidator;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentStringPBEConfig;
import org.jasypt.properties.EncryptableProperties;
import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.IOException;
import java.io.InputStream;

@Configuration
public class UtilsConfig {

    @Bean
    public javax.validation.Validator validator(){
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        javax.validation.Validator validator = factory.getValidator();
        return validator;
    }

    @Bean
    public EntityValidator entityValidator(@Autowired Validator validator){
        return new EntityValidator(validator);
    }

    @Bean
    public BasicTextEncryptor basicTextEncryptor(@Value("${app.encryptor.password}") String password){
        BasicTextEncryptor bte = new BasicTextEncryptor();
        bte.setPassword(password);
        return bte;
    }

    private EnvironmentStringPBEConfig environmentStringPBEConfig(String password) {
        EnvironmentStringPBEConfig config = new EnvironmentStringPBEConfig();
        config.setAlgorithm("PBEWithMD5AndDES");
        config.setPassword(password);
        return config;
    }

    private StandardPBEStringEncryptor standardPBEStringEncryptor(String password) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setConfig(environmentStringPBEConfig(password));
        return encryptor;
    }

    @Bean
    public EncryptableProperties encryptableProperties(@Value("${app.encryptor.location}") String location, @Value("${app.encryptor.password}") String password) {
        EncryptableProperties props = new EncryptableProperties(standardPBEStringEncryptor(password));

        //location property specified
        if (location != null) {
            String loaderType;
            String filePath;

            String[] parts = location.split(":");
            if (parts.length > 1) {
                loaderType = parts[0];
                filePath = parts[1];
            } else {
                loaderType = "classpath";
                filePath = parts[0];
            }

            switch (loaderType) {
                case "classpath": {
                    try (InputStream input = new ClassPathResource(filePath).getInputStream()) {
                        props.load(input);
                    } catch (IOException e) {
                        throw new RuntimeException("Could not load propeties file from classpath", e);
                    }
                    return props;
                }
                case "file": {
                    try (InputStream input = new FileSystemResource(filePath).getInputStream()) {
                        props.load(input);
                    } catch (IOException e) {
                        throw new RuntimeException("Could not load propeties file from file system", e);
                    }
                    return props;
                }
                default: {
                    throw new RuntimeException("Invalid loader specified. Expecting either 'classpath' or 'file'");
                }
            }
        }

        //fallback option
        try (InputStream input = new ClassPathResource("encrypted.properties").getInputStream()) {
            props.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Could not load propeties files from 'encrypted.properties' in the classpath", e);
        }
        return props;
    }

    @Bean
    public EmailValidator emailValidator(){
        return new EmailValidator();
    }
}
