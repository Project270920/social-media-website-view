package com.project.view.api;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class NewsData {

	private Source source;
	private String author;
	private String title;
	private String description;
	private String url;
	private String urlToImage;
	private Date publishedAt;
	private String content;
	
	
	public NewsData setSource(Source source) {
		this.source = source;
		return this;
	}
	public NewsData setAuthor(String author) {
		this.author = author;
		return this;
	}
	public NewsData setTitle(String title) {
		this.title = title;
		return this;
	}
	public NewsData setDescription(String description) {
		this.description = description;
		return this;
	}
	public NewsData setUrl(String url) {
		this.url = url;
		return this;
	}
	public NewsData setUrlToImage(String urlToImage) {
		this.urlToImage = urlToImage;
		return this;
	}
	public NewsData setPublishedAt(Date publishedAt) {
		this.publishedAt = publishedAt;
		return this;
	}
	public NewsData setContent(String content) {
		this.content = content;
		return this;
	}
	
	
}

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
class Source
{
	private String id;
	private String name;

	public Source setId(String id) {
		this.id = id;
		return this;
	}
	public Source setName(String name) {
		this.name = name;
		return this;
	}

}