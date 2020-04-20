package com.cyurio.labs.spring.transaction.dao.mapper;

import com.cyurio.labs.spring.transaction.SpringTransactionLabApplicationTests;
import com.cyurio.labs.spring.transaction.dao.entity.User;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zhouchunli@secoo.com
 * @date 2020/4/20 5:13 下午
 */
@Log
class UserMapperTest extends SpringTransactionLabApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    @SuppressWarnings("squid:S106")
    public void testSelect() {
        log.info("----- selectAll method test ------");
        List<User> userList = userMapper.selectList(null);
        Assertions.assertEquals(5, userList.size());
        userList.forEach(System.out::print);
    }
}