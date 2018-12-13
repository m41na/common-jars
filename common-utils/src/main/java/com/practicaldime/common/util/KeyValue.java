package com.practicaldime.common.util;

public class KeyValue {

	public final String key;
	public final Object value;
	
	public KeyValue(String key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public Object getValue() {
		return value;
	}
}
