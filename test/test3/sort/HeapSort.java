package poly.sort;

public class HeapSort implements Sort{
    private String name;

    public HeapSort(String name) {
        this.name = name;
    }

    @Override
    public void ascending(int[] arr) {
        System.out.println(name + " ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println(name + " descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println(name + "입니다.");
    }
}
