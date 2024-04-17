package ru.job4j.cache;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractCache<K, V> {

    private final Map<K, SoftReference<V>> cache = new HashMap<>();

    public final void put(K key, V value) {
        SoftReference<V> newValue = new SoftReference<>(value);
        cache.put(key, newValue);
    }

    public final V get(K key) {
        if (cache.get(key) != null) {
            return cache.get(key).get();
        }
        return load(key);
    }

    protected abstract V load(K key);
}