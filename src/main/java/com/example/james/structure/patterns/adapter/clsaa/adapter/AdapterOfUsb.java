package com.example.james.structure.patterns.adapter.clsaa.adapter;

/**
 * @author hz
 * @date 2019-6-12 15:46
 */
public class AdapterOfUsb extends Usber implements Ps2 {

    @Override
    public void isPs2() {
        this.isUsb();
    }
}
