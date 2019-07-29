package com.theo;

public interface ITelephone {

     void powerOn();
     void dial(int phoneNumber);
     void answer();
     boolean callPhone(int phoneNumber);
     boolean isRinging();

    // if a class implements the Interface, these are the methods, that the class must implement
    // so the interface exists to define the methods that must be implemented
    // the methods will be defined in the class, so the keyword "public" is useless here
}
