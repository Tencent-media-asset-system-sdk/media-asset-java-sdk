package com.mediaassetsdk;

public enum MediaType {
	
	VIDEO("视频"),
	LIVE("直播流"),
	IMAGE("图片"),
	AUDIO("音频"),
	TEXT("文稿");
	
	private String value;

	MediaType(final String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;

	}
}
