//Q1. Inorder traversal
//class TreeNode
//{
//    int data;
//    TreeNode left,right;
//    TreeNode(int data)
//    {
//        this.data=data;
//        left=right=null;
//    }
//}
//class Tree1
//{
//    public static void inorder(TreeNode root)
//    {
//        if(root==null)
//            return;
//        inorder(root.left);
//        System.out.print(root.data+" ");
//        inorder(root.right);
//    }
//    public static void main(String args[])
//    {
//        TreeNode root=new TreeNode(1);
//        root.left=new TreeNode(2);
//        root.right=new TreeNode(3);
//        root.left.left=new TreeNode(4);
//        root.left.right=new TreeNode(5);
//        inorder(root);
//    }
//}

//Q2. Maximum depth of the binary tree/Height of the binary tree
/*class TreeNode
{
    int data;
    TreeNode left,right;
    TreeNode(int data)
    {
        this.data=data;
        left=right=null;
    }
}
class Tree1
{
    public static int height(TreeNode root)
    {
        if(root==null)
            return 0;
        int leftnode=height(root.left);
        int rightnode=height(root.right);
        return 1+Math.max(leftnode,rightnode);
    }
    public static void main(String args[])
    {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        System.out.println("Height of the tree is:"+height(root));
    }
}*/

//Q3. Count total nodes in a binary tree
//class TreeNode
//{
//    int data;
//    TreeNode left,right;
//
//    TreeNode(int value)
//    {
//        data=value;
//        left=null;
//        right=null;
//    }
//}
//class Tree1
//{
//    public static int count(TreeNode root)
//    {
//        if(root==null)
//            return 0;
//        return 1+count(root.left)+count(root.right);
//    }
//    public static void main(String args[])
//    {
//        TreeNode root=new TreeNode(1);
//        root.left=new TreeNode(2);
//        root.left.left=new TreeNode(4);
//        root.left.left.left=new TreeNode(8);
//        root.left.left.right=new TreeNode(9);
//        root.left.right=new TreeNode(5);
//        root.left.right.left=new TreeNode(10);
//        root.left.right.right=new TreeNode(13);
//
//        root.right=new TreeNode(3);
//        root.right.left=new TreeNode(6);
//        root.right.right=new TreeNode(7);
//        root.right.left.left=new TreeNode(11);
//        root.right.left.right=new TreeNode(12);
//        root.right.right.left=new TreeNode(14);
//        root.right.right.right=new TreeNode(15);
//
//        System.out.println(count(root));
//    }
//}

//Q4. Search a node in a binary tree
//class TreeNode
//{
//    int data;
//    TreeNode left,right;
//
//    TreeNode(int value)
//    {
//        data=value;
//        left=null;
//        right=null;
//    }
//}
//class Tree1
//{
//    public static boolean search(TreeNode root,int value)
//    {
//        if(root==null)
//            return true;
//        if(root.data==value)
//            return true;
//        return search(root.left,value)||search(root.right,value);
//    }
//    public static void main(String args[])
//    {
//        TreeNode root=new TreeNode(1);
//        root.left=new TreeNode(2);
//        root.left.left=new TreeNode(4);
//        root.left.left.left=new TreeNode(8);
//        root.left.left.right=new TreeNode(9);
//        root.left.right=new TreeNode(5);
//        root.left.right.left=new TreeNode(10);
//        root.left.right.right=new TreeNode(13);
//
//        root.right=new TreeNode(3);
//        root.right.left=new TreeNode(6);
//        root.right.right=new TreeNode(7);
//        root.right.left.left=new TreeNode(11);
//        root.right.left.right=new TreeNode(12);
//        root.right.right.left=new TreeNode(14);
//        root.right.right.right=new TreeNode(15);
//
//        int val=7;
//        System.out.println(search(root,val));
//    }
//}
