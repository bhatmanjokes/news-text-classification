package de.upb.cs.textclassifier;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;

public class NewsArticleClassifier {
	public static void main(String[] args) {

		String category = "entertainment";

		String headline = "COVID-19 doesn't kill you";

		InputJsonObject test = new InputJsonObject(category, headline);
		System.out.println(test.getCategory() +"\n" + test.getHeadline());
	}
}
