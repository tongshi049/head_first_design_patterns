package com.example.designpatterns.proxy.client;

import com.example.designpatterns.proxy.compute.MyRemote;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyRemoteClient {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(args[0]);

            MyRemote service = (MyRemote) registry.lookup("RemoteMethod");

            System.out.println(service.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
