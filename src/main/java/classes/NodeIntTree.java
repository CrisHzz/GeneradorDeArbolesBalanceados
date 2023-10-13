package classes;

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
        count = 0;
        countNodes(this);
        System.out.println(count);
    }
    
    private void countNodes(NodeIntTree daddy){
        if(daddy != null){
            count++;
            countNodes(daddy.kidLeft);
            countNodes(daddy.kidRight);
        }
    }
    

    public void treeLeafsQuantity(){
        count = 0;
        countLeafs(this);
        System.out.println(count);
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
    
    public int treeHeight(NodeIntTree dad) {
        if (dad == null) {
            return 0;
        } else {
            int leftHeight = treeHeight(dad.kidLeft);
            int rightHeight = treeHeight(dad.kidRight);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
    
}
        

    





    
    

