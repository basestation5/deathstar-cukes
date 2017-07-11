package com.thedeathstar.steps;

import com.thedeathstar.model.DeathStars;
import com.thedeathstar.repository.DeathStarsRepository;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.util.Assert;

/**
 * Created by Jeremy on 7/10/17.
 */
public class ThenCukeSteps {


    @Then("^I should get an TooManyDeathStarsError$")
    public void GetTooManyDeathStarsError() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I should get all deathstars$")
    public void i_should_get_all_deathstars() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I should get three deathstars$")
    public void ThenThreeDeathStars() throws Throwable {
        DeathStarsRepository client = new DeathStarsRepository();
        DeathStars deathStars = client.GetDeathStars();
        Assert.isTrue(3 == deathStars.getDeathStars().size());
    }

    @Then("^I should get two deathstars$")
    public void ThenTwoDeathStars() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }


}
