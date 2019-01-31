import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LogOut extends BaseTest {
    @Test
    public void logOutTest(){
        wd.findElement(By.xpath("//a[@title='Log out']")).click();
    }

/*
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException { // proverka chto user zaloginen pered kajdim testom v etom Classe
        if (!isUserLoggedIn())
            login();
    }

    public boolean isUserLoggedIn() {  // proverka chto user zaloginen pered kajdim testom v etom Classe, vzyali code iz ineta
        return isElementPresent(By.cssSelector("a href[title='Log Out']")); //esli est' takoi lokator to user zaloginen
    }

    public boolean isElementPresent(By by) {
        try {
            wd.findElement(by);
            return true;
        } catch (NoSuchElementException e) {   // pri oshibke vipadet NoSuchElementException
            return false;
        }
    }
    */


}
