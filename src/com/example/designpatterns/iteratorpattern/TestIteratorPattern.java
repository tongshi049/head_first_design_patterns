package com.example.designpatterns.iteratorpattern;

public class TestIteratorPattern {

    public static void main(String[] args) {

        // Create a new inventory
        Inventory inventory = new HandHoldInventory(new Item("Pen"), new Item("Apple"));

        // use concrete iterator to traverse the element in the created inventory
        InventoryIterator iterator = inventory.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().name);
        }

    }
}
