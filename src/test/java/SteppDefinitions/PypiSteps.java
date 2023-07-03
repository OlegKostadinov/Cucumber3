package SteppDefinitions;

import PageObjekts.Base;
import PageObjekts.PypiPO;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PypiSteps extends Base {
@Before

   public void openedge(){
    setUp();
}
@After
 public void closeedge(){
    driverClose();
 }

    @Given("the user is on the webpage")
    public void the_user_is_on_the_webpage() {
        toHome();

    }
    @When("user clicks the PyPi button")
    public void user_clicks_the_py_pi_button() throws InterruptedException {
       PypiPO.pypiclick();

    }
    @When("user enters try in the search")
    public void user_enters_try_in_the_search() throws InterruptedException {
    PypiPO.pypienter();
    }
    @When("user clicks the confirmation button")
    public void user_clicks_the_confirmation_button() {
        PypiPO.pypiconf();

    }
    @Then("user can see the result")
    public void user_can_see_the_result() {
        PypiPO.checkresult();
    }

}
