package edu.ca.ualberta.ssrg.surveyvis;

import javax.swing.JTextArea;

public class Textbox extends JTextArea{
	
	/**
	 * This will contain the question body
	 */
	
	private static final long serialVersionUID = 1L;

	public Textbox(String content, boolean editable) {

		//TEXT AREA
		this.setText(content);   

	    this.setLineWrap(true);
	    this.setWrapStyleWord(true);
	    this.setEditable(editable);
	    this.setVisible(true);
	    
	}
	
	public void updateText(String newText) {
		this.setText(newText);
		
	}

}
