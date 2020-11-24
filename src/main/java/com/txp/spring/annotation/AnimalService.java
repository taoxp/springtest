package com.txp.spring.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author: taoxp
 * @create: 2020-11-24 18:39
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface AnimalService {
    String value() default "";
}
