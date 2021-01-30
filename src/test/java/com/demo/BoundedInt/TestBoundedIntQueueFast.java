package com.demo.BoundedInt;


public final class TestBoundedIntQueueFast extends TestBoundedIntQueue {
    public TestBoundedIntQueueFast() {}

    @Override
    protected BoundedIntQueue newBoundedIntQueue(int capacity) {
        return new BoundedIntQueueFast(capacity);
    }
}
