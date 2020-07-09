package com.stream;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Dennis
 * @date: 2020/7/8 20:10
 */
// 有参、无参构造，get、set、toString方法
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;
    private String name;
    private int age;
}
