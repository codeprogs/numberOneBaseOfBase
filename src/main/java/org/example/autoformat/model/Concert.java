package org.example.autoformat.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Concert {
    @Qualifier("classicMusician")
    @Autowired
    Musician musician;

    @Qualifier("rockMusician")
    @Autowired
    Musician musicianTwo;

    public void showConcert() {
        musician.playMusing();
        musicianTwo.singASong();
    }
}
