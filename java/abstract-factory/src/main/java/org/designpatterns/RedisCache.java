package org.designpatterns;

public class RedisCache extends Caching {
    @Override
    public void Cache(String data) {
        System.out.println("Redis ile cache yapıldı.");
    }
}
