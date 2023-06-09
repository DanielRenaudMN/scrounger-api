package com.scrounger_api.security;

import lombok.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class JwtUtils {
    private static final Logger logger = LoggerFactory.getLogger(JwtUtils.class);

    @Value("${scrounger.app.jwtSecret}")
    private String jwtSecret;
}
