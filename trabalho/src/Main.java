import view.MenuView;
import controller.MenuController;

import model.*;

public class Main {
    public static void main(String[] args) {
        Eclusa eclusa = new Eclusa(); 
        MenuController menuController = new MenuController(eclusa);
        menuController.iniciarMenu();
    }
}