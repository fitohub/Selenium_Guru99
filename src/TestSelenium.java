import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestSelenium {

    public static void main(String[] args) {

        //Open Mercury Tours page
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://newtours.demoaut.com/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //HOME - Find A Flight
        WebElement userName = driver.findElement(By.name("userName"));
        userName.sendKeys("mercury");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("mercury");

        WebElement login = driver.findElement(By.name("login"));
        login.click();

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        // FLIGHT FINDER - Flight Details
        Select passCount = new Select(driver.findElement(By.name("passCount")));
        passCount.selectByVisibleText("2");

        Select fromPort = new Select(driver.findElement(By.name("fromPort")));
        fromPort.selectByVisibleText("Zurich");

        Select fromMonth = new Select(driver.findElement(By.name("fromMonth")));
        fromMonth.selectByVisibleText("October");

        Select fromDay = new Select(driver.findElement(By.name("fromDay")));
        fromDay.selectByVisibleText("2");

        Select toPort = new Select(driver.findElement(By.name("toPort")));
        toPort.selectByVisibleText("New York");

        Select toMonth = new Select(driver.findElement(By.name("toMonth")));
        toMonth.selectByVisibleText("December");

        Select toDay = new Select(driver.findElement(By.name("toDay")));
        toDay.selectByVisibleText("17");

        // FLIGHT FINDER - Flight Details

        WebElement findFlights = driver.findElement(By.name("findFlights"));
        findFlights.click();

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);



//        WebElement button = driver.findElement(By.xpath("//input[@name='btnLogin']"));
//        button.click();
    }
}
