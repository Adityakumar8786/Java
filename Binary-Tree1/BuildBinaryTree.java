public class BuildBinaryTree {

    static class Node {
        int data;
        Node leftNode;
        Node rightNode;

        Node(int data) {
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildbinarytree(int nodes[]) {
            idx++; // Increment idx
            if (idx >= nodes.length || nodes[idx] == -1) { // Check bounds or null node
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.leftNode = buildbinarytree(nodes);
            newNode.rightNode = buildbinarytree(nodes);
            return newNode;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // Call the static method directly using the class name
        Node root = BinaryTree.buildbinarytree(nodes);

        // Print the data of the right child of the root
        System.out.println(root.rightNode.data); // Should print 3
    }
}