package o;

import java.util.ArrayDeque;
import o.NU1;

/* renamed from: o.Ge  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3032Ge<T> implements NU1<T> {
    public static final String e = "ZslRingBuffer";
    public final int a;
    public final ArrayDeque<T> b;
    public final Object c;
    public final NU1.a<T> d;

    public C3032Ge(int i) {
        this(i, null);
    }

    @Override // o.NU1
    public int a() {
        return this.a;
    }

    @Override // o.NU1
    public T b() {
        T removeLast;
        synchronized (this.c) {
            removeLast = this.b.removeLast();
        }
        return removeLast;
    }

    @Override // o.NU1
    public void c(T t) {
        T t2;
        synchronized (this.c) {
            try {
                if (this.b.size() >= this.a) {
                    t2 = b();
                } else {
                    t2 = null;
                }
                this.b.addFirst(t);
            } catch (Throwable th) {
                throw th;
            }
        }
        NU1.a<T> aVar = this.d;
        if (aVar != null && t2 != null) {
            aVar.a(t2);
        }
    }

    @Override // o.NU1
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.c) {
            isEmpty = this.b.isEmpty();
        }
        return isEmpty;
    }

    public C3032Ge(int i, NU1.a<T> aVar) {
        this.c = new Object();
        this.a = i;
        this.b = new ArrayDeque<>(i);
        this.d = aVar;
    }
}
