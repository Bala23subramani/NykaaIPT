package com.NaykaaIPT.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import com.NaykaaIPT.base.Baseclass;
import com.NaykaaIPT.pom.Login;
import com.NaykaaIPT.pom.PagaObjectManager;

public class Testrunner extends Baseclass {
	
	public static void main(String[] args) {
		Testrunner t = new Testrunner();
		t.browserLaunch("Chrome");
		t.launchUrl("https://www.nykaa.com/");
		PagaObjectManager pom = new PagaObjectManager();
		
	    t.clickOnElements(pom.getL().getSing_in());	   
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}    
	    t.inputToSend(pom.getL().getNumber(), "9940567237");
	    t.clickOnElements(pom.getL().getSubmit());
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {	
			e.printStackTrace();
		}  
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    t.clickOnElements(pom.getL().getVerify());
	  
}

}
