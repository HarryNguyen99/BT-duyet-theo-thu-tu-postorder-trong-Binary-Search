public class TestBST {

    public static void main(String[] args) {

        BST<String> tree = new BST<>();
        tree.insert("45");
        tree.insert("34");
        tree.insert("56");
        tree.insert("39");
        tree.insert("59");
        tree.insert("23");
        tree.insert("48");

        System.out.println("Inorder (đã sắp xếp): ");
        tree.inorder();
        System.out.println("postorder (đã sắp xếp): ");
        tree.postorder();
        System.out.println("preorder (đã sắp xếp): ");
        tree.preorder();
        System.out.println("Số lượng nút là: " + tree.getSize());
    }
}
