package fi.utu.ville.exercises.hope;

import org.json.JSONArray;

import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;


public class EditorQuestionLayout extends HorizontalLayout {
	
	private String question;
	private String country;
	private TextField qtf;
	private ComboBox countryselect;
	
	public EditorQuestionLayout(String question, String country){
		this.question = question;
		this.country = country;
		doLayout();
	}
	
	public EditorQuestionLayout(){
		this.question = "";
		this.country = "";
		doLayout();
	}
	
	public void doLayout(){
		setMargin(true);
		setSpacing(true);
		qtf = new TextField();
		countryselect = new ComboBox();
		
		if (question != null || !question.equals("")) {
			qtf.setValue(question);
		}

		if (country != null || !country.equals("")) {
			countryselect.setValue(country);
		}
		
		countryselect.addItem("Afghanistan");countryselect.addItem("Angola");countryselect.addItem("Albania");countryselect.addItem("United Arab Emirates");countryselect.addItem("Argentina");countryselect.addItem("Armenia");countryselect.addItem("Antarctica");countryselect.addItem("French Southern and Antarctic Lands");countryselect.addItem("Australia");countryselect.addItem("Austria");countryselect.addItem("Azerbaijan");countryselect.addItem("Burundi");countryselect.addItem("Belgium");countryselect.addItem("Benin");countryselect.addItem("Burkina Faso");countryselect.addItem("Bangladesh");countryselect.addItem("Bulgaria");countryselect.addItem("The Bahamas");countryselect.addItem("Bosnia and Herzegovina");countryselect.addItem("Belarus");countryselect.addItem("Belize");countryselect.addItem("Bolivia");countryselect.addItem("Brazil");countryselect.addItem("Brunei");countryselect.addItem("Bhutan");countryselect.addItem("Botswana");countryselect.addItem("Central African Republic");countryselect.addItem("Canada");countryselect.addItem("Switzerland");countryselect.addItem("Chile");countryselect.addItem("China");countryselect.addItem("Ivory Coast");countryselect.addItem("Cameroon");countryselect.addItem("Democratic Republic of the Congo");countryselect.addItem("Republic of the Congo");countryselect.addItem("Colombia");countryselect.addItem("Costa Rica");countryselect.addItem("Cuba");countryselect.addItem("Northern Cyprus");countryselect.addItem("Cyprus");countryselect.addItem("Czech Republic");countryselect.addItem("Germany");countryselect.addItem("Djibouti");countryselect.addItem("Denmark");countryselect.addItem("Dominican Republic");countryselect.addItem("Algeria");countryselect.addItem("Ecuador");countryselect.addItem("Egypt");countryselect.addItem("Eritrea");countryselect.addItem("Spain");countryselect.addItem("Estonia");countryselect.addItem("Ethiopia");countryselect.addItem("Finland");countryselect.addItem("Fiji");countryselect.addItem("Falkland Islands");countryselect.addItem("France");countryselect.addItem("Gabon");countryselect.addItem("United Kingdom");countryselect.addItem("Georgia");countryselect.addItem("Ghana");countryselect.addItem("Guinea");countryselect.addItem("Gambia");countryselect.addItem("Guinea Bissau");countryselect.addItem("Equatorial Guinea");countryselect.addItem("Greece");countryselect.addItem("Greenland");countryselect.addItem("Guatemala");countryselect.addItem("Guyana");countryselect.addItem("Honduras");countryselect.addItem("Croatia");countryselect.addItem("Haiti");countryselect.addItem("Hungary");countryselect.addItem("Indonesia");countryselect.addItem("India");countryselect.addItem("Ireland");countryselect.addItem("Iran");countryselect.addItem("Iraq");countryselect.addItem("Iceland");countryselect.addItem("Israel");countryselect.addItem("Italy");countryselect.addItem("Jamaica");countryselect.addItem("Jordan");countryselect.addItem("Japan");countryselect.addItem("Kazakhstan");countryselect.addItem("Kenya");countryselect.addItem("Kyrgyzstan");countryselect.addItem("Cambodia");countryselect.addItem("South Korea");countryselect.addItem("Kosovo");countryselect.addItem("Kuwait");countryselect.addItem("Laos");countryselect.addItem("Lebanon");countryselect.addItem("Liberia");countryselect.addItem("Libya");countryselect.addItem("Sri Lanka");countryselect.addItem("Lesotho");countryselect.addItem("Lithuania");countryselect.addItem("Luxembourg");countryselect.addItem("Latvia");countryselect.addItem("Morocco");countryselect.addItem("Moldova");countryselect.addItem("Madagascar");countryselect.addItem("Mexico");countryselect.addItem("Macedonia");countryselect.addItem("Mali");countryselect.addItem("Myanmar");countryselect.addItem("Montenegro");countryselect.addItem("Mongolia");countryselect.addItem("Mozambique");countryselect.addItem("Mauritania");countryselect.addItem("Malawi");countryselect.addItem("Malaysia");countryselect.addItem("Namibia");countryselect.addItem("New Caledonia");countryselect.addItem("Niger");countryselect.addItem("Nigeria");countryselect.addItem("Nicaragua");countryselect.addItem("Netherlands");countryselect.addItem("Norway");countryselect.addItem("Nepal");countryselect.addItem("New Zealand");countryselect.addItem("Oman");countryselect.addItem("Pakistan");countryselect.addItem("Panama");countryselect.addItem("Peru");countryselect.addItem("Philippines");countryselect.addItem("Papua New Guinea");countryselect.addItem("Poland");countryselect.addItem("Puerto Rico");countryselect.addItem("North Korea");countryselect.addItem("Portugal");countryselect.addItem("Paraguay");countryselect.addItem("Qatar");countryselect.addItem("Romania");countryselect.addItem("Russia");countryselect.addItem("Rwanda");countryselect.addItem("Western Sahara");countryselect.addItem("Saudi Arabia");countryselect.addItem("Sudan");countryselect.addItem("South Sudan");countryselect.addItem("Senegal");countryselect.addItem("Solomon Islands");countryselect.addItem("Sierra Leone");countryselect.addItem("El Salvador");countryselect.addItem("Somaliland");countryselect.addItem("Somalia");countryselect.addItem("Republic of Serbia");countryselect.addItem("Suriname");countryselect.addItem("Slovakia");countryselect.addItem("Slovenia");countryselect.addItem("Sweden");countryselect.addItem("Swaziland");countryselect.addItem("Syria");countryselect.addItem("Chad");countryselect.addItem("Togo");countryselect.addItem("Thailand");countryselect.addItem("Tajikistan");countryselect.addItem("Turkmenistan");countryselect.addItem("East Timor");countryselect.addItem("Trinidad and Tobago");countryselect.addItem("Tunisia");countryselect.addItem("Turkey");countryselect.addItem("Taiwan");countryselect.addItem("United Republic of Tanzania");countryselect.addItem("Uganda");countryselect.addItem("Ukraine");countryselect.addItem("Uruguay");countryselect.addItem("United States of America");countryselect.addItem("Uzbekistan");countryselect.addItem("Venezuela");countryselect.addItem("Vietnam");countryselect.addItem("Vanuatu");countryselect.addItem("West Bank");countryselect.addItem("Yemen");countryselect.addItem("South Africa");countryselect.addItem("Zambia");countryselect.addItem("Zimbabwe");
		
		addComponents(qtf, countryselect);
	}
	
	public String getQuestion(){
		return qtf.getValue();
	}
	
	public String getCountry(){
		return (String)countryselect.getValue();
	}
	
	public void setQuestion(String s){
		qtf.setValue(s);
	}

	public void setCountry(String s){
		countryselect.setValue(s);
	}
}
