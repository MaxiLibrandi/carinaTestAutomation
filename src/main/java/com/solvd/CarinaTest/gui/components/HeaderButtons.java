package com.solvd.CarinaTest.gui.components;

public enum HeaderButtons {
	HOME("Inicio"),
	GUARANI("SIU"),
	PHONES("Teléfonos"),
	TEACHERS("docentes"),
	STUDENTS("alumnos"),
	DOCUMENTS("Documentos");
	
	private String buttonName;
	
	HeaderButtons(String buttonName) {
		this.buttonName = buttonName;
	}
	
	public String getButtonName() {
		return buttonName;
	}
}
