package o;

import android.net.Uri;
import o.AbstractC7373jp2;
import o.C8322nf1;

@Deprecated
/* renamed from: o.s82  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9419s82 extends AbstractC7373jp2 {
    public static final Object n1 = new Object();
    public static final C8322nf1 o1 = new C8322nf1.c().D("SinglePeriodTimeline").L(Uri.EMPTY).a();
    public final long a1;
    public final long b1;
    public final long c1;
    public final long d1;
    public final long e1;
    public final long f1;
    public final long g1;
    public final boolean h1;
    public final boolean i1;
    public final boolean j1;
    @InterfaceC11300zs1
    public final Object k1;
    @InterfaceC11300zs1
    public final C8322nf1 l1;
    @InterfaceC11300zs1
    public final C8322nf1.g m1;

    @Deprecated
    public C9419s82(long j, boolean z, boolean z2, boolean z3, @InterfaceC11300zs1 Object obj, @InterfaceC11300zs1 Object obj2) {
        this(j, j, 0L, 0L, z, z2, z3, obj, obj2);
    }

    @Override // o.AbstractC7373jp2
    public int g(Object obj) {
        if (n1.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // o.AbstractC7373jp2
    public AbstractC7373jp2.b l(int i, AbstractC7373jp2.b bVar, boolean z) {
        Object obj;
        C9542sf.c(i, 0, 1);
        if (z) {
            obj = n1;
        } else {
            obj = null;
        }
        return bVar.y(null, obj, 0, this.d1, -this.f1);
    }

    @Override // o.AbstractC7373jp2
    public int n() {
        return 1;
    }

    @Override // o.AbstractC7373jp2
    public Object t(int i) {
        C9542sf.c(i, 0, 1);
        return n1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r1 > r3) goto L9;
     */
    @Override // o.AbstractC7373jp2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC7373jp2.d v(int i, AbstractC7373jp2.d dVar, long j) {
        long j2;
        C9542sf.c(i, 0, 1);
        long j3 = this.g1;
        boolean z = this.i1;
        if (z && !this.j1 && j != 0) {
            long j4 = this.e1;
            if (j4 != C10323vs.b) {
                j3 += j;
            }
            j2 = -9223372036854775807L;
            return dVar.l(AbstractC7373jp2.d.m1, this.l1, this.k1, this.a1, this.b1, this.c1, this.h1, z, this.m1, j2, this.e1, 0, 0, this.f1);
        }
        j2 = j3;
        return dVar.l(AbstractC7373jp2.d.m1, this.l1, this.k1, this.a1, this.b1, this.c1, this.h1, z, this.m1, j2, this.e1, 0, 0, this.f1);
    }

    @Override // o.AbstractC7373jp2
    public int w() {
        return 1;
    }

    public C9419s82(long j, boolean z, boolean z2, boolean z3, @InterfaceC11300zs1 Object obj, C8322nf1 c8322nf1) {
        this(j, j, 0L, 0L, z, z2, z3, obj, c8322nf1);
    }

    @Deprecated
    public C9419s82(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, @InterfaceC11300zs1 Object obj, @InterfaceC11300zs1 Object obj2) {
        this((long) C10323vs.b, (long) C10323vs.b, (long) C10323vs.b, j, j2, j3, j4, z, z2, z3, obj, obj2);
    }

    public C9419s82(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, @InterfaceC11300zs1 Object obj, C8322nf1 c8322nf1) {
        this(C10323vs.b, C10323vs.b, C10323vs.b, j, j2, j3, j4, z, z2, false, obj, c8322nf1, z3 ? c8322nf1.Y0 : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C9419s82(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, @InterfaceC11300zs1 Object obj, @InterfaceC11300zs1 Object obj2) {
        this(j, j2, j3, j4, j5, j6, j7, z, z2, false, obj, r0.b().K(obj2).a(), z3 ? r0.Y0 : null);
        C8322nf1 c8322nf1 = o1;
    }

    @Deprecated
    public C9419s82(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, @InterfaceC11300zs1 Object obj, C8322nf1 c8322nf1, @InterfaceC11300zs1 C8322nf1.g gVar) {
        this(j, j2, j3, j4, j5, j6, j7, z, z2, false, obj, c8322nf1, gVar);
    }

    public C9419s82(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, @InterfaceC11300zs1 Object obj, C8322nf1 c8322nf1, @InterfaceC11300zs1 C8322nf1.g gVar) {
        this.a1 = j;
        this.b1 = j2;
        this.c1 = j3;
        this.d1 = j4;
        this.e1 = j5;
        this.f1 = j6;
        this.g1 = j7;
        this.h1 = z;
        this.i1 = z2;
        this.j1 = z3;
        this.k1 = obj;
        this.l1 = (C8322nf1) C9542sf.g(c8322nf1);
        this.m1 = gVar;
    }
}
