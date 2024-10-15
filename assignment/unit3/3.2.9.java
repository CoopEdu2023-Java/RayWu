class IsAVLtree {
    public static boolean IsAVL(int[] root) {
        int layersLeft = 0;
        int layersRight = 0;
        int x = 2;
        for (int i = 1; i < root.length; i += x + 1) {
            if (root[i] == 0) {
                i += x + 1;
            }
            layersLeft ++;
        }
        for (int i = 2; i < root.length; i += x + 1) {
            if (root[i] == 0) {
                i += x + 1;
            }
            layersRight ++;
        }
        if (layersLeft == layersRight || layersLeft == layersRight + 1 || layersLeft == layersRight - 1) {
            return true;
    } else {
        return false;
        }
    }
    public static void main(String[] args) {
        int[] array = {3, 9, 20, 0, 0, 15, 7};
        IsAVLtree.IsAVL(array);
    }
}