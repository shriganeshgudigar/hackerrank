package advancedJava;

public class MyTree implements Tree, DisplayTree{

    public Node getNewNode(int data){
        return new Node(data);
    }

    public Node insertNode(int data, Node nodeAdd){
        if(nodeAdd == null){
            return getNewNode(data);
        }else{
            if(data <= nodeAdd.data){
                nodeAdd.leftPtr = insertNode(data, nodeAdd.leftPtr);
            }else{
                nodeAdd.rightPtr = insertNode(data, nodeAdd.rightPtr);
            }
            return nodeAdd;
        }
    }

    /*
        leftPointerData - pointer - rightPointerData
     */
    public void inOrderDisplay(Node nodeAdd) {
        if(nodeAdd == null){
            return;
        }else{
            inOrderDisplay(nodeAdd.leftPtr);
            System.out.println(nodeAdd.data);
            inOrderDisplay(nodeAdd.rightPtr);
        }
    }

    public void postOrderDisplay(Node nodeAdd){
        if(nodeAdd == null){
            return;
        }else{
            postOrderDisplay(nodeAdd.leftPtr);
            postOrderDisplay(nodeAdd.rightPtr);
            System.out.println(nodeAdd.data);
        }
    }

    public  void preOrderDisplay(Node nodeAdd){
        if(nodeAdd == null){
            return;
        }else{
            System.out.println(nodeAdd.data);
            preOrderDisplay(nodeAdd.leftPtr);
            preOrderDisplay(nodeAdd.rightPtr);
        }
    }

    public int findMin(Node nodeAdd){
        if(nodeAdd.leftPtr == null){
            return nodeAdd.data;
        }else{
            return findMin(nodeAdd.leftPtr);
        }
    }

    public int findMax(Node nodeAdd){
        if(nodeAdd.rightPtr == null){
            return nodeAdd.data;
        }else{
            return findMax(nodeAdd.rightPtr);
        }
    }
}