package com.google.api.translate;
import com.google.api.translate.Language;

public class Translator {


	public String translate(String s1) {
	   for(int i=0;i<3;i++)
		{
		if(Language.ENGLISH[i].compareTo(s1)==0)
		{
		return Language.FRENCH[i];
		
		}}
		return "word meaning is not match";
	}
	
}


