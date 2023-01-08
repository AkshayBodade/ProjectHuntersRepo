package TestData;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_2 {
@BeforeSuite
public void BS(){
	System.out.println("suite");
	}
@BeforeClass
public void BC(){
	System.out.println("class");
}
@BeforeTest
public void BT(){
	System.out.println("test");
}
@BeforeMethod
public void BM()
{
	System.out.println("method");
}	
@Test
public void test(){
	System.out.println("Test1");
}
@Test
public void test1(){
	System.out.println("Test2");
}
@AfterMethod
public void AM()
{
	System.out.println("Amethod");
}
@AfterTest
public void AT(){
	System.out.println("Atest");
}
@AfterClass
public void AC(){
	System.out.println("Aclass");
}
@AfterSuite
public void AS(){
	System.out.println("Asuite");
	}
}
