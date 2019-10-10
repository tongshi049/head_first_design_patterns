package com.example.designpatterns.iteratorpattern.example.iterator;
import java.util.Iterator;
import java.util.List;

public class Waitress {

    List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator menuIterator = this.menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu  = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }
    }



//    Menu dinerMenu;
//    Menu pancakeHouseMenu;
//    Menu cafeMenu;
//
//    public Waitress(Menu dinerMenu, Menu pancakeHouseMenu, Menu cafeMenu) {
//        this.dinerMenu = dinerMenu;
//        this.pancakeHouseMenu = pancakeHouseMenu;
//        this.cafeMenu = cafeMenu;
//    }
//
//    public void printMenu() {
//        Iterator iterator = dinerMenu.createIterator();
//        System.out.println("MENU\n---\nBREAKFAST");
//        printMenu(iterator);
//
//        Iterator iterator1 = pancakeHouseMenu.createIterator();
//        System.out.println("MENU\n---\nPANCAKE");
//        printMenu(iterator1);
//
//        Iterator iterator2 = cafeMenu.createIterator();
//        System.out.println("MENU\n---\nCAFE");
//        printMenu(iterator2);
//    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName());
        }
    }
}
