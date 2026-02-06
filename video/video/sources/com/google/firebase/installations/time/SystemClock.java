package com.google.firebase.installations.time;

/* loaded from: classes3.dex */
public class SystemClock implements Clock {
    public static SystemClock a;

    private SystemClock() {
    }

    public static SystemClock b() {
        if (a == null) {
            a = new SystemClock();
        }
        return a;
    }

    @Override // com.google.firebase.installations.time.Clock
    public long a() {
        return System.currentTimeMillis();
    }
}
