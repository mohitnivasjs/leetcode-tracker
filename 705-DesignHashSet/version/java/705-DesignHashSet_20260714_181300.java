// Last updated: 14/07/2026, 18:13:00
1class MyHashSet {
2
3    boolean[] arr;
4
5    public MyHashSet() {
6        arr=new boolean[1000001];
7    }
8
9    public void add(int key) {
10        arr[key]=true;
11    }
12
13    public void remove(int key) {
14        arr[key]=false;
15    }
16
17    public boolean contains(int key) {
18        return arr[key];
19    }
20}