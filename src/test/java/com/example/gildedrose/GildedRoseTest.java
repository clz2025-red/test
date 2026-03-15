package com.example.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class GildedRoseTest {

    @Test
    void agedBrieQualityIncreasesByOnePerDay() {
        Item agedBrie = new Item("Aged Brie", 2, 10);
        GildedRose gildedRose = new GildedRose(List.of(agedBrie));

        gildedRose.updateQuality();
        assertEquals(11, agedBrie.getQuality());
        assertEquals(1, agedBrie.getSellIn());

        gildedRose.updateQuality();
        assertEquals(12, agedBrie.getQuality());
        assertEquals(0, agedBrie.getSellIn());
    }
}
