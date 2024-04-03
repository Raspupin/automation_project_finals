package Selleniun_start_projects.Selleniun_start_projects;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PasswordValidation {
	static WebDriver browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","M:\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html");
		
	  }
	 public enum Validator {
		 VALID,
		 INVALID
	 }
	 
	 @Test
	 public void Test1() {
				WebElement textBox = browser.findElement(By.name("characters"));
				textBox.sendKeys("");
				WebElement validateButton = browser.findElement(By.name("validate"));
				validateButton.click();
				WebElement outputTextBox = browser.findElement(By.name("validation_message"));
				String textBoxValue = outputTextBox.getAttribute("value");
				if(textBoxValue.contains("Invalid"))
					textBoxValue = Validator.INVALID.toString();
				else
					textBoxValue = Validator.VALID.toString();
				assertEquals(Validator.INVALID.toString(), textBoxValue);
	 }
	 @Test
	 public void Test2() {
				WebElement textBox = browser.findElement(By.name("characters"));
				textBox.sendKeys("*");
				WebElement validateButton = browser.findElement(By.name("validate"));
				validateButton.click();
				WebElement outputTextBox = browser.findElement(By.name("validation_message"));
				String textBoxValue = outputTextBox.getAttribute("value");
				if(textBoxValue.contains("Invalid"))
					textBoxValue = Validator.INVALID.toString();
				else
					textBoxValue = Validator.VALID.toString();
				assertEquals(Validator.INVALID.toString(), textBoxValue);
	 }
	 @Test
	 public void Test3() {
				WebElement textBox = browser.findElement(By.name("characters"));
				textBox.sendKeys("aaaaaaaa");
				WebElement validateButton = browser.findElement(By.name("validate"));
				validateButton.click();
				WebElement outputTextBox = browser.findElement(By.name("validation_message"));
				String textBoxValue = outputTextBox.getAttribute("value");
				if(textBoxValue.contains("Invalid"))
					textBoxValue = Validator.INVALID.toString();
				else
					textBoxValue = Validator.VALID.toString();
				assertEquals(Validator.INVALID.toString(), textBoxValue);
	 }
	 @Test
	 public void Test4() {
				WebElement textBox = browser.findElement(By.name("characters"));
				textBox.sendKeys("aa**aa**");
				WebElement validateButton = browser.findElement(By.name("validate"));
				validateButton.click();
				WebElement outputTextBox = browser.findElement(By.name("validation_message"));
				String textBoxValue = outputTextBox.getAttribute("value");
				if(textBoxValue.contains("Invalid"))
					textBoxValue = Validator.INVALID.toString();
				else
					textBoxValue = Validator.VALID.toString();
				assertEquals(Validator.INVALID.toString(), textBoxValue);
	 }
	 @Test
	 public void Test5() {
				WebElement textBox = browser.findElement(By.name("characters"));
				textBox.sendKeys("AAA");
				WebElement validateButton = browser.findElement(By.name("validate"));
				validateButton.click();
				WebElement outputTextBox = browser.findElement(By.name("validation_message"));
				String textBoxValue = outputTextBox.getAttribute("value");
				if(textBoxValue.contains("Invalid"))
					textBoxValue = Validator.INVALID.toString();
				else
					textBoxValue = Validator.VALID.toString();
				assertEquals(Validator.INVALID.toString(), textBoxValue);
	 }
	 @Test
	 public void Test6(){
				WebElement textBox = browser.findElement(By.name("characters"));
				textBox.sendKeys("AA**AA**");
				WebElement validateButton = browser.findElement(By.name("validate"));
				validateButton.click();
				WebElement outputTextBox = browser.findElement(By.name("validation_message"));
				String textBoxValue = outputTextBox.getAttribute("value");
				if(textBoxValue.contains("Invalid"))
					textBoxValue = Validator.INVALID.toString();
				else
					textBoxValue = Validator.VALID.toString();
				assertEquals(Validator.INVALID.toString(), textBoxValue);
	 }
	 @Test
	 public void Test7() {
				WebElement textBox = browser.findElement(By.name("characters"));
				textBox.sendKeys("aaAA");
				WebElement validateButton = browser.findElement(By.name("validate"));
				validateButton.click();
				WebElement outputTextBox = browser.findElement(By.name("validation_message"));
				String textBoxValue = outputTextBox.getAttribute("value");
				if(textBoxValue.contains("Invalid"))
					textBoxValue = Validator.INVALID.toString();
				else
					textBoxValue = Validator.VALID.toString();
				assertEquals(Validator.INVALID.toString(), textBoxValue);
	 }
	 @Test
	 public void Test8() {
				WebElement textBox = browser.findElement(By.name("characters"));
				textBox.sendKeys("aaAA**a*");
				WebElement validateButton = browser.findElement(By.name("validate"));
				validateButton.click();
				WebElement outputTextBox = browser.findElement(By.name("validation_message"));
				String textBoxValue = outputTextBox.getAttribute("value");
				if(textBoxValue.contains("Invalid"))
					textBoxValue = Validator.INVALID.toString();
				else
					textBoxValue = Validator.VALID.toString();
				assertEquals(Validator.INVALID.toString(), textBoxValue);
	 }
	 @Test
	 public void Test9() {
				WebElement textBox = browser.findElement(By.name("characters"));
				textBox.sendKeys("??!!??!");
				WebElement validateButton = browser.findElement(By.name("validate"));
				validateButton.click();
				WebElement outputTextBox = browser.findElement(By.name("validation_message"));
				String textBoxValue = outputTextBox.getAttribute("value");
				if(textBoxValue.contains("Invalid"))
					textBoxValue = Validator.INVALID.toString();
				else
					textBoxValue = Validator.VALID.toString();
				assertEquals(Validator.INVALID.toString(), textBoxValue);
	 }
	 @Test
	 public void Test10() {
				WebElement textBox = browser.findElement(By.name("characters"));
				textBox.sendKeys("*******");
				WebElement validateButton = browser.findElement(By.name("validate"));
				validateButton.click();
				WebElement outputTextBox = browser.findElement(By.name("validation_message"));
				String textBoxValue = outputTextBox.getAttribute("value");
				if(textBoxValue.contains("Invalid"))
					textBoxValue = Validator.INVALID.toString();
				else
					textBoxValue = Validator.VALID.toString();
				assertEquals(Validator.VALID.toString(), textBoxValue);
	 }
	 @Test
	 public void Test11() {
				WebElement textBox = browser.findElement(By.name("characters"));
				textBox.sendKeys("aaaaaaa");
				WebElement validateButton = browser.findElement(By.name("validate"));
				validateButton.click();
				WebElement outputTextBox = browser.findElement(By.name("validation_message"));
				String textBoxValue = outputTextBox.getAttribute("value");
				if(textBoxValue.contains("Invalid"))
					textBoxValue = Validator.INVALID.toString();
				else
					textBoxValue = Validator.VALID.toString();
				assertEquals(Validator.VALID.toString(), textBoxValue);
	 }
	 @Test
	 public void Test12() {
				WebElement textBox = browser.findElement(By.name("characters"));
				textBox.sendKeys("a*a*a*a");
				WebElement validateButton = browser.findElement(By.name("validate"));
				validateButton.click();
				WebElement outputTextBox = browser.findElement(By.name("validation_message"));
				String textBoxValue = outputTextBox.getAttribute("value");
				if(textBoxValue.contains("Invalid"))
					textBoxValue = Validator.INVALID.toString();
				else
					textBoxValue = Validator.VALID.toString();
				assertEquals(Validator.VALID.toString(), textBoxValue);
	 }
	 @Test
	 public void Test13() {
				WebElement textBox = browser.findElement(By.name("characters"));
				textBox.sendKeys("AAAAAAA");
				WebElement validateButton = browser.findElement(By.name("validate"));
				validateButton.click();
				WebElement outputTextBox = browser.findElement(By.name("validation_message"));
				String textBoxValue = outputTextBox.getAttribute("value");
				if(textBoxValue.contains("Invalid"))
					textBoxValue = Validator.INVALID.toString();
				else
					textBoxValue = Validator.VALID.toString();
				assertEquals(Validator.VALID.toString(), textBoxValue);
	 }
	 @Test
	 public void Test14() {
				WebElement textBox = browser.findElement(By.name("characters"));
				textBox.sendKeys("A*A*A*A");
				WebElement validateButton = browser.findElement(By.name("validate"));
				validateButton.click();
				WebElement outputTextBox = browser.findElement(By.name("validation_message"));
				String textBoxValue = outputTextBox.getAttribute("value");
				if(textBoxValue.contains("Invalid"))
					textBoxValue = Validator.INVALID.toString();
				else
					textBoxValue = Validator.VALID.toString();
				assertEquals(Validator.VALID.toString(), textBoxValue);
	 }
	 @Test
	 public void Test15() {
				WebElement textBox = browser.findElement(By.name("characters"));
				textBox.sendKeys("AbAbAbA");
				WebElement validateButton = browser.findElement(By.name("validate"));
				validateButton.click();
				WebElement outputTextBox = browser.findElement(By.name("validation_message"));
				String textBoxValue = outputTextBox.getAttribute("value");
				if(textBoxValue.contains("Invalid"))
					textBoxValue = Validator.INVALID.toString();
				else
					textBoxValue = Validator.VALID.toString();
				assertEquals(Validator.VALID.toString(), textBoxValue);
	 }
	 @Test
	 public void Test16() {
				WebElement textBox = browser.findElement(By.name("characters"));
				textBox.sendKeys("Abbbbb*");
				WebElement validateButton = browser.findElement(By.name("validate"));
				validateButton.click();
				WebElement outputTextBox = browser.findElement(By.name("validation_message"));
				String textBoxValue = outputTextBox.getAttribute("value");
				if(textBoxValue.contains("Invalid"))
					textBoxValue = Validator.INVALID.toString();
				else
					textBoxValue = Validator.VALID.toString();
				assertEquals(Validator.VALID.toString(), textBoxValue);
	 }

}
