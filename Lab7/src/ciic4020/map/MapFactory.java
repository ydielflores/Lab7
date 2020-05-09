package ciic4020.map;

public interface MapFactory<K, V> {

	Map<K, V> getInstance(KeyExtractor<K, V> extractor);
}