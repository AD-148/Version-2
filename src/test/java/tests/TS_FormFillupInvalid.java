package tests;

import org.testng.annotations.Test;

import functionalities.FormFillingFunctionality;

public class TS_FormFillupInvalid extends BaseClass {
	
	BaseClass bc= new BaseClass();
	
		FormFillingFunctionality fill = new FormFillingFunctionality();
		
	
	@Test(priority=1)
	public void TC_InvalidEmail() {
		fill.getCourse();
		fill.navigateForm();
		fill.setFormValues(2);
	}
	@Test(priority=2)
	public void TC_noData1() {
		refresh();
		fill.setFormValues(3);
		
	}
	@Test(priority=3)
	public void TC_wrongData() {
		refresh();
		fill.setFormValues(4);
		
	}
	@Test(priority=4)
	public void TC_noData2() {
		refresh();
		fill.setFormValues(5);
		
	}
	@Test(priority=5)
	public void TC_noData3() {
		refresh();
		fill.setFormValues(6);
		
	}
	@Test(priority=6)
	public void TC_noData4() {
		refresh();
		fill.setFormValues(7);
		
	}
	@Test(priority=7)
	public void TC_noData5() {
		refresh();
		fill.setFormValues(8);
		
	}
	@Test(priority=8)
	public void TC_noData6() {
		refresh();
		fill.setFormValues(9);
		
	}
	@Test(priority=9)
	public void TC_noData7() {
		refresh();
		fill.setFormValues(10);
		
	}
	@Test(priority=10)
	public void TC_noData8() {
		refresh();
		fill.setFormValues(11);
		
	}
	

}