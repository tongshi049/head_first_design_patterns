package com.example.designpatterns.iteratorpattern;

// a concrete class that can be iterated
public class HandHoldInventory implements Inventory {

    // item on left hand
    private Item left;

    // item on right hand
    private Item right;

    public static final int SIZE = 2;

    // getters and setters
    public Item getLeft() {
        return left;
    }

    public void setLeft(Item left) {
        this.left = left;
    }

    public Item getRight() {
        return right;
    }

    public void setRight(Item right) {
        this.right = right;
    }

    // constructor
    public HandHoldInventory(Item left, Item right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public InventoryIterator getIterator() {
        return new HandHoldInventoryIterator(this);
    }
}
