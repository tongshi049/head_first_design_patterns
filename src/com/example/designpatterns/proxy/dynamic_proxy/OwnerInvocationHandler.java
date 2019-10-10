package com.example.designpatterns.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {

    PersonBean person;

    /*
    * Pass the real subject in the constructor and we keep a reference to it.
    * */
    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    /*
    * invoke method: gets called every time a method is invoked on the proxy
    *
    * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("get")) { // if method is a getter, we go ahead and invoke it on the real subject
                return method.invoke(person, args);
            } else if (method.getName().equals("setHotOrNotRating")) { // we disallow it by throwing a IllegalAccessException
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(person,  args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }
}




























