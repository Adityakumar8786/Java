import java.util.HashMap;

public class DuplicateSubtree {

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

        public static Node buildBinaryTree(int nodes[]) {
            idx++; // Increment index to process the next node
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.leftNode = buildBinaryTree(nodes);
            newNode.rightNode = buildBinaryTree(nodes);

            return newNode;
        }
    }

    static HashMap<String, Integer> map = new HashMap<>();

    public static String findDuplicate(Node root) {
        if (root == null) {
            return "$";
        }

        String str = "(";
        str += findDuplicate(root.leftNode);
        str += Integer.toString(root.data);
        str += findDuplicate(root.rightNode);
        str += ")";

        if (map.get(str) != null && map.get(str) == 1) {
            System.out.print(root.data + " ");
        }

        if (map.containsKey(str)) {
            map.put(str, map.get(str) + 1);
        } else {
            map.put(str, 1);
        }

        return str;
    }

    public static void main(String[] args) {
        // Example tree: 
        //       1
        //      / \
        //     2   3
        //    / \  / \
        //   4  5 4  5
        // The subtrees rooted at 4 and 5 are duplicated
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 4, -1, -1, 5, -1, -1};
        
        BinaryTree.idx = -1; // Reset index before building
        Node root = BinaryTree.buildBinaryTree(nodes);
        
        System.out.println("Root nodes of duplicate subtrees:");
        findDuplicate(root);
        
        // Print final HashMap for reference
        System.out.println("\nFinal HashMap: " + map);
    }
}