﻿namespace TemplateMethod;

public class ChildrenScoreCalculator : BaseScoreCalculator
{
    public override int CalculateBaseScore(int hits)
    {
        return hits * 80;
    }

    public override int CalculateOverallScore(int score, int reduction)
    {
        return score - reduction;
    }

    public override int CalculateReduction(TimeSpan time)
    {
        return (int)time.Seconds/2;
    }
}