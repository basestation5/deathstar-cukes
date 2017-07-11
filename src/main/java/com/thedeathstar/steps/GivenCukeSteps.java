package com.thedeathstar.steps;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thedeathstar.repository.DeathStarsRepository;
import com.thedeathstar.model.DeathStars;
import cucumber.api.java.en.Given;
import org.springframework.util.Assert;


/**
 * Created by Jeremy on 6/27/17.
 */


//Feature: Get a Deathstar
//   Scenario: Get a single Deathstar
//           Given There are two deathstars in the Galaxy
//           When I call the Deathstar Service
//           Then I should get two deathstars

public class GivenCukeSteps {


    @Given("^There are fifty deathstars in the Galaxy$")
    public void GivenFiftyDeathStars() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }


    @Given("^There are two deathstars in the Galaxy$")
    public void GivenTwoDeathStars() throws Throwable {

    DeathStarsRepository client = new DeathStarsRepository();
    DeathStars deathStars = client.GetDeathStars();
    Assert.isTrue(2 == deathStars.getDeathStars().size());
    }


}
