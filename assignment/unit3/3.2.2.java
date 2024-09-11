import java.util.ArrayList;
import java.util.List;

class PreorderTraversal {
    public List<Integer> preorderTraversal(Tree root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    private void preorderHelper(Tree node, List<Integer> result) {
        if (node != null) {
            result.add(node.val); // Visit the root
            preorderHelper(node.left, result); // Traverse left subtree
            preorderHelper(node.right, result); // Traverse right subtree
        }
    }
}
