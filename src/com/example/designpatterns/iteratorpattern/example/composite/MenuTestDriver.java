package com.example.designpatterns.iteratorpattern.example.composite;

public class MenuTestDriver {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu =
                new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("Diner Menu", "Lunch");
        MenuComponent cafeMenu =
                new Menu("Cafe Menu", "Dinner");
        MenuComponent dessertMenu =
                new Menu("Dessert menu", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem(
                "Pasta", "Spaghetti with Marinara Sauce",  3.89, true));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie", "Apple pie with vanilla cream", 1.50, true
        ));

        pancakeHouseMenu.add(new MenuItem(
                "Original Pancake", "Only a big pancake", 1.0, true
        ));

        pancakeHouseMenu.add(new MenuItem(
                "Sweet Pancake", "Pancake with syrup", 1.6, true
        ));

        Waitress waitress = new Waitress(allMenus);

        //waitress.printMenu();

        waitress.printVegetarianMenu();


    }
}
