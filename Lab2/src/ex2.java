public class ex2 {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a'};
        //for (int i = 0; i < chars.length; i++)
        for (char c : chars){
            System.out.println(c);
        }
        System.out.println(chars);
        String value = new String(chars);

        int[][] intMatrix = new int[3][3];
        intMatrix[0][0] = 0;
        intMatrix[2][2] = 22;
        for (int i[]  : intMatrix){
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        char[][] multidimCharArray = {{'c', 'f'}, {'2'}};
        //System.out.println(multidimCharArray);

        char[][] chars1 = new char[3][];

        int[][] ints = new int[3][];
        ints[0] = new int[2];
        ints[0][0] = 1;
        ints[0][1] = 2;
        ints[1] = new int[] {4, 5, 67};
        ints[2] = new int[]{33, 44};
        displayArrayValues(ints);
    }

    private static void displayArrayValues(int[][] input) {
        for (int[] i : input) {
            for (int j : i) {
                System.out.print(j + " ");
            }
        System.out.println();
        }
    }
}
