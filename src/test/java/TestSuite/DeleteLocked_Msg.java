package TestSuite;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.crm.BaseClass.Base_Class;
import com.crm.BaseClass.Random_Num;
import com.crm.pom.pric;

public class DeleteLocked_Msg extends Base_Class {
	@Test
	public void delete_mesg() throws IOException, InterruptedException
	{
		preCondition();
		login();
     	pric p=new pric(driver);
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(8000);
		p.locked.click();
		Thread.sleep(4000);
		p.create.click();
		int no = Random_Num.random(); 
		String s = String.valueOf(no);
		p.amount.sendKeys("1");
		p.visible_Mesg.sendKeys("sweety");
 	    p.preminumContent.sendKeys("1234");
		p.submit.click();
		p.delete_icon.click();
		Thread.sleep(6000);
		p.delete_button.click();
		driver.navigate().refresh();
		p.Home.click();
       }
}
