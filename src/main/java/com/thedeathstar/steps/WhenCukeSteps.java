package com.thedeathstar.steps;

import com.thedeathstar.model.DeathStars;
import com.thedeathstar.repository.DeathStarsRepository;
import cucumber.api.java.en.When;
import org.springframework.http.HttpStatus;
import org.springframework.util.Assert;

/**
 * Created by Jeremy on 7/10/17.
 */
public class WhenCukeSteps {


    @When("^I add a Deathstar to the DeathStar Service$")
    public void AddADeathStar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I call the Deathstar Service$")
    public void VerifyServiceIsAvailable() throws Throwable {

        DeathStarsRepository client = new DeathStarsRepository();
        HttpStatus status = client.GetServiceResponseCode();
        Assert.isTrue(HttpStatus.OK == status);
    }

}
