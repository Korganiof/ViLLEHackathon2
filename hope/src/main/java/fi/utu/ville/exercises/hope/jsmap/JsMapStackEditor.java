package fi.utu.ville.exercises.hope.jsmap;

import org.json.JSONArray;
import org.json.JSONException;

import com.vaadin.ui.AbstractJavaScriptComponent;
import com.vaadin.ui.JavaScriptFunction;

import fi.utu.ville.exercises.hope.HopeEditor;


@com.vaadin.annotations.JavaScript({"public/initEditor.js" })

public class JsMapStackEditor extends AbstractJavaScriptComponent {
	private HopeEditor exect;
	public JsMapStackEditor(final HopeEditor exect) {
		this.exect = exect;
		addFunction("setQuestions", new JavaScriptFunction() { 

		      public void call(JSONArray arguments) throws JSONException {
		        
		        String arvo = arguments.getString(0);
                
		      }
		    });
	}
}
