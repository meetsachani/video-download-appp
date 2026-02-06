package o;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.TreeSet;

@Deprecated
/* renamed from: o.l92  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7697l92 implements InterfaceC3741Nk {
    public static final int g = 10;
    public static final double h = 0.5d;
    public final int a;
    public final double b;
    public final ArrayDeque<a> c;
    public final TreeSet<a> d;
    public double e;
    public long f;

    /* renamed from: o.l92$a */
    /* loaded from: classes2.dex */
    public static class a implements Comparable<a> {
        public final long X;
        public final double Y;

        public a(long j, double d) {
            this.X = j;
            this.Y = d;
        }

        @Override // java.lang.Comparable
        /* renamed from: h */
        public int compareTo(a aVar) {
            return TD2.u(this.X, aVar.X);
        }
    }

    public C7697l92() {
        this(10, 0.5d);
    }

    @Override // o.InterfaceC3741Nk
    public void a(long j, long j2) {
        while (this.c.size() >= this.a) {
            a remove = this.c.remove();
            this.d.remove(remove);
            this.e -= remove.Y;
        }
        double sqrt = Math.sqrt(j);
        a aVar = new a((j * 8000000) / j2, sqrt);
        this.c.add(aVar);
        this.d.add(aVar);
        this.e += sqrt;
        this.f = b();
    }

    public final long b() {
        if (this.c.isEmpty()) {
            return Long.MIN_VALUE;
        }
        double d = this.e * this.b;
        Iterator<a> it = this.d.iterator();
        double d2 = 0.0d;
        long j = 0;
        double d3 = 0.0d;
        while (it.hasNext()) {
            a next = it.next();
            double d4 = d2 + (next.Y / 2.0d);
            if (d4 < d) {
                j = next.X;
                d3 = d4;
                d2 = (next.Y / 2.0d) + d4;
            } else if (j == 0) {
                return next.X;
            } else {
                return j + ((long) (((next.X - j) * (d - d3)) / (d4 - d3)));
            }
        }
        return j;
    }

    @Override // o.InterfaceC3741Nk
    public long d() {
        return this.f;
    }

    @Override // o.InterfaceC3741Nk
    public void reset() {
        this.c.clear();
        this.d.clear();
        this.e = 0.0d;
        this.f = Long.MIN_VALUE;
    }

    public C7697l92(int i, double d) {
        C9542sf.a(d >= 0.0d && d <= 1.0d);
        this.a = i;
        this.b = d;
        this.c = new ArrayDeque<>();
        this.d = new TreeSet<>();
        this.f = Long.MIN_VALUE;
    }
}
