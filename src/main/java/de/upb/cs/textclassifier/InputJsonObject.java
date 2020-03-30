package de.upb.cs.textclassifier;

import java.net.URL;
import java.util.Arrays;

public class InputJsonObject {

	/*
	 * { "category":"POLITICS",
	 * "headline":"Ireland Votes To Repeal Abortion Amendment In Landslide Referendum"
	 * , "authors":"Laura Bassett", "link":
	 * "https://www.huffingtonpost.com/entry/results-for-irelands-historic-abortion-referendum-show-yes-vote-leads_us_5b086497e4b0802d69cb2cff",
	 * "short_description":"Irish women will no longer have to travel to the United Kingdom to end their pregnancies."
	 * , "date":"2018-05-26" }
	 */
	private String category;
	private String headline;
	private String authors;
	private URL link;
	private String shortDescription;
	private String date;

	public InputJsonObject(String category, String headline, String authors, URL link, String shortDescription,
			String date) {
		super();
		this.category = category;
		this.headline = headline;
		this.authors = authors;
		this.link = link;
		this.shortDescription = shortDescription;
		this.date = date;
	}

	public InputJsonObject(String category, String headline) {
		super();
		this.category = category;
		this.headline = headline;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public URL getLink() {
		return link;
	}

	public void setLink(URL link) {
		this.link = link;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "InputJsonObject [category=" + category + ", headline=" + headline + ", authors="
				+ authors + ", link=" + link + ", shortDescription=" + shortDescription + ", date=" + date + "]";
	}

}
