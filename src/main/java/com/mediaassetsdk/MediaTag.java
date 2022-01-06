package com.mediaassetsdk;

public enum MediaTag {
	
	NEWS("新闻"),
	ENTERTAINNENT("综艺"),
	INTERNETINFO("互联网资讯"),
	MOVIE("电影"),
	SERIES("电视剧"),
	SPECIAL("专题"),
	SPORT("体育");
	
	private String value;

	MediaTag(final String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;

	}
}
