//inorder successor of BST

public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {

	TreeNode cur=null;
	while(root!=null){
		if(root.val>p.val){
			cur=root;
			root=root.left;
		}	
		else
		{
			root=root.right;
		}
	}
	return cur;
        
}