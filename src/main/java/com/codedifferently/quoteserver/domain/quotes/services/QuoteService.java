package com.codedifferently.quoteserver.domain.quotes.services;

import com.codedifferently.quoteserver.domain.quotes.models.Quote;
import com.codedifferently.quoteserver.domain.quotes.models.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class QuoteService {

    private static final Logger logger = LoggerFactory.getLogger(QuoteService.class);

    private RestTemplate restTemplate;

    public QuoteService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }



}
