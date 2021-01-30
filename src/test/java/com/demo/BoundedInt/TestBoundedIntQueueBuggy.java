package com.demo.BoundedInt;


public final class TestBoundedIntQueueBuggy extends TestBoundedIntQueue {
    public TestBoundedIntQueueBuggy() {}

    @Override
    protected BoundedIntQueue newBoundedIntQueue(int capacity) {
        return new BoundedIntQueueBuggy(capacity);
    }
}
