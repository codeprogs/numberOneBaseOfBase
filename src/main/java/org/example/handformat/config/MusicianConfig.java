package org.example.handformat.config;

import org.example.handformat.model.ClassicMusician;
import org.example.handformat.model.RockMusician;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MusicianConfig {
    @Bean
    RockMusician getRockMusician(){
        return new RockMusician();
    }
    @Bean
    @Scope("prototype")
    ClassicMusician getClassicMusician(){
        return new ClassicMusician();
    }
}
