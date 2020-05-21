package Bin_tree;

/**
 * @author: Dennis
 * @date: 2019/5/27 21:11
 */

public interface bin_tree<E> {
    void add(E e);

    boolean contains(E e);

    /**
     * 前序遍历
     */
    void preOrder();

    /**
     * 中序遍历
     */
    void inOrder();

    /**
     * 后序遍历
     */
    void postOeder();

    void levelOrder();

    /**
     * 取得最小值
     *
     * @return
     */
    E getMin();

    E getMax();

    E removeMin();

    E removeMax();

    /**
     * 移除二叉树中指定值的节点
     *
     * @param e
     * @return
     */
    void remove(E e);

    int size();

}
