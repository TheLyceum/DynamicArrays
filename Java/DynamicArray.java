package Java;

import java.util.Arrays;

class DynamicArray<T> {
    private T[] data;
    private int capacity;
    private int size;

    DynamicArray(int capacity) {
        this.data = (T[]) new Object[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public T get(int index) {
        return this.data[index];
    }

    public void append(T value) {
        if (this.capacity / 2 >= this.size) {
            this.capacity *= 2;
            T[] oldList = this.data;
            this.data = (T[]) new Object[this.capacity];
            Arrays.copyOf(oldList, capacity);
        }
        this.data[this.size] = value;
        this.size++;
    }
}