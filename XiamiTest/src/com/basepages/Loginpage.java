package com.basepages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.util.Page;
import com.util.SystemUtil;

public class Loginpage extends Page{
	
	 public static String TITLE="虾米网(xiami.com) - 高品质音乐互动社区";
	
	@FindBy(css="#email")
	WebElement username;
	@FindBy(css="#password")
	WebElement password;
	@FindBy(xpath="//*[@id='submit']")
	WebElement clickbutton;
	
	
	Properties PROPERTIES =SystemUtil.loadPropertiesResources("logininfo.properties");
	
	String usern= PROPERTIES.getProperty("username");
	String pas= PROPERTIES.getProperty("password");
	
	
	public  Loadingpage login(){
		username.sendKeys(usern);
		password.sendKeys(pas);
		clickbutton.click();
		return new Loadingpage();
		
	}

}
