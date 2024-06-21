package com.Assessment;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base extends AssessmentConstant {
	
	
public static WebDriver driver;
	
	public static WebDriver browserLaunch(String url) {
		
		WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
		
	}
	

	public static void getTitle() {
		
		driver.getTitle();

	}
	
	public static void get_current_url() {
		driver.getCurrentUrl();

	}
	public static void close() {
		driver.close();

	}
	public static void quit() {
		driver.quit();

	}
	
	public static void navi_To(String url) {
		driver.navigate().to(url);

	}
	public static void navi_Forward() {
		driver.navigate().forward();
	}
	
	public static void navi_Back() {
		driver.navigate().back();
		
	}
	
	public static void navi_refresh() {
		driver.navigate().refresh();
		

	}
	
	public static void sendkey(WebElement ref,String keys) {
	ref.sendKeys(keys);	
			
	}
	public static void click(WebElement ref) {
	ref.click();	

	}
	public static void get_Text(WebElement element) {
		System.out.println(element.getText());
		
	}
	public static void get_Attribute(WebElement element,String value) {
		
	System.out.println(element.getAttribute(value));
	}
	public static void is_Displayed(WebElement element) {
		
		boolean display = element.isDisplayed();
		System.out.println(display);

	}
	public static void is_Selected(WebElement element) {
		boolean select = element.isSelected();
		System.out.println(select);
		

	}
	public static void is_Enabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
		
	}
	public static void clear(WebElement element) {
		element.clear();
		
	}
	public static void selectbyvalue_Dropdown(WebElement value,String value1) {
		Select s = new Select(value);
		s.selectByValue(value1);
	}
	public static void selectbyindex_Dropdown(WebElement value,int value1) {
		Select s = new Select(value);
		s.selectByIndex(value1);

	}
	public static void selectbyvisibletext_Dropdown(WebElement element,String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	public static void deselectbyvalue_dropdown(WebElement element,String value1) {
	 Select s = new Select(element);
	 s.deselectByValue(value1);
	 

	}
	public static void deselectbyindex_Dropdown(WebElement element,int value1) {
	Select s = new Select(element);
	s.deselectByIndex(value1);

	}
	public static void deselectbyvisibletext_Dropdown(WebElement element,String value1) {
	Select s = new Select(element);
	s.deselectByVisibleText(value1);
	}
	public static void is_Multiple(WebElement element) {
		Select s =new Select(element);
		System.out.println(s.isMultiple());
			}
	public static void get_Options(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options2 = s.getOptions();
		for (WebElement webElement : options2) {
			System.out.println(webElement.getText());
			
		}
	
	}
	public static  void get_All_Selected(WebElement element) {
		Select s = new Select(element);
		List<WebElement> all = s.getAllSelectedOptions();
		for (WebElement webElement : all) {
			System.out.println(webElement.getText());
			
		}
	}
	public static void get_First_Selected(WebElement element) {
		Select s = new Select(element);
		System.out.println(s.getFirstSelectedOption());

	}
	public static void deselect_All(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
				
	}
	public static void accept_Alert(WebElement element) {
		element.click();
		driver.switchTo().alert().accept();
			}
	public static void dismiss_Alert(WebElement element) {
		element.click();
		driver.switchTo().alert().dismiss();

	}
	public static void sendkeys_Alert(WebElement element,String text ) {
	element.click();
	driver.switchTo().alert().sendKeys(null);

	}
	public static void gettext_Alert(WebElement element) {
		element.click();
		driver.switchTo().alert().getText();

	}
	public static void single_Frame(WebElement keys) {
		driver.switchTo().frame(keys);

	}
	public static void multi_Frame(WebElement element,WebElement element1) {
		driver.switchTo().frame(element);
		driver.switchTo().frame(element1);

	}
	public static void scroll_Into(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);

	}
	public static void scroll_By(int a,int b) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("windoe.scrollBy(a,b);");

	}
	public static void mouse_Click(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).build().perform();

	}
	public static void context_Click(WebElement element) {
		Actions a = new Actions(driver);	
a.contextClick(element).build().perform();
	}
	public static void double_Click(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).build().perform();

	}
	public static void move_To_Element(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();

	}
	public static void drug_And_Drop(WebElement element,WebElement element1) {
		Actions a = new Actions(driver);
		a.dragAndDrop(element, element1).build().perform();

	}
	public static void get_Window_Handles() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String id : windowHandles) {
			driver.switchTo().window(id);
		}
	}
	
	
	
	
		
	
}



