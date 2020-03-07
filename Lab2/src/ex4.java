import java.util.Arrays;

public class ex4 {
    public static void main(String[] args) {
        int[][] ints = new int[2][];
        ints[0] = new int[]{3, 5, 7};
        ints[1] = new int[]{1, 4, 7, 8, 9};

        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.deepToString(ints));
        System.out.println(Arrays.hashCode(ints));
        System.out.println(Arrays.deepHashCode(ints));

        short[] shortArrays = new short[5];
        Arrays.fill(shortArrays, (short)10);
        System.out.println(Arrays.toString(shortArrays));
    }
}
