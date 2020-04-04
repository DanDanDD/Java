//package D2;
//
//import java.util.HashMap;
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantReadWriteLock;
//
//public class MyCache<K,V> {
//    private HashMap<K,V>hashMap;
//    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
//    private Lock readlock = lock.readLock();
//    private Lock writelock = lock.writeLock();
//    public V get(K k){
//        readlock.lock();
//        return hashMap.get(K);
//    }
//    public void put(K k,V v){
//
//    }
//}
