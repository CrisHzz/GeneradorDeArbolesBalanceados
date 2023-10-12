package classes;

import java.util.LinkedList;
import java.util.Queue;

public class NodeInt {
    NodeInt kidLeft;
    NodeInt kidRight;
    int value;
    int count;

    public NodeInt() {
        count=0;
    }

    public NodeInt(int value){
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

    public void inOrder(){
        
        if(kidLeft!=null){
            kidLeft.preOrder();
        }
        System.out.println(value);

        if(kidRight!=null){
            kidRight.preOrder();
        }
    }

    public void postOrder(){
        
        if(kidLeft!=null){
            kidLeft.preOrder();
        }

        if(kidRight!=null){
            kidRight.preOrder();
        }
        System.out.println(value);
    }

    public void nodesQuantity(){
        if(kidLeft!=null){
            kidLeft.nodesQuantity();
        }
        if(kidRight!=null){
            kidRight.nodesQuantity();
        }
        count++;
        System.out.println(count);
    }

    public void treeLeafsQuantity(){
        if(kidLeft!=null){
            kidLeft.treeLeafsQuantity();
        }
        if(kidRight!=null){
            kidRight.treeLeafsQuantity();
        }
        if(kidLeft==null && kidRight==null){
            count++;
        }
        System.out.println(count);
    }

    public void treeLevels() {
    Queue<NodeInt> queue = new LinkedList<>();
    queue.add(this);
    int levelCount = 1;
    int currentLevel = 0;
    while (!queue.isEmpty()) {
        NodeInt node = queue.poll();
        levelCount--;
        if (node.kidLeft != null) {
            queue.add(node.kidLeft);
        }
        if (node.kidRight != null) {
            queue.add(node.kidRight);
        }
        if (levelCount == 0) {
            currentLevel++;
            levelCount = queue.size();
        }
    }
    System.out.println(currentLevel);
}
        

    





    
    
}
