package com.theo;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("now ringing " + phoneNumber + " on mobilePhone");
        }
        else {
            System.out.println("phone is switched off");
        }
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("answering the phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println(" melody ring ring");
        }
        else {
            isRinging = false;
            System.out.println("the number you have entered is invalid, or the phone is off");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}