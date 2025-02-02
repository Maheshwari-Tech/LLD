package problems.Cache.src.main.java;

public interface ICache<Key, Value> {
    Value get(Key key) throws KeyNotFoundException;
    void put(Key key, Value value);
}
