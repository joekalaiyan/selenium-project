package pom.testcases;

import pom.tripadvisor.pages.HomePage;
import wrappers.ProjectWrappers;

public class Triptc003 extends ProjectWrappers{
	
	public void Holidathomes(){
		
		new HomePage(driver,test)
		.clickOnTravelForums()
		.clickonholidayhomes()
		.enterdestination("punjab")
		.clickoncheckin()
		.clickoncheckindate()
		.clickoncheckoutdate()
		.clickonfindhotels()
		.clickonsort()
		.clickonhightolow()
		.clickonbook()
		.clickoncheckin()
		.clickoncheckindate()
		.clickoncheckoutdate()
		.clickonguest()
		.clickonaddadutls()
		.clickonaddadutls()
		.clickonaddchild()
		.clickonapply()
		.gettextavailable()
		.gettextprice()
		.clickonbook()
	
		.enterfullname("test fullname")
		.entermobile("7364567378")
		.enteremail("testemail@gamil.com")
		.enterrenterMessage("test message ")
		.enternameoncard("testcardname")
		.entercardno("63546635")
		.entercardno("63546787")
		//.entercardno("776")
		.selectcardyear("2030")
		.selectcardmon("11")
		.entercardccv("776")
		.selectcountry("INDIA")
		.enterzipcode("600223")
		.clickbooknow();
		
	}

}
