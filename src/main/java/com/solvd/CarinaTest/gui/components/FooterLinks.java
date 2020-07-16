package com.solvd.CarinaTest.gui.components;

public enum FooterLinks {
	FACULTY("www.exa.unicen.edu.ar"),
	UNIVERSITY("www.unicen.edu.ar"),
	LOCATION("ubicacion"),
	WEBMASTER("direccion-tic");
	
	private String linkName;
	
	FooterLinks(String linkName) {
		this.linkName = linkName;
	}
	
	public String getLinkName() {
		return linkName;
	}
}
