package com.company.util;

import com.company.field.Field;

import java.util.Iterator;

public class CircleList<T> implements Iterator<T> {
    private Element head;
    private Element tail;

    public void add(T value) {
        if (head == null) {
            head = new Element(null, value);
            tail = head;
        } else {
            Element element = new Element(null, value);
            tail.next = element;
            tail = element;
            element.next = head;
        }
    }

    public Element search(T el) {
        Element element = head;
        while (element != null) {
            if (element.value.equals(el)) {
                return element;
            }
            element = element.next;
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }


    class Element<T> {
        Element next;
        T value;

        public Element(Element next, T value) {
            this.next = next;
            this.value = value;
        }
    }

}
