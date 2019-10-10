package com.example.designpatterns.iteratorpattern;

public enum ItemEnum {
    LEFT(0, "Item on left hand"), RIGHT(1, "Item on right hand");

    private int index;
    private String itemDesc;

    private ItemEnum(int index, String itemDesc) {
        this.index = index;
        this.itemDesc = itemDesc;
    }

    private int getIndex() {
        return index;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public static ItemEnum stateOf(int index) {
        for (ItemEnum item: values()) {
            if (item.index == index)
                return item;
        }

        return null;
    }
}
