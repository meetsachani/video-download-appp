package org.jsoup.internal;

import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import java.util.function.Supplier;
import o.GD2;
import org.jsoup.internal.SoftPool;

/* loaded from: classes4.dex */
public class SoftPool<T> {
    public static final int c = 12;
    public final ThreadLocal<SoftReference<ArrayDeque<T>>> a = new GD2(new Supplier() { // from class: o.E92
        @Override // java.util.function.Supplier
        public final Object get() {
            return SoftPool.a();
        }
    });
    public final Supplier<T> b;

    public SoftPool(Supplier<T> supplier) {
        this.b = supplier;
    }

    public static /* synthetic */ SoftReference a() {
        return new SoftReference(new ArrayDeque());
    }

    public T b() {
        ArrayDeque<T> c2 = c();
        if (!c2.isEmpty()) {
            return c2.pop();
        }
        return this.b.get();
    }

    public ArrayDeque<T> c() {
        ArrayDeque<T> arrayDeque = this.a.get().get();
        if (arrayDeque == null) {
            ArrayDeque<T> arrayDeque2 = new ArrayDeque<>();
            this.a.set(new SoftReference<>(arrayDeque2));
            return arrayDeque2;
        }
        return arrayDeque;
    }

    public void d(T t) {
        ArrayDeque<T> c2 = c();
        if (c2.size() < 12) {
            c2.push(t);
        }
    }
}
