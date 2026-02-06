package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.AbstractC5317bO0;
import o.InterfaceC6859hi0;
import o.InterfaceC7583kh1;

@Deprecated
/* renamed from: o.q7  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8920q7 extends AbstractC4037Ql {
    public static final int A = 10000;
    public static final int B = 25000;
    public static final int C = 25000;
    public static final int D = 1279;
    public static final int E = 719;
    public static final float F = 0.7f;
    public static final float G = 0.75f;
    public static final long H = 1000;
    public static final String z = "AdaptiveTrackSelection";
    public final InterfaceC3643Mk j;
    public final long k;
    public final long l;
    public final long m;
    public final int n;

    /* renamed from: o  reason: collision with root package name */
    public final int f837o;
    public final float p;
    public final float q;
    public final AbstractC5317bO0<a> r;
    public final LD s;
    public float t;
    public int u;
    public int v;
    public long w;
    @InterfaceC11300zs1
    public AbstractC2533Be1 x;
    public long y;

    /* renamed from: o.q7$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.a) * 31) + ((int) this.b);
        }
    }

    /* renamed from: o.q7$b */
    /* loaded from: classes2.dex */
    public static class b implements InterfaceC6859hi0.b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final float f;
        public final float g;
        public final LD h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        @Override // o.InterfaceC6859hi0.b
        public final InterfaceC6859hi0[] a(InterfaceC6859hi0.a[] aVarArr, InterfaceC3643Mk interfaceC3643Mk, InterfaceC7583kh1.b bVar, AbstractC7373jp2 abstractC7373jp2) {
            InterfaceC3643Mk interfaceC3643Mk2;
            InterfaceC6859hi0 b;
            AbstractC5317bO0 B = C8920q7.B(aVarArr);
            InterfaceC6859hi0[] interfaceC6859hi0Arr = new InterfaceC6859hi0[aVarArr.length];
            int i = 0;
            while (i < aVarArr.length) {
                InterfaceC6859hi0.a aVar = aVarArr[i];
                if (aVar != null) {
                    int[] iArr = aVar.b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            b = new C2999Fu0(aVar.a, iArr[0], aVar.c);
                            interfaceC3643Mk2 = interfaceC3643Mk;
                        } else {
                            interfaceC3643Mk2 = interfaceC3643Mk;
                            b = b(aVar.a, iArr, aVar.c, interfaceC3643Mk2, (AbstractC5317bO0) B.get(i));
                        }
                        interfaceC6859hi0Arr[i] = b;
                        i++;
                        interfaceC3643Mk = interfaceC3643Mk2;
                    }
                }
                interfaceC3643Mk2 = interfaceC3643Mk;
                i++;
                interfaceC3643Mk = interfaceC3643Mk2;
            }
            return interfaceC6859hi0Arr;
        }

        public C8920q7 b(C9593sr2 c9593sr2, int[] iArr, int i, InterfaceC3643Mk interfaceC3643Mk, AbstractC5317bO0<a> abstractC5317bO0) {
            return new C8920q7(c9593sr2, iArr, i, interfaceC3643Mk, this.a, this.b, this.c, this.d, this.e, this.f, this.g, abstractC5317bO0, this.h);
        }

        public b(int i, int i2, int i3, float f) {
            this(i, i2, i3, C8920q7.D, C8920q7.E, f, 0.75f, LD.a);
        }

        public b(int i, int i2, int i3, int i4, int i5, float f) {
            this(i, i2, i3, i4, i5, f, 0.75f, LD.a);
        }

        public b(int i, int i2, int i3, float f, float f2, LD ld) {
            this(i, i2, i3, C8920q7.D, C8920q7.E, f, f2, ld);
        }

        public b(int i, int i2, int i3, int i4, int i5, float f, float f2, LD ld) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = f;
            this.g = f2;
            this.h = ld;
        }
    }

    public C8920q7(C9593sr2 c9593sr2, int[] iArr, InterfaceC3643Mk interfaceC3643Mk) {
        this(c9593sr2, iArr, 0, interfaceC3643Mk, 10000L, 25000L, 25000L, D, E, 0.7f, 0.75f, AbstractC5317bO0.L(), LD.a);
    }

    public static AbstractC5317bO0<AbstractC5317bO0<a>> B(InterfaceC6859hi0.a[] aVarArr) {
        AbstractC5317bO0 e;
        long j;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC6859hi0.a aVar : aVarArr) {
            if (aVar != null && aVar.b.length > 1) {
                AbstractC5317bO0.a r = AbstractC5317bO0.r();
                r.g(new a(0L, 0L));
                arrayList.add(r);
            } else {
                arrayList.add(null);
            }
        }
        long[][] G2 = G(aVarArr);
        int[] iArr = new int[G2.length];
        long[] jArr = new long[G2.length];
        for (int i = 0; i < G2.length; i++) {
            long[] jArr2 = G2[i];
            if (jArr2.length == 0) {
                j = 0;
            } else {
                j = jArr2[0];
            }
            jArr[i] = j;
        }
        y(arrayList, jArr);
        AbstractC5317bO0<Integer> H2 = H(G2);
        for (int i2 = 0; i2 < H2.size(); i2++) {
            int intValue = H2.get(i2).intValue();
            int i3 = iArr[intValue] + 1;
            iArr[intValue] = i3;
            jArr[intValue] = G2[intValue][i3];
            y(arrayList, jArr);
        }
        for (int i4 = 0; i4 < aVarArr.length; i4++) {
            if (arrayList.get(i4) != null) {
                jArr[i4] = jArr[i4] * 2;
            }
        }
        y(arrayList, jArr);
        AbstractC5317bO0.a r2 = AbstractC5317bO0.r();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            AbstractC5317bO0.a aVar2 = (AbstractC5317bO0.a) arrayList.get(i5);
            if (aVar2 == null) {
                e = AbstractC5317bO0.L();
            } else {
                e = aVar2.e();
            }
            r2.g(e);
        }
        return r2.e();
    }

    public static long[][] G(InterfaceC6859hi0.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            InterfaceC6859hi0.a aVar = aVarArr[i];
            if (aVar == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[aVar.b.length];
                int i2 = 0;
                while (true) {
                    int[] iArr = aVar.b;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    long j = aVar.a.c(iArr[i2]).c1;
                    long[] jArr2 = jArr[i];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i2] = j;
                    i2++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    public static AbstractC5317bO0<Integer> H(long[][] jArr) {
        double d;
        InterfaceC10058um1 a2 = AbstractC10301vm1.h().a().a();
        for (int i = 0; i < jArr.length; i++) {
            long[] jArr2 = jArr[i];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    long[] jArr3 = jArr[i];
                    double d2 = 0.0d;
                    if (i2 >= jArr3.length) {
                        break;
                    }
                    long j = jArr3[i2];
                    if (j != -1) {
                        d2 = Math.log(j);
                    }
                    dArr[i2] = d2;
                    i2++;
                }
                int i3 = length - 1;
                double d3 = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d4 = dArr[i4];
                    i4++;
                    double d5 = (d4 + dArr[i4]) * 0.5d;
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d5 - dArr[0]) / d3;
                    }
                    a2.put(Double.valueOf(d), Integer.valueOf(i));
                }
            }
        }
        return AbstractC5317bO0.F(a2.values());
    }

    public static void y(List<AbstractC5317bO0.a<a>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            AbstractC5317bO0.a<a> aVar = list.get(i);
            if (aVar != null) {
                aVar.g(new a(j, jArr[i]));
            }
        }
    }

    public final int A(long j, long j2) {
        long C2 = C(j2);
        int i = 0;
        for (int i2 = 0; i2 < this.d; i2++) {
            if (j == Long.MIN_VALUE || !d(i2, j)) {
                C10833xx0 a2 = a(i2);
                if (z(a2, a2.c1, C2)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    public final long C(long j) {
        long j2;
        long I = I(j);
        if (this.r.isEmpty()) {
            return I;
        }
        int i = 1;
        while (i < this.r.size() - 1 && this.r.get(i).a < I) {
            i++;
        }
        a aVar = this.r.get(i - 1);
        a aVar2 = this.r.get(i);
        long j3 = aVar.a;
        return aVar.b + ((((float) (I - j3)) / ((float) (aVar2.a - j3))) * ((float) (aVar2.b - j2)));
    }

    public final long D(List<? extends AbstractC2533Be1> list) {
        if (list.isEmpty()) {
            return C10323vs.b;
        }
        AbstractC2533Be1 abstractC2533Be1 = (AbstractC2533Be1) C5098aU0.w(list);
        long j = abstractC2533Be1.g;
        if (j != C10323vs.b) {
            long j2 = abstractC2533Be1.h;
            if (j2 != C10323vs.b) {
                return j2 - j;
            }
        }
        return C10323vs.b;
    }

    public long E() {
        return this.m;
    }

    public final long F(InterfaceC2631Ce1[] interfaceC2631Ce1Arr, List<? extends AbstractC2533Be1> list) {
        int i = this.u;
        if (i < interfaceC2631Ce1Arr.length && interfaceC2631Ce1Arr[i].next()) {
            InterfaceC2631Ce1 interfaceC2631Ce1 = interfaceC2631Ce1Arr[this.u];
            return interfaceC2631Ce1.b() - interfaceC2631Ce1.a();
        }
        for (InterfaceC2631Ce1 interfaceC2631Ce12 : interfaceC2631Ce1Arr) {
            if (interfaceC2631Ce12.next()) {
                return interfaceC2631Ce12.b() - interfaceC2631Ce12.a();
            }
        }
        return D(list);
    }

    public final long I(long j) {
        long b2;
        long g = this.j.g();
        this.y = g;
        long j2 = ((float) g) * this.p;
        if (this.j.b() != C10323vs.b && j != C10323vs.b) {
            float f = (float) j;
            return (((float) j2) * Math.max((f / this.t) - ((float) b2), 0.0f)) / f;
        }
        return ((float) j2) / this.t;
    }

    public final long J(long j, long j2) {
        if (j == C10323vs.b) {
            return this.k;
        }
        if (j2 != C10323vs.b) {
            j -= j2;
        }
        return Math.min(((float) j) * this.q, this.k);
    }

    public boolean K(long j, List<? extends AbstractC2533Be1> list) {
        long j2 = this.w;
        if (j2 != C10323vs.b && j - j2 < 1000) {
            if (list.isEmpty() || ((AbstractC2533Be1) C5098aU0.w(list)).equals(this.x)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // o.AbstractC4037Ql, o.InterfaceC6859hi0
    @InterfaceC2591Bt
    public void b() {
        this.x = null;
    }

    @Override // o.InterfaceC6859hi0
    public long c() {
        return this.y;
    }

    @Override // o.InterfaceC6859hi0
    public int f() {
        return this.u;
    }

    @Override // o.AbstractC4037Ql, o.InterfaceC6859hi0
    public void i(float f) {
        this.t = f;
    }

    @Override // o.InterfaceC6859hi0
    @InterfaceC11300zs1
    public Object j() {
        return null;
    }

    @Override // o.InterfaceC6859hi0
    public void l(long j, long j2, long j3, List<? extends AbstractC2533Be1> list, InterfaceC2631Ce1[] interfaceC2631Ce1Arr) {
        int o2;
        long b2 = this.s.b();
        long F2 = F(interfaceC2631Ce1Arr, list);
        int i = this.v;
        if (i == 0) {
            this.v = 1;
            this.u = A(b2, F2);
            return;
        }
        int i2 = this.u;
        if (list.isEmpty()) {
            o2 = -1;
        } else {
            o2 = o(((AbstractC2533Be1) C5098aU0.w(list)).d);
        }
        if (o2 != -1) {
            i = ((AbstractC2533Be1) C5098aU0.w(list)).e;
            i2 = o2;
        }
        int A2 = A(b2, F2);
        if (A2 != i2 && !d(i2, b2)) {
            C10833xx0 a2 = a(i2);
            C10833xx0 a3 = a(A2);
            long J = J(j3, F2);
            int i3 = a3.c1;
            int i4 = a2.c1;
            if ((i3 > i4 && j2 < J) || (i3 < i4 && j2 >= this.l)) {
                A2 = i2;
            }
        }
        if (A2 != i2) {
            i = 3;
        }
        this.v = i;
        this.u = A2;
    }

    @Override // o.AbstractC4037Ql, o.InterfaceC6859hi0
    @InterfaceC2591Bt
    public void q() {
        this.w = C10323vs.b;
        this.x = null;
    }

    @Override // o.AbstractC4037Ql, o.InterfaceC6859hi0
    public int r(long j, List<? extends AbstractC2533Be1> list) {
        AbstractC2533Be1 abstractC2533Be1;
        int i;
        int i2;
        long b2 = this.s.b();
        if (!K(b2, list)) {
            return list.size();
        }
        this.w = b2;
        if (list.isEmpty()) {
            abstractC2533Be1 = null;
        } else {
            abstractC2533Be1 = (AbstractC2533Be1) C5098aU0.w(list);
        }
        this.x = abstractC2533Be1;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long x0 = TD2.x0(list.get(size - 1).g - j, this.t);
        long E2 = E();
        if (x0 >= E2) {
            C10833xx0 a2 = a(A(b2, D(list)));
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC2533Be1 abstractC2533Be12 = list.get(i3);
                C10833xx0 c10833xx0 = abstractC2533Be12.d;
                if (TD2.x0(abstractC2533Be12.g - j, this.t) >= E2 && c10833xx0.c1 < a2.c1 && (i = c10833xx0.m1) != -1 && i <= this.f837o && (i2 = c10833xx0.l1) != -1 && i2 <= this.n && i < a2.m1) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // o.InterfaceC6859hi0
    public int u() {
        return this.v;
    }

    public boolean z(C10833xx0 c10833xx0, int i, long j) {
        if (i <= j) {
            return true;
        }
        return false;
    }

    public C8920q7(C9593sr2 c9593sr2, int[] iArr, int i, InterfaceC3643Mk interfaceC3643Mk, long j, long j2, long j3, int i2, int i3, float f, float f2, List<a> list, LD ld) {
        super(c9593sr2, iArr, i);
        long j4;
        if (j3 < j) {
            I31.n(z, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j4 = j;
        } else {
            j4 = j3;
        }
        this.j = interfaceC3643Mk;
        this.k = j * 1000;
        this.l = j2 * 1000;
        this.m = j4 * 1000;
        this.n = i2;
        this.f837o = i3;
        this.p = f;
        this.q = f2;
        this.r = AbstractC5317bO0.F(list);
        this.s = ld;
        this.t = 1.0f;
        this.v = 0;
        this.w = C10323vs.b;
        this.y = Long.MIN_VALUE;
    }
}
