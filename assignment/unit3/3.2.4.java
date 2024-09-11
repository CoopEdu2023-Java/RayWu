import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class PostorderTraversalIterative {
    public List<Integer> postorderTraversal(Tree root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<Tree> stack = new Stack<>();
        Stack<Tree> output = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Tree node = stack.pop();
            output.push(node);

            if (node.left != null) {
                stack.push(node.left); // Push left child
            }
            if (node.right != null) {
                stack.push(node.right); // Push right child
            }
        }

        while (!output.isEmpty()) {
            result.add(output.pop().val); // Reverse postorder
        }

        return result;
    }
}
