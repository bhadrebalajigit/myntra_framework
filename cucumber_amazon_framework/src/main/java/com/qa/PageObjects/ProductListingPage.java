package com.qa.PageObjects;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;

import javax.security.auth.PrivateCredentialPermission;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class ProductListingPage {
	
	


	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	private WebElement  search_product;
	
	@FindBy(xpath="(//*[text()='Add to bag'])[1]")
	private WebElement adding_tshirt;
	
	WebDriver driver;
	public ProductListingPage(WebDriver driver) {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
		 }

	public void search_product() throws InterruptedException
	 {
		Thread.sleep(10000);
		search_product.sendKeys("tshirt",Keys.ENTER); 
		//adding_tshirt.click();
		
		
	 }
	
	public void close_page() throws InterruptedException
	 {
		driver.close();
		
		
	 }
	
	
}
