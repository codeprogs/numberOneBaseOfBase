package org.example.smallProject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {
    private String name;
    private LocalDate foundingDate;
    private Long population;
    private Country country;

    @Override
    public String toString(){
        return name + " " + population + " " + foundingDate + " " + country;
    }
}
