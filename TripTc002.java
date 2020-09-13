package pom.testcases;


import pom.tripadvisor.pages.HomePage;
import wrappers.ProjectWrappers;

public class TripTc002  extends ProjectWrappers{
	
	public void cruises(){
		new HomePage(driver,test)
		.clickOnTravelForums()
		.clickoncruises()
		.clickoncrusiesin()
		.clickonamreciancruises()
		.clickoncrusiestype()
		.clickonamericanglory()
		.clickonsearch()
		.clickonwritereviw()
		.selectcabintype("Balcony")
		.selectdestination("Bahamas")
		.entertitle("The wonder full journey")
		.enterreview("In closing, we had a bucket full of bucket list moments… Cruising enables you to relax and be pampered like no other vacation experience, and cruising with Celebrity is a pure ")
		.clickontypetour()
		.selecttraveldate("8,2020")
		.clickonfirstcuriseyes()
		.clickoncertify()
		.clickonrating()
		.clickonsubmit();

	}
	}
