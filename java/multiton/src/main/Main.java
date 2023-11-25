package main;

public class Main {
  public static void main(String[] args) {
    Camera camera = Camera.getCamera("sony");
    Camera camera1 = Camera.getCamera("canon");
    Camera camera2 = Camera.getCamera("sony");

    System.out.println(camera.hashCode());

    System.out.println(camera1.hashCode());

    System.out.println(camera2.hashCode());
  }
}
