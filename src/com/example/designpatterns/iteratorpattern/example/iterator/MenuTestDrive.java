package com.example.designpatterns.iteratorpattern.example.iterator;

import java.util.ArrayList;
import java.util.List;

public class MenuTestDrive {

    public static void main(String[] args) {

        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        CafeMenu cafeMenu = new CafeMenu();
//        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu, cafeMenu);
        List<Menu> menuList = new ArrayList<>();
        menuList.add(dinerMenu); menuList.add(pancakeHouseMenu); menuList.add(cafeMenu);
        Waitress waitress = new Waitress(menuList);
        waitress.printMenu();

    }
}
