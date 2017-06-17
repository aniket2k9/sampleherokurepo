package com.example.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResponseBean {
	
	private String timestamp;
	private long calls;
	
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public long getCalls() {
		return calls;
	}
	public void setCalls(long calls) {
		this.calls = calls;
	}
}
