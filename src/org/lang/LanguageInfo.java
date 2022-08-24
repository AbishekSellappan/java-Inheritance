package org.lang;

public class LanguageInfo extends StateDetails {
public void tamilLanguage() {
	System.out.println("Tamil Language is TAMIL");
}
public void engishLanguage() {
	System.out.println("English Language is ENGLISH");
}
public void hindiLanguage() {
	System.out.println("Hindi Language is HINDI");
}
public static void main(String[] args) {
	LanguageInfo l = new LanguageInfo();
	l.tamilLanguage();
	l.engishLanguage();
	l.hindiLanguage();
	l.southIndia();
	l.northIndia();
}
}
