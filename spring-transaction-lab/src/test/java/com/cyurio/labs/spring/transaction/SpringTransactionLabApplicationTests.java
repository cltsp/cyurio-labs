package com.cyurio.labs.spring.transaction;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SpringTransactionLabApplicationTests {

    @Test
    void contextLoads() {
        log.info("contextLoads");
    }

}
