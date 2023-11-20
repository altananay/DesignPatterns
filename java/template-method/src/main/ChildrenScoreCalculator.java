package main;

import java.time.LocalTime;

public class ChildrenScoreCalculator extends BaseScoreCalculator {
    @Override
    public int CalculateOverallScore(int score, int reduction) {
        return score - reduction;
    }

    @Override
    public int CalculateReduction(LocalTime time) {
        return time.getSecond()/2;
    }

    @Override
    public int CalculateBaseScore(int hits) {
        return hits * 80;
    }
}
