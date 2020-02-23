package Run;

import org.testng.annotations.Test;

import Com.pages.HomePage;
import Common.Browsers;

public class Home_Page_Test extends Browsers {
	
  @Test
  public void f() {
	  HomePage h=new HomePage(driver);
	  h.EmailIdField();
	  h.PasswordField();
	  h.LoginButton();
	  
  }
}
