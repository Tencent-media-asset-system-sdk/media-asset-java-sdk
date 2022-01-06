package com.mediaassetsdk;

public enum MediaLang {
	MANDARIN("普通话"),
	CANTONESE("粤语");
	
	private String value;

	MediaLang(final String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;

	}
}
