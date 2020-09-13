package pom.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class Irctctcc05 extends ProjectWrappers {
	@BeforeTest
	public void beforeclass(){
		testCaseName="IRCTC HOTELS";
		testCaseDescription="BOOKING HOTELS";
		author="kalaiyan";
		category="smoke";
		appName="IRCTC";
		browser="chrome";
		
	}
	@Test
	public void bookhoteltwo(){
			new HomePage(driver, test)
			.clickonok()
			.clickonstays()
			.clickonhotels()
			.switchToNewwindow()
			.clickoncovidok()
			.clickonlogin()
			.clickonguest()
			.enteremailaddress("ttemailaddress@gamil.com")
			.waitForHomePage(3000)
			.entermobilenumber("7483746567")
			.waitForHomePage(4000)
			.clicksumbit()
			.enterhotelcityname("punjab")
			.waitForHomePage(3000)
			.scrollDownclickhotel()
			.waitForHomePage(3000)
			.clickoncheckin()
			.waitForHomePage(3000)
			.clickoncheckindate("29")
			.waitForHomePage(3000)
			.clickoncheckout()
			.waitForHomePage(3000)
			.clickoncheckoutdate("30")
			.clickonrooms()
			.selectadults("3")
			.clickonok()
			.waitForHomePage(3000)
			.clickonfindhotels()
			.waitForHomePage(5000)
			.switchToNewwindow()
			.clickonbook()
			.waitForHomePage(3000)
			.gettexthotelname("the hotel name is ")
			.waitForHomePage(3000)
			.gettexthotelprice("The hotel price in the web application is ")
			
			.waitForHomePage(3000)
			.clickoncontinuebookhotel()
			.selecttitle("1")
			.enterfirstname("testfirstname")
			.enterlastname("testlastname")
			.entermobile("736545678")
			.enteremail("testgm@gmail.com")
			.selectgst("Yes")
			.entergstnumber("635467263PY")
			.entercompanyname("testcpomapnyname")
			.entercompanyaddress("testcpmapnyaddresss")
			.clickongo()
			.gettextgsterrortext();
		
			
	}

}
