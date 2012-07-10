package cucumber.examples.java.helloworld;

import static org.junit.Assert.assertEquals;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class HelloStepdefs {
	private Hello hello;
	private String hi;

	@Given("^Minha saudacao e \"([^\"]*)\"$")
	public void I_have_a_hello_app_with(String greeting) {
		hello = new Hello(greeting);
	}

	@When("^Eu executo minha aplicacao$")
	public void I_ask_it_to_say_hi() {
		hi = hello.sayHi();
	}

	@Then("^Ela deveria responder com \"([^\"]*)\"$")
	public void it_should_answer_with(String expectedHi) {
		assertEquals(expectedHi, hi);
	}
}
