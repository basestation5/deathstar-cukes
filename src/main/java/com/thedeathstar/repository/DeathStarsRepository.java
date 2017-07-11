package com.thedeathstar.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import com.thedeathstar.model.DeathStars;

/**
 * Created by Jeremy on 6/27/17.
 */
public class DeathStarsRepository {

    //private static final RestTemplate restTemplate;

    public DeathStars GetDeathStars()
    {
        String url = "http://deathstar-service.cfapps.io/deathstars";
        DeathStars deathStars;

        RestTemplate restTemplate = new RestTemplate();
        deathStars = restTemplate.getForObject(url, DeathStars.class);

        return deathStars;
    }

    public HttpStatus GetServiceResponseCode()
    {
        String url = "http://deathstar-service.cfapps.io/deathstars";

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Object> entity = new HttpEntity<Object>(headers);

        ResponseEntity<String> out = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        return out.getStatusCode();
    }

}

