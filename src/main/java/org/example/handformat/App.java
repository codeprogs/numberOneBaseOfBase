package org.example.handformat;

import org.example.handformat.config.MusicianConfig;
import org.example.handformat.model.ClassicMusician;
import org.example.handformat.model.Musician;
import org.example.handformat.model.RockMusician;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MusicianConfig.class);
        System.out.println("Приветствуем рок музыканта");
        Musician rockMusician = context.getBean(RockMusician.class);
        rockMusician.sayHello();
        rockMusician.playMusing();
        rockMusician.singASong();
        System.out.println("Приветствуем классического музыканта");
        Musician classicMusician = context.getBean(ClassicMusician.class);
        classicMusician.sayHello();
        classicMusician.playMusing();
        classicMusician.singASong();
        System.out.println("Приветсвуем еще одного рок музыканта");
        Musician rockMusicianTwo = context.getBean(RockMusician.class);
        rockMusicianTwo.sayHello();
        System.out.println("Так это же один и тот же музыкант? " + " - " + rockMusician.equals(rockMusicianTwo));
        System.out.println("Тогда приветсвуем еще одного классического музыканта");
        Musician classicMusicianTwo = context.getBean(ClassicMusician.class);
        System.out.println("Это опять один и тот же? " + " - " + classicMusician.equals(classicMusicianTwo));
        System.out.println("Ну хоть классические разные =)");
    }
}
