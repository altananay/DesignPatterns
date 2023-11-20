using TemplateMethod;

BaseScoreCalculator baseScoreCalculator;
Console.WriteLine("Mens");
baseScoreCalculator = new MensScoreCalculator();
Console.WriteLine(baseScoreCalculator.GenerateScore(10, new TimeSpan(0, 2, 34)));

Console.WriteLine("women");
baseScoreCalculator = new WomensScoreCalculator();
Console.WriteLine(baseScoreCalculator.GenerateScore(10, new TimeSpan(0, 2, 34)));


Console.WriteLine("children");
baseScoreCalculator = new ChildrenScoreCalculator();
Console.WriteLine(baseScoreCalculator.GenerateScore(10, new TimeSpan(0, 2, 34)));