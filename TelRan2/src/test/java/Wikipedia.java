import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class Wikipedia {
    Webdriver = wd;

    @BeforeClass
    public void setUp (){
        wd=new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // wait max 3 sec dlya poiska elementov, idet dal'she
    }

    @Test
    public void chromeBrowserTest(){
        wd.get("https://www.ebay.com/");
        // type in SearchBar
        wd.findElement(By.id("gh-ac")).click();
        wd.findElement(By.id("gh-ac")).clear();
        wd.findElement(By.id("gh-ac")).sendKeys("Shoes");
        wd.findElement(By.id("gh-btn")).click();
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        wd.quit();
    }
}


