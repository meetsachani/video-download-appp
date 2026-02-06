package o;

import java.util.ArrayDeque;
import java.util.Deque;

@Deprecated
/* renamed from: o.o92  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8444o92 implements InterfaceC3741Nk {
    public static final int f = 10;
    public final ArrayDeque<a> a;
    public final b b;
    public final LD c;
    public double d;
    public double e;

    /* renamed from: o.o92$a */
    /* loaded from: classes2.dex */
    public static class a {
        public final long a;
        public final double b;
        public final long c;

        public a(long j, double d, long j2) {
            this.a = j;
            this.b = d;
            this.c = j2;
        }
    }

    /* renamed from: o.o92$b */
    /* loaded from: classes2.dex */
    public interface b {
        boolean a(Deque<a> deque);
    }

    public C8444o92() {
        this(g(10L));
    }

    public static /* synthetic */ boolean b(long j, LD ld, Deque deque) {
        if (!deque.isEmpty() && ((a) TD2.o((a) deque.peek())).c + j < ld.b()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean c(long j, Deque deque) {
        if (deque.size() >= j) {
            return true;
        }
        return false;
    }

    public static b e(long j) {
        return f(j, LD.a);
    }

    @InterfaceC5056aJ2
    public static b f(final long j, final LD ld) {
        return new b() { // from class: o.n92
            @Override // o.C8444o92.b
            public final boolean a(Deque deque) {
                return C8444o92.b(j, ld, deque);
            }
        };
    }

    public static b g(final long j) {
        return new b() { // from class: o.m92
            @Override // o.C8444o92.b
            public final boolean a(Deque deque) {
                return C8444o92.c(j, deque);
            }
        };
    }

    @Override // o.InterfaceC3741Nk
    public void a(long j, long j2) {
        while (this.b.a(this.a)) {
            a remove = this.a.remove();
            double d = this.d;
            double d2 = remove.b;
            this.d = d - (remove.a * d2);
            this.e -= d2;
        }
        a aVar = new a((j * 8000000) / j2, Math.sqrt(j), this.c.b());
        this.a.add(aVar);
        double d3 = this.d;
        double d4 = aVar.b;
        this.d = d3 + (aVar.a * d4);
        this.e += d4;
    }

    @Override // o.InterfaceC3741Nk
    public long d() {
        if (this.a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return (long) (this.d / this.e);
    }

    @Override // o.InterfaceC3741Nk
    public void reset() {
        this.a.clear();
        this.d = 0.0d;
        this.e = 0.0d;
    }

    public C8444o92(b bVar) {
        this(bVar, LD.a);
    }

    @InterfaceC5056aJ2
    public C8444o92(b bVar, LD ld) {
        this.a = new ArrayDeque<>();
        this.b = bVar;
        this.c = ld;
    }
}
