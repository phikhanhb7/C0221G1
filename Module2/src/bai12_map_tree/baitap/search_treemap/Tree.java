package bai12_map_tree.baitap.search_treemap;


public interface Tree<E> {
    boolean insert(E e);

    void inorder();

    int getSize();

}
