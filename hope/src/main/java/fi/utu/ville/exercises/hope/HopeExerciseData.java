package fi.utu.ville.exercises.hope;

import java.util.ArrayList;
import java.util.HashMap;

import fi.utu.ville.exercises.model.ExerciseData;
import fi.utu.ville.standardutils.AbstractFile;

public class HopeExerciseData implements ExerciseData {

	/**
	 * 
	 */
	private static final long serialVersionUID = -716445297446246493L;
	
	private HashMap<Integer, QuestionData> questions;
	
	public HopeExerciseData(HashMap<Integer, QuestionData> questions) {
		this.questions = questions;
	}

	public HashMap<Integer, QuestionData> getQuestions() {
		return questions;
	}

}
