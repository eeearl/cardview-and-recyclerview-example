package com.emstudio.cardviewandrecyclerview;

import java.util.ArrayList;

/**
 * Created by HanulPark on 3/30/15.
 */
public class DummyItems {

    public static ArrayList<Item> ITEMS = new ArrayList<>();

    static {
        ITEMS.add(new Item("Bella"));
        ITEMS.add(new Item("Max"));
        ITEMS.add(new Item("Lucy"));
        ITEMS.add(new Item("Molly"));
        ITEMS.add(new Item("Oliver"));
        ITEMS.add(new Item("Chloe"));
        ITEMS.add(new Item("Tiger"));
        ITEMS.add(new Item("Shadow"));
        ITEMS.add(new Item("Maggie"));
        ITEMS.add(new Item("Sophie"));
        ITEMS.add(new Item("Charlie"));
        ITEMS.add(new Item("Bailey"));
    }

    public static class Item {
        public String text;

        public Item(String text) {
            this.text = text;
        }
    }
}
