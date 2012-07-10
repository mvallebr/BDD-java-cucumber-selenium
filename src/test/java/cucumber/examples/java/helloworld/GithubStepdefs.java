package cucumber.examples.java.helloworld;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class GithubStepdefs {
	private WebDriver driver;

	@Given("^Eu estou no site \"([^\"]*)\"$")
	public void eu_estou_no_site(String site) throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(site);
	}

	@When("^Eu procuro por \"([^\"]*)\"$")
	public void eu_procuro_por (String searchText) throws Exception {		
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys(searchText + "\n");
	}
	
	@When("^Eu clico no link com descricao \"([^\"]*)\"$")
	public void eu_clico_no_link_com_descricao (String expectedLinkText) throws Exception {				
		driver.findElement(By.linkText(expectedLinkText)).click();
	}

	@Then("^Eu deveria encontrar um link com descricao \"([^\"]*)\"$")
	public void eu_deveria_encontrar_um_link_com_descricao (String expectedLinkText) throws Exception {
		try {
			Assert.assertNotNull(driver.findElement(By
					.linkText(expectedLinkText)));
		} finally {
			driver.quit();
		}
	}
}
