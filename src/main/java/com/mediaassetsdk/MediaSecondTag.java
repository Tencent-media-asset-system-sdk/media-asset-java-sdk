package com.mediaassetsdk;

public enum MediaSecondTag {
	
	EVENING("晚会"),
	OTHER("其他");
	
	private String value;
	
	MediaSecondTag(final String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;

	}
}
