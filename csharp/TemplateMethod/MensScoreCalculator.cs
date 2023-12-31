﻿namespace TemplateMethod;

public class MensScoreCalculator : BaseScoreCalculator
{
    public override int CalculateBaseScore(int hits)
    {
        return hits*100;
    }

    public override int CalculateOverallScore(int score, int reduction)
    {
        return score - reduction;
    }

    public override int CalculateReduction(TimeSpan time)
    {
        return (int)time.Seconds / 5;
    }
}