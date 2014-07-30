package com.basepages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateImage {
	
	public static String TITLE= "更新头像";
	
	
   @FindBy(css="a.reupload")
   WebElement reUpload;
   @FindBy(css="#picture")
   WebElement chooseImage;
   @FindBy(css="#reupload_div > form > p.acts > input")
   WebElement submit;
   @FindBy(css="#ui-m4 > div > div.buddy_current > h3")
   WebElement indicate;
   
   
   
   public void reUpload(){
	   reUpload.click();  
	   chooseImage.sendKeys("C:\\Users\\dora.zhang\\Desktop\\IMG_2010.JPG");
	   submit.click();
	   System.out.println(indicate.getText());
	   
   }

}
