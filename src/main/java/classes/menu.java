package classes;
import java.util.Scanner;

public class menu {
    private String user_option;

    public menu() {
    }
    
    public void initialtext(){
        System.out.println("\nWelcome to the tree generation program (balanced)\n  1)Enter nodes with set quantity, Press (1)\n -1)Enter Nodes with undetermined amount Press (-1)\n  x)Close the machine, Press x\nEnter your choice:");
    }
    public void optionsInitial(String user_option) {
        do {
            switch (user_option) {
                case "1":
                    nodeDeterminaded();
                    break;
                case "-1":
                    nodeUndetermined();
                    break;
                case "x":
                    System.out.println("Thanks for using our program, see you soon :) ! ");
                    System.exit(0);
                    break;

                case "0":
                    voidtree();
                    break;  
                default:
                    System.out.println("Invalid option, try again :)");
                    Scanner scanner = new Scanner(System.in);
                    user_option = scanner.nextLine();
                    break;
            }
        } while (!isValidOption(user_option));
    }

    private boolean isValidOption(String user_option) {
        return user_option.equals("1") || user_option.equals("-1") || user_option.equalsIgnoreCase("x");
    }


    public void nodeDeterminaded() {
    System.out.println("Please, enter the number of nodes you want to enter:");
    Scanner scanner = new Scanner(System.in);
    int numberNodes = scanner.nextInt();
    //TODO: SOLAMENTE HAY LA SOLICITUD DE LOS NODOS A REQUERIR
       
    }

    public void nodeUndetermined() {
        // TODO: Implementar esta función
        System.out.println("Your undetermined tree has been created, bye bye :)");
    }

    public void voidtree(){
        System.out.println("The void tree have been created");
    }

    public void nodeOptions(String user_option) {
        do {
            System.out.println("1) Show the number of nodes.\n2) Show the number of leaves.\n3) Show the number of levels.\n4) Show the width of the tree.\n5) Pre-order traversal.\n6) In-order traversal.\n7) Post-order traversal.");
            switch (user_option) {
                case "1":
                    showAmountNodes();
                    break;
                case "2":
                    showAmountLeafs();
                    break;
                case "3":
                    showNumberLevels();
                    break;
                case "4":
                    showWidthTree();
                    break;
                case "5":
                    routePreOrden();
                    break;
                case "6":
                    routeInOrden();
                    break;
                case "7":
                    routePostOrden();
                    break;
                case "x":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (!user_option.equals("x"));
    }

    public void showAmountNodes(){
        // TODO: Implementar esta función
    }

    public void showAmountLeafs(){
        // TODO: Implementar esta función

    }

    public void showNumberLevels(){
        // TODO: Implementar esta función

    }

    public void showWidthTree(){

        // TODO: Implementar esta función
    }

    public void routePreOrden(){
        // TODO: Implementar esta función

    }
    public void routeInOrden(){
        // TODO: Implementar esta función

    }
    public void routePostOrden(){
        // TODO: Implementar esta función
    }






    public void welcome() {
        String title =
                "        ████████╗██████╗ ███████╗███████╗                                            \n" +
                        "╚══██╔══╝██╔══██╗██╔════╝██╔════╝                                            \n" +
                        "   ██║   ██████╔╝█████╗  █████╗                                              \n" +
                        "   ██║   ██╔══██╗██╔══╝  ██╔══╝                                              \n" +
                        "   ██║   ██║  ██║███████╗███████╗                                            \n" +
                        "   ╚═╝   ╚═╝  ╚═╝╚══════╝╚══════╝                                            \n" +
                        "                                                                             \n" +
                        "███╗   ███╗ █████╗  ██████╗██╗  ██╗██╗███╗   ██╗███████╗                     \n" +
                        "████╗ ████║██╔══██╗██╔════╝██║  ██║██║████╗  ██║██╔════╝                     \n" +
                        "██╔████╔██║███████║██║     ███████║██║██╔██╗ ██║█████╗                       \n" +
                        "██║╚██╔╝██║██╔══██║██║     ██╔══██║██║██║╚██╗██║██╔══╝                       \n" +
                        "██║ ╚═╝ ██║██║  ██║╚██████╗██║  ██║██║██║ ╚████║███████╗                     \n" +
                        "╚═╝     ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝╚═╝╚═╝  ╚═══╝╚══════╝                     \n" +
                        "                                                                             \n" +
                        " ██████╗ ███████╗███╗   ██╗███████╗██████╗  █████╗ ████████╗ ██████╗ ██████╗ \n" +
                        "██╔════╝ ██╔════╝████╗  ██║██╔════╝██╔══██╗██╔══██╗╚══██╔══╝██╔═══██╗██╔══██╗\n" +
                        "██║  ███╗█████╗  ██╔██╗ ██║█████╗  ██████╔╝███████║   ██║   ██║   ██║██████╔╝\n" +
                        "██║   ██║██╔══╝  ██║╚██╗██║██╔══╝  ██╔══██╗██╔══██║   ██║   ██║   ██║██╔══██╗\n" +
                        "╚██████╔╝███████╗██║ ╚████║███████╗██║  ██║██║  ██║   ██║   ╚██████╔╝██║  ██║\n" +
                        " ╚═════╝ ╚══════╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝\n" +
                        "                                                                                                                      ";
        for (int i = 0; i <title.length() ; i++) {
            System.out.print(title.charAt(i));
        }
    }
}
