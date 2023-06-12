package cases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ATFLoginPage;
import utils.ATFExcelManager;
import utils.ATFTestDetails;

import java.lang.reflect.Method;
import java.util.HashMap;


public class LoginTest extends ATFBaseTest {

    //ATFExcelManager exceldata=new ATFExcelManager();

    @BeforeMethod(alwaysRun = true)
    public void beforeTest(Method method) {
        launchBrowser(method);
    }


    @ATFTestDetails(user = "RAJU", date = "10/23/2019", displayName = "Login Into Application")
    @Test(groups = {REGRESSION}, description = "Test login into application")
    public void testLoginIntoApplication() {
        atfLoginPage = navigateToPage(ATFLoginPage.class);
        atfLoginPage.doSearch("LoginPage.USERNAME");
        AssertElementVisible(GetWebController(), ATFLoginPage.SEARCH_INPUT, "Input box");
    }

    @ATFTestDetails(user = "KK", date = "10/23/2019", displayName = "Login Into Application")
    @Test(groups = {REGRESSION}, description = "Test login into application")
    public void testTC1() {
        atfLoginPage = navigateToPage(ATFLoginPage.class);
        atfLoginPage.doSearch(atfLoginPage.getTestData().get("AMAZON_WEBSITE"));
        AssertElementVisible(GetWebController(), ATFLoginPage.SEARCH_INPUT, "Input box");

    }

}