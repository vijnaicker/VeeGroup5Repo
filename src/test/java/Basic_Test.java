import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.support.ui.Sleeper;

public class Basic_Test {

    WebDriver driver;

    @BeforeTest
    public void launchBrowser()
    {
        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
    }

    @Test
    public void enterCredentials()
    {
        driver.findElement(By.xpath("/html/body/div/div/nav/div[1]/div[3]/button/span[2]")).click();
        driver.findElement(By.id("login-email")).sendKeys("vijnaicker@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("vtest@ntest2");
        //driver.findElement(By.id("login-submit")).click();
    }
    @Test (priority = 1)
    public void clickSubmit() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();

        Thread.sleep(2000);
    }

    @Test (priority = 3)
    public void verifyLogin() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/nav/div[1]/div[2]/div[1]/button/span[2]")).isDisplayed();
    }

    @Test (priority = 4)
    public void clickLearn() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div/nav/div[1]/div[2]/div[1]/button/span[2]")).click();
        //Thread.sleep(5000);
    }
    ///html/body/div/div/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]
    @Test (priority = 5)
    public void verifyLearningMaterials() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")).isDisplayed();
        Thread.sleep(5000);
    }

    @Test (priority = 6)
    public void clickLearningMaterials() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")).click();
        Thread.sleep(5000);
    }

    @Test (priority = 7)
    public void verifyBasicForm() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div/main/section/div[2]/button[3]")).isDisplayed();
        Thread.sleep(2000);
    }

    @Test (priority = 8)
    public void clickBasicForm() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div/main/section/div[2]/button[3]")).click();
        Thread.sleep(2000);
    }


    @Test (priority = 9)
    public void verifyExpandBasicForm() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div/main/section/div[2]/button[3]")).isDisplayed();
        Thread.sleep(2000);
    }

    @Test (priority = 10)
    public void clickExpandBasicForm() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div/main/section/div[2]/button[3]")).click();
        Thread.sleep(2000);

    }

    @Test (priority = 11)
    public void verifySummaryBasicForm() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div/main/section/div[3]/div/div/h2")).isDisplayed();
        Thread.sleep(2000);
    }

    @Test (priority = 12)
    public void clickSummaryBasicForm() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div/div/main/section/div[3]/div/details/summary")).click();
        Thread.sleep(2000);

    }

    @AfterTest
    public void closeBrowser()
    {
        driver.quit();

    }

}
