
//Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {

    Stack<TreeNode> stk;
    public BSTIterator(TreeNode root) {
        
        stk=new Stack<TreeNode>();
        while(root!=null)
        {
            stk.push(root);
            root=root.left;
        }
        
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        
        if(stk.isEmpty())
        {
            return false;
        }
        else
        {
            return true;
        }
        
    }

    /** @return the next smallest number */
    public int next() {
        
        TreeNode temp=stk.pop();
        int result=temp.val;
        if(temp.right!=null)
        {
            temp=temp.right;
            while(temp!=null)
            {
                stk.push(temp);
                temp=temp.left;
            }
        }
        return result;
        
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */