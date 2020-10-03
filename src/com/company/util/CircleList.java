package com.company.util;

import java.util.ArrayList;
import java.util.Arrays;

public class CircleList<T> {

    private Element head;
    private Element tail;

    public CircleList() {
    }


    public void add(T value) {
        if (head == null) {
            head = new Element(null, value);
            tail = head;
        } else {
            Element element = new Element(null, value);
            tail.next = element;
            tail = element;
            tail.next = head;
        }
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
