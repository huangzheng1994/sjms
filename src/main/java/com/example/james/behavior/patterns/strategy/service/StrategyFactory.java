package com.example.james.behavior.patterns.strategy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author hz
 * @date 2019-12-18 15:53
 */
public class StrategyFactory {

    private Map<Integer, Strategy> map;


    public StrategyFactory() {
        List<Strategy> strategies = new ArrayList<>();

//        strategies.add(new OrdinaryStrategy());
//        strategies.add(new SilverStrategy());
        strategies.add(new GoldStrategy());
        strategies.add(new PlatinumStrategy());
        strategies.add(new PlatinumStrategy());

        //
        this.map = strategies.stream().collect(Collectors.toMap(Strategy::getType, strategy -> strategy));
    }

    public void setMap(int key, Strategy strategy) {
        map.put(key, strategy);
    }

    public static class Holder {
        public static StrategyFactory instance = new StrategyFactory();
    }

    public static StrategyFactory getInstance() {
        return Holder.instance;
    }

    public Strategy get(Integer type) {
        return map.get(type);
    }
}
