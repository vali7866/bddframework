package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
WebDriver driver;
	
	@Given("^user is present in Login page$")
	public void user_present_in_login_page()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\veni\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_nav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1");
	}
	
	@When("^Title of Login page is amazon$")
	public void Title_of_Login_amazon() {
		String title =driver.getTitle();
		System.out.println(title);
		}
	@Then("^user enters username and click on next button$")
	public void user_enters_username_and_click_on_next_button() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("meravali143@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(2000);
		}
	@Then("^user enters password and click on next button$")
	public void user_enters_password_and_click_on_next_button() {
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("valimeera");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
	}
	
	@Then ("^user search books and click on Search button$")
	public void user_search_books_and_click_on_Search_button() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("books");
		driver.quit();
	}

}
