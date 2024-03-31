package Selleniun_start_projects.Selleniun_start_projects;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IsATriangleTesting {
	static WebDriver browser;
	 
	 @Before
	 public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","M:\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");
		
	 }
	 public enum TriangleType {
		    NOT_TRIANGLE,
		    ERROR,
		    ISOSCELES,
		    EQUILATERAL,
		    SCALENE
		}
	 @Test
	 public void Test1() {
				WebElement side1 = browser.findElement(By.id("side1"));
				side1.sendKeys("2");
				WebElement side2 = browser.findElement(By.id("side2"));
				side2.sendKeys("2");
				WebElement side3 = browser.findElement(By.id("side3"));
				side3.sendKeys("2");
				WebElement validateButton = browser.findElement(By.id("identify-triangle-action"));
				validateButton.click();
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("triangle-type")));
			    String textBoxValue = outputTextBox.getText();
				assertEquals(TriangleType.EQUILATERAL.toString(), textBoxValue.toUpperCase());
	  }
	 @Test
	 public void Test2() {
				WebElement side1 = browser.findElement(By.id("side1"));
				side1.sendKeys("3");
				WebElement side2 = browser.findElement(By.id("side2"));
				side2.sendKeys("3");
				WebElement side3 = browser.findElement(By.id("side3"));
				side3.sendKeys("4");
				WebElement validateButton = browser.findElement(By.id("identify-triangle-action"));
				validateButton.click();
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("triangle-type")));
			    String textBoxValue = outputTextBox.getText();
				assertEquals(TriangleType.ISOSCELES.toString(), textBoxValue.toUpperCase());
	  }
	 @Test
	 public void Test3() {
				WebElement side1 = browser.findElement(By.id("side1"));
				side1.sendKeys("4");
				WebElement side2 = browser.findElement(By.id("side2"));
				side2.sendKeys("3");
				WebElement side3 = browser.findElement(By.id("side3"));
				side3.sendKeys("4");
				WebElement validateButton = browser.findElement(By.id("identify-triangle-action"));
				validateButton.click();
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("triangle-type")));
			    String textBoxValue = outputTextBox.getText();
				assertEquals(TriangleType.ISOSCELES.toString(), textBoxValue.toUpperCase());
	  }
	 @Test
	 public void Test4() {
				WebElement side1 = browser.findElement(By.id("side1"));
				side1.sendKeys("3");
				WebElement side2 = browser.findElement(By.id("side2"));
				side2.sendKeys("4");
				WebElement side3 = browser.findElement(By.id("side3"));
				side3.sendKeys("4");
				WebElement validateButton = browser.findElement(By.id("identify-triangle-action"));
				validateButton.click();
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("triangle-type")));
			    String textBoxValue = outputTextBox.getText();
				assertEquals(TriangleType.ISOSCELES.toString(), textBoxValue.toUpperCase());
	  }
	 @Test
	 public void Test5() {
				WebElement side1 = browser.findElement(By.id("side1"));
				side1.sendKeys("3");
				WebElement side2 = browser.findElement(By.id("side2"));
				side2.sendKeys("4");
				WebElement side3 = browser.findElement(By.id("side3"));
				side3.sendKeys("5");
				WebElement validateButton = browser.findElement(By.id("identify-triangle-action"));
				validateButton.click();
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("triangle-type")));
			    String textBoxValue = outputTextBox.getText();
				assertEquals(TriangleType.SCALENE.toString(), textBoxValue.toUpperCase());
	  }
	 @Test
	 public void Test6() {
				WebElement side1 = browser.findElement(By.id("side1"));
				side1.sendKeys("2");
				WebElement side2 = browser.findElement(By.id("side2"));
				side2.sendKeys("2");
				WebElement side3 = browser.findElement(By.id("side3"));
				side3.sendKeys("5");
				WebElement validateButton = browser.findElement(By.id("identify-triangle-action"));
				validateButton.click();
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("triangle-type")));
			    String textBoxValue = outputTextBox.getText().toUpperCase();
			    if(textBoxValue.equals("ERROR: NOT A TRIANGLE"))
			    	textBoxValue = TriangleType.NOT_TRIANGLE.toString();
			    assertEquals(TriangleType.NOT_TRIANGLE.toString(), textBoxValue);
	  }
	 @Test
	 public void Test7() {
				WebElement side1 = browser.findElement(By.id("side1"));
				side1.sendKeys("2");
				WebElement side2 = browser.findElement(By.id("side2"));
				side2.sendKeys("5");
				WebElement side3 = browser.findElement(By.id("side3"));
				side3.sendKeys("2");
				WebElement validateButton = browser.findElement(By.id("identify-triangle-action"));
				validateButton.click();
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("triangle-type")));
			    String textBoxValue = outputTextBox.getText().toUpperCase();
			    if(textBoxValue.equals("ERROR: NOT A TRIANGLE"))
			    	textBoxValue = TriangleType.NOT_TRIANGLE.toString();
			    assertEquals(TriangleType.NOT_TRIANGLE.toString(), textBoxValue);
	  }
	 @Test
	 public void Test8() {
				WebElement side1 = browser.findElement(By.id("side1"));
				side1.sendKeys("5");
				WebElement side2 = browser.findElement(By.id("side2"));
				side2.sendKeys("2");
				WebElement side3 = browser.findElement(By.id("side3"));
				side3.sendKeys("2");
				WebElement validateButton = browser.findElement(By.id("identify-triangle-action"));
				validateButton.click();
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("triangle-type")));
			    String textBoxValue = outputTextBox.getText().toUpperCase();
			    if(textBoxValue.equals("ERROR: NOT A TRIANGLE"))
			    	textBoxValue = TriangleType.NOT_TRIANGLE.toString();
			    assertEquals(TriangleType.NOT_TRIANGLE.toString(), textBoxValue);
	  }
	 @Test
	 public void Test9() {
				WebElement side1 = browser.findElement(By.id("side1"));
				side1.sendKeys("1");
				WebElement side2 = browser.findElement(By.id("side2"));
				side2.sendKeys("2");
				WebElement side3 = browser.findElement(By.id("side3"));
				side3.sendKeys("4");
				WebElement validateButton = browser.findElement(By.id("identify-triangle-action"));
				validateButton.click();
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("triangle-type")));
			    String textBoxValue = outputTextBox.getText().toUpperCase();
			    if(textBoxValue.equals("ERROR: NOT A TRIANGLE"))
			    	textBoxValue = TriangleType.NOT_TRIANGLE.toString();
			    assertEquals(TriangleType.NOT_TRIANGLE.toString(), textBoxValue);
	  }
	 @Test
	 public void Test10() {
				WebElement side1 = browser.findElement(By.id("side1"));
				side1.sendKeys("a");
				WebElement side2 = browser.findElement(By.id("side2"));
				side2.sendKeys("5");
				WebElement side3 = browser.findElement(By.id("side3"));
				side3.sendKeys("2");
				WebElement validateButton = browser.findElement(By.id("identify-triangle-action"));
				validateButton.click();
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("triangle-type")));
			    String textBoxValue = outputTextBox.getText();
			    if(textBoxValue.contains("Side"))
			    	textBoxValue = "ERROR";
			    assertEquals(TriangleType.ERROR.toString(), textBoxValue);
	  }
	 @Test
	 public void Test11() {
				WebElement side1 = browser.findElement(By.id("side1"));
				side1.sendKeys("1");
				WebElement side2 = browser.findElement(By.id("side2"));
				side2.sendKeys("a");
				WebElement side3 = browser.findElement(By.id("side3"));
				side3.sendKeys("4");
				WebElement validateButton = browser.findElement(By.id("identify-triangle-action"));
				validateButton.click();
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("triangle-type")));
			    String textBoxValue = outputTextBox.getText();
			    if(textBoxValue.contains("Side"))
			    	textBoxValue = "ERROR";
			    assertEquals(TriangleType.ERROR.toString(), textBoxValue);
	  }
	 @Test
	 public void Test12() {
				WebElement side1 = browser.findElement(By.id("side1"));
				side1.sendKeys("1");
				WebElement side2 = browser.findElement(By.id("side2"));
				side2.sendKeys("2");
				WebElement side3 = browser.findElement(By.id("side3"));
				side3.sendKeys("a");
				WebElement validateButton = browser.findElement(By.id("identify-triangle-action"));
				validateButton.click();
				WebDriverWait wait = new WebDriverWait(browser, 10); // wait for up to 10 seconds
			    WebElement outputTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("triangle-type")));
			    String textBoxValue = outputTextBox.getText();
			    if(textBoxValue.contains("Side"))
			    	textBoxValue = "ERROR";
			    assertEquals(TriangleType.ERROR.toString(), textBoxValue);
	  }

}
