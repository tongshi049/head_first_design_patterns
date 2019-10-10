package com.example.designpatterns.iteratorpattern.example.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {

    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Black");
        addItem("Latte");
    }

    public void addItem(String name) {
        MenuItem menuItem = new MenuItem(name);
        menuItems.put(name, menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
