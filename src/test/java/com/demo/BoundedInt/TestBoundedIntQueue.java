package com.demo.BoundedInt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

public abstract class TestBoundedIntQueue {
    protected abstract BoundedIntQueue newBoundedIntQueue(int capacity);

    @Test
    public void initialCapacity() {
        for (int c = 0; c <= 100; ++c)
            assertEquals(c, newBoundedIntQueue(c).capacity());
    }

    @Test
    public void initialSize() {
        assertEquals(0, newBoundedIntQueue(10).size());
    }

    @Test(expected = IllegalStateException.class)
    public void cannotAddToQueueWith0Capacity() {
        BoundedIntQueue q = newBoundedIntQueue(0);
        q.addLast(0);
    }

    @Test(expected = IllegalStateException.class)
    public void cannotAddToFullQueue() {
        BoundedIntQueue q = newBoundedIntQueue(2);
        q.addLast(1);
        q.addLast(2);
        q.addLast(3);
    }

    @Test(expected = IllegalStateException.class)
    public void cannotRemoveFromEmptyQueue() {
        BoundedIntQueue q = newBoundedIntQueue(10);
        q.removeFirst();
    }

    @Test
    public void size() {
        int capacity = 100;
        BoundedIntQueue q = newBoundedIntQueue(capacity);
        for (int i = 0; i < capacity; ++i) {
            assertEquals(i, q.size());
            q.addLast(i);
        }
    }

    @Test
    public void isEmptyInitially() {
        for (int capacity = 0; capacity < 100; ++capacity) {
            BoundedIntQueue q = newBoundedIntQueue(capacity);
            assertTrue(q.isEmpty());
        }
    }

    @Test
    public void isNotFullInitially() {
        for (int capacity = 1; capacity < 100; ++capacity) {
            BoundedIntQueue q = newBoundedIntQueue(capacity);
            assertFalse(q.isFull());
        }
    }

   /* @Test
    public void hasQueueBehavior() {
        Random rng = new Random();
        BoundedIntQueue q = newBoundedIntQueue(20);
        int nextToAdd = 0;
        int nextToRemove = 0;
        for (int i = 0; i < 1000; ++i) {
            if (q.isEmpty() || (!q.isFull() && rng.nextInt(3) != 0))
                q.addLast(nextToAdd++);
            else
            	assertEquals(nextToRemove++, q.removeFirst());
        }
        while (!q.isEmpty())
            assertEquals(nextToRemove++, q.removeFirst());
        assertEquals(nextToAdd, nextToRemove);
    }*/
}
