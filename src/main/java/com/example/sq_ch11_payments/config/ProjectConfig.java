package com.example.sq_ch11_payments.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.example.sq_ch11_payments.proxies")
public class ProjectConfig {
}
