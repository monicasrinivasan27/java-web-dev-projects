package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<MenuItem> menuItems=new ArrayList<>(Arrays.asList
                (new MenuItem(9.99,"Vegan Pasta","Entree", true),
                new MenuItem(11.99,"Vegan Burger","Entree",true),
                new MenuItem(4.99,"Tiramisu ","Dessert",true),
                        new MenuItem(4.99,"Choclate Cake ","Dessert",true),
                        new MenuItem(4.99,"Blackforest ","Dessert",true),
                        new MenuItem(11.99,"Chicken Fried Burger","Entree",true),
                        new MenuItem(9.99,"Chicken Burger","Entree",true)
                        ));

        Menu menu=new Menu(menuItems);
        menu.addMenuItem( new MenuItem(4.99,"Testing Menu","Dessert",true));
        menu.printMenu();
        menu.removeMenuItem(new MenuItem( 4.99,"Testing Menu ","Dessert",true));
        System.out.println("********************************");
        menu.printMenu();
    }
}
