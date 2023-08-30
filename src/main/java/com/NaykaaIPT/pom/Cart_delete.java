package com.NaykaaIPT.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_delete implements Cart_inter {

	WebDriver driver;
	
	public Cart_delete() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath =Bag_xpath)
	WebElement Bag;
	@FindBy (className =ele_class)
	WebElement ele;
	@FindBy (xpath =dle_xpath)
	WebElement delete;
	@FindBy (className = confirm_class)
	WebElement confirm;
	@FindBy (xpath = Back_xpath)
	WebElement Back;
	
	public WebElement getBag() {
		return Bag;
	}

	public WebElement getEle() {
		return ele;
	}

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getBack() {
		return Back;
	}

	public void cart_delete() {
		WebElement Bag = driver.findElement(By.xpath("//span[@class='cart-count']"));
		Bag.click();
		
		WebElement ele = driver.findElement(By.className("css-acpm4k"));
		ele.click();
		driver.switchTo().frame(ele);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement delete = driver.findElement(By.xpath("(//span[@class='css-175whwo ehes2bo0'])[2]"));
		delete.click();
		
		WebElement confirm = driver.findElement(By.className("css-h96myd e8tshxd1"));
		confirm.click();
		
	    WebElement Back = driver.findElement(By.xpath("//span[@class='css-175whwo ehes2bo0']"));
		Back.click();
	}
	

}
