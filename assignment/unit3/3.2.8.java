class AVLTree {
    private Node root;

    private static class Node {
        int key;
        Node left;
        Node right;
        int height;

        Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
            this.height = 1;
        }
    }

    public int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    public int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    public void updateHeight(Node node) {
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }

    public Node rightRotate(Node node) {
        Node temp = node.left;
        node.left = temp.right;
        temp.right = node;
        updateHeight(node);
        updateHeight(temp);
        return temp;
    }

    public Node leftRotate(Node node) {
        Node temp = node.right;
        node.right = temp.left;
        temp.left = node;
        updateHeight(node);
        updateHeight(temp);
        return temp;
    }

    public Node rebalance(Node node) {
        int balance = getBalance(node);
        if (balance > 1) {
            if (getBalance(node.left) < 0) {
                node.left = leftRotate(node.left);
            }
            return rightRotate(node);
        } else if (balance < -1) {
            if (getBalance(node.right) > 0) {
                node.right = rightRotate(node.right);
            }
            return leftRotate(node);
        }
        return node;
    }

    public Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else {
            return node;
        }
        updateHeight(node);
        return rebalance(node);
    }

    public Node delete(Node node, int key) {
        if (node == null) {
            return null;
        }
        if (key < node.key) {
            node.left = delete(node.left, key);
        } else if (key > node.key) {
            node.right = delete(node.right, key);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                Node temp = node.right;
                while (temp.left != null) {
                    temp = temp.left;
                }
                node.key = temp.key;
                node.right = delete(node.right, temp.key);
            }
        }
        if (node == null) {
            return null;
        }
        updateHeight(node);
        return rebalance(node);
    }

    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.key + " ");
            inorderTraversal(node.right);
        }
    }

    public void insert(int key) {
        root = insert(root, key);
    }

    public void delete(int key) {
        root = delete(root, key);
    }

    public void printTree() {
        inorderTraversal(root);
    }
}