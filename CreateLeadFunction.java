package week1.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class CreateLeadFunction{



public static void main(String[] args) {
    EdgeDriver driver=new EdgeDriver();
    driver.get("https://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        WebElement usernameTextField = driver.findElement(By.id("username"));
        usernameTextField.sendKeys("DemoCSR");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
       driver.findElement(By.className("decorativeSubmit")).click();
       driver.findElement(By.partialLinkText("CRM")).click();
       driver.findElement(By.linkText("Leads")).click();
       driver.findElement(By.linkText("Create Lead")).click();
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lavanya");
       driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Magesh");
       WebElement dropDown = driver.findElement(By.id("createLeadForm_industryEnumId"));
       Select industryDD = new Select(dropDown);
       industryDD.selectByIndex(5);
       driver.findElement(By.name("submitButton")).click();
}
}
