import java.util.*;
public class binarytree {
    class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    Node root;
    binarytree(){
        root=null;
    }
    void insert(int data){
        root=insertFunction(root,data);
    }
    Node insertFunction(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        else if(data<root.data){
            root.left=insertFunction(root.left, data);
        }
        else if(data>root.data){
            root.right=insertFunction(root.right, data);
        }
        return root;
    }
    void inorder(){
        inOrder(root);
    }
    public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print( " -> "+root.data);
            inOrder(root.right);
        }
    }
    void perorder(){
        preOrder(root);
    }
    public static void preOrder(Node root){
        if(root!=null){
            System.out.print( " -> "+root.data);
            inOrder(root.left);
            inOrder(root.right);
        }
    }
    void postorder(){
        postOrder(root);
    }
    public static void postOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            inOrder(root.right);
            System.out.print( " -> "+root.data);
        }
    }
    public Integer findHeight(){
        return getNodeHeight(this.root);
    }
    private Integer getNodeHeight(Node root) {
        if(root == null) {
            return -1;
        }
        int Height= Math.max(getNodeHeight(root.left), getNodeHeight(root.right))+1;
        return Height;
    }
    int minvalue() { 
        Node current = root; 
        while (current.left != null) { 
            current = current.left; 
        } 
        return (current.data); 
    }
    int maxvalue() { 
        Node cur = root; 
        while (cur.right != null) { 
            cur = cur.right; 
        } 
        return (cur.data); 
    } 
    void printGivenLevel (Node root ,int level) 
    { 
        if (root == null) 
            return; 
        if (level == 1) 
            System.out.print(root.data + " "); 
        else if (level > 1) 
        { 
            printGivenLevel(root.left, level-1); 
            printGivenLevel(root.right, level-1); 
        } 
    } 
    void printLevelOrder() 
    { 
        int h = findHeight(); 
        int i; 
        for (i=1; i<=h+1; i++) 
            printGivenLevel(root, i); 
    }
    void mirror(){ 
        root = mirror(root); 
    } 
    Node mirror(Node node) { 
        if (node == null) 
            return node; 
        Node left = mirror(node.left); 
        Node right = mirror(node.right); 
        node.left = right; 
        node.right = left; 
        return node; 
    }
    public static void main(String args[]){
        binarytree obj =new binarytree();
        obj.insert(60);
        obj.insert(20);
        obj.insert(10);
        obj.insert(40);
        obj.insert(70);
        obj.insert(60);
        obj.insert(80);
        obj.insert(100);
        System.out.println("inorder");
        obj.inorder();
        System.out.println("\npreorder");
        obj.perorder();
        System.out.println("\npostorder");
        obj.postorder();
        System.out.println("\nHeight of the tree: "+obj.findHeight());
        System.out.println("Minimum element : "+obj.minvalue());
        System.out.println("Maximum element : "+obj.maxvalue());
        obj.printLevelOrder();
    }
}