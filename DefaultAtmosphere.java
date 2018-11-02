package com.example;

import org.atmosphere.wasync.ClientFactory;
import org.atmosphere.wasync.impl.AtmosphereClient;

public class DefaultAtmosphere {

    private final AtmosphereClient client = ClientFactory.getDefault().newClient(AtmosphereClient.class);
}
