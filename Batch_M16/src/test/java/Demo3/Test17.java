package Demo3;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test17 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//suggession class example
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ind");
	Thread.sleep(1000);
		List<WebElement>list=driver.findElements(By.xpath("//ul[@id='ui-id-1']//li[@class='ui-menu-item']"));
		System.out.println(list.size());
		//for(int i=0;i<=list.size();i++)
		//{
			String str1=list.get(1).getText();
			System.out.println(str1);
			
			//if(list.get(i).getText()==("India"))
				
		list.get(1).click();
				
		//break;
		//}
		
		//select
		WebElement drp=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select sel=new Select(drp);
		sel.selectByIndex(2);
		//openwindow
	/*	driver.findElement(By.xpath("//button[@id='openwindow']")).click();
	String str=driver.getWindowHandle();
	Set<String>set=driver.getWindowHandles();
	System.out.print(str);
	System.out.print(set);
	driver.switchTo().window("CDwindow-FD2EAD0ADB6373F2A10B547CF2D363CB");
	Thread.sleep(3000);
	driver.close();*/
	//Radio Button
	List<WebElement>list1=driver.findElements(By.xpath("//input[@name='radioButton']"));
	System.out.println(list1.size());
	/*for(int i=0;i<list1.size();i++) {
		String str2=list1.get(i).getText();
		if(list1.get(i).getText().equalsIgnoreCase("Radio2"))*/
			list1.get(2).click();
			
			
		//break;
//	}
		// TODO Auto-generated method stub
	}

}
//Thread.sleep(3000);