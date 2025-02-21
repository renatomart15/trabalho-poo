package main;

import view.MenuView;
import model.MenuController;

public class Main {
    public static void main(String[] args) {
        MenuController menuController = new MenuController();
        menuController.iniciarMenu();
    }
}