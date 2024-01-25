package com.stalcom.fruits.product.model;

public enum Sort {
    GOLD("Gold"),
    GALA("Gala"),
    ABBAT("Abbat"),
    Summer("summer");
    public final String label;

    Sort(String label) {
        this.label = label;
    }
}
