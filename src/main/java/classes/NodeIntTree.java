package classes;

import java.util.Scanner;

public class NodeIntTree {
    NodeIntTree kidLeft;
    NodeIntTree kidRight;
    int value;
    int count;

    public NodeIntTree() {
        count=0;
    }

    public NodeIntTree(int value){
        this.value=value;
        this.kidLeft=null;
        this.kidRight=null;
    }

    public Boolean isleaf(){
        return kidLeft==null && kidRight==null;

    }
    public void preOrder(){
        System.out.println(value);
        if(kidLeft!=null){
            kidLeft.preOrder();
        }
        if(kidRight!=null){
            kidRight.preOrder();
        }
    }

    public void inOrder() {
        if(kidLeft != null) {
            kidLeft.inOrder();
        }
        System.out.println(value);

        if(kidRight != null) {
            kidRight.inOrder();
        }
    }
    

    public void postOrder(){
        
        if(kidLeft!=null){
            kidLeft.postOrder();
        }

        if(kidRight!=null){
            kidRight.postOrder();
        }
        System.out.println(value);
    }

    public void nodesQuantity(){
        count = 0;
        countNodes(this);
        System.out.println(count);
    }
    
    private void countNodes(NodeIntTree daddy){
        count=0;
        if(daddy != null){
            count++;
            countNodes(daddy.kidLeft);
            countNodes(daddy.kidRight);
        }
    }
    
    private void countLeafs(NodeIntTree daddy){
        if(daddy != null){
            if(daddy.kidLeft == null && daddy.kidRight == null){
                count++;
            } else {
                countLeafs(daddy.kidLeft);
                countLeafs(daddy.kidRight);
            }
        }
    }

    public void treeLeafsQuantity(){
        count = 0;
        countLeafs(this);
        System.out.println(count);
    }
    
    
    public int treeHeight(NodeIntTree dad) {
        if (dad == null) {
            return 0;
        } else {
            int leftHeightB = treeHeight(dad.kidLeft);
            int rightHeightA = treeHeight(dad.kidRight);
            return Math.max(leftHeightB, rightHeightA) + 1;
        }
    }

    public static NodeIntTree createTree(int numNodes, Scanner scanner) {
        return createTreeR(numNodes, scanner);
    }
    private static NodeIntTree createTreeR(int numNodes, Scanner scanner) {
        if (numNodes <= 0) {
            return null;
        }
        
        System.out.println("Please, enter the value of the node:");
        int value = scanner.nextInt();
        
        NodeIntTree node = new NodeIntTree(value);
        
        int leftNodes = numNodes / 2;
        int rightNodes = numNodes - leftNodes - 1;

        node.kidLeft = createTreeR(leftNodes, scanner);
        node.kidRight = createTreeR(rightNodes, scanner);
        
        return node;
    }

    public boolean isComplete(int index, int numberNodes) {
        
        if (index >= numberNodes) {
            return false;
        }
    
        boolean leftIsFull = (kidLeft != null) ? kidLeft.isComplete(2 * index + 1, numberNodes) : true;
        boolean rightIsFull = (kidRight != null) ? kidRight.isComplete(2 * index + 2, numberNodes) : true;
    
        return leftIsFull && rightIsFull;
    }

    public NodeIntTree addNode(NodeIntTree node, int value) {
        if (node == null) {
            return new NodeIntTree(value);
        } else if (value < node.value) {
            node.kidLeft = addNode(node.kidLeft, value);
        } else if (value > node.value) {
            node.kidRight = addNode(node.kidRight, value);
        }
        return node;
    }

    private int countNodesUndeterminated(NodeIntTree node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + countNodesUndeterminated(node.kidLeft) + countNodesUndeterminated(node.kidRight);
        }
    }

    public boolean isCompleteUndeterminated() {
        int numberNodes = countNodesUndeterminated(this);
        return isComplete(0, numberNodes);
    }
    
}
        

    





    
    

