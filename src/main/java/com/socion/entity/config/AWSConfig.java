package com.socion.entity.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AWSConfig {

    @Autowired
    AppContext appContext;

    @Bean
    public AmazonS3 amazonClient() {
        AWSCredentials credentials = new BasicAWSCredentials(
                appContext.getAwsAccessKey(),
                appContext.getAwsSecretKey()
        );

        return AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(appContext.getAwsRegion())
                .build();
    }
}
