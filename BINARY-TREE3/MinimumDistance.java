import java.util.ArrayList; 

public class MinimumDistance {

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

    static class Binarytree {
        static int idx = -1; 

        public static Node buildBinarytree(int nodes[]) {
            idx++; 
            if (nodes[idx] == -1) {
                return null; 
            }
            Node newNode = new Node(nodes[idx]); 
            newNode.leftNode = buildBinarytree(nodes); 
            newNode.rightNode = buildBinarytree(nodes); 
            return newNode; 
        }
    }

    public static void Lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>(); 
        ArrayList<Node> path2 = new ArrayList<>(); 
        getpath(root, n1, path1);
        getpath(root, n2, path2);
        int i = 0; 
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        Node lca = path1.get(i - 1); 
        System.out.println("LCA: " + lca.data); 
        int distance = findDistance(root, n1, n2, lca);
        System.out.println("Minimum Distance: " + distance);
    }

    public static boolean getpath(Node root, int n1, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        if (root.data == n1) {
            path.add(root);
            return true; 
        }
        path.add(root); 
        if (getpath(root.leftNode, n1, path) || getpath(root.rightNode, n1, path)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static int findDistance(Node root, int n1, int n2, Node lca) {
        return findDistanceFromNode(lca, n1, 0) + findDistanceFromNode(lca, n2, 0);
    }

    public static int findDistanceFromNode(Node root, int n, int distance) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return distance;
        }
        int left = findDistanceFromNode(root.leftNode, n, distance + 1);
        if (left != -1) {
            return left;
        }
        int right = findDistanceFromNode(root.rightNode, n, distance + 1);
        if (right != -1) {
            return right;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = Binarytree.buildBinarytree(nodes);
        Lca(root, 4, 6);
    }
}