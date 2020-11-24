package com.txp.spring.annotation;

import com.txp.spring.util.AnimalType;

import java.lang.annotation.*;

/**
 * @author: taoxp
 * @create: 2020-11-24 18:30
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Animal {
    AnimalType value();
}
