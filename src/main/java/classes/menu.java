import java.util.Scanner;
public class menu {
    private String user_option;
    public menu() {
    }
    public void initialtext(){
        System.out.println("");
        System.out.println("Welcome to the tree generation program (balanced)");
        System.out.println("  1)Enter nodes with set quantity, Press (1)");
        System.out.println(" -1)Enter Nodes with undetermined amount Press (-1)");
        System.out.println("  x)Close the machine, Press x");
        System.out.println("Enter your choice:");
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


    private void nodeDeterminaded() {
        // TODO: Implementar esta función
        System.out.println("Your determined tree has been created, bye bye :)");
    }

    private void nodeUndetermined() {
        // TODO: Implementar esta función
        System.out.println("Your undetermined tree has been created, bye bye :)");
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
