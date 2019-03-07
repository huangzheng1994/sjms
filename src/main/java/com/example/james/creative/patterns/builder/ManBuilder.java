package com.example.james.creative.patterns.builder;

import lombok.Data;

/**
 * ConcreteBuilder角色:具体的建造者
 *
 *
 * @author hz
 * @date 2019-2-20 16:52
 */
@Data
public class ManBuilder implements PersonBuilder {

    private Person person;

    public ManBuilder() {
        this.person = new Person();
    }

    @Override
    public void buildHead() {
        person.setHead("建造男性头部");
    }

    @Override
    public void buildBody() {
        person.setBody("建造男性身体");
    }

    @Override
    public void buildFoot() {
        person.setFoot("建造男性脚部");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
