class MyHashSet {
    
    boolean arr[] = new boolean[1000001];

    public MyHashSet() {
        Arrays.fill(arr,false);
    }
    
    public void add(int key) {
        arr[key] = true;
    }
    
    public void remove(int key) {
        arr[key] = false;
    }
    
    public boolean contains(int key) {
        return arr[key] == true;
    }
}
