package com.example.designpatterns.proxy.engine;

import com.example.designpatterns.proxy.compute.MyRemote;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    private static final long serialVersionUID = 7307507943547279964L;


    public MyRemoteImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hello'";
    }

    public static void main(String[] args) {
        if (System.getSecurityManager() == null)
            System.setSecurityManager(new SecurityManager());

        try {
            MyRemote service = new MyRemoteImpl();
            //MyRemote stub = (MyRemote) UnicastRemoteObject.exportObject(service, 0);
            Registry registry = LocateRegistry.createRegistry(0);
            registry.bind("RemoteMethod", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
