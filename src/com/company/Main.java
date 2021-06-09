package com.company;

public class Main {

    public static void main(String[] args) {
        // This is a practise run for me to better understand design patterns.
        // Subject has a state and a list of observers (which is empty at the beginning).
        // Everytime there is a creation of a new observer, it adds itself in the list of the State object.
        // This is a basic event example.

	    Subject subject = new Subject();
	    new BinaryObserver(subject);
	    new OctalObserver(subject);
	    new HexObserver(subject);

        System.out.println("State is changed to 16");
        subject.setState(16);
        System.out.println("State is changed to 10");
        subject.setState(10);
    }
}
