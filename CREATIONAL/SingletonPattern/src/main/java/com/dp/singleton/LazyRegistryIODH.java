package com.dp.singleton;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 * jdk < 1.5
 */
public class LazyRegistryIODH {
    private LazyRegistryIODH(){
        System.out.println("In lazyRegistryIODH singleton");
    }

    private static class RegistryHolder {
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }
}
