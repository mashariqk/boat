package com.boat.your.dock.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by 273041 on 11/23/2016.
 */


public interface GenericRequestHandlerService {
    boolean isSiteViewAllowed(String request);
}
