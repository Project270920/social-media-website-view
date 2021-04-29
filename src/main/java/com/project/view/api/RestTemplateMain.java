package com.project.view.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import lombok.Data;

public class RestTemplateMain {

	private final static String API_KEY = "81759099fff348c99c471fc71f48cd3d";
	private final static String URL = "https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=";

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	/*
		RestTemplate restTemplate = new RestTemplate();

		NewsDataList response = restTemplate.getForObject(URL + API_KEY, NewsDataList.class);
		List<NewsData> list = response.getEmployees();

		for(NewsData obj:list)
			System.out.println(obj);
	*/
		
		RestTemplate restTemplate = new RestTemplate();
		NewsDataList response = restTemplate.getForObject(URL + API_KEY, NewsDataList.class);
		for(NewsData obj:response.getEmployees())
			System.out.println(obj);

		System.out.println(response);

	}

}

@Data
class NewsDataList {
    private List<NewsData> employees;

    public NewsDataList() {
        employees = new ArrayList<>();
    }
}

