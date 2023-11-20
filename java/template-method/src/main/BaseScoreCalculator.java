package main;

import java.time.LocalTime;

public abstract class BaseScoreCalculator
{
    public int GenerateScore(int hits, LocalTime time)
    {
        int score = CalculateBaseScore(hits);
        int reduction = CalculateReduction(time);
        return CalculateOverallScore(score, reduction);
    }

    public abstract int CalculateOverallScore(int score, int reduction);

    public abstract int CalculateReduction(LocalTime time);

    public abstract int CalculateBaseScore(int hits);
}
