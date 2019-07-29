package com.theo;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("no action taken, no power button here");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("now ringing " + phoneNumber + " on deskPhone");
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
        if (phoneNumber == myNumber){
            isRinging = true;
            System.out.println("ring ring");
        }
        else {
            isRinging = false;
            System.out.println("the number you have entered is invalid, please enter another number");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
