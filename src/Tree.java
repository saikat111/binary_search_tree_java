public class Tree {
    private TreeNode root;
    public void insert(int value){
        if(root == null){
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }

    public void traverseInorder(){
        if(root != null){
            root.traverseInorder();
        }
    }
    public void traversePreorder(){
        if(root != null){
            root.traversePreorder();
        }
    }
    public void traversePostorder(){
        if(root != null){
            root.traversePostorder();
        }
    }
    public TreeNode get(int value){
        if(root != null){
            return  root.get(value);
        }
        return null;
    }
    public int min(){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        else {
           return root.min();
        }
    }
    public int max(){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        else {
            return root.max();
        }
    }

}
