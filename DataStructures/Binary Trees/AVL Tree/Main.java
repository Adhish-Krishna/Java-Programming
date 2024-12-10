class AVLTree{
  public class TreeNode{
    public int data;
    public int height;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int data){
      this.data = data;
      this.height = 1;
      this.left = null;
      this.right = null;
    }
  }
  int GetHeight(TreeNode node){
    if(node == null)return 0;
    return node.height;
  }
  int GetBalanceFactor(TreeNode node){
    if(node == null)return 0;
    return GetHeight(node.left) - GetHeight(node.right);
  }
  void UpdateHeight(TreeNode node){
    int left_h = GetHeight(node.left);
    int right_h = GetHeight(node.right);
    node.height = (left_h>right_h?left_h:right_h) + 1;
  }
  TreeNode RightRotate(TreeNode y){
    TreeNode x = y.left;
    TreeNode T2 = x.right;
    x.right = y;
    y.left = T2;
    UpdateHeight(y);
    UpdateHeight(x);
    return x;
  }
  TreeNode LeftRotate(TreeNode y){
    TreeNode x = y.right;
    TreeNode T2 = x.left;
    x.left = y;
    y.right = T2;
    UpdateHeight(y);
    UpdateHeight(x);
    return x;
  }
  public TreeNode InsertNode(TreeNode root , int data){
    if(root == null){
      return new TreeNode(data);
    }
    if(data < root.data){
      root.left = InsertNode(root.left, data);
    }
    else if(data > root.data){
      root.right = InsertNode(root.right , data);
    }
    else{
      return root;
    }
    UpdateHeight(root);
    int balance  = GetBalanceFactor(root);
    if(balance>1 && data < root.left.data){
      return RightRotate(root);
    }
    if(balance<-1 && data > root.right.data){
      return LeftRotate(root);
    }
    if(balance>1 && data>root.left.data){
      root.left = LeftRotate(root.left);
      return RightRotate(root);
    }
    if(balance<-1 && data<root.right.data){
      root.right = RightRotate(root.right);
      return LeftRotate(root);
    }
    return root;
  }
  public void PreOrderTraversal(TreeNode root){
    if(root == null)return;
    System.out.print(root.data+" ");
    PreOrderTraversal(root.left);
    PreOrderTraversal(root.right);
  }
  public void InOrderTraversal(TreeNode root){
    if(root == null)return;
    InOrderTraversal(root.left);
    System.out.print(root.data+" ");
    InOrderTraversal(root.right);
  }
}

public class Main{
  public static void main(String[] args) {
    AVLTree tree = new AVLTree();
    AVLTree.TreeNode root = null;
    root = tree.InsertNode(root, 10);
    root = tree.InsertNode(root, 20);
    root = tree.InsertNode(root, 30);
    root = tree.InsertNode(root, 40);
    root = tree.InsertNode(root, 0);
    root = tree.InsertNode(root, 5);
    root = tree.InsertNode(root, 12);
    root = tree.InsertNode(root, 3);
    root = tree.InsertNode(root, 5);
    root = tree.InsertNode(root, 60);
    tree.PreOrderTraversal(root);
    System.out.println("\n");
    tree.InOrderTraversal(root);
  }
}