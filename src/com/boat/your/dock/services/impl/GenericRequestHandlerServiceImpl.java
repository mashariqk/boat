package com.boat.your.dock.services.impl;

import com.boat.your.dock.services.GenericRequestHandlerService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by 273041 on 11/23/2016.
 */

@Service
@Component(value = "genericRequestHandlerService")
public class GenericRequestHandlerServiceImpl implements GenericRequestHandlerService {
    @Override
    public boolean isSiteViewAllowed(String request) {
        return false;
    }
}
