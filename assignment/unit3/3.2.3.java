import java.util.ArrayList;
import java.util.List;

class InorderTraversal {
    public List<Integer> inorderTraversal(Tree root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    private void inorderHelper(Tree node, List<Integer> result) {
        if (node != null) {
            inorderHelper(node.left, result); // Traverse left subtree
            result.add(node.val); // Visit the root
            inorderHelper(node.right, result); // Traverse right subtree
        }
    }
}
