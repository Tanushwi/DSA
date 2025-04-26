//Q1. Insert a node
//import java.util.LinkedList;
//import java.util.Queue;
//class Node
//{
//    int data;
//    Node left,right;
//    Node(int data)
//    {
//        this.data=data;
//        left=right=null;
//    }
//}
//class Tree3
//{
//    public static void insert(Node root,int key)
//    {
//        Queue<Node>queue=new LinkedList<>();
//        queue.add(root);
//        while(!queue.isEmpty())
//        {
//            Node temp=queue.poll();
//            if(temp.left==null)
//            {
//                temp.left=new Node(key);
//                break;
//            }
//            else
//                queue.add(temp.left);
//            if(temp.right==null)
//            {
//                temp.right=new Node(key);
//                break;
//            }
//            else
//                queue.add(temp.right);
//        }
//    }
//    public static void inorder(Node root)
//    {
//        if(root==null)
//            return;
//        inorder(root.left);
//        System.out.print(root.data+" ");
//        inorder(root.right);
//    }
//    public static void main(String args[])
//    {
//        Node root=new Node(10);
//        root.right=new Node(20);
//        root.left=new Node(30);
//        System.out.println("before insertion");
//        inorder(root);
//        insert(root,40);
//        System.out.println();
//        System.out.println("after insertion");
//        inorder(root);
//    }
//}

//Q2. Delete a node
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Tree3 {
    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else {
                queue.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else {
                queue.add(temp.right);
            }
        }
        return root;
    }

    public static Node deleteNode(Node root, int key) {
        if (root == null) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        Node temp = null, keyNode = null;

        while (!queue.isEmpty()) {
            temp = queue.poll();

            if (temp.data == key) {
                keyNode = temp;
            }

            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }

        if (keyNode != null) {
            temp = getDeepestNode(root);
            keyNode.data = temp.data;
            deleteDeepestNode(root, temp);
        }
        return root;
    }

    public static Node getDeepestNode(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        Node temp = null;
        while (!queue.isEmpty()) {
            temp = queue.poll();

            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }
        return temp;
    }

    public static void deleteDeepestNode(Node root, Node deepestNode) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        Node temp = null;
        while (!queue.isEmpty()) {
            temp = queue.poll();

            if (temp == deepestNode) {
                temp = null;
                return;
            }

            if (temp.right != null) {
                if (temp.right == deepestNode) {
                    temp.right = null;
                    return;
                } else {
                    queue.add(temp.right);
                }
            }

            if (temp.left != null) {
                if (temp.left == deepestNode) {
                    temp.left = null;
                    return;
                } else {
                    queue.add(temp.left);
                }
            }
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(15);
        root.right.right = new Node(25);

        System.out.println("Original tree (inorder):");
        inorder(root);
        System.out.println();

        root = insert(root, 40);
        System.out.println("After insertion (inorder):");
        inorder(root);
        System.out.println();

        root = deleteNode(root, 20);
        System.out.println("After deletion (inorder):");
        inorder(root);
        System.out.println();
    }
}
