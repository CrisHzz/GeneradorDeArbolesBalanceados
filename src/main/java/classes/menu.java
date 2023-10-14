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
                do {
                    System.out.println("Invalid option, try again :)");
                    Scanner scanner = new Scanner(System.in);
                    user_option = scanner.nextLine();
                } while (!isValidOption(user_option));
                optionsInitial(user_option);
                break;
        }
    }
    
    private boolean isValidOption(String user_option) {
        return user_option.equals("1") || user_option.equals("-1") || user_option.equalsIgnoreCase("x");
    }
    

    public void nodeDeterminaded() {
    System.out.println("Please, enter the number of nodes you want to enter:");
    Scanner scanner = new Scanner(System.in);
    int maxNodes = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Remember, if you press x the program will not take more values");   
    System.out.println("\nWARNING YOU HAVE TO ENTER THE THREE USING THE CORRECT STRUCTURE,FIRST THE LEFT VALUES AND LAST THE RIGHT VALUES, THE LEFT VALUES ARE MORE BIGGER THAN THE RIGHT\n");
    System.out.println("¡Okey! :) , enter the values of the nodes:");
    NodeIntTree daddy = null;
    NodeIntTree aux= new NodeIntTree();        
    int countQuantity = 0;
    String input = scanner.nextLine();

    while (!input.equals("x") && countQuantity < maxNodes) {
        int value = Integer.parseInt(input);
        daddy = aux.addNode(daddy, value);
        countQuantity++;
        if (countQuantity < maxNodes) {
            input = scanner.nextLine();
        }
    }
        do {
            System.out.println("What do you want to do?\n1) Pre-order traversal.\n2) In-order traversal.\n3) Post-order traversal.\n4) Show the number of leafs.\n5) Show the height of the tree.\n6) Show the number of nodes.\n7) Show if the tree is complete.\n8) Balance a tree.\nx)Press x to exit");
            Scanner scanner2 = new Scanner(System.in);
            user_option = scanner2.nextLine();

            switch (user_option) {
                case "1":
                System.out.println("Pre-order route is:");
                daddy.preOrder();
                    break;
                case "2":
                System.out.println("In-order route is:");
                daddy.inOrder();
                    break;
                case "3":
                System.out.println("Post-order route is:");
                daddy.postOrder();
                    break;
                case "4":
                System.out.println("The number of leafs is");
                daddy.treeLeafsQuantity();
                    break;
                case "5":
                daddy.treeHeight(daddy);
                System.out.println("The height of the tree is: " + daddy.treeHeight(daddy));
                    break;
                case "6":
                System.out.println("The number of nodes is:");
                System.out.println(countQuantity);;
                    break;
                case "7":
                if (daddy.isComplete(0, countQuantity)) {
                    System.out.println("The tree is complete.");
                } else {
                    System.out.println("The tree is not complete.");
                }
                    break;
                case "8":
                showBalanceTree();
                    break;    
                case "x":
                    System.out.println("Thanks for using our program, see you soon :) ! ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, please try again ;)");
                    break;
            }
        } while (!user_option.equals("x"));
    
        
    }

    public void nodeUndetermined() {
        System.out.println("Please, enter the values of the nodes (enter 'x' to stop):");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        NodeIntTree daddy = null;
        NodeIntTree aux= new NodeIntTree();        
        int nodeCount = 0;
    
        while (!input.equals("x")) {
            int value = Integer.parseInt(input);
            daddy = aux.addNode(daddy, value);
            nodeCount++;
            input = scanner.next();
        }
    
             do {
            System.out.println("What do you want to do?\n1) Pre-order traversal.\n2) In-order traversal.\n3) Post-order traversal.\n4) Show the number of leafs.\n5) Show the height of the tree.\n6) Show the number of nodes.\n7) Show if the tree is complete.\n8) Balance a tree.\nx)Press x to exit");
            Scanner scanner2 = new Scanner(System.in);
            user_option = scanner2.nextLine();

            switch (user_option) {
                case "1":
                System.out.println("Pre-order route is:");
                daddy.preOrder();
                    break;
                case "2":
                System.out.println("In-order route is:");
                daddy.inOrder();
                    break;
                case "3":
                System.out.println("Post-order route is:");
                daddy.postOrder();
                    break;
                case "4":
                System.out.println("The number of leafs is");
                daddy.treeLeafsQuantity();
                    break;
                case "5":
                daddy.treeHeight(daddy);
                System.out.println("The height of the tree is: " + daddy.treeHeight(daddy));
                    break;
                case "6":
                System.out.println("The number of nodes is:");
                System.out.println(nodeCount);;
                    break;
                case "7":
                if (daddy != null && daddy.isCompleteUndeterminated()) {
                    System.out.println("The tree is complete.");
                } else {
                    System.out.println("The tree is not complete.");
                }
                    break;
                case "8":
                showBalanceTree();
                    break;    
                case "x":
                    System.out.println("Thanks for using our program, see you soon :) ! ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (!user_option.equals("x"));
        }
    

    public void voidtree(){
        System.out.println("The void tree have been created");
    }

    public void showBalanceTree(){
        System.out.println("The tree has been balanced");
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
