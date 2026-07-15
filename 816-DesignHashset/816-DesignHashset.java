// Last updated: 15/07/2026, 14:59:00
class MyHashSet {

    boolean[] arr;

    public MyHashSet() {
        arr=new boolean[1000001];
    }

    public void add(int key) {
        arr[key]=true;
    }

    public void remove(int key) {
        arr[key]=false;
    }

    public boolean contains(int key) {
        return arr[key];
    }
}