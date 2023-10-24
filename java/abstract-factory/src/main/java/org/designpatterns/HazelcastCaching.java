package org.designpatterns;

public class HazelcastCaching extends Caching {
    @Override
    public void Cache(String data) {
        System.out.println("Hazelcast ile cache yapıldı.");
    }
}
