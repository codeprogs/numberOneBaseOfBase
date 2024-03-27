package org.example.autoformat.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("rockMusician")
public class RockMusician implements Musician {
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
