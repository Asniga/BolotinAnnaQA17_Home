import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Wikipedia extends BaseTest {
    WebDriver wd;

    @Test
    public void chromeBrowserTest() throws InterruptedException {
        login();
        serch("Game of Thrones");
        addToWatchList();
    }

}


