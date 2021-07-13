package StepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UberBookingSteps {
	
	
	

    @Given("^User wants to select a car type \"([^\"]*)\" from uber app$")
    public void user_wants_to_select_a_car_type_something_from_uber_app(String strArg1) throws Throwable {
    System.out.println("");
    }
    
    

    @When("^User select car \"([^\"]*)\" and pick up point \"([^\"]*)\" and drop point \"([^\"]*)\"$")
    public void user_select_car_something_and_pick_up_point_something_and_drop_point_something(String strArg1, String strArg2, String strArg3) throws Throwable {
    }

    @Then("^Driver Starts the journey$")
    public void driver_starts_the_journey() throws Throwable {
    }

    @Then("^User pays 1000USD$")
    public void user_pays_1000usd() throws Throwable {
    }

}
