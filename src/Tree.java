public interface Tree <E> {
    /**
     * Chèn phần tử e vào cây tìm kiếm nhị phân.
     * Trả về true nếu phần tử được chèn thành công.
     */
    public boolean insert(E e);

    public void inorder();

    public void postorder();

    public void preorder();


    /**
     * Lấy số lượng nút trong cây
     */
    public int getSize();
}
