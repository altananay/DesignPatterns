public class Camera
{
    static Dictionary<string, Camera> Cameras = new Dictionary<string, Camera>();
    static object _lock = new object();

    private Camera()
    {
        
    }

    public static Camera GetCamera(string brand)
    {
        lock (_lock)
        {
            if (!Cameras.ContainsKey(brand))
            {
                Cameras.Add(brand, new Camera());
            }
        }

        return Cameras[brand];

    }
}