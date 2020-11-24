package com.txp.spring.generic;

/**
 * @author: taoxp
 * @create: 2020-11-22 22:08
 */
public class Animal {

    public <T> void eat(T animal){
        System.out.println(animal+"has eat");
    }
}
