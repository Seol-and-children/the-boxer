package com.seolandchildren;

import com.seolandchildren.menu.Menu;
import com.seolandchildren.menu.Naming;

public class Application {
    public static void main(String[] args) {
        Naming naming = new Naming();
        Menu menu = new Menu();
        naming.naming();
        menu.menu();
    }
}