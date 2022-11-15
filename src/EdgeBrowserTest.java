import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {

    public static void main(String[] args) {
        //1) Setup Edge Browser
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //2)Open url
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //3)Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        //4)Print the current url
        System.out.println("Current Url: "+ driver.getCurrentUrl());

        //5)print the page source
        System.out.println("Page source: "+ driver.getPageSource());

        //6)Enter the email to email field
        WebElement emailfield = driver.findElement(By.name("user[email]"));
        emailfield.sendKeys("yfhdt@gamil.com");

        //7)Enter the password to password field
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("jdusrsg985874");

        //8)Close the browser
        driver.quit();
    }
}
