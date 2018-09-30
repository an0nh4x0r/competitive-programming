package in.swapnilsingh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(12);

        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        binaryTreeTraversal.preOrder(root);
        System.out.println();
        binaryTreeTraversal.inOrder(root);
        System.out.println();
        binaryTreeTraversal.postOrder(root);

        System.out.println();
        MorrisTraversal morrisTraversal = new MorrisTraversal();
        morrisTraversal.inOrder(root);

    }
}
