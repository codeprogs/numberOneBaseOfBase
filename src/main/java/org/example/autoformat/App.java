package org.example.autoformat;

import org.example.autoformat.config.MainConfig;
import org.example.autoformat.model.Concert;
import org.example.autoformat.model.Musician;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("А теперь начинается концерт");
        Concert concert = context.getBean(Concert.class);
        concert.showConcert();
    }
}
