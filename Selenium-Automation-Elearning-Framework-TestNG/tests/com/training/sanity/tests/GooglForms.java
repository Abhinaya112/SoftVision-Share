package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.GooglePOM;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class GooglForms {

	private WebDriver driver;
	private String baseUrl;
	private GooglePOM googlePOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private ApachePOIExcelRead excel;

	@BeforeTest
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeClass
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		googlePOM = new GooglePOM(driver); 
		excel=new ApachePOIExcelRead();
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	    // Enter mail ID, password and click on Next
			googlePOM.sendmailID("testabhi112@gmail.com");
			googlePOM.clickNext();
			Thread.sleep(2000);
			googlePOM.sendPassword("dec@2018");
			googlePOM.clickNextpwd();
			Thread.sleep(2000);
			// Open a new Form
			googlePOM.clickNewForm();
			Thread.sleep(3000);
	}
	

	
		@AfterTest
		public void afterTest() throws Exception{
		Thread.sleep(1000);
		driver.quit();
	}
	

	@Test(dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void GoogleForm( String desc, String option1, String option2, String option3,String option4) throws InterruptedException {

	// Send in title, Question and Options
		googlePOM.sendTitle("Softvision Quiz");
		googlePOM.senddesc(desc);
		Thread.sleep(5000);
		googlePOM.sendOption1(option1);
		googlePOM.clickAddOptions(option2,option3,option4);
		Thread.sleep(2000);
		//googlePOM.clickNewQuestion();
		// Alter Settings
		googlePOM.clickSetting();
		googlePOM.clickquiz();
		googlePOM.clicktoggleQuiz();
		googlePOM.clicklater();
		googlePOM.clickcb1();
		googlePOM.clickcb2();
		googlePOM.clicksave();
		Thread.sleep(5000);
		
		
	}
}
