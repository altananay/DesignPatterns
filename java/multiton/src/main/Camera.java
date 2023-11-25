package main;

import java.util.HashMap;

public class Camera {

    private static volatile HashMap<String, Camera> cameras = new HashMap<>();

    private Camera() {}

    public static Camera getCamera(String brand)
    {
        synchronized (Camera.class)
        {
            if (!cameras.containsKey(brand))
            {
                cameras.put(brand, new Camera());
            }
        }

        return cameras.get(brand);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
