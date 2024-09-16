package TestSuite;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.BaseClass.Base_Class;
import com.crm.BaseClass.Random_Num;
import com.crm.pom.pric;

public class Edge_case extends Base_Class {
	@Test
	public void edit_mesg() throws IOException, InterruptedException
	{
		preCondition();
		login();
     	pric p=new pric(driver);
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		int no = Random_Num.random(); 
		String s = String.valueOf(no);
		p.amount.sendKeys(s);
		p.visible_Mesg.sendKeys("Manjiri");
 	    p.preminumContent.sendKeys("124");
		p.submit.click();
		Thread.sleep(3000);
		assertTrue(p.price.getText().contains(s),"It is verify");
		p.Home.click();
	}
}
