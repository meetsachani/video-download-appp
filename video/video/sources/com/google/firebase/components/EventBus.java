package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
class EventBus implements Subscriber, Publisher {
    @InterfaceC8710pF0("this")
    public final Map<Class<?>, ConcurrentHashMap<EventHandler<Object>, Executor>> a = new HashMap();
    @InterfaceC8710pF0("this")
    public Queue<Event<?>> b = new ArrayDeque();
    public final Executor c;

    public EventBus(Executor executor) {
        this.c = executor;
    }

    public static /* synthetic */ void e(Map.Entry entry, Event event) {
        ((EventHandler) entry.getKey()).a(event);
    }

    @Override // com.google.firebase.events.Subscriber
    public <T> void a(Class<T> cls, EventHandler<? super T> eventHandler) {
        b(cls, this.c, eventHandler);
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void b(Class<T> cls, Executor executor, EventHandler<? super T> eventHandler) {
        try {
            Preconditions.b(cls);
            Preconditions.b(eventHandler);
            Preconditions.b(executor);
            if (!this.a.containsKey(cls)) {
                this.a.put(cls, new ConcurrentHashMap<>());
            }
            this.a.get(cls).put(eventHandler, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.firebase.events.Publisher
    public void c(final Event<?> event) {
        Preconditions.b(event);
        synchronized (this) {
            try {
                Queue<Event<?>> queue = this.b;
                if (queue != null) {
                    queue.add(event);
                    return;
                }
                for (final Map.Entry<EventHandler<Object>, Executor> entry : g(event)) {
                    entry.getValue().execute(new Runnable() { // from class: com.google.firebase.components.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            EventBus.e(entry, event);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void d(Class<T> cls, EventHandler<? super T> eventHandler) {
        Preconditions.b(cls);
        Preconditions.b(eventHandler);
        if (!this.a.containsKey(cls)) {
            return;
        }
        ConcurrentHashMap<EventHandler<Object>, Executor> concurrentHashMap = this.a.get(cls);
        concurrentHashMap.remove(eventHandler);
        if (concurrentHashMap.isEmpty()) {
            this.a.remove(cls);
        }
    }

    public void f() {
        Queue<Event<?>> queue;
        synchronized (this) {
            try {
                queue = this.b;
                if (queue != null) {
                    this.b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            for (Event<?> event : queue) {
                c(event);
            }
        }
    }

    public final synchronized Set<Map.Entry<EventHandler<Object>, Executor>> g(Event<?> event) {
        Set<Map.Entry<EventHandler<Object>, Executor>> entrySet;
        try {
            ConcurrentHashMap<EventHandler<Object>, Executor> concurrentHashMap = this.a.get(event.b());
            if (concurrentHashMap == null) {
                entrySet = Collections.EMPTY_SET;
            } else {
                entrySet = concurrentHashMap.entrySet();
            }
        } catch (Throwable th) {
            throw th;
        }
        return entrySet;
    }
}
