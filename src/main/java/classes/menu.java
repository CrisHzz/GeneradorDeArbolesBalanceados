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
       
    }

    public void nodeUndetermined() {
        // TODO: Implementar esta función
        System.out.println("Your undetermined tree has been created, bye bye :)");
    }

    public void nodeOptions(String user_option) {
        do {
            System.out.println("1) Mostrar la cantidad de nodos.\n2) Mostrar cantidad de hojas.\n3) Mostrar número de niveles.\n4) Mostrar anchura del árbol.\n5) Recorrido preOrden.\n6) Recorrido inOrden.\n7) Recorrido postOrden.");
            switch (user_option) {
                case "1":
                    mostrarCantidadNodos();
                    break;
                case "2":
                    mostrarCantidadHojas();
                    break;
                case "3":
                    mostrarNumeroNiveles();
                    break;
                case "4":
                    mostrarAnchuraArbol();
                    break;
                case "5":
                    recorridoPreOrden();
                    break;
                case "6":
                    recorridoInOrden();
                    break;
                case "7":
                    recorridoPostOrden();
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

    public void mostrarCantidadNodos(){
        // TODO: Implementar esta función
    }

    public void mostrarCantidadHojas(){
        // TODO: Implementar esta función

    }

    public void mostrarNumeroNiveles(){
        // TODO: Implementar esta función

    }

    public void mostrarAnchuraArbol(){

        // TODO: Implementar esta función
    }

    public void recorridoPreOrden(){
        // TODO: Implementar esta función

    }
    public void recorridoInOrden(){
        // TODO: Implementar esta función

    }
    public void recorridoPostOrden(){
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
