package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.basepages.Configpage;
import com.basepages.Loadingpage;
import com.basepages.Loginpage;
import com.basepages.UpdateImage;
import com.util.TestCaseBase;

public class TC01_Login extends TestCaseBase{
	
	//@Test(groups={"ChromeWin32"})
	//@Test(groups={"IEWin32"})
	//@Test(groups={"firefox","ChromeWin32"})
	@Test(groups={"firefox"})
	public void loginSucess(){
	
	Loadingpage loadingpage= PageFactory.initElements(driver, Loadingpage.class);
	loadingpage.loginBox();
	
	Loginpage loginpage =PageFactory.initElements(driver, Loginpage.class);
	assert(loginpage.titleIs(Loginpage.TITLE));
    //loginpage.login();
     loadingpage =loginpage.login();
//     Configpage configpage = loadingpage.changeImage();
//     configpage=PageFactory.initElements(driver, Configpage.class);
//     assert(configpage.titleIs(Configpage.TITLE));
//     UpdateImage updateImage = configpage.imageChange();
//     updateImage=PageFactory.initElements(driver, UpdateImage.class);
//     updateImage.reUpload();
	
	loadingpage.searchResult();
	
	
	}

}
