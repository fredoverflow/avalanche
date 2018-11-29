package h;

import java.util.HashMap;

public class Registry<V extends Deleteable> implements Deleteable {
    private final HashMap<String, V> registry = new HashMap<>();

    public boolean contains(String key) {
        return registry.containsKey(key);
    }

    public V put(String key, V value) {
        assert !contains(key) : key;

        this.registry.put(key, value);
        return value;
    }

    public V get(String key) {
        assert contains(key) : key;

        return registry.get(key);
    }

    public void remove(String key) {
        assert this.contains(key) : key;

        this.registry.remove(key);
    }

    public void delete() {
        for (V value : this.registry.values()) {
            value.delete();
        }
        this.registry.clear();
    }
}
