package com.cyurio.labs.spring.transaction;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Charlie
 */
@MapperScan("com.cyurio.labs.spring.transaction.dao.mapper")
@SpringBootApplication
public class SpringTransactionLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTransactionLabApplication.class, args);
    }

}
