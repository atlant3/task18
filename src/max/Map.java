package max;

import java.util.*;

public class Map<K,V> extends MyEntry<K,V> {
    private List<MyEntry<K,V>> map = new ArrayList<>();
    public Map() {
        super(null, null);
    }
    void add(K key, V value) {
        MyEntry<K,V> val = new MyEntry<K, V>(key,value);
        map.add(val);
    }
    void removeKey(K key) {
        Iterator<MyEntry<K, V>> iterator = map.iterator();
        while(iterator.hasNext()) {
            MyEntry<K, V> next = iterator.next();
            if(next.getKey().equals(key)) {
                iterator.remove();
            }
        }
    }
    void removeValue(V value) {
        Iterator<MyEntry<K, V>> iterator = map.iterator();
        while(iterator.hasNext()) {
            MyEntry<K, V> next = iterator.next();
            if(next.getValue().equals(value)) {
                iterator.remove();
            }
        }
    }
    void showSetKey() {
        System.out.println("Show Set key: ");
        Set<K> keysSet = new HashSet<>();
        Iterator<MyEntry<K, V>> iterator = map.iterator();
        while(iterator.hasNext()) {
            MyEntry<K, V> next = iterator.next();
            keysSet.add(next.getKey());
        }
        System.out.println(keysSet);
    }
    void showListValue() {
        System.out.println("Show List Value: ");
        List<V> listValue = new ArrayList<>();
        Iterator<MyEntry<K, V>> iterator = map.iterator();
        while(iterator.hasNext()) {
            MyEntry<K, V> next = iterator.next();
            listValue.add(next.getValue());
        }
        System.out.println(listValue);
    }
    void showAllMap() {
        System.out.println("Show all Map");
        HashMap<K, V> allMap = new HashMap<K,V>();
        Iterator<MyEntry<K, V>> iterator = map.iterator();
        while(iterator.hasNext()) {
            MyEntry<K, V> next = iterator.next();
            allMap.put(next.getKey(), next.getValue());
        }
        System.out.println(allMap);
    }
}
