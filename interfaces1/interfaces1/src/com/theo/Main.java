package com.theo;

public class Main {

    public static void main(String[] args) {

        // the interface itself is abstract, think about it as a helper class
        //it's like a contract, that the methods in this interface will have the same parameters and the same name
        // if they are used from the class
        // normally, when naming an interface, the first letter is a capital I

        ITelephone theosPhone = new DeskPhone(123456);

        theosPhone.powerOn();
        theosPhone.callPhone(123456);
        theosPhone.answer();

        System.out.println();

        theosPhone = new MobilePhone(234512);

//        theosPhone.powerOn();

        theosPhone.callPhone(234512);
        theosPhone.answer();
    }
}
