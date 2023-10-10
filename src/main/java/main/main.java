package main;
import classes.menu;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        menu menu=new menu();
        menu.welcome();
        Scanner prueba=new Scanner(System.in);
        menu.initialtext();
        String user_option=prueba.next();
        menu.optionsInitial(user_option);
        


    }
}
