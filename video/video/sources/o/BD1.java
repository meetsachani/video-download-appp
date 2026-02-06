package o;

import android.os.SystemClock;
import java.util.List;
import o.InterfaceC7583kh1;

@Deprecated
/* loaded from: classes2.dex */
public final class BD1 {
    public static final InterfaceC7583kh1.b t = new InterfaceC7583kh1.b(new Object());
    public final AbstractC7373jp2 a;
    public final InterfaceC7583kh1.b b;
    public final long c;
    public final long d;
    public final int e;
    @InterfaceC11300zs1
    public final C3824Og0 f;
    public final boolean g;
    public final C10079ur2 h;
    public final C3381Jr2 i;
    public final List<C4224Si1> j;
    public final InterfaceC7583kh1.b k;
    public final boolean l;
    public final int m;
    public final DD1 n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f415o;
    public volatile long p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public BD1(AbstractC7373jp2 abstractC7373jp2, InterfaceC7583kh1.b bVar, long j, long j2, int i, @InterfaceC11300zs1 C3824Og0 c3824Og0, boolean z, C10079ur2 c10079ur2, C3381Jr2 c3381Jr2, List<C4224Si1> list, InterfaceC7583kh1.b bVar2, boolean z2, int i2, DD1 dd1, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = abstractC7373jp2;
        this.b = bVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = c3824Og0;
        this.g = z;
        this.h = c10079ur2;
        this.i = c3381Jr2;
        this.j = list;
        this.k = bVar2;
        this.l = z2;
        this.m = i2;
        this.n = dd1;
        this.p = j3;
        this.q = j4;
        this.r = j5;
        this.s = j6;
        this.f415o = z3;
    }

    public static BD1 k(C3381Jr2 c3381Jr2) {
        AbstractC7373jp2 abstractC7373jp2 = AbstractC7373jp2.X;
        InterfaceC7583kh1.b bVar = t;
        return new BD1(abstractC7373jp2, bVar, C10323vs.b, 0L, 1, null, false, C10079ur2.Z0, c3381Jr2, AbstractC5317bO0.L(), bVar, false, 0, DD1.Y0, 0L, 0L, 0L, 0L, false);
    }

    public static InterfaceC7583kh1.b l() {
        return t;
    }

    @OB
    public BD1 a() {
        return new BD1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, m(), SystemClock.elapsedRealtime(), this.f415o);
    }

    @OB
    public BD1 b(boolean z) {
        return new BD1(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.f415o);
    }

    @OB
    public BD1 c(InterfaceC7583kh1.b bVar) {
        return new BD1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, bVar, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.f415o);
    }

    @OB
    public BD1 d(InterfaceC7583kh1.b bVar, long j, long j2, long j3, long j4, C10079ur2 c10079ur2, C3381Jr2 c3381Jr2, List<C4224Si1> list) {
        return new BD1(this.a, bVar, j2, j3, this.e, this.f, this.g, c10079ur2, c3381Jr2, list, this.k, this.l, this.m, this.n, this.p, j4, j, SystemClock.elapsedRealtime(), this.f415o);
    }

    @OB
    public BD1 e(boolean z, int i) {
        return new BD1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, this.n, this.p, this.q, this.r, this.s, this.f415o);
    }

    @OB
    public BD1 f(@InterfaceC11300zs1 C3824Og0 c3824Og0) {
        return new BD1(this.a, this.b, this.c, this.d, this.e, c3824Og0, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.f415o);
    }

    @OB
    public BD1 g(DD1 dd1) {
        return new BD1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, dd1, this.p, this.q, this.r, this.s, this.f415o);
    }

    @OB
    public BD1 h(int i) {
        return new BD1(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.f415o);
    }

    @OB
    public BD1 i(boolean z) {
        return new BD1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, z);
    }

    @OB
    public BD1 j(AbstractC7373jp2 abstractC7373jp2) {
        return new BD1(abstractC7373jp2, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.f415o);
    }

    public long m() {
        long j;
        long j2;
        if (!n()) {
            return this.r;
        }
        do {
            j = this.s;
            j2 = this.r;
        } while (j != this.s);
        return TD2.j1(TD2.b2(j2) + (((float) (SystemClock.elapsedRealtime() - j)) * this.n.X));
    }

    public boolean n() {
        if (this.e == 3 && this.l && this.m == 0) {
            return true;
        }
        return false;
    }

    public void o(long j) {
        this.r = j;
        this.s = SystemClock.elapsedRealtime();
    }
}
