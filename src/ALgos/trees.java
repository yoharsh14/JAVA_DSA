package ALgos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class trees {

         class TreeNode{
            int data;
            TreeNode left;
            TreeNode right;
            TreeNode(int data){
                this.data = data;
                this.left = this.right=null;
            }
        }
    TreeNode root;
    trees(){
        root=null;
    }
    public TreeNode insert(TreeNode root,int DataToBeInserted){
        if(root==null){
            root = new TreeNode(DataToBeInserted);
            return root;
        }
        else if(DataToBeInserted<root.data){
           root.left= insert(root.left,DataToBeInserted);
        }
        else if(DataToBeInserted>root.data){
           root.right= insert(root.right,DataToBeInserted);
        }
        return root;
    }

    public TreeNode search(TreeNode root,int DataToBeSearched){
        if(root==null||root.data==DataToBeSearched){
            return root;
        }
         if(DataToBeSearched>root.data){
           return search(root.right,DataToBeSearched);
        }
        else{
            return  search(root.left,DataToBeSearched);
        }

    }
    public void inOrder(TreeNode root){
        if(root==null)
            return;
        inOrder(root.left);
        System.out.println(" "+root.data);
        inOrder(root.right);
    } public void postOrder(TreeNode root){
        if(root==null)
            return;
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(" "+root.data);
    }
    public  void preOrder(TreeNode root){
        if(root==null)
            return;
        System.out.print(" "+root.data);
        inOrder(root.left);
        inOrder(root.right);
       ;
    }

    //wrapper methods which will increase the readability of the code and one can identify the flow of the code.
    public void insertIntoTree(int data){
        root = insert(root,data);
    }
    public TreeNode searchTree(int data){
        return search(root,data);
    }
    public void inOrderTraversal(){
        inOrder(root);
    }   public void postorderTraversal(){
        postOrder(root);
    } public void preorderTraversal(){
        preOrder(root);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int ch;
        trees tr = new trees();
        do {
            System.out.println("Menu");
            System.out.println("1.Insert");
            System.out.println("2.Search");
            System.out.println("3.Inorder Traversal");
            System.out.println("4.preorder Traversal");
            System.out.println("5.postorder Traversal");
            System.out.println("6.Exit");
            ch = Integer.parseInt(br.readLine());
             switch (ch){
                 case 1:System.out.println("Enter how many number you want to enter");
                 int d = Integer.parseInt(br.readLine());
                 for(int i=1;i<=d;i++){
                     System.out.println("enter element number "+i);
                     int num = Integer.parseInt(br.readLine());
                     tr.insertIntoTree(num);
                 }
                 break;
                 case 2:
                     System.out.println("Enter which element you want to search");
                     int num = Integer.parseInt(br.readLine());
                    if(tr.searchTree(num)!=null)
                        System.out.println("Number is present");
                    else System.out.println("Number is absent");
                     break;
                 case 3:
                     System.out.println("Inorder Traversal of tree");
                     tr.inOrderTraversal();
                     System.out.println("");
                     break;
                 case 4:
                     System.out.println("preorder Traversal of tree");
                     tr.preorderTraversal();
                     System.out.println("");
                     break;
                 case 5:
                     System.out.println("postorder Traversal of tree");
                     tr.postorderTraversal();
                     System.out.println("");
                 break;
                 case 6:ch = 6;
                 break;
             }
        }while (ch!=6);
    }
}
