package com.example.james.creative.patterns.builder;

/**
 * Director角色:指挥者,控制产品的构建顺序和组装产品
 * <p>
 * 调用具体建造者来创建复杂对象的各个部分，
 * 在指导者中不涉及具体产品的信息，只负责保证对象各部分完整创建或按某种顺序创建
 *
 * @author hz
 * @date 2019-2-20 16:57
 */
public class PersonDirector {

    /**
     * 描述: 构建人物
     *
     * @param
     * @return
     * @auther: hz
     * @date: 2019-2-20 17:45
     */
    public Person constructPerson(PersonBuilder personBuilder) {
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildFoot();
        return personBuilder.buildPerson();
    }
}
