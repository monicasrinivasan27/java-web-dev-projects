package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(ArrayList<MenuItem> i) {
        this.lastUpdated = LocalDate.now();
        this.items = i;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addMenuItem(MenuItem item){
        this.items.add(item);
    }
    public void removeMenuItem(MenuItem item){
        this.items.remove(item);
    }
    public void printMenu(){
        for (MenuItem menuItem:items){
            System.out.println(menuItem.toString());

        }
    }
}


