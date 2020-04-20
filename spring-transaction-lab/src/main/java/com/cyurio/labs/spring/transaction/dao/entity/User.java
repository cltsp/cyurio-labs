package com.cyurio.labs.spring.transaction.dao.entity;

import lombok.Data;

/**
 * @author zhouchunli@secoo.com
 * @date 2020/4/20 5:09 下午
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
