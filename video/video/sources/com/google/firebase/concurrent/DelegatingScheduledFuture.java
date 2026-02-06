package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.O2;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes3.dex */
class DelegatingScheduledFuture<V> extends O2<V> implements ScheduledFuture<V> {
    public final ScheduledFuture<?> d1;

    /* loaded from: classes3.dex */
    public interface Completer<T> {
        void a(Throwable th);

        void set(T t);
    }

    /* loaded from: classes3.dex */
    public interface Resolver<T> {
        ScheduledFuture<?> a(Completer<T> completer);
    }

    public DelegatingScheduledFuture(Resolver<V> resolver) {
        this.d1 = resolver.a(new Completer<V>() { // from class: com.google.firebase.concurrent.DelegatingScheduledFuture.1
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Completer
            public void a(Throwable th) {
                DelegatingScheduledFuture.this.w(th);
            }

            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Completer
            public void set(V v) {
                DelegatingScheduledFuture.this.v(v);
            }
        });
    }

    @Override // java.lang.Comparable
    /* renamed from: C */
    public int compareTo(Delayed delayed) {
        return this.d1.compareTo(delayed);
    }

    @Override // o.O2
    public void g() {
        this.d1.cancel(z());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.d1.getDelay(timeUnit);
    }
}
