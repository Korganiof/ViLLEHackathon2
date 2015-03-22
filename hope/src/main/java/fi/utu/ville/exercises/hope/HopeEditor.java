package fi.utu.ville.exercises.hope;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import com.vaadin.client.ui.VFilterSelect.Select;
import com.vaadin.ui.AbstractSelect.ItemCaptionMode;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import fi.utu.ville.exercises.model.Editor;
import fi.utu.ville.exercises.model.EditorHelper;
import fi.utu.ville.exercises.model.EditorHelper.EditedExerciseGiver;
import fi.utu.ville.standardutils.AFFile;
import fi.utu.ville.standardutils.AbstractFile;
import fi.utu.ville.standardutils.Localizer;
import fi.utu.ville.standardutils.SimpleFileUploader;
import fi.utu.ville.standardutils.StandardUIFactory;
import fi.utu.ville.standardutils.SimpleFileUploader.UploaderListener;
import fi.utu.ville.standardutils.ui.AbstractEditorLayout;
import fi.utu.ville.exercises.model.VilleContent;
import fi.utu.ville.exercises.model.VilleUI;

public class HopeEditor extends VilleContent implements
		Editor<HopeExerciseData> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4600841604409240872L;

	private static final int MAX_FILE_SIZE_KB = 1024;
	
	private static final String MIME_FILTER = "^image/.*$";
	
	private EditorHelper<HopeExerciseData> editorHelper;

	private TextField questionText;
	
	private TextField countryText;

	private AbstractFile currImgFile;

	private Localizer localizer;
	
	private AbstractEditorLayout layout;
	
	private ComboBox combobox = new ComboBox("Some caption");
	
	private ArrayList<EditorQuestionLayout> questions;
	
	private VerticalLayout questionContainer;


	public HopeEditor() {
		super(null);
	}

	@Override
	public Layout getView() {
		return this;
	}

	@Override
	public void initialize(VilleUI ui, Localizer localizer, HopeExerciseData oldData,
			EditorHelper<HopeExerciseData> editorHelper) {
		this.init(ui);
		this.localizer = localizer;

		this.editorHelper = editorHelper;

		editorHelper.getTempManager().initialize();

		doLayout(oldData);
	}

	private HopeExerciseData getCurrentExercise() {
		HashMap<Integer, QuestionData> qs = new HashMap<Integer, QuestionData>();
		for (int i = 0 ; i < questions.size() ; i++) {
			QuestionData qd = new QuestionData(questions.get(i).getQuestion(), questions.get(i).getCountry());
			qs.put(i, qd);
			System.out.println(i + " kysymys: " + questions.get(i).getQuestion());
		}
		//exercisedata mitä editorissa voi laittaa
		return new HopeExerciseData(qs);
	}

	@Override
	public boolean isOkToExit() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public void doLayout() {
		
	}
	
	public void doLayout(HopeExerciseData oldData) {

		this.setMargin(false);
		this.setSpacing(false);
		this.setWidth("100%");
		questions = new ArrayList<EditorQuestionLayout>();
		questionContainer = new VerticalLayout();
		
		layout = StandardUIFactory.getTwoColumnView();
		addComponent(layout);
		
		layout.setTitle("Editor");
		
		/*String oldQuestion;
		if (oldData != null) {
			oldQuestion = oldData.getQuestion();
			currImgFile = oldData.getImgFile();
		} else {
			oldQuestion = "";
			currImgFile = null;
		}*/


		layout.addToLeft(editorHelper.getInfoEditorView());

		layout.addToTop(editorHelper
				.getControlbar(new EditedExerciseGiver<HopeExerciseData>() {

					@Override
					public HopeExerciseData getCurrExerData(
							boolean forSaving) {
						return getCurrentExercise();
					}
				}));


		VerticalLayout editlayout = new VerticalLayout();
		
		Button addButton = new Button("add");
		addButton.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				EditorQuestionLayout eql = new EditorQuestionLayout();
				questions.add(eql);
				questionContainer.addComponent(eql);
				
			}
		});
		editlayout.addComponent(addButton);
		editlayout.addComponent(questionContainer);
		
		EditorQuestionLayout one = new EditorQuestionLayout("foo", "bar");
		questions.add(one);
		questionContainer.addComponent(one);
		
		
		layout.addToRight(editlayout);

	}
	
	@Override
	public String getViewName(){
		return "StubExercise";
	}
}
