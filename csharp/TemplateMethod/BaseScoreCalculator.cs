namespace TemplateMethod;

public abstract class BaseScoreCalculator
{
    public int GenerateScore(int hits, TimeSpan time)
    {
        int score = CalculateBaseScore(hits);
        int reduction = CalculateReduction(time);
        return CalculateOverallScore(score, reduction);
    }

    public abstract int CalculateOverallScore(int score, int reduction);

    public abstract int CalculateReduction(TimeSpan time);

    public abstract int CalculateBaseScore(int hits);
}