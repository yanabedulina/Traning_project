package Run;

import org.testng.annotations.Test;

import Com.pages.HomePage;
import Common.Browsers;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class Testdata extends Browsers {
  @Test(dataProvider = "signin")
  public void f(String n, String s) {
	  HomePage h=new HomePage(driver);
	  h.EmailIdField(n);
	  h.PasswordField();
	  h.LoginButton();
	  Reporter.log("Executed succsessfully");
  }

  @DataProvider
  public Object[][] signin() {
    return new Object[][] {
      new Object[] { "yannnnn@gmail.com", "a" },
      new Object[] { "pri@mail.ru", "b" },
      new Object[] { "you@gmail.com", "c" },
    };
  }
}
