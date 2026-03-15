package com.example.gildedrose.strategy;

import com.example.gildedrose.Item;

public class DefaultStrategy implements QualityUpdateStrategy {
    @Override
    public void update(Item item) {
        decreaseQuality(item, 1);
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0) {
            decreaseQuality(item, 1);
        }
    }

    private void decreaseQuality(Item item, int amount) {
        int nextQuality = Math.max(0, item.getQuality() - amount);
        item.setQuality(nextQuality);
    }
}
