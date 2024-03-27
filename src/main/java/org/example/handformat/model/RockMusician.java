package org.example.handformat.model;

public class RockMusician implements Musician{
    @Override
    public void sayHello() {
        System.out.println("Всем привет, я рок музыкант");
    }

    @Override
    public void playMusing() {
        System.out.println("Rock: tram pam brinks");
    }
    @Override
    public void singASong() {
        System.out.println("Rock: na-na-nai-na-na");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
