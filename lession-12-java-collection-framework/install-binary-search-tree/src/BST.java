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

    protected TreeNode<E> creatNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public void insert(E e) {
        if (root == null) {
            root = creatNewNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else return;
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = creatNewNode(e);
            else
                parent.right = creatNewNode(e);
        }
        size++;
    }

    public boolean delete(E e) {
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null) {
            int compare = e.compareTo(current.element);
            if (compare == 0) {
                break;
            }
            parent = current;
            if (compare < 0) current = current.left;
            else current = current.right;
        }
        if (current == null) return false;
        if (current.left == null) replaceNode(parent, current, current.right);
        else if (current.right == null) replaceNode(parent, current, current.left);
        else {
            TreeNode<E> min = findMin(current.right);
            current.element = min.element;
            deleteMin(current);
        }

        size--;
        return true;
    }

    private void replaceNode(TreeNode<E> parent, TreeNode<E> current, TreeNode<E> newNode) {
        if (parent == null) {
            root = newNode;
        } else if (current == parent.left) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    private TreeNode<E> findMin(TreeNode<E> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    private void deleteMin(TreeNode<E> node) {
        while (node.right != null) {
            TreeNode<E> parent = node;
            node = node.right;
        }
    }

    private static class TreeNodeWithParent<E> {
        TreeNode<E> node;
        TreeNode<E> parent;
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

    protected void postorder(TreeNode<E> root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.element + " ");
    }

    @Override
    public void postorder() {
        postorder(root);
    }

    protected void preorder(TreeNode<E> root) {
        if (root == null) return;
        System.out.println(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }

    @Override
    public void preorder() {
        preorder(root);
    }

}
