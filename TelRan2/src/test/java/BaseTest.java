import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver wd;

    @BeforeClass
    public void setUp (){
        wd=new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // wait max 3 sec dlya poiska elementov, idet dal'she
        wd.manage().window().maximize();
    }

    public void addToWatchList() throws InterruptedException {
        wd.findElement(By.cssSelector("[accesskey=w]")).click();
        Thread.sleep(5000);
    }

    public void serch(String s) {
        wd.findElement(By.id("searchInput")).click();
        wd.findElement(By.id("searchInput")).clear();
        wd.findElement(By.id("searchInput")).sendKeys(s);

    }

    public void clickOk() {
        wd.findElement(By.id("wpLoginAttempt")).click();
    }

    public void insertPass(String s) {
        wd.findElement(By.id("wpPassword1")).clear();
        wd.findElement(By.id("wpPassword1")).click();
        wd.findElement(By.id("wpPassword1")).sendKeys(s);
    }

    public void insertName(String anna) {
        wd.findElement(By.id("wpName1")).clear();
        wd.findElement(By.id("wpName1")).sendKeys(anna);
    }

    public void clickLogin(String s) throws InterruptedException {
        wd.findElement(By.id(s)).click();
        Thread.sleep(1000);
    }

    public void clickEnglish(String s) throws InterruptedException {
        clickLogin(s);
    }

    public void openSite(String url) {
        wd.get(url);
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        wd.quit();
    }

    //___________________________________________________________________________
   //_____ _________________________________________________________________

    public void login() throws InterruptedException {
        openSite("https://www.wikipedia.org/");
        clickEnglish("js-link-box-en");
        clickEnglish("pt-login");
        insertName("Asniga");
        insertPass("dtcyf1235");
        clickOk();
    }

}
