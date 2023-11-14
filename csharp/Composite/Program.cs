using Composite;

Employee altan = new Employee();
altan.Name = "Altan anay";

Employee dilek = new Employee();
dilek.Name = "Dilek anay";

altan.AddSubordinate(dilek);

Employee hakan = new Employee();
hakan.Name = "hakan";

altan.AddSubordinate(hakan);

Employee mehmet = new Employee();
mehmet.Name = "mehmet";
dilek.AddSubordinate(mehmet);

Console.WriteLine(altan.Name);
foreach (Employee manager in altan)
{
    Console.WriteLine("   " + manager.Name);

	foreach (IPerson employee in manager)
	{
		Console.WriteLine($"     {employee.Name}");
	}
}