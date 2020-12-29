package com.example.springbootproperties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties("aws")
public class AwsProperties {

    private String awsAccessKeyId;
    private String awsSecretAccessKey;
    private String bucketName;
    private Map<String, String> cloudFront;

    public AwsProperties() {
    }

    public AwsProperties(String awsAccessKeyId, Map<String, String> cloudFront) {
        this.awsAccessKeyId = awsAccessKeyId;
        this.cloudFront = cloudFront;
    }

    public String getAwsAccessKeyId() {
        return awsAccessKeyId;
    }

    public void setAwsAccessKeyId(String awsAccessKeyId) {
        this.awsAccessKeyId = awsAccessKeyId;
    }

    public Map<String, String> getCloudFront() {
        return cloudFront;
    }

    public void setCloudFront(Map<String, String> cloudFront) {
        this.cloudFront = cloudFront;
    }

    public String getAwsSecretAccessKey() {
        return awsSecretAccessKey;
    }

    public void setAwsSecretAccessKey(String awsSecretAccessKey) {
        this.awsSecretAccessKey = awsSecretAccessKey;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
}
