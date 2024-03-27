package org.example.autoformat.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("classicMusician")
public class ClassicMusician implements Musician {
    @Override
    public void sayHello() {
        System.out.println("Дамы и господа, Вас приветствует классический музыкант");
    }

    @Override
    public void playMusing() {
        System.out.println("Classic: tu-tu-ru-tuuu");
    }
    @Override
    public void singASong() {
        System.out.println("Classic: O sole miaaaaa");
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
