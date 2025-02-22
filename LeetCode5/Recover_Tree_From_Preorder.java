package LeetCode5;
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
public class Recover_Tree_From_Preorder {
	private static int i=0;
	public static TreeNode recoverFromPreorder(String traversal) {
        return helper(traversal,0);
    }
	private static TreeNode helper(String s, int depth) {
        int n = s.length();
        int dashCount = 0;
        while (i < n && s.charAt(i) == '-') {
            dashCount++;
            i++;
        }
        if (dashCount != depth) {
            i -= dashCount; 
            return null;
        }
        int num = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            i++;
        }
        TreeNode root = new TreeNode(num);
        root.left = helper(s, depth + 1);
        root.right = helper(s, depth + 1);
        return root;
	}


	public static void main(String[] args) {
		String s = "1-2--3--4-5--6--7";
//		System.out.println(recoverFromPreorder(s));

	}

}
