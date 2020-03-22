package arrays;

import java.util.Arrays;

public class MyArrayList {

    private int max;
    private int index;
    private float[] arr;

    public MyArrayList() {
        index = 0;
        max = 10;
        arr = new float[max];
    }

    public MyArrayList(int max) {
        index = 0;
        if (max <= 0) {
            max = 1;
        }
        this.max = max;
        arr = new float[max];
    }

    public void add (float value) {
        if (index + 1 > max) {
            float[] new_arr = new float[2 * max];
            System.arraycopy(arr, 0, new_arr, 0, max);
            max *= 2;
            arr = new_arr;
        }
    }

    public boolean contains(float value) {
        for (int i = 0; i < max; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void remove(int index) {
        System.arraycopy(arr, index + 1, arr, index, this.index - index - 1);
        --this.index;
    }

    public float get(int index) {
        return arr[index];
    }

    public int size() {
        return index;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "max=" + max +
                ", index=" + index +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}

