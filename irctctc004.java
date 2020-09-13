package pom.testcases;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class irctctc004 extends ProjectWrappers {
	
	@org.testng.annotations.BeforeClass
	public void beforeclass(){
		appName="IRCTC";
		browser="chrome";
		author="kalaiyan";
		category="regression";
		sheetName="Tc004";
		testCaseName="IRCTC";
		testCaseDescription="to check the chater is working";
		
	}
	@Test(dataProvider="fetchData")
	
	public void Bookhotels(String email,String mob,String dest, String adult,String title ,String fname,String lname){
		new HomePage(driver,test)
		.clickonok()
		.clickonstays()
		.clickonhotels()
		.switchToNewwindow()
		.clickoncovidok()
		.clickonlogin()
		.clickonguest()
		.enteremailaddress(email)
		.entermobilenumber(mob)
		.waitForHomePage(3000)
		.clicksumbit()
		.enterhotelcityname("punjab")
		.waitForHomePage(3000)
		.scrollDownclickhotel()
		.waitForHomePage(3000)
		.clickoncheckin()
		.waitForHomePage(3000)
		.clickoncheckindate("30")
		.waitForHomePage(3000)
		.clickoncheckout()
		.waitForHomePage(3000)
		.clickoncheckoutdate("31")
		.waitForHomePage(3000)
		.clickonrooms()
		.waitForHomePage(3000)
		.selectadults("3")
		.waitForHomePage(3000)
		.clickonok()
		.clickonfindhotels()
		.waitForHomePage(3000)
		.clickonbook()
		.waitForHomePage(3000)
		.gettexthotelname("The hotel name in the application is ")
		.gettexthotelprice("the hotel price is ")
		.clickoncontinuebookhotel()
		.waitForHomePage(3000)
		.selecttitle("1")
		.enterfirstname("testfirstname")
		.enterlastname("testlastname")
		.entermobile("736545678")
		.enteremail("testgm@gmail.com")
		.selectgst("No")
		.verifyhotelname("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[2]/div/div/div[1]/span")
		.verifyprice("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[2]/div/div/div[5]/span/b")
	.clickongo()
	.clickonagree()
	.clickonmakepayment()
	.clickonotpverify()
	.gettextotperror();
	}
	
	

}
