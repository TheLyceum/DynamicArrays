package Java;

public class DynamicArrayTest {
    DynamicArrayTest() {
        appendTest();
    }

    private void appendTest() {
        DynamicArray<Integer> list = new DynamicArray<>(5);
        list.append(2);
        System.out.println(list.get(0));
    }
}