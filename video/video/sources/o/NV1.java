package o;

import java.util.Comparator;
import java.util.TreeSet;
import o.NV1;

@Deprecated
/* loaded from: classes2.dex */
public final class NV1 {
    @InterfaceC5056aJ2
    public static final int e = 1000;
    public static final int f = 5000;
    @InterfaceC8710pF0("this")
    public final TreeSet<a> a = new TreeSet<>(new Comparator() { // from class: o.MV1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return NV1.a((NV1.a) obj, (NV1.a) obj2);
        }
    });
    @InterfaceC8710pF0("this")
    public int b;
    @InterfaceC8710pF0("this")
    public int c;
    @InterfaceC8710pF0("this")
    public boolean d;

    /* loaded from: classes2.dex */
    public static final class a {
        public final LV1 a;
        public final long b;

        public a(LV1 lv1, long j) {
            this.a = lv1;
            this.b = j;
        }
    }

    public NV1() {
        f();
    }

    public static /* synthetic */ int a(a aVar, a aVar2) {
        return c(aVar.a.g, aVar2.a.g);
    }

    public static int c(int i, int i2) {
        int min;
        int i3 = i - i2;
        if (Math.abs(i3) > 1000 && (min = (Math.min(i, i2) - Math.max(i, i2)) + 65535) < 1000) {
            if (i < i2) {
                return min;
            }
            return -min;
        }
        return i3;
    }

    public final synchronized void b(a aVar) {
        this.b = aVar.a.g;
        this.a.add(aVar);
    }

    public synchronized boolean d(LV1 lv1, long j) {
        if (this.a.size() < 5000) {
            int i = lv1.g;
            if (!this.d) {
                f();
                this.c = LV1.c(i);
                this.d = true;
                b(new a(lv1, j));
                return true;
            } else if (Math.abs(c(i, LV1.b(this.b))) < 1000) {
                if (c(i, this.c) > 0) {
                    b(new a(lv1, j));
                    return true;
                }
                return false;
            } else {
                this.c = LV1.c(i);
                this.a.clear();
                b(new a(lv1, j));
                return true;
            }
        }
        throw new IllegalStateException("Queue size limit of 5000 reached.");
    }

    @InterfaceC11300zs1
    public synchronized LV1 e(long j) {
        if (this.a.isEmpty()) {
            return null;
        }
        a first = this.a.first();
        int i = first.a.g;
        if (i != LV1.b(this.c) && j < first.b) {
            return null;
        }
        this.a.pollFirst();
        this.c = i;
        return first.a;
    }

    public synchronized void f() {
        this.a.clear();
        this.d = false;
        this.c = -1;
        this.b = -1;
    }
}
