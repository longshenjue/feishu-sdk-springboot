package com.example.feishusdkspringboot.config;

import com.lark.oapi.Client;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiClientManager {

    @Value("${lark.api.client.appId}")
    private String appId;
    @Value("${lark.api.client.appSecret}")
    private String appSecret;
    @Bean
    public Client getLarkClient() {
        // 使用从配置文件中获取的值创建 API Client
        return Client.newBuilder(this.appId, this.appSecret)
                .logReqAtDebug(true)
                .build();
    }
}