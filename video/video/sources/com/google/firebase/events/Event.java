package com.google.firebase.events;

import com.google.firebase.components.Preconditions;

/* loaded from: classes3.dex */
public class Event<T> {
    public final Class<T> a;
    public final T b;

    public Event(Class<T> cls, T t) {
        this.a = (Class) Preconditions.b(cls);
        this.b = (T) Preconditions.b(t);
    }

    public T a() {
        return this.b;
    }

    public Class<T> b() {
        return this.a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.a, this.b);
    }
}
