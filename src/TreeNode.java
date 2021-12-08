public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightNode;

    public void insert(int value){
        if(data == value){
            return;
        }
        if(value < data){
            if(leftChild == null){
                leftChild = new TreeNode(value);
            }
            else {
                leftChild.insert(value);
            }
        }
        else {
            if(rightNode == null){
                rightNode = new TreeNode(value);
            }
            else {
                rightNode.insert(value);
            }
        }
    }
    public void traverseInorder(){
        if(leftChild != null){
            leftChild.traverseInorder();
        }
        System.out.print(data + " ");
        if(rightNode != null){
            rightNode.traverseInorder();
        }
    }
    public void traversePreorder(){
        System.out.print(data + " ");
        if(leftChild != null){
            leftChild.traversePreorder();
        }
        if(rightNode != null){
            rightNode.traversePreorder();
        }

    }
    public void traversePostorder(){

        if(leftChild != null){
            leftChild.traversePostorder();
        }
        if(rightNode != null){
            rightNode.traversePostorder();
        }
        System.out.print(data + " ");
    }

    public  TreeNode get(int value){
        if (value == data)
        {
            return this;
        }
        if(value < data){
            if(leftChild != null){
                return leftChild.get(value);
            }

        }
        if(value > data){
            if(rightNode != null){
                return rightNode.get(value);
            }

        }
        return null;
    }

    public int min(){
        if(leftChild == null){
            return data;
        }
        else {
            return leftChild.min();
        }
    }
    public int max(){
        if(rightNode == null){
            return data;
        }
        else {
            return rightNode.max();
        }
    }





    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
