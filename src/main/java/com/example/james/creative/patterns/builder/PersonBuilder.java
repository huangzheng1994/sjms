package com.example.james.creative.patterns.builder;

/**
 * builder角色:建造者接口,指定各个部件的构建方法,定义返回产品的类型
 * <p>
 * 产品类建造者,
 * 规范产品对象的各个组成部分
 *
 * @author hz
 * @date 2019-2-20 16:32
 */
public interface PersonBuilder {

    /**
     * 描述:建造头部
     *
     * @param
     * @return
     * @auther: hz
     * @date: 2019-2-20 16:46
     */
    void buildHead();

    /**
     * 描述:建造身体
     *
     * @param
     * @return
     * @auther: hz
     * @date: 2019-2-20 16:46
     */
    void buildBody();

    /**
     * 描述:建造脚部
     *
     * @param
     * @return
     * @auther: hz
     * @date: 2019-2-20 16:46
     */
    void buildFoot();

    /**
     * 描述:组装成人
     *
     * @param
     * @return
     * @auther: hz
     * @date: 2019-2-20 16:46
     */
    Person buildPerson();//组装  

}
