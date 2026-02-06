package androidx.recyclerview.widget;

import androidx.recyclerview.widget.i;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.recyclerview.widget.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373c<T> {
    public final Executor a;
    public final Executor b;
    public final i.f<T> c;

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* loaded from: classes.dex */
    public static final class a<T> {
        public static final Object d = new Object();
        public static Executor e;
        public Executor a;
        public Executor b;
        public final i.f<T> c;

        public a(i.f<T> fVar) {
            this.c = fVar;
        }

        public C0373c<T> a() {
            if (this.b == null) {
                synchronized (d) {
                    try {
                        if (e == null) {
                            e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.b = e;
            }
            return new C0373c<>(this.a, this.b, this.c);
        }

        public a<T> b(Executor executor) {
            this.b = executor;
            return this;
        }

        public a<T> c(Executor executor) {
            this.a = executor;
            return this;
        }
    }

    public C0373c(Executor executor, Executor executor2, i.f<T> fVar) {
        this.a = executor;
        this.b = executor2;
        this.c = fVar;
    }

    public Executor a() {
        return this.b;
    }

    public i.f<T> b() {
        return this.c;
    }

    public Executor c() {
        return this.a;
    }
}
