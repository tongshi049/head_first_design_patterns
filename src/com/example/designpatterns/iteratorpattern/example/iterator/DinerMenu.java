package com.example.designpatterns.iteratorpattern.example.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu{

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        this.menuItems = new MenuItem[3];
        addItem("sandwich");
        addItem("burger");
        addItem("sausage");
    }

    public void addItem(String name){
        MenuItem menuItem = new MenuItem(name);
        menuItems[numberOfItems++] = menuItem;
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
