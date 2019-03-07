package com.example.james.creative.patterns.builder;

/**
 * @author hz
 * @date 2019-2-20 17:00
 */
public class Test {

    public void builderPerson() {
        PersonDirector personDirector = new PersonDirector();
        Person person = personDirector.constructPerson(new ManBuilder());
    }

}
