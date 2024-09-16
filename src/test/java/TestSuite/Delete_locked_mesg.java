package TestSuite;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.BaseClass.Base_Class;
import com.crm.BaseClass.Random_Num;
import com.crm.pom.pric;

public class Delete_locked_mesg extends Base_Class{
	@Test
	public void delete_mesg() throws InterruptedException, IOException
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
	    p.preminumContent.sendKeys("1234");
	p.submit.click();
	Thread.sleep(6000);
	p.delete_button.click();
	driver.navigate().refresh();
	p.Home.click();
	}

}
