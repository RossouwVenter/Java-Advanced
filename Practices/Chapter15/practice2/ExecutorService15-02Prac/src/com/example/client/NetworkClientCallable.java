/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.client;

import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.Callable;

/**
 *
 * @author rosso
 */
public class NetworkClientCallable implements Callable<RequestResponse> {

    private final RequestResponse lookup;

    public NetworkClientCallable(RequestResponse lookup) {
        this.lookup = lookup;
    }

    @Override
    public RequestResponse call() throws Exception {
        try ( Socket sock = new Socket(lookup.host, lookup.port);  Scanner scanner = new Scanner(sock.getInputStream())) {
            lookup.response = scanner.next();
            return lookup;
        }
    }

}
