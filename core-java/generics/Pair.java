package assignment.generics;

public class Pair<K, V> {

	private K key;
	private V value;

	public Pair(K k, V v) {
		this.key = k;
		this.value = v;
	}

	public Pair() {
	}

	public K setKey(K k) {
		this.key = k;
		return this.key;
	}

	public V setValue(V v) {
		this.value = v;
		return this.value;
	}

	public K getKey() {
		return this.key;
	}

	public V getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return "Pair [key=" + key + ", value=" + value + "]";
	}
}
