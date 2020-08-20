package org.tain.object;

import org.tain.annotation.StringInjector;

public class MyObject {

	@StringInjector("My name is JSON.")
	private String name;
	
	@StringInjector
	private String defaultValue;
	
	@StringInjector
	private Integer invalidType;
	
	public String getName() {
		return this.name;
	}
	
	public String getDefaultValue() {
		return this.defaultValue;
	}
	
	public Integer getInvalidType() {
		return this.invalidType;
	}
}
