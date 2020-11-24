package com.txp.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author: taoxp
 * @create: 2020-11-04 18:24
 */

/**
 *
 * value 指定要扫描的包，默认扫描所有包。 可以传字符串或者数组
 * excludeFilters 在指定的包中排除要加载的注解
 * includeFilters 在指定的包中，指定要加载的注解（必须要将useDefaultFilters = false），
 *    当excludeFilters 和 includeFilters同时包含某个注解时，不会加载这个注解
 */
@ComponentScan(value = {"com.txp.spring.controller", "com.txp.spring.service"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class, Service.class})},
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Service.class}),@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Configuration.class})},
        useDefaultFilters = false
        )
public class ApplicationConfig {

}
