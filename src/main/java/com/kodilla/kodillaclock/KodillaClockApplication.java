package com.kodilla.kodillaclock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
import java.time.*;

@SpringBootApplication
public class KodillaClockApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaClockApplication.class, args);

        Clock clock = Clock.fixed(Instant.parse("2019-01-01T10:00:00Z"), ZoneId.systemDefault());
        Clock clock1 = Clock.fixed(Instant.parse("2019-01-01T09:00:00Z"), ZoneId.systemDefault());
        Clock clock2 = Clock.fixed(Instant.parse("2019-01-01T08:00:00Z"), ZoneId.systemDefault());
        Clock clock3 = Clock.fixed(Instant.parse("2019-01-01T07:00:00Z"), ZoneId.systemDefault());
        Clock clock4 = Clock.fixed(Instant.parse("2019-01-01T06:00:00Z"), ZoneId.systemDefault());


        LinkedList<Clock> clocks = new LinkedList<>();
        clocks.add(clock);
        clocks.add(clock1);
        clocks.add(clock2);
        clocks.add(clock3);
        clocks.add(clock4);


        for(int i = 0; i < clocks.size(); i++){
            System.out.println("Time before change: " + clocks.get(i).instant());
        }

        for(int i = 0; i < clocks.size(); i++){
            Instant pastTime = clocks.get(i).instant();
            Instant newTime = pastTime.plusSeconds(60);
            System.out.println("Time after change: "+ newTime);



    }

}
