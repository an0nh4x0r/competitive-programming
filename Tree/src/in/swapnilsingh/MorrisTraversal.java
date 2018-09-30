package in.swapnilsingh;

public class MorrisTraversal {

    public void inOrder(Node root) {

        Node current = root;
        while (current != null) {
            // left is null, print the node and go to right
            if (current.left == null) {
                System.out.println(current.data + " ");
                current = current.right;
            } else {
                // find the predecessor
                Node predecessor = current.left;
                // To find the predecessor keep going right till the right node is not null or right node is not current.
                while (predecessor.right != current && predecessor.right != null) {
                    predecessor = predecessor.right;
                }
                // if right node is null then go left after establishing link from predecessor to current
                if (predecessor.right == null) {
                    predecessor.right = current;
                    current = current.left;
                } else { // left tree is already visited. Go right after visiting current
                    predecessor.right = null;
                    System.out.println(current.data + " ");
                    current = current.right;
                }
            }
        }

    }

}
