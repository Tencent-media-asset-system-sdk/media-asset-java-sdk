package com.mediaassetsdk;

public enum MediaState {
	UPLOADING("上传中"),
	WAITINGVERIFY("等待验证"),
	COMPLETED("上传完成"),
	FAILED("上传失败"),
	DOWNLOADING("下载素材中"),
	VERIFYING("验证素材中"),
	DELETED("素材已删除"),
	CLEANED("素材已清理");
	
	private String value;

	MediaState(final String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;

	}
}
