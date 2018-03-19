import java.io.*;
class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinarySearchTree {
	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
   static int getMax(int a, int b) {
            if (a>=b) {
                return a;
            } else {
                return b;
            }
    }

	static int height(Node root) {
      	// Write your code here.
        if (root == null) {
            return -1;
        }

        int hl = height(root.left);
        int hr = height(root.right);
        int h = 1 + getMax(hl, hr);
        return h;
    }

   public static Node insert(Node root, int data) {
        if(root == null){
            return new Node(data);
        }
        else {
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }
            else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
 }
