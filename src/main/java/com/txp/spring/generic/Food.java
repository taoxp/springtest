package com.txp.spring.generic;

/**
 * @author: taoxp
 * @create: 2020-11-22 22:06
 */
public class Food <T>{
    public <S> void  println(S fond){
        System.out.println(fond+"has been eat!!");
    }
}
