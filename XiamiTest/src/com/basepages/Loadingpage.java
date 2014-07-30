package com.basepages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.util.Page;
import com.util.SystemUtil;
import com.util.TestCaseBase;
import com.util.FunctionUtil;

public class Loadingpage extends Page{
	
	//private static String  TITLE="虾米音乐网(xiami.com) - 中国好声音官方授权";
	@FindBy(xpath="//a[@class='first']")
	WebElement loginbutton;
	@FindBy(css="#email")
	WebElement username;
	@FindBy(css="#password")
	WebElement password;
	
	//load files
	Properties PROPERTIES =SystemUtil.loadPropertiesResources("logininfo.properties");
	String url=PROPERTIES.getProperty("url");
	
	
	public void loginBox(){
		
		TestCaseBase.threadDriver.get().navigate().to(url);
		loginbutton.click();		
	}
	
	@FindBy(css="#header > div > div > div > table > tbody > tr > td.account > div > a.last > b.icon.user")
	WebElement iconUser;
	@FindBy(css="#header > div > div > div > div.user_popup > div > ul > li:nth-child(7) > a")
	WebElement changeConfig;
	
	public Configpage changeImage(){
		
		Actions action= new Actions(TestCaseBase.threadDriver.get());
		action.moveToElement(iconUser).perform();
		action.moveToElement(changeConfig).click().perform();
		 
		return new Configpage();
		
	}
	
	@FindBy(css="#search > input.keyword") 
	WebElement searchBox;
	@FindBy(css="#header > div > div > div > table > tbody > tr > td.search > div > div") 
	WebElement resultBox;
	public void searchResult(){
		searchBox.sendKeys("平凡");
		List<WebElement> titles= resultBox.findElements(By.tagName("tr"));
		for (WebElement title :titles){
			
			 try { 
				 title.findElement(By.tagName("h3")); 
				 System.out.println("title name is "+title.findElement(By.tagName("h3")).getText());
				 
	              
	        } catch (NoSuchElementException e) { 
	        	System.out.println("this element is not existing");
	           
	        } 
			
			 List<WebElement> lists = title.findElements(By.tagName("li"));
				for(WebElement list : lists){
					System.out.println("list name is "+list.getText());
				}
			
			
			
			
			
			
			
			
			
			
			//if(FunctionUtil.isExist(title.findElement(By.tagName("h3")))){
			//System.out.println("title name is "+title.findElement(By.tagName("h3")).getText());
//			List<WebElement> lists = title.findElements(By.tagName("li"));
//			for(WebElement list : lists){
//				System.out.println("list name is "+list.getText());
//			}
		}
		
		}
		
		
	
	

}
