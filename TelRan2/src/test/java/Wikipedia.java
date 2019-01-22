import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Wikipedia {
    WebDriver wd;

    @BeforeClass
    public void setUp (){
        wd=new ChromeDriver();
        //wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // wait max 3 sec dlya poiska elementov, idet dal'she
    }

    @Test
    public void chromeBrowserTest() throws InterruptedException {
        wd.get("https://www.wikipedia.org/");
        // type in SearchBar
        wd.findElement(By.id("js-link-box-en")).click();
        Thread.sleep(1000);
        wd.findElement(By.id("pt-login")).click();
        Thread.sleep(1000);
        wd.findElement(By.id("wpName1")).clear();
        wd.findElement(By.id("wpName1")).sendKeys("Anna");
        wd.findElement(By.id("wpPassword1")).clear();
        wd.findElement(By.id("wpPassword1")).click();
        wd.findElement(By.id("wpPassword1")).sendKeys("123456");

        wd.findElement(By.id("wpLoginAttempt")).click();
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        wd.quit();
    }
}


