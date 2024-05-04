package com.jojoldu.boot.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//import org.springframework.boot.autoconfigure.domain.EntityScan;    // 240504

@Configuration
@EnableJpaAuditing // JPA Auditing 활성화
//@EntityScan(basePackages = {"com.jojoldu.boot.springboot"})
public class JpaConfig {}
