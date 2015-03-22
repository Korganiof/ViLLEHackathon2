package fi.utu.ville.exercises.hope;

import java.io.Serializable;

public class QuestionData implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 32976560619495368L;

	private String text;
	private String result;
		
	public QuestionData(String question, String answer) {
		text = question;
		result = answer;
	}
	
	public String getQuestion(){
		return text;
	}
	
	public String getAnswer(){
		return result;
	}
	
	
	
	
	
	
	
		
	
	
}
