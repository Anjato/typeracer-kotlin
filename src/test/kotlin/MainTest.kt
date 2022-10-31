//import io.github.bonigarcia.wdm.WebDriverManager
//import org.openqa.selenium.By
//import org.openqa.selenium.Keys
//import org.testng.Assert
//import org.testng.annotations.Test
//import org.openqa.selenium.WebDriver
//import org.openqa.selenium.WebElement
//import org.openqa.selenium.firefox.FirefoxDriver
//import org.testng.annotations.AfterTest
//import org.testng.annotations.BeforeTest
//import java.time.Duration
//
//class MainTest  {
//
//    private var driver: WebDriver? = null
//
//    @BeforeTest
//    fun createDriver() {
//        WebDriverManager.firefoxdriver().setup()
//        driver = FirefoxDriver()
//        driver!!.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
//    }
//
//    @AfterTest
//    fun tearDownDriver() {
//        driver!!.quit()
//    }
//
//    @Test
//    fun main() {
//        val url = "https://www.google.com/"
//
//        driver!!.get(url)
//
//        Assert.assertEquals(driver!!.currentUrl, url)
//
//
//        val searchBarBy = By.cssSelector(".gLFyf.gsfi")
//        val searchBar: WebElement = driver!!.findElement(searchBarBy)
//
//        searchBar.sendKeys("Selenium Testing", Keys.ENTER)
//    }
//
//    @Test
//    fun testTwo(){
//
//        val url = "https://www.youtube.com"
//
//        driver!!.get(url)
//
//    }
//}
