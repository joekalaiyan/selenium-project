package pom.testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import okhttp3.internal.cache.DiskLruCache.Snapshot;
import pom.indianfro.pages.HomePage;
import wrappers.ProjectWrappers;

public class Indainfrovtc006  extends ProjectWrappers{

	@BeforeClass
	public void beforeClass(){
		testCaseName="Formc";
		testCaseDescription="To verify Form C registration";
		author="Kalaiyan";
		category="Smoke";
		browser="chrome";
		appName="FORMC";
		sheetName="Tc006";
	}
	
	
	@Test(dataProvider="fetchData")
	public void Formc(String uid,String upwd,String cupwd,String seq,String strt,String name,String gen,
			String dob,String desi,String email,String mob,String phn,String nat,String nameo,
			String cap,String addro,String state,String city,String acco,String rate,String emailo,
			String mcon,String con,String tname,String tadd,String tstate,String  dist,String emailoo,String mobo , String cono,String nameoo,String addoo,
			String temailo,String tmobo,String tcono,String ttname,String ttaddr,String ttemail,String ttmob,String ttcon){
		new HomePage(driver,test)
		.clickonsignup()
		.waitForRegistrationPage(3000)
		.enteruserid(uid)
		.enterpwd(upwd)
		.entercnpwd(cupwd)
		.selectquestion(seq)
		.enteranswer(strt)
		.entername("testname")
		.selectgender("M")
		.enterdob("13/11/1994")
		.enterdesignation("public")
		.enteremail("testgamil@gmail.com")
		.entermob("8476378987")
		.enterphone("6456378998")
		.selectnationality("IND")
		.enternamehouse("testhousename")
		.entercapacity("4")
		.enteraddress("test address")
		.selectstate("28")
		.selectdistrict("4C")
		.selectaccomdationtype("BB")
		.selectaccomdationgrade("5s")
		.enteremailid("testemail2@gamil.com")
		.entermcontact("8746356478")
		.enterPhonenumber("8476567878")
		.enterownername("test owner name")
		.enterowneraddress("test owner address")
		.waitForRegistrationPage(4000)
		.selectownerstate("28")
		.waitForRegistrationPage(4000)
		
		.selectownerdistrict("2D")
		.enterowneremailid("testowner@gmail.com")
		.enterownerphone("63746746567")
		.enterownermobile("8765467898")
		.waitForRegistrationPage(3000)
		.clickonadd()
		.enterownername("testownername")
		.enterowneraddress("testowner")
		.selectownerstate("28")
		.selectownerdistrict("4C")
		.enterowneremailid("testowner34@gmail.com")
		.enterownerphone("6465432456")
		.enterownermobile("9876567898");
	}
}
