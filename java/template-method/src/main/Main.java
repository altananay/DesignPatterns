package main;

import java.sql.Time;
import java.time.LocalTime;

public class Main {
  public static void main(String[] args) {
    BaseScoreCalculator baseScoreCalculator;
    System.out.println("Mens");
    baseScoreCalculator = new MenScoreCalculator();
    System.out.println(baseScoreCalculator.GenerateScore(10,LocalTime.of(0, 2, 34) ));

    System.out.println("Womens");
    baseScoreCalculator = new WomenScoreCalculator();
    System.out.println(baseScoreCalculator.GenerateScore(10,LocalTime.of(0, 2, 34) ));


    System.out.println("Children");
    baseScoreCalculator = new ChildrenScoreCalculator();
    System.out.println(baseScoreCalculator.GenerateScore(10,LocalTime.of(0, 2, 34) ));

  }
}
