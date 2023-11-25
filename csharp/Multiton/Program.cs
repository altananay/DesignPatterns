Camera camera = Camera.GetCamera("sony");
Camera camera1 = Camera.GetCamera("canon");
Camera camera2 = Camera.GetCamera("sony");


Console.WriteLine(camera.GetHashCode());
Console.WriteLine(camera2.GetHashCode());

Console.WriteLine(camera1.GetHashCode());