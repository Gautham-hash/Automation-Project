package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LogOut;
import pages.LoginPage;
import pages.MentorPage;

public class LoginTest extends TestBase {

    LoginPage obj;
    HomePage hobj;
    MentorPage mobj;
    LogOut lobj;

    @BeforeMethod
    public void SetUp() {
        obj = new LoginPage(driver);
        hobj = new HomePage(driver);
        mobj = new MentorPage(driver);
        lobj = new LogOut(driver);
    }

    @Test
    public void tc001_login() {
        Assert.assertTrue(obj.chkbtn(), "Login button not visible");
        obj.clkloginbtn();
        obj.getuname("ictak@example.com");
        obj.getpass("0000");
        obj.loginclk();
    }

    @Test
    public void tc002_addProject() {
    	
        hobj.addProject();
        hobj.projectTopic("AI/ML");
        hobj.projectDuration("6 months");
        hobj.addProjectbtn();
    }

    @Test
    public void tc003_addMentor() {
    	
        mobj.clkMentor();
        mobj.addMentor();
        mobj.mntrName("gautham");
        mobj.mntrEmail("gauthamsurendran@gmail.com");
        mobj.mntrPhone("76489936383");
        mobj.mntrPass("1234");
        mobj.mntrProject("sdet");
        mobj.mntrAdd();
    }
    
    @Test
    public void tc004_logout() {
    
    	lobj.clickLogout();
    }
    
    
}
