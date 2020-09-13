package pom.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class Irctctripc001 extends ProjectWrappers {
	@BeforeClass
	public void beforeclass(){
		testCaseName="IRCTC";
		testCaseDescription="user regestration";
		author="kalaiyan";
		category="regeression";
		browser="chrome";
		appName="IRCTC";
		
	}
	@Test
	public void Registeration(){
		
		new HomePage(driver, test)
		.clickonok()
		.clickonregister()
		.entername("Test name")
		.enterpwd("Password@1234")
		.enterCpwd("Password@1234")
		.clicksecuirtyquestion()
		.clickquestion()
		.enteranswer("test answer")
		.clicklanguage()
		.enterfirstname("testfname")
		.entermiddleName("tesmname")
		.enterlastname("testlname")
		.clickMale()
		.enterdob("13-11-1994")
		.clickonoccuption()
		.clickonprofessional()
		.clickonunmarried()
		.selectcountry("india")
		.enteremail("testemail@gmail.com")
		.entermobile("7364563728")
		.selectnationality("india")
		.enterresAddress1("test address1")
		.enterresAddress2("test address2")
		.enterresAddress3("test address3")
		.enterpincode("600119")
		.clickstate()
		.selectcity("chennai")
		.selectpost("sholiung")
		.enterphone("")
		.clickno()
		.enteroffAddress1("")
		.enteroffAddress2("")
		.enteroffAddress3("")
		.enterpincode1("")
		.clickonstate()
		.selectcity1("")
		.selectpost1("")
		.enterPhone1("")
		.clickonterms();
	}

}
