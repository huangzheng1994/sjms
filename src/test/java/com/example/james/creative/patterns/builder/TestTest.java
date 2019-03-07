package com.example.james.creative.patterns.builder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hz
 * @date 2019-2-20 17:10
 */
public class TestTest {

    @Test
    public void builderPerson() {
        PersonDirector personDirector = new PersonDirector();
        Person person = personDirector.constructPerson(new ManBuilder());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
    }
}