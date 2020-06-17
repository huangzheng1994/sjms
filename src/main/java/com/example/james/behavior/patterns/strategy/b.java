package com.example.james.behavior.patterns.strategy;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @author hz
 * @date 2020-6-12 16:47
 */
@Service
public class b implements a{

    @Override
    public void ts(String a) {
        System.out.println("被调用了");
    }
}
