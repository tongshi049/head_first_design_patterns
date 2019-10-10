package com.example.designpatterns.iteratorpattern;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

import java.util.zip.Deflater;

public class HandHoldInventoryIterator implements InventoryIterator{

    HandHoldInventory handHoldInventory;

    int index = 0;

    public HandHoldInventoryIterator(HandHoldInventory handHoldInventory) {
        this.handHoldInventory = handHoldInventory;
    }

    @Override
    public boolean hasNext() {
        return index < handHoldInventory.SIZE;
    }

    @Override
    public Item next() {
        Item item = null;

        switch (index) {
            case 0:
                item = handHoldInventory.getLeft();
                break;
            case 1:
                item = handHoldInventory.getRight();
                break;
        }

        index++;

        return item;
    }
}
