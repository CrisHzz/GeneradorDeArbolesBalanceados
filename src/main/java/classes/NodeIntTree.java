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
    
    
    public int treeHeight(NodeIntTree daddy) {
        if (daddy == null) {
            return 0;
        } else {
            int leftHeightB = treeHeight(daddy.kidLeft);
            int rightHeightA = treeHeight(daddy.kidRight);
            return Math.max(leftHeightB, rightHeightA) + 1;
        }
    }


    public boolean isComplete(int index, int nodesQuantity) {
        
        if (index >= nodesQuantity) {
            return false;
        }

        boolean leftIsFull = (kidLeft != null) ? kidLeft.isComplete(2 * index + 1, nodesQuantity) : true;
        boolean rightIsFull = (kidRight != null) ? kidRight.isComplete(2 * index + 2, nodesQuantity) : true;
    
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

    public LinkedList runToLinkedList() {
        LinkedList list = new LinkedList();
        runToLinkedList(this, list);
        return list;
    }

    private void runToLinkedList(NodeIntTree node, LinkedList miniLinkedList) {
        if (node != null) {
            runToLinkedList(node.kidLeft, miniLinkedList);
            miniLinkedList.add(node.value);
            runToLinkedList(node.kidRight, miniLinkedList);
        }
    }

    public NodeIntTree makeBalancedTree(LinkedList miniLinkedList) {
        int momentNumber = miniLinkedList.size();
        return makeBalancedTree(miniLinkedList, 0, momentNumber - 1);
    }

    private NodeIntTree makeBalancedTree(LinkedList miniLinkedList, int initial, int end) {
        if (initial > end) {
            return null;
        }

        int mid = (initial + end) / 2;
        NodeIntTree node = new NodeIntTree(miniLinkedList.get(mid));

        node.kidLeft = makeBalancedTree(miniLinkedList, initial, mid - 1);
        node.kidRight = makeBalancedTree(miniLinkedList, mid + 1, end);
        return node;
    }

    public NodeIntTree balanceTree() {
        LinkedList list = this.runToLinkedList();
        return makeBalancedTree(list);
    }

    public boolean findNodeInTree(int value) {
        if (this.value == value) {
            System.out.println("The number " + value + " is in the tree");
            return true;
        } else if (this.value > value) {
            if (this.kidLeft != null) {
                return this.kidLeft.findNodeInTree(value);
            }
        } else {
            if (this.kidRight != null) {
                return this.kidRight.findNodeInTree(value);
            }
        }
        
        System.out.println("The number " + value + " isn't in the tree");
        return false;
    }

    public int findMax(NodeIntTree daddy) {
        if (daddy == null) {
            return Integer.MIN_VALUE;
        }
    
        int max = daddy.value;
        int leftMax = findMax(daddy.kidLeft);
        int rightMax = findMax(daddy.kidRight);
    
        if (leftMax > max) {
            max = leftMax;
        }
    
        if (rightMax > max) {
            max = rightMax;
        }
    
        return max;
    }

    public int findMin(NodeIntTree daddy) {
        if (daddy == null) {
            return Integer.MAX_VALUE;
        }
    
        int min = daddy.value;
        int leftMin = findMin(daddy.kidLeft);
        int rightMin = findMin(daddy.kidRight);
    
        if (leftMin < min) {
            min = leftMin;
        }
    
        if (rightMin < min) {
            min = rightMin;
        }
    
        return min;
    }
    


    
    
        
    
    
    
    




    
       

    

    
    
        
    
    
    

}
        

    





    
    

