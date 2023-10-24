public interface Tree<E> {
    void insert(E e);
    void inorder();
    void postorder();
    void preorder();
    int getSize();
}
