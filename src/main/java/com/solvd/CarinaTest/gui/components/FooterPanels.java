package com.solvd.CarinaTest.gui.components;

public enum FooterPanels {
	GUARANI("www.exa.unicen.edu.ar/es/estudios/acceso-siu-guarani"),
	MOODLE("moodle.exa.unicen.edu.ar"),
	UNICEN("www.unicen.edu.ar"),
	CEFCE("www.cefce.com.ar"),
	LIBRARY("biblio.unicen.edu.ar");
	
	private String panelName;
	
	FooterPanels(String panelName) {
		this.panelName = panelName;
	}
	
	public String getPanelName() {
		return panelName;
	}
}
