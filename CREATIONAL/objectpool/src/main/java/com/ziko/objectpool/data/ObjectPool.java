package com.ziko.objectpool.data;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ObjectPool<T extends Poolable> {

    private final BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, int count) {
        this.availablePool = new LinkedBlockingDeque<>();
        IntStream.range(0,count).forEach(i -> availablePool.offer(creator.get()));
    }

    public T get(){
        try {
            return availablePool.take();
        }catch (InterruptedException exception){
            System.err.println("take() was interrupted");
        }
        return null;
    }

    public void release(T obj) {
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException e) {
            System.err.println("put() was interrupted");
        }
    }
}
