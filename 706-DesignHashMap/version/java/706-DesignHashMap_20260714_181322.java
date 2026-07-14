// Last updated: 14/07/2026, 18:13:22
1class MyHashMap {
2
3    int[] arr;
4
5    public MyHashMap() {
6        arr=new int[1000001];
7        for(int i=0;i<arr.length;i++){
8            arr[i]=-1;
9        }
10    }
11
12    public void put(int key,int value) {
13        arr[key]=value;
14    }
15
16    public int get(int key) {
17        return arr[key];
18    }
19
20    public void remove(int key) {
21        arr[key]=-1;
22    }
23}