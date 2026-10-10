class MyHashSet {
    private static final int BASE = 769; // A prime number for better hash distribution
    private LinkedList[] set;

    public MyHashSet() {
        set = new LinkedList[BASE];
        for (int i = 0; i < BASE; i++) {
            set[i] = new LinkedList<Integer>();
        }
    }

    private int hash(int key) {
        return key % BASE;
    }

    public void add(int key) {
        int index = hash(key);
        if (!set[index].contains(key)) {
            set[index].addFirst(key);
        }
    }

    public void remove(int key) {
        int index = hash(key);
        set[index].remove((Integer) key);
    }

    public boolean contains(int key) {
        int index = hash(key);
        return set[index].contains(key);
    }
}
OUTPUT:
Input
["MyHashSet","add","add","add","remove","contains","add","add","add","remove","contains","add","add","add","remove","contains","add","add","add","remove","contains"]
[[],[1],[10001],[1],[1],[1],[7],[10007],[7],[7],[7],[123],[10123],[123],[123],[123],[5000],[15000],[5000],[5000],[5000]]
Output
[null,null,null,null,null,false,null,null,null,null,false,null,null,null,null,false,null,null,null,null,false]
