package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class OnDemandCounter {
    public final AtomicInteger a = new AtomicInteger();
    public final AtomicInteger b = new AtomicInteger();

    public int a() {
        return this.b.get();
    }

    public int b() {
        return this.a.get();
    }

    public void c() {
        this.b.getAndIncrement();
    }

    public void d() {
        this.a.getAndIncrement();
    }

    public void e() {
        this.b.set(0);
    }
}
