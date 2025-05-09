//Q1. Printing nodes in a particular level
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
//class Tree2
//{
//    public static void printLevel(Node root,int k)
//    {
//        if(root==null)
//            return;
//        if(k==1)
//            System.out.print(root.data+" ");
//        else {
//            printLevel(root.left, k - 1);
//            printLevel(root.right, k - 1);
//        }
//    }
//    public static void main(String args[])
//    {
//        Node root=new Node(10);
//        root.left=new Node(20);
//        root.right=new Node(30);
//        root.left.left=new Node(40);
//        root.left.right=new Node(50);
//        root.right.left=new Node(60);
//        root.right.right=new Node(70);
//        System.out.println("Nodes at level3:");
//        printLevel(root,3);
//    }
//}

//Q2. Maximum value from the binary tree
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
//class Tree2
//{
//    public static int maximum(Node root)
//    {
//        if(root==null)
//            return 0;
//        return Math.max(root.data,(Math.max(maximum(root.left),maximum(root.right))));
//    }
//    public static void main(String args[])
//    {
//        Node root=new Node(12);
//        root.left=new Node(24);
//        root.right=new Node(36);
//        System.out.println("Maximum value is:"+maximum(root));
//    }
//}

//Q3. Count Leaf nodes in a binary tree
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
//class Tree2
//{
//    public static int countleaves(Node root) {
//        if(root==null)
//            return 0;
//        if(root.left==null && root.right==null)
//            return 1;
//        return countleaves(root.left)+countleaves(root.right);
//    }
//    public static void main(String args[])
//    {
//        Node root=new Node(12);
//        root.left=new Node(24);
//        root.right=new Node(36);
//        System.out.println("Number of leaves in binary tree:"+countleaves(root));
//    }
//}

//Q4. Find the total sum of all nodes values in binary tree
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
//class Tree2
//{
//    static int sum(Node root)
//    {
//        if(root==null)
//            return 0;
//        return root.data+sum(root.left)+sum(root.right);
//    }
//    public static void main(String args[])
//    {
//        Node root=new Node(12);
//        root.left=new Node(24);
//        root.right=new Node(36);
//        System.out.println(sum(root));
//    }
//}

//Q5. Traverse binary tree in postorder
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
//class Tree2
//{
//    public static void postorder(Node root)
//    {
//        if(root==null)
//            return;
//        postorder(root.left);
//        postorder(root.right);
//        System.out.print(root.data+" ");
//    }
//    public static void main(String args[])
//    {
//        Node root=new Node(12);
//        root.left=new Node(24);
//        root.right=new Node(36);
//        postorder(root);
//    }
//}

//Q6. Insert a new node in the first available position
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
//class Tree2
//{
//    public static Node insert(Node root, int value) {
//        Node newNode = new Node(value);
//
//        if (root == null) {
//            return newNode;
//        }
//
//        if (root.left == null) {
//            root.left = newNode;
//            return root;
//        }
//
//        if (root.right == null) {
//            root.right = newNode;
//            return root;
//        }
//
//        Node inserted = insert(root.left, value);
//        if (inserted != null) {
//            return root;
//        }
//
//        insert(root.right, value);
//        return root;
//    }
//
//    public static void preorder(Node root)
//    {
//        if(root==null)
//            return;
//        System.out.print(root.data+" ");
//        preorder(root.left);
//        preorder(root.right);
//    }
//    public static void main(String args[])
//    {
//        Node root=new Node(10);
//        root.left=new Node(20);
//        root.right=new Node(30);
//        preorder(root);
//        System.out.println();
//        insert(root,40);
//        preorder(root);
//    }
//}