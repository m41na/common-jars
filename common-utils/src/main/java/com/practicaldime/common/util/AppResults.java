package com.practicaldime.common.util;

public interface AppResults {

	public final class Entry<K, V> {

		public final K code;
		public final V message;
		
		public Entry(K code, V message) {
			super();
			this.code = code;
			this.message = message;
		}
	}
	
	public Entry<Integer, String> NO_RESULTS_FOUND = new Entry<>(0, "No records were found");
	public Entry<Integer, String> UNKNOWN_QUERY_PARAMETER = new Entry<>(0, "No records were found");
}
