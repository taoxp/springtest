package com.txp.spring.service;

import com.txp.spring.annotation.Animal;
import com.txp.spring.util.AnimalType;
import org.springframework.stereotype.Service;

/**
 * @author: taoxp
 * @create: 2020-11-24 18:32
 */
@com.txp.spring.annotation.AnimalService
@Service
public class AnimalService {
    @Animal(AnimalType.CAT)
    public void catEat(){
        System.out.println("car eat!!!!!");
    }
    @Animal(AnimalType.DOG)
    public void dogEat(){
        System.out.println("dog eat!!!!!");
    }
}
