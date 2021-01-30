package com.demo.BoundedInt;


public final class TestBoundedIntQueueSlow extends TestBoundedIntQueue {
    public TestBoundedIntQueueSlow() {}

    @Override
    protected BoundedIntQueue newBoundedIntQueue(int capacity) {
        return new BoundedIntQueueSlow(capacity);
    }
}
