package hust.soict.talentedprogram.aims.media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Book extends Media {
	
	private List<String> authors=new ArrayList<String>();
	private String content;
	private List<String> contentTokens;
	private TreeMap<String, Integer> wordFrequency=new TreeMap<String, Integer>();
	public Book(String title) {
		super(title);
	}
	public Book(String title, String category) {
		super(title,category);
	}
	public Book(String title, String category,List<String> authors) {
		super(title,category);
		this.authors=authors;
	}
	public Book(String title, float cost) {
		super(title,cost);
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void addAuthor(String authorName) {
		if(authors.contains(authorName))
			System.out.println("Author already in list!");
		else {
			authors.add(authorName);
		}
	}
	public void removeAuthor(String authorName) {
		if (!authors.contains(authorName))
			System.out.println("Author not in list!");
		else {
			authors.remove(authorName);
		}
	}
	public void processContent(){
		List<String> contents_splitted=Arrays.asList(content.split("[\\p{Punct}\\s]+"));
		TreeSet<String> set=new TreeSet<String>(contents_splitted);
		contentTokens=new ArrayList<String>(set);
		for (String s : contentTokens) {
			Integer count=Collections.frequency(contents_splitted, s);
			wordFrequency.put(s, count);
		}
	}
	@Override
	public String toString() {
		StringBuilder s=new StringBuilder();
		s.append("Title: "+this.getTitle()+"\n");
		s.append("Category: "+this.getCategory()+"\n");
		s.append("ID: "+this.getId()+"\n");
		s.append("Cost: "+this.getCost()+"\n");
		s.append("Authors: "+this.getAuthors()+"\n");
		s.append("Contents: "+this.getContent()+"\n");
		s.append("Content length: "+contentTokens.size()+"\n");
		s.append("Token list: "+contentTokens+"\n");
		s.append("Word frequency: "+wordFrequency+"\n");
		return s.toString();
	}
}
