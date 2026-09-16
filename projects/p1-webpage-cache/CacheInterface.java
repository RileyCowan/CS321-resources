/**
 * Interface for a generic cache whose values provide a key.
 *
 * @param <K> type of key used by cached values
 * @param <V> type of value stored in the cache
 * @author CS321 Instructors
 */
public interface CacheInterface<K, V extends KeyInterface<K>> {

    /**
     * Looks up a value by key.
     *
     * @param key key to search for
     * @return matching value, or null if the key is not cached
     */
    public V get(K key);

    /**
     * Adds a value to the cache.
     *
     * @param value value to add
     * @return value removed because the cache was full, or null otherwise
     */
    public V add(V value);

    /**
     * Removes a value by key.
     *
     * @param key key of the value to remove
     * @return removed value, or null if the key was not found
     */
    public V remove(K key);

    /**
     * Removes all values from the cache.
     */
    public void clear();

    /**
     * Returns a formatted description of cache statistics.
     *
     * @return cache statistics
     */
    public String toString();
}
