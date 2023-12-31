package com.NaykaaIPT.pom;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Products implements Product_inter {

	WebDriver driver;
	
	@FindBy (xpath = cursor_xpath)
	WebElement cursor;
	@FindBy (linkText = powder_link )
	WebElement powder;
	@FindBy (className = Himalata_name)
	WebElement Himalaya;
	@FindBy (className = Drop_class)
	WebElement dropdown;
	@FindBy (className = Cart_class)
	WebElement Addto_cart;
	
	
	
	
	public WebElement getAddto_cart() {
		return Addto_cart;
	}
	public WebElement getCursor() {
		return cursor;
	}
	public WebElement getPowder() {
		return powder;
	}
	public WebElement getHimalaya() {
		return Himalaya;
	}
	public WebElement getDropdown() {
		return dropdown;
	}
	
	public void mom_baby() {
		
		WebElement cursor = driver.findElement(By.xpath("//a[text() = 'mom & baby']"));
	    
		Actions a = new Actions(driver);
		a.moveToElement(cursor).build().perform();
		
		WebElement powder = driver.findElement(By.linkText("Baby Powder"));
		powder.click();
	}
	
	public void	Baby_powder() {
		
		Set<String> windowHandles = driver.getWindowHandles();
        for (String string : windowHandles) {
		driver.switchTo().window(string);
	}
	WebElement Himalaya = driver.findElement(By.className("css-xrzmfa"));
	Himalaya.click();
	
}
	public void Himalaya_Babypowder(){
	
		Set<String> windowHandles = driver.getWindowHandles();
        for (String string : windowHandles) {
		driver.switchTo().window(string);
		}
	
        WebElement dropdown = driver.findElement(By.className("css-2t5nwu"));
	    Select s = new Select(dropdown);
	    s.selectByValue("3");
	
	    WebElement Addto_cart = driver.findElement(By.className("btn-text"));
	    Addto_cart.click();
	    try {
		Thread.sleep(2000);
	    } catch (InterruptedException e) {				
		e.printStackTrace();
	    }
}
}
