package com.kita.first.level2;

public class IMac {
	private int memory =500;
	private String color="스페이스그레이";
	
	public IMac() {}
	
	public IMac(int memory, String color){
		this.memory =memory;
		this.color = color;
	}
	
	public void setMemory(int memory) {
		this.memory =memory;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getmemory() {
		return memory;
	}
	public String getcolor() {
		return color;
	}
}
