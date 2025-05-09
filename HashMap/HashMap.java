public class HashMap<K, V> {

    public class CustomHasher {

        public static int toNumber(char c) throws Exception {
            String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ$-_.+!*|(),;/?:@=&#~%[]";
            if (!alphabet.contains(c + "")) throw new Exception("Invalid character: " + c);
            return alphabet.indexOf(c);
        }
    
        public static long hashCode(String s) throws Exception {
            long sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += toNumber(s.charAt(i));
            }
            if (s.contains("https://")) sum -= 352;
            return sum;
        }
    }
    
    public class Entry<K, V> {
        public K key;
        public V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "(" + key + ", " + value + ")";
        }

        @Override
        public boolean equals(Object o) {
            if (o instanceof Entry other) {
                return key.equals(other.key);
            }
            return false;
        }
    }

    private Lista<Entry<K, V>>[] buckets;
    private int capacity;
    private int size;

    @SuppressWarnings("unchecked")
    public HashMap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.buckets = (Lista<Entry<K, V>>[]) new Lista[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new Lista<>();
        }
    }

    public int hash(K key) {
        try {
            return (int) (Math.abs(CustomHasher.hashCode((String) key)) % capacity);
        } catch (Exception e) {
            return Math.abs(key.hashCode()) % capacity;
        }
    }

    public void put(K key, V value) {
        int index = hash(key);
        Lista<Entry<K, V>> list = buckets[index];

        for (int i = 0; i < list.size(); i++) {
            Entry<K, V> entry = list.get(i);
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        list.add(list.size(), new Entry<>(key, value));
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        Lista<Entry<K, V>> list = buckets[index];

        for (int i = 0; i < list.size(); i++) {
            Entry<K, V> entry = list.get(i);
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public V remove(K key) {
        int index = hash(key);
        Lista<Entry<K, V>> list = buckets[index];

        for (int i = 0; i < list.size(); i++) {
            Entry<K, V> entry = list.get(i);
            if (entry.key.equals(key)) {
                V value = entry.value;
                list.remove(i);
                size--;
                return value;
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public int size() {
        return size;
    }

    public int capacity(){
        return capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printTable() {
        for (int i = 0; i < capacity; i++) {
            System.out.print("[" + i + "]: ");
            var it = buckets[i].iterador();
            while (it.hasNext()) {
                System.out.print(it.next().toString() + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(10);

        map.put("https://example1.com", 1);  
        map.put("https://example2.com", 2);  
        map.put("https://example3.com", 3);  
        map.put("https://example4.com", 4);  
        
        map.put("https://test1.com", 5);     
        map.put("https://test2.com", 6);     
        
        System.out.println("example1: " + map.get("https://example1.com"));
        System.out.println("example2: " + map.get("https://example2.com"));
        System.out.println("example3: " + map.get("https://example3.com"));
        System.out.println("example4: " + map.get("https://example4.com"));
        System.out.println("test1: " + map.get("https://test1.com"));
        System.out.println("test2: " + map.get("https://test2.com"));
    
        System.out.println("Size: " + map.size());
    
        System.out.println("Hash table with collisions:");
        map.printTable();
    }
}
