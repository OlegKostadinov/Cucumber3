package SteppDefinitions;

import PageObjekts.Base;
import PageObjekts.POlink_download;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class linkdownload_check extends Base{

    @Before
    public void closeChrome(){
        setUp();

    }






    @Given("the user is on the website")
    public void the_user_is_on_the_website() {
        toHome();

    }
    @When("user clicks the download button")
    public void user_clicks_the_download_button() throws InterruptedException{
        POlink_download.downlinkone();


    }
    @Then("user have the downloads page")
    public void user_have_the_downloads_page() {
        POlink_download.checkTitle();

    }

    @After
    public void setUpChrome() {
        driverClose();
    }



}
