package com.thedeathstar.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.thedeathstar.model.DeathStars;

/**
 * Created by Jeremy on 6/27/17.
 */
public class RestClient {

    //private static final RestTemplate restTemplate;

    public DeathStars GetDeathStars()
    {
        String url = "https://deathstar-service.cfapps.io/deathstars";
        String result;
        DeathStars deathStars;

        RestTemplate restTemplate = new RestTemplate();
        deathStars = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", DeathStars.class);

        return deathStars;
    }
}

