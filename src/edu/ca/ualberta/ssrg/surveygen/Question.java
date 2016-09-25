package edu.ca.ualberta.ssrg.surveygen;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public abstract class Question {
	
	private String title;
	private String body;
	private BufferedImage img;
	private String type;
	
	public Question (String title, String body, BufferedImage image, String type) {
		this.title = title;
		this.body = body;
		this.img = image;
		this.type = type;
	}
	
	public abstract ArrayList<String> getPossibleAnswers();
	
	public String getBody() {
		return body;
	}
	
	public BufferedImage getImage() {
		return img;
	}
	
	public String getType() {
		return type;
	}
	
	public String getTypeDescription() {
		switch (getType()) {
		case "LA":
			return "Describe your answer in the field below:";
		case "MC":
			return "Select one answer:";
		case "CB":
			return "Select all answers that apply:";
		default: 
			return "";
		}
	}

}
