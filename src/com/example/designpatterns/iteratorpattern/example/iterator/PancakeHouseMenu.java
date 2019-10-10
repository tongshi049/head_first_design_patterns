package com.example.designpatterns.iteratorpattern.example.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{

    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("pancake");
        addItem("pancake with eggs");
        addItem("pancake with syrup");
    }

    public void addItem(String name){
        MenuItem menuItem = new MenuItem(name);
        menuItems.add(menuItem);

    }

    public Iterator createIterator(){
        return menuItems.iterator();
    }
}
