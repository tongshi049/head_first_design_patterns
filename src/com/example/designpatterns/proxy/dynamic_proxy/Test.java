package com.example.designpatterns.proxy.dynamic_proxy;

public class Test {

    public static void main(String[] args) {
        PersonBean garen = new PersonBeanImpl("Garen", "m");
        PersonBean lux = new PersonBeanImpl("Lux", "f");

        PersonBean ownerProxy = ((PersonBeanImpl) garen).getOwnerProxy(garen);
        System.out.println("Name is " + ownerProxy.getName());

        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Cannot set rating from owner proxy");
        }

        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());


        PersonBean nonOwnerProxy = ((PersonBeanImpl) garen).getNonOwnerProxy(garen);
        try {
            nonOwnerProxy.setInterests("bowling");
        } catch (Exception e) {
            System.out.println("Cannot set interests from non owner proxy");
        }

        nonOwnerProxy.setHotOrNotRating(8);
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());

    }

}
