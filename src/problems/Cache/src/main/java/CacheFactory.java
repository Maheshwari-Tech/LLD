package problems.Cache.src.main.java;

public class CacheFactory {
    ICache getDefaultCache(int N){
        return new CacheImpl(new HashMapBasedStorage<>(N), new LRUEvictionPolicy<>());
    }
}
