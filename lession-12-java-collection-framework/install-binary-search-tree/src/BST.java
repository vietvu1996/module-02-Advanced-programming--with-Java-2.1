public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

//    public BST(E[] object) {
//        for (E e : object) {
//            insert(e);
//        }
//    }

    protected TreeNode<E> creatNewNode(E e){
        return new TreeNode<>(e);
    }

    @Override
    public void insert(E e) {
        if (root == null) {
            root = creatNewNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null){
                if(e.compareTo(current.element) < 0){
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                }
                else return;
            }
            if(e.compareTo(parent.element) < 0)
                parent.left = creatNewNode(e);
            else
                parent.right = creatNewNode(e);
        }
        size++;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }
    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
}
