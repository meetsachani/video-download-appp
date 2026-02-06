package o;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.AbstractC7373jp2;
import o.C8322nf1;
import o.InterfaceC7583kh1;

@Deprecated
/* renamed from: o.Bi1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2549Bi1 extends TI<Integer> {
    public static final int q1 = -1;
    public static final C8322nf1 r1 = new C8322nf1.c().D("MergingMediaSource").a();
    public final boolean f1;
    public final boolean g1;
    public final InterfaceC7583kh1[] h1;
    public final AbstractC7373jp2[] i1;
    public final ArrayList<InterfaceC7583kh1> j1;
    public final VI k1;
    public final Map<Object, Long> l1;
    public final InterfaceC10058um1<Object, JD> m1;
    public int n1;
    public long[][] o1;
    @InterfaceC11300zs1
    public b p1;

    /* renamed from: o.Bi1$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC3696My0 {
        public final long[] b1;
        public final long[] c1;

        public a(AbstractC7373jp2 abstractC7373jp2, Map<Object, Long> map) {
            super(abstractC7373jp2);
            int w = abstractC7373jp2.w();
            this.c1 = new long[abstractC7373jp2.w()];
            AbstractC7373jp2.d dVar = new AbstractC7373jp2.d();
            for (int i = 0; i < w; i++) {
                this.c1[i] = abstractC7373jp2.u(i, dVar).i1;
            }
            int n = abstractC7373jp2.n();
            this.b1 = new long[n];
            AbstractC7373jp2.b bVar = new AbstractC7373jp2.b();
            for (int i2 = 0; i2 < n; i2++) {
                abstractC7373jp2.l(i2, bVar, true);
                long longValue = ((Long) C9542sf.g(map.get(bVar.Y))).longValue();
                long[] jArr = this.b1;
                longValue = longValue == Long.MIN_VALUE ? bVar.Y0 : longValue;
                jArr[i2] = longValue;
                long j = bVar.Y0;
                if (j != C10323vs.b) {
                    long[] jArr2 = this.c1;
                    int i3 = bVar.Z;
                    jArr2[i3] = jArr2[i3] - (j - longValue);
                }
            }
        }

        @Override // o.AbstractC3696My0, o.AbstractC7373jp2
        public AbstractC7373jp2.b l(int i, AbstractC7373jp2.b bVar, boolean z) {
            super.l(i, bVar, z);
            bVar.Y0 = this.b1[i];
            return bVar;
        }

        @Override // o.AbstractC3696My0, o.AbstractC7373jp2
        public AbstractC7373jp2.d v(int i, AbstractC7373jp2.d dVar, long j) {
            long j2;
            super.v(i, dVar, j);
            long j3 = this.c1[i];
            dVar.i1 = j3;
            if (j3 != C10323vs.b) {
                long j4 = dVar.h1;
                if (j4 != C10323vs.b) {
                    j2 = Math.min(j4, j3);
                    dVar.h1 = j2;
                    return dVar;
                }
            }
            j2 = dVar.h1;
            dVar.h1 = j2;
            return dVar;
        }
    }

    /* renamed from: o.Bi1$b */
    /* loaded from: classes2.dex */
    public static final class b extends IOException {
        public static final int Y = 0;
        public final int X;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: o.Bi1$b$a */
        /* loaded from: classes2.dex */
        public @interface a {
        }

        public b(int i) {
            this.X = i;
        }
    }

    public C2549Bi1(InterfaceC7583kh1... interfaceC7583kh1Arr) {
        this(false, interfaceC7583kh1Arr);
    }

    public final void C0() {
        AbstractC7373jp2.b bVar = new AbstractC7373jp2.b();
        for (int i = 0; i < this.n1; i++) {
            long j = -this.i1[0].k(i, bVar).t();
            int i2 = 1;
            while (true) {
                AbstractC7373jp2[] abstractC7373jp2Arr = this.i1;
                if (i2 < abstractC7373jp2Arr.length) {
                    this.o1[i][i2] = j - (-abstractC7373jp2Arr[i2].k(i, bVar).t());
                    i2++;
                }
            }
        }
    }

    @Override // o.TI
    @InterfaceC11300zs1
    /* renamed from: D0 */
    public InterfaceC7583kh1.b w0(Integer num, InterfaceC7583kh1.b bVar) {
        if (num.intValue() == 0) {
            return bVar;
        }
        return null;
    }

    @Override // o.TI
    /* renamed from: E0 */
    public void z0(Integer num, InterfaceC7583kh1 interfaceC7583kh1, AbstractC7373jp2 abstractC7373jp2) {
        if (this.p1 == null) {
            if (this.n1 == -1) {
                this.n1 = abstractC7373jp2.n();
            } else if (abstractC7373jp2.n() != this.n1) {
                this.p1 = new b(0);
                return;
            }
            if (this.o1.length == 0) {
                this.o1 = (long[][]) Array.newInstance(Long.TYPE, this.n1, this.i1.length);
            }
            this.j1.remove(interfaceC7583kh1);
            this.i1[num.intValue()] = abstractC7373jp2;
            if (this.j1.isEmpty()) {
                if (this.f1) {
                    C0();
                }
                a aVar = this.i1[0];
                if (this.g1) {
                    F0();
                    aVar = new a(aVar, this.l1);
                }
                p0(aVar);
            }
        }
    }

    public final void F0() {
        AbstractC7373jp2[] abstractC7373jp2Arr;
        AbstractC7373jp2.b bVar = new AbstractC7373jp2.b();
        for (int i = 0; i < this.n1; i++) {
            int i2 = 0;
            long j = Long.MIN_VALUE;
            while (true) {
                abstractC7373jp2Arr = this.i1;
                if (i2 >= abstractC7373jp2Arr.length) {
                    break;
                }
                long p = abstractC7373jp2Arr[i2].k(i, bVar).p();
                if (p != C10323vs.b) {
                    long j2 = p + this.o1[i][i2];
                    if (j == Long.MIN_VALUE || j2 < j) {
                        j = j2;
                    }
                }
                i2++;
            }
            Object t = abstractC7373jp2Arr[0].t(i);
            this.l1.put(t, Long.valueOf(j));
            for (JD jd : this.m1.get(t)) {
                jd.w(0L, j);
            }
        }
    }

    @Override // o.TI, o.InterfaceC7583kh1
    public void Q() throws IOException {
        b bVar = this.p1;
        if (bVar == null) {
            super.Q();
            return;
        }
        throw bVar;
    }

    @Override // o.InterfaceC7583kh1
    public InterfaceC4410Ug1 h(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
        int length = this.h1.length;
        InterfaceC4410Ug1[] interfaceC4410Ug1Arr = new InterfaceC4410Ug1[length];
        int g = this.i1[0].g(bVar.a);
        for (int i = 0; i < length; i++) {
            interfaceC4410Ug1Arr[i] = this.h1[i].h(bVar.a(this.i1[i].t(g)), interfaceC10877y8, j - this.o1[g][i]);
        }
        C2451Ai1 c2451Ai1 = new C2451Ai1(this.k1, this.o1[g], interfaceC4410Ug1Arr);
        if (this.g1) {
            JD jd = new JD(c2451Ai1, true, 0L, ((Long) C9542sf.g(this.l1.get(bVar.a))).longValue());
            this.m1.put(bVar.a, jd);
            return jd;
        }
        return c2451Ai1;
    }

    @Override // o.InterfaceC7583kh1
    public C8322nf1 k() {
        InterfaceC7583kh1[] interfaceC7583kh1Arr = this.h1;
        if (interfaceC7583kh1Arr.length > 0) {
            return interfaceC7583kh1Arr[0].k();
        }
        return r1;
    }

    @Override // o.TI, o.AbstractC10541wl
    public void k0(@InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
        super.k0(interfaceC4261Sr2);
        for (int i = 0; i < this.h1.length; i++) {
            A0(Integer.valueOf(i), this.h1[i]);
        }
    }

    @Override // o.TI, o.AbstractC10541wl
    public void q0() {
        super.q0();
        Arrays.fill(this.i1, (Object) null);
        this.n1 = -1;
        this.p1 = null;
        this.j1.clear();
        Collections.addAll(this.j1, this.h1);
    }

    @Override // o.InterfaceC7583kh1
    public void s(InterfaceC4410Ug1 interfaceC4410Ug1) {
        if (this.g1) {
            JD jd = (JD) interfaceC4410Ug1;
            Iterator<Map.Entry<Object, JD>> it = this.m1.r().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, JD> next = it.next();
                if (next.getValue().equals(jd)) {
                    this.m1.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            interfaceC4410Ug1 = jd.X;
        }
        C2451Ai1 c2451Ai1 = (C2451Ai1) interfaceC4410Ug1;
        int i = 0;
        while (true) {
            InterfaceC7583kh1[] interfaceC7583kh1Arr = this.h1;
            if (i < interfaceC7583kh1Arr.length) {
                interfaceC7583kh1Arr[i].s(c2451Ai1.b(i));
                i++;
            } else {
                return;
            }
        }
    }

    public C2549Bi1(boolean z, InterfaceC7583kh1... interfaceC7583kh1Arr) {
        this(z, false, interfaceC7583kh1Arr);
    }

    public C2549Bi1(boolean z, boolean z2, InterfaceC7583kh1... interfaceC7583kh1Arr) {
        this(z, z2, new C8781pY(), interfaceC7583kh1Arr);
    }

    public C2549Bi1(boolean z, boolean z2, VI vi, InterfaceC7583kh1... interfaceC7583kh1Arr) {
        this.f1 = z;
        this.g1 = z2;
        this.h1 = interfaceC7583kh1Arr;
        this.k1 = vi;
        this.j1 = new ArrayList<>(Arrays.asList(interfaceC7583kh1Arr));
        this.n1 = -1;
        this.i1 = new AbstractC7373jp2[interfaceC7583kh1Arr.length];
        this.o1 = new long[0];
        this.l1 = new HashMap();
        this.m1 = AbstractC10301vm1.d().a().a();
    }
}
