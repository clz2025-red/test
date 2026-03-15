package com.example.gildedrose.strategy;

import com.example.gildedrose.Item;

public class AgedBrieStrategy implements QualityUpdateStrategy {
    @Override
    public void update(Item item) {
        int nextQuality = Math.min(50, item.getQuality() + 1);
        item.setQuality(nextQuality);
        item.setSellIn(item.getSellIn() - 1);
    }
}
