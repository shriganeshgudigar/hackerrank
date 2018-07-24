package advancedJava;

public interface Tree{
    public Node getNewNode(int data);
    public Node insertNode(int data, Node nodeAdd);
}

interface DisplayTree{
    public void preOrderDisplay(Node nodeAdd);
    public void postOrderDisplay(Node nodeAdd);
    public void inOrderDisplay(Node nodeAdd);
}



