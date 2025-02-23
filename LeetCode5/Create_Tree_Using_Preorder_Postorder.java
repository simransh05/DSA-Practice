package LeetCode5;

public class Create_Tree_Using_Preorder_Postorder {
    static int pre ,post;
    public static TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode root = new TreeNode();
        root.val=preorder[pre];
        pre++;
        if(root.val!=postorder[post]){
            root.left=constructFromPrePost(preorder,postorder);
        }if(root.val!=postorder[post]){
            root.right=constructFromPrePost(preorder,postorder);
        }post++;
        return root;
    }
    public static void main(String[] args) {
		int[] pre = {1,2,4,5,3,6,7};
		int [] post= {4,5,2,6,7,3,1};
		System.out.println(constructFromPrePost(pre,post));
	}
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}