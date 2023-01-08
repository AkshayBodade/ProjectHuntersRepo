package Demo3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelReader  {

	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\devra\\eclipse-workspace\\Batch_M16\\Excel\\Data1.xlsx";
		FileInputStream fs=new FileInputStream(path);
		XSSFWorkbook xs=new XSSFWorkbook(fs);
		String Data_0_0=xs.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

		String Data_0_1=xs.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		String Data_1_1=xs.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	
		System.out.println(Data_0_0);
		System.out.println(Data_0_1);
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys(Data_0_0);
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys(Data_0_1);
		// TODO Auto-generated method stub

	}
}
