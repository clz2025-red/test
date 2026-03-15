package com.example.gildedrose.strategy;

import com.example.gildedrose.Item;

public class SulfurasStrategy implements QualityUpdateStrategy {
    @Override
    public void update(Item item) {
        // Sulfuras does not change in quality or sell-in.
    }
}
