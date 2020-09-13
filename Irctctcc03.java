package pom.testcases;

import org.junit.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class Irctctcc03 extends ProjectWrappers {
	
	@org.testng.annotations.BeforeClass
	public void beforeclass(){
	testCaseName="IRCTC";
	testCaseDescription="Launch irctc";
	author="kalaiyan";
	category="smoke";
	browser="chrome";
	appName="IRCTC";
			
	
		
		
	}
	@Test
	public void Salooncheck(){
		
		new HomePage(driver,test)
		.waitForHomePage(3000)
		.clickonok()
		.clickonstays()
		.clickonlounge()
		.switchtoNewWindow()
	   	.waitForHomePage(3000)
		.clickonmenu()
		.clickonchater()
		.clickonenquiryform()
		.enternameofapplicant("testname")
		.enternameoforganisation("test organisation")
		.enteraddress("test address")
		.entermobile("7635467890")
		.enteremail("yeurjkdms@gmail.com")
		.selectrequestfor("Saloon Charter")
		.enterorginsatation("banglore")
		.enterdestsatation("goa")
		.clickdeparture()
		.clickdateofdepature()
		.waitForHomePage(3000)
		.clickonarrival()
		.clickondateofarrival()
		.waitForHomePage(3000)
		.enterdurationdays("4")
		.enternoandtypeofcoaches("3 coaches and first class")
		.enternopassanger("3")
		.enterpurpose("vaccation tour")
		.enteradditionalinfo("yes needed")
		.clicksubmit()
		.verifymobile();
		
	}

}
