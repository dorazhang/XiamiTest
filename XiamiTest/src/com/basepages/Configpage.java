package com.basepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.util.Page;

public class Configpage extends Page {

	public static String TITLE="同步分享";
	
	
	@FindBy(css="#usr_top > ul > li:nth-child(3) > a")
	WebElement changeButton;
	
	
	public UpdateImage imageChange(){
		changeButton.click();
		
		return new UpdateImage();
		
		
		
	
	}
	
}
