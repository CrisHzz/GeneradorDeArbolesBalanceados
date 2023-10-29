package classes;
import java.util.Scanner;

public class menu {
    private String user_option;

    public menu() {
    }
    
    public void initialtext(){
        System.out.println("\nWelcome to the tree generation program (balanced)\n  1)Enter nodes with set quantity, Press (1)\n -1)Enter Nodes with undetermined amount Press (-1)\n  x)Close the machine,\n 99)To create a void tree Press x\nEnter your choice:" );
    }
    public void optionsInitial(String user_option) {
        switch (user_option) {
            case "1":
                nodeDeterminaded();
                break;
            case "-1":
                nodeUndetermined();
                break;
            case "99":
                System.out.println("You created a void tree");
                NodeIntTree voidtree = new NodeIntTree();
                voidtree.value = 0;
                voidtree.kidLeft = null;
                voidtree.kidRight = null;
                System.out.println("-------------------");
                System.out.println("All characteristics of the void tree are null because it is a void tree");
                System.out.println("the kidRight is " + voidtree.kidRight);
                System.out.println("the kidLeft is " + voidtree.kidLeft);
                System.out.println("the value of daddy is " + voidtree.value);
                System.out.println("-------------------");
                System.out.println("\nnow we gonna send you to the menu again");
                System.out.println("\nPlease enter a new option:");
                System.out.println("Welcome to the tree generation program (balanced)\n  1)Enter nodes with set quantity, Press (1)\n -1)Enter Nodes with undetermined amount Press (-1)\n  x)Close the machine,\n 99)To create a void tree Press x\nEnter your choice:");
                Scanner scanner = new Scanner(System.in);
                String new_option = scanner.nextLine();
                optionsInitial(new_option);
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
                    scanner = new Scanner(System.in);
                    user_option = scanner.nextLine();
                } while (!isValidOption(user_option));
                optionsInitial(user_option);
                break;
        }
    }
    
    private boolean isValidOption(String user_option) {
        return user_option.equals("1") || user_option.equals("-1") || user_option.equals("99") || user_option.equals("x") || user_option.equals("0");
    }

    public void nodeDeterminaded() {
    System.out.println("Please, enter the number of nodes you want to enter:");
    Scanner scanner = new Scanner(System.in);
    int maxNodes = 0;

    while (true) {
        String input = scanner.nextLine().trim(); 
        if (!input.isEmpty()) {
            try {
                maxNodes = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number:");
            }
        } else {
            System.out.println("Input cannot be empty. Please enter a valid number:");
        }
    }
    warnings();
    NodeIntTree daddy = null;
    NodeIntTree aux= new NodeIntTree();        
    int countQuantity = 0;
    String input = scanner.nextLine();

        while (!input.equals("x") && countQuantity < maxNodes) {
            int value = Integer.parseInt(input);
            if (value < 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
            } else {
                daddy = aux.addNode(daddy, value);
                countQuantity++;
            }
            if (countQuantity < maxNodes) {
                input = scanner.nextLine();
            }
        }

        do {
            menuOptionsTree();
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
                    System.out.println("Your tree is being balanced...");
                    daddy=daddy.balanceTree();
                    System.out.println("The tree has been balanced, you can check it with the options of the menu");
                    break;
                case "9":
                    System.out.println("Please enter a number for search in the tree");
                    Scanner scanner4= new Scanner(System.in);
                    int number=scanner4.nextInt();
                    daddy.findNodeInTree(number);
                    break;
                case "10":
                    NodeIntTree node = new NodeIntTree();
                    int max= node.findMax(daddy);
                    System.out.println("The max value in the tree is "+max);
                    break;
                case "11":
                    NodeIntTree node2 = new NodeIntTree();
                    int min= node2.findMin(daddy);
                    System.out.println("The min value in the tree is "+min);
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
        System.out.println("Are you ready? :) Y/N");
        Scanner scanner = new Scanner(System.in);
        String placeholder = scanner.next();
          
        System.out.println("Lets start!");
        System.out.println("Please, enter the values of the nodes (enter 'x' to stop):");
        
        NodeIntTree daddy = null;
        NodeIntTree aux= new NodeIntTree();        
        int nodeCount = 0;
    
        while (true) {
            String request = scanner.next();
    
            if (request.equals("x")) {
                break;
            }
    
            try {
                int value = Integer.parseInt(request);
                if (value < 0) {
                    System.out.println("Invalid input. Please enter a positive integer.");
                } else {
                    daddy = aux.addNode(daddy, value);
                    nodeCount++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        }
    
        do {
            menuOptionsTree();
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
                    System.out.println("Your tree is being balanced...");
                    daddy=daddy.balanceTree();
                    System.out.println("The tree has been balanced, you can check it with the options of the menu");
                    break;
                 case "9":
                    System.out.println("Please enter a number for search in the tree");
                    Scanner scanner4= new Scanner(System.in);
                    int number=scanner4.nextInt();
                    daddy.findNodeInTree(number);
                    break;
                 case "10":
                    NodeIntTree node = new NodeIntTree();
                    int max= node.findMax(daddy);
                    System.out.println("The max value in the tree is "+max);
                    break;   
                case "11":
                    NodeIntTree node2 = new NodeIntTree();
                    int min= node2.findMin(daddy);
                    System.out.println("The min value in the tree is "+min);
                    break;    
                case "x":
                    System.out.println("Thanks for using our program, see you soon :) ! ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, try again :)");
                    break;
            }
        } while (!user_option.equals("x"));
        }


    public void voidtree(){
        System.out.println("The void tree have been created");
    }

    public void menuOptionsTree(){
        System.out.println("What do you want to do?\n1) Pre-order traversal.\n2) In-order traversal.\n3) Post-order traversal.\n4) Show the number of leafs.\n5) Show the height of the tree.\n6) Show the number of nodes.\n7) Show if the tree is complete.\n8) Balance a tree.\n9) Find a number in the tree. (NEW FUNCTION) \n10) Show the max value in the tree.(NEW FUNCTION) \n11) Show the min value in the tree.(NEW FUNCTION) \nx) Press x to exit");
    }

    public void warnings(){
        System.out.println("Remember, if you press x the program will not take more values");   
        System.out.println("\nWARNING YOU HAVE TO ENTER THE Tree USING THE CORRECT STRUCTURE,FIRST THE LEFT VALUES AND LAST THE RIGHT VALUES, THE LEFT VALUES ARE MORE BIGGER THAN THE RIGHT\n");
        System.out.println("¡Okey! :) , enter the values of the nodes:");
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
