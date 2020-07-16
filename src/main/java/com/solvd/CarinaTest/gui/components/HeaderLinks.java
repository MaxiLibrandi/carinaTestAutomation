package com.solvd.CarinaTest.gui.components;

public enum HeaderLinks {
	NEW_STUDENTS("Ingresantes"),
	STUDENTS("Estudiantes"),
	TEACHERS("Docentes"),
	NO_TEACHERS("No Docentes"),
	GRADUATES("Graduados"),
	SCHOOLS("Escuelas"),
	ENTERPRISES("Empresas");
	
	private String linkName;
	
	HeaderLinks(String linkName) {
		this.linkName = linkName;
	}
	
	public String getLinkName() {
		return linkName;
	}
}
