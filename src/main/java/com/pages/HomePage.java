package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;
	private By subMenu = By.xpath("//*[@class=\"top_submenu\"]/a");
	
	
	public HomePage(WebDriver driver){
		this.driver= driver;
	}
	
	public int countMenuOptions() {
		return driver.findElements(subMenu).size();
	}
	
	public List<String> menuOptions() {
		List<String> menuOptionsList = new ArrayList<>();
		List<WebElement> menuList = driver.findElements(subMenu);
		for(WebElement e : menuList) {
			String text = e.getText();
			System.out.println(text);
			menuOptionsList.add(text);
		}
		return menuOptionsList;
		}
	
	
	
}
