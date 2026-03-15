package com.example.gildedrose;

import com.example.gildedrose.strategy.AgedBrieStrategy;
import com.example.gildedrose.strategy.DefaultStrategy;
import com.example.gildedrose.strategy.QualityUpdateStrategy;
import com.example.gildedrose.strategy.SulfurasStrategy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GildedRose {
    private static final String AGED_BRIE = "Aged Brie";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    private final List<Item> items;
    private final Map<String, QualityUpdateStrategy> strategies;
    private final QualityUpdateStrategy defaultStrategy;

    public GildedRose(List<Item> items) {
        this.items = items;
        this.defaultStrategy = new DefaultStrategy();
        this.strategies = new HashMap<>();
        this.strategies.put(AGED_BRIE, new AgedBrieStrategy());
        this.strategies.put(SULFURAS, new SulfurasStrategy());
    }

    public void updateQuality() {
        for (Item item : items) {
            QualityUpdateStrategy strategy = strategies.getOrDefault(item.getName(), defaultStrategy);
            strategy.update(item);
        }
    }
}
