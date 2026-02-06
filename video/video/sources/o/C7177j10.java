package o;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import o.AbstractC5317bO0;
import o.AbstractC7692l81;
import o.C2989Fr2;
import o.C7177j10;
import o.C8920q7;
import o.InterfaceC10712xR1;
import o.InterfaceC6859hi0;
import o.InterfaceC7583kh1;
import o.InterfaceC8368nr;

@Deprecated
/* renamed from: o.j10  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7177j10 extends AbstractC7692l81 implements InterfaceC10712xR1.f {
    public static final String k = "DefaultTrackSelector";
    public static final String l = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
    public static final int m = 0;
    public static final int n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f771o = 2;
    public static final float p = 0.98f;
    public static final AbstractC10587ww1<Integer> q = AbstractC10587ww1.h(new Comparator() { // from class: o.a10
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C7177j10.v((Integer) obj, (Integer) obj2);
        }
    });
    public static final AbstractC10587ww1<Integer> r = AbstractC10587ww1.h(new Comparator() { // from class: o.b10
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C7177j10.u((Integer) obj, (Integer) obj2);
        }
    });
    public final Object d;
    @InterfaceC11300zs1
    public final Context e;
    public final InterfaceC6859hi0.b f;
    public final boolean g;
    @InterfaceC8710pF0("lock")
    public d h;
    @InterfaceC8710pF0("lock")
    @InterfaceC11300zs1
    public g i;
    @InterfaceC8710pF0("lock")
    public C9546sg j;

    /* renamed from: o.j10$b */
    /* loaded from: classes2.dex */
    public static final class b extends i<b> implements Comparable<b> {
        public final int Z0;
        public final boolean a1;
        @InterfaceC11300zs1
        public final String b1;
        public final d c1;
        public final boolean d1;
        public final int e1;
        public final int f1;
        public final int g1;
        public final boolean h1;
        public final int i1;
        public final int j1;
        public final boolean k1;
        public final int l1;
        public final int m1;
        public final int n1;
        public final int o1;
        public final boolean p1;
        public final boolean q1;

        public b(int i, C9593sr2 c9593sr2, int i2, d dVar, int i3, boolean z, IF1<C10833xx0> if1) {
            super(i, c9593sr2, i2);
            int i4;
            int i5;
            boolean z2;
            boolean z3;
            boolean z4;
            int i6;
            boolean z5;
            this.c1 = dVar;
            this.b1 = C7177j10.U(this.Y0.Z);
            this.d1 = C7177j10.Q(i3, false);
            int i7 = 0;
            while (true) {
                i4 = Integer.MAX_VALUE;
                if (i7 < dVar.i1.size()) {
                    i5 = C7177j10.I(this.Y0, dVar.i1.get(i7), false);
                    if (i5 > 0) {
                        break;
                    }
                    i7++;
                } else {
                    i5 = 0;
                    i7 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.f1 = i7;
            this.e1 = i5;
            this.g1 = C7177j10.M(this.Y0.Z0, dVar.j1);
            C10833xx0 c10833xx0 = this.Y0;
            int i8 = c10833xx0.Z0;
            if (i8 != 0 && (i8 & 1) == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.h1 = z2;
            if ((c10833xx0.Y0 & 1) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.k1 = z3;
            int i9 = c10833xx0.t1;
            this.l1 = i9;
            this.m1 = c10833xx0.u1;
            int i10 = c10833xx0.c1;
            this.n1 = i10;
            if ((i10 == -1 || i10 <= dVar.l1) && ((i9 == -1 || i9 <= dVar.k1) && if1.apply(c10833xx0))) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.a1 = z4;
            String[] A0 = TD2.A0();
            int i11 = 0;
            while (true) {
                if (i11 < A0.length) {
                    i6 = C7177j10.I(this.Y0, A0[i11], false);
                    if (i6 > 0) {
                        break;
                    }
                    i11++;
                } else {
                    i6 = 0;
                    i11 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.i1 = i11;
            this.j1 = i6;
            int i12 = 0;
            while (true) {
                if (i12 < dVar.m1.size()) {
                    String str = this.Y0.g1;
                    if (str != null && str.equals(dVar.m1.get(i12))) {
                        i4 = i12;
                        break;
                    }
                    i12++;
                } else {
                    break;
                }
            }
            this.o1 = i4;
            if (InterfaceC10712xR1.l(i3) == 128) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.p1 = z5;
            this.q1 = InterfaceC10712xR1.w(i3) == 64;
            this.Z0 = l(i3, z);
        }

        public static int h(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static AbstractC5317bO0<b> j(int i, C9593sr2 c9593sr2, d dVar, int[] iArr, boolean z, IF1<C10833xx0> if1) {
            AbstractC5317bO0.a r = AbstractC5317bO0.r();
            for (int i2 = 0; i2 < c9593sr2.X; i2++) {
                r.g(new b(i, c9593sr2, i2, dVar, iArr[i2], z, if1));
            }
            return r.e();
        }

        @Override // o.C7177j10.i
        public int e() {
            return this.Z0;
        }

        @Override // java.lang.Comparable
        /* renamed from: i */
        public int compareTo(b bVar) {
            AbstractC10587ww1 E;
            AbstractC10587ww1 abstractC10587ww1;
            if (this.a1 && this.d1) {
                E = C7177j10.q;
            } else {
                E = C7177j10.q.E();
            }
            AbstractC9452sH j = AbstractC9452sH.n().k(this.d1, bVar.d1).j(Integer.valueOf(this.f1), Integer.valueOf(bVar.f1), AbstractC10587ww1.z().E()).f(this.e1, bVar.e1).f(this.g1, bVar.g1).k(this.k1, bVar.k1).k(this.h1, bVar.h1).j(Integer.valueOf(this.i1), Integer.valueOf(bVar.i1), AbstractC10587ww1.z().E()).f(this.j1, bVar.j1).k(this.a1, bVar.a1).j(Integer.valueOf(this.o1), Integer.valueOf(bVar.o1), AbstractC10587ww1.z().E());
            Integer valueOf = Integer.valueOf(this.n1);
            Integer valueOf2 = Integer.valueOf(bVar.n1);
            if (!this.c1.r1) {
                abstractC10587ww1 = C7177j10.r;
            } else {
                abstractC10587ww1 = C7177j10.q.E();
            }
            AbstractC9452sH j2 = j.j(valueOf, valueOf2, abstractC10587ww1).k(this.p1, bVar.p1).k(this.q1, bVar.q1).j(Integer.valueOf(this.l1), Integer.valueOf(bVar.l1), E).j(Integer.valueOf(this.m1), Integer.valueOf(bVar.m1), E);
            Integer valueOf3 = Integer.valueOf(this.n1);
            Integer valueOf4 = Integer.valueOf(bVar.n1);
            if (!TD2.g(this.b1, bVar.b1)) {
                E = C7177j10.r;
            }
            return j2.j(valueOf3, valueOf4, E).m();
        }

        public final int l(int i, boolean z) {
            if (!C7177j10.Q(i, this.c1.j2)) {
                return 0;
            }
            if (!this.a1 && !this.c1.d2) {
                return 0;
            }
            if (C7177j10.Q(i, false) && this.a1 && this.Y0.c1 != -1) {
                d dVar = this.c1;
                if (!dVar.s1 && !dVar.r1) {
                    if (dVar.l2 || !z) {
                        return 2;
                    }
                    return 1;
                }
                return 1;
            }
            return 1;
        }

        @Override // o.C7177j10.i
        /* renamed from: m */
        public boolean g(b bVar) {
            int i;
            String str;
            int i2;
            d dVar = this.c1;
            if (dVar.g2 || ((i2 = this.Y0.t1) != -1 && i2 == bVar.Y0.t1)) {
                if (dVar.e2 || ((str = this.Y0.g1) != null && TextUtils.equals(str, bVar.Y0.g1))) {
                    d dVar2 = this.c1;
                    if (dVar2.f2 || ((i = this.Y0.u1) != -1 && i == bVar.Y0.u1)) {
                        if (!dVar2.h2) {
                            if (this.p1 != bVar.p1 || this.q1 != bVar.q1) {
                                return false;
                            }
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: o.j10$c */
    /* loaded from: classes2.dex */
    public static final class c implements Comparable<c> {
        public final boolean X;
        public final boolean Y;

        public c(C10833xx0 c10833xx0, int i) {
            this.X = (c10833xx0.Y0 & 1) != 0;
            this.Y = C7177j10.Q(i, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(c cVar) {
            return AbstractC9452sH.n().k(this.Y, cVar.Y).k(this.X, cVar.X).m();
        }
    }

    /* renamed from: o.j10$d */
    /* loaded from: classes2.dex */
    public static final class d extends C2989Fr2 implements InterfaceC8368nr {
        public static final String A2;
        public static final String B2;
        public static final String C2;
        public static final String D2;
        public static final String E2;
        public static final String F2;
        public static final String G2;
        public static final String H2;
        public static final String I2;
        public static final InterfaceC8368nr.a<d> J2;
        public static final d p2;
        @Deprecated
        public static final d q2;
        public static final String r2;
        public static final String s2;
        public static final String t2;
        public static final String u2;
        public static final String v2;
        public static final String w2;
        public static final String x2;
        public static final String y2;
        public static final String z2;
        public final boolean Z1;
        public final boolean a2;
        public final boolean b2;
        public final boolean c2;
        public final boolean d2;
        public final boolean e2;
        public final boolean f2;
        public final boolean g2;
        public final boolean h2;
        public final boolean i2;
        public final boolean j2;
        public final boolean k2;
        public final boolean l2;
        public final boolean m2;
        public final SparseArray<Map<C10079ur2, f>> n2;
        public final SparseBooleanArray o2;

        static {
            d B = new a().B();
            p2 = B;
            q2 = B;
            r2 = TD2.R0(1000);
            s2 = TD2.R0(1001);
            t2 = TD2.R0(1002);
            u2 = TD2.R0(1003);
            v2 = TD2.R0(1004);
            w2 = TD2.R0(1005);
            x2 = TD2.R0(1006);
            y2 = TD2.R0(1007);
            z2 = TD2.R0(1008);
            A2 = TD2.R0(1009);
            B2 = TD2.R0(1010);
            C2 = TD2.R0(1011);
            D2 = TD2.R0(1012);
            E2 = TD2.R0(1013);
            F2 = TD2.R0(1014);
            G2 = TD2.R0(1015);
            H2 = TD2.R0(1016);
            I2 = TD2.R0(1017);
            J2 = new InterfaceC8368nr.a() { // from class: o.k10
                @Override // o.InterfaceC8368nr.a
                public final InterfaceC8368nr a(Bundle bundle) {
                    C7177j10.d B3;
                    B3 = new C7177j10.d.a(bundle).B();
                    return B3;
                }
            };
        }

        public static boolean H(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean I(SparseArray<Map<C10079ur2, f>> sparseArray, SparseArray<Map<C10079ur2, f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !J(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static boolean J(Map<C10079ur2, f> map, Map<C10079ur2, f> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<C10079ur2, f> entry : map.entrySet()) {
                C10079ur2 key = entry.getKey();
                if (!map2.containsKey(key) || !TD2.g(entry.getValue(), map2.get(key))) {
                    return false;
                }
                while (r4.hasNext()) {
                }
            }
            return true;
        }

        public static d L(Context context) {
            return new a(context).B();
        }

        public static int[] M(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                iArr[i] = sparseBooleanArray.keyAt(i);
            }
            return iArr;
        }

        public static void Q(Bundle bundle, SparseArray<Map<C10079ur2, f>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i = 0; i < sparseArray.size(); i++) {
                int keyAt = sparseArray.keyAt(i);
                for (Map.Entry<C10079ur2, f> entry : sparseArray.valueAt(i).entrySet()) {
                    f value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(keyAt));
                }
                bundle.putIntArray(B2, C7775lT0.B(arrayList));
                bundle.putParcelableArrayList(C2, C8855pr.i(arrayList2));
                bundle.putSparseParcelableArray(D2, C8855pr.l(sparseArray2));
            }
        }

        @Override // o.C2989Fr2
        /* renamed from: K */
        public a B() {
            return new a();
        }

        public boolean N(int i) {
            return this.o2.get(i);
        }

        @InterfaceC11300zs1
        @Deprecated
        public f O(int i, C10079ur2 c10079ur2) {
            Map<C10079ur2, f> map = this.n2.get(i);
            if (map != null) {
                return map.get(c10079ur2);
            }
            return null;
        }

        @Deprecated
        public boolean P(int i, C10079ur2 c10079ur2) {
            Map<C10079ur2, f> map = this.n2.get(i);
            if (map != null && map.containsKey(c10079ur2)) {
                return true;
            }
            return false;
        }

        @Override // o.C2989Fr2, o.InterfaceC8368nr
        public Bundle e() {
            Bundle e = super.e();
            e.putBoolean(r2, this.Z1);
            e.putBoolean(s2, this.a2);
            e.putBoolean(t2, this.b2);
            e.putBoolean(F2, this.c2);
            e.putBoolean(u2, this.d2);
            e.putBoolean(v2, this.e2);
            e.putBoolean(w2, this.f2);
            e.putBoolean(x2, this.g2);
            e.putBoolean(G2, this.h2);
            e.putBoolean(H2, this.i2);
            e.putBoolean(y2, this.j2);
            e.putBoolean(z2, this.k2);
            e.putBoolean(A2, this.l2);
            e.putBoolean(I2, this.m2);
            Q(e, this.n2);
            e.putIntArray(E2, M(this.o2));
            return e;
        }

        @Override // o.C2989Fr2
        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (super.equals(dVar) && this.Z1 == dVar.Z1 && this.a2 == dVar.a2 && this.b2 == dVar.b2 && this.c2 == dVar.c2 && this.d2 == dVar.d2 && this.e2 == dVar.e2 && this.f2 == dVar.f2 && this.g2 == dVar.g2 && this.h2 == dVar.h2 && this.i2 == dVar.i2 && this.j2 == dVar.j2 && this.k2 == dVar.k2 && this.l2 == dVar.l2 && this.m2 == dVar.m2 && H(this.o2, dVar.o2) && I(this.n2, dVar.n2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.C2989Fr2
        public int hashCode() {
            return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.Z1 ? 1 : 0)) * 31) + (this.a2 ? 1 : 0)) * 31) + (this.b2 ? 1 : 0)) * 31) + (this.c2 ? 1 : 0)) * 31) + (this.d2 ? 1 : 0)) * 31) + (this.e2 ? 1 : 0)) * 31) + (this.f2 ? 1 : 0)) * 31) + (this.g2 ? 1 : 0)) * 31) + (this.h2 ? 1 : 0)) * 31) + (this.i2 ? 1 : 0)) * 31) + (this.j2 ? 1 : 0)) * 31) + (this.k2 ? 1 : 0)) * 31) + (this.l2 ? 1 : 0)) * 31) + (this.m2 ? 1 : 0);
        }

        /* renamed from: o.j10$d$a */
        /* loaded from: classes2.dex */
        public static final class a extends C2989Fr2.a {
            public boolean A;
            public boolean B;
            public boolean C;
            public boolean D;
            public boolean E;
            public boolean F;
            public boolean G;
            public boolean H;
            public boolean I;
            public boolean J;
            public boolean K;
            public boolean L;
            public boolean M;
            public boolean N;
            public final SparseArray<Map<C10079ur2, f>> O;
            public final SparseBooleanArray P;

            public static SparseArray<Map<C10079ur2, f>> P0(SparseArray<Map<C10079ur2, f>> sparseArray) {
                SparseArray<Map<C10079ur2, f>> sparseArray2 = new SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: A1 */
            public a d0(@InterfaceC11300zs1 String str) {
                super.d0(str);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: B1 */
            public a e0(Context context) {
                super.e0(context);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: C1 */
            public a g0(String... strArr) {
                super.g0(strArr);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: D1 */
            public a h0(int i) {
                super.h0(i);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: E1 */
            public a i0(@InterfaceC11300zs1 String str) {
                super.i0(str);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: F0 */
            public a A(C2782Dr2 c2782Dr2) {
                super.A(c2782Dr2);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: F1 */
            public a j0(String... strArr) {
                super.j0(strArr);
                return this;
            }

            @Override // o.C2989Fr2.a
            /* renamed from: G0 */
            public d B() {
                return new d(this);
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: G1 */
            public a k0(int i) {
                super.k0(i);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: H0 */
            public a C(C9593sr2 c9593sr2) {
                super.C(c9593sr2);
                return this;
            }

            @InterfaceC6181ey
            public a H1(int i, boolean z) {
                if (this.P.get(i) == z) {
                    return this;
                }
                if (z) {
                    this.P.put(i, true);
                    return this;
                }
                this.P.delete(i);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: I0 */
            public a D() {
                super.D();
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: I1 */
            public a l0(boolean z) {
                super.l0(z);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: J0 */
            public a E(int i) {
                super.E(i);
                return this;
            }

            @InterfaceC6181ey
            @Deprecated
            public a J1(int i, C10079ur2 c10079ur2, @InterfaceC11300zs1 f fVar) {
                Map<C10079ur2, f> map = this.O.get(i);
                if (map == null) {
                    map = new HashMap<>();
                    this.O.put(i, map);
                }
                if (map.containsKey(c10079ur2) && TD2.g(map.get(c10079ur2), fVar)) {
                    return this;
                }
                map.put(c10079ur2, fVar);
                return this;
            }

            @InterfaceC6181ey
            @Deprecated
            public a K0(int i, C10079ur2 c10079ur2) {
                Map<C10079ur2, f> map = this.O.get(i);
                if (map != null && map.containsKey(c10079ur2)) {
                    map.remove(c10079ur2);
                    if (map.isEmpty()) {
                        this.O.remove(i);
                    }
                }
                return this;
            }

            public final void K1(Bundle bundle) {
                AbstractC5317bO0 d;
                SparseArray e;
                int[] intArray = bundle.getIntArray(d.B2);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(d.C2);
                if (parcelableArrayList == null) {
                    d = AbstractC5317bO0.L();
                } else {
                    d = C8855pr.d(C10079ur2.b1, parcelableArrayList);
                }
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(d.D2);
                if (sparseParcelableArray == null) {
                    e = new SparseArray();
                } else {
                    e = C8855pr.e(f.c1, sparseParcelableArray);
                }
                if (intArray != null && intArray.length == d.size()) {
                    for (int i = 0; i < intArray.length; i++) {
                        J1(intArray[i], (C10079ur2) d.get(i), (f) e.get(i));
                    }
                }
            }

            @InterfaceC6181ey
            @Deprecated
            public a L0() {
                if (this.O.size() == 0) {
                    return this;
                }
                this.O.clear();
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: L1 */
            public a m0(int i, boolean z) {
                super.m0(i, z);
                return this;
            }

            @InterfaceC6181ey
            @Deprecated
            public a M0(int i) {
                Map<C10079ur2, f> map = this.O.get(i);
                if (map != null && !map.isEmpty()) {
                    this.O.remove(i);
                }
                return this;
            }

            @InterfaceC6181ey
            public a M1(boolean z) {
                this.L = z;
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: N0 */
            public a F() {
                super.F();
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: N1 */
            public a n0(int i, int i2, boolean z) {
                super.n0(i, i2, z);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: O0 */
            public a G() {
                super.G();
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: O1 */
            public a o0(Context context, boolean z) {
                super.o0(context, z);
                return this;
            }

            public final void Q0() {
                this.A = true;
                this.B = false;
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = false;
                this.H = false;
                this.I = false;
                this.J = true;
                this.K = true;
                this.L = false;
                this.M = true;
                this.N = false;
            }

            public final SparseBooleanArray R0(@InterfaceC11300zs1 int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i : iArr) {
                    sparseBooleanArray.append(i, true);
                }
                return sparseBooleanArray;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: S0 */
            public a J(C2989Fr2 c2989Fr2) {
                super.J(c2989Fr2);
                return this;
            }

            @InterfaceC6181ey
            public a T0(boolean z) {
                this.H = z;
                return this;
            }

            @InterfaceC6181ey
            public a U0(boolean z) {
                this.I = z;
                return this;
            }

            @InterfaceC6181ey
            public a V0(boolean z) {
                this.F = z;
                return this;
            }

            @InterfaceC6181ey
            public a W0(boolean z) {
                this.G = z;
                return this;
            }

            @InterfaceC6181ey
            public a X0(boolean z) {
                this.N = z;
                return this;
            }

            @InterfaceC6181ey
            public a Y0(boolean z) {
                this.M = z;
                return this;
            }

            @InterfaceC6181ey
            public a Z0(boolean z) {
                this.D = z;
                return this;
            }

            @InterfaceC6181ey
            public a a1(boolean z) {
                this.B = z;
                return this;
            }

            @InterfaceC6181ey
            public a b1(boolean z) {
                this.C = z;
                return this;
            }

            @InterfaceC6181ey
            public a c1(boolean z) {
                this.J = z;
                return this;
            }

            @InterfaceC6181ey
            @Deprecated
            public a d1(int i) {
                return N(i);
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            @Deprecated
            /* renamed from: e1 */
            public a K(Set<Integer> set) {
                super.K(set);
                return this;
            }

            @InterfaceC6181ey
            public a f1(boolean z) {
                this.E = z;
                return this;
            }

            @InterfaceC6181ey
            public a g1(boolean z) {
                this.K = z;
                return this;
            }

            @InterfaceC6181ey
            public a h1(boolean z) {
                this.A = z;
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: i1 */
            public a L(boolean z) {
                super.L(z);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: j1 */
            public a M(boolean z) {
                super.M(z);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: k1 */
            public a N(int i) {
                super.N(i);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: l1 */
            public a O(int i) {
                super.O(i);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: m1 */
            public a P(int i) {
                super.P(i);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: n1 */
            public a Q(int i) {
                super.Q(i);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: o1 */
            public a R(int i) {
                super.R(i);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: p1 */
            public a S(int i, int i2) {
                super.S(i, i2);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: q1 */
            public a T() {
                super.T();
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: r1 */
            public a U(int i) {
                super.U(i);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: s1 */
            public a V(int i) {
                super.V(i);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: t1 */
            public a W(int i, int i2) {
                super.W(i, i2);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: u1 */
            public a X(C2782Dr2 c2782Dr2) {
                super.X(c2782Dr2);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: v1 */
            public a Y(@InterfaceC11300zs1 String str) {
                super.Y(str);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: w1 */
            public a Z(String... strArr) {
                super.Z(strArr);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: x1 */
            public a a0(@InterfaceC11300zs1 String str) {
                super.a0(str);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: y1 */
            public a b0(String... strArr) {
                super.b0(strArr);
                return this;
            }

            @Override // o.C2989Fr2.a
            @InterfaceC6181ey
            /* renamed from: z1 */
            public a c0(int i) {
                super.c0(i);
                return this;
            }

            @Deprecated
            public a() {
                this.O = new SparseArray<>();
                this.P = new SparseBooleanArray();
                Q0();
            }

            public a(Context context) {
                super(context);
                this.O = new SparseArray<>();
                this.P = new SparseBooleanArray();
                Q0();
            }

            public a(d dVar) {
                super(dVar);
                this.A = dVar.Z1;
                this.B = dVar.a2;
                this.C = dVar.b2;
                this.D = dVar.c2;
                this.E = dVar.d2;
                this.F = dVar.e2;
                this.G = dVar.f2;
                this.H = dVar.g2;
                this.I = dVar.h2;
                this.J = dVar.i2;
                this.K = dVar.j2;
                this.L = dVar.k2;
                this.M = dVar.l2;
                this.N = dVar.m2;
                this.O = P0(dVar.n2);
                this.P = dVar.o2.clone();
            }

            public a(Bundle bundle) {
                super(bundle);
                Q0();
                d dVar = d.p2;
                h1(bundle.getBoolean(d.r2, dVar.Z1));
                a1(bundle.getBoolean(d.s2, dVar.a2));
                b1(bundle.getBoolean(d.t2, dVar.b2));
                Z0(bundle.getBoolean(d.F2, dVar.c2));
                f1(bundle.getBoolean(d.u2, dVar.d2));
                V0(bundle.getBoolean(d.v2, dVar.e2));
                W0(bundle.getBoolean(d.w2, dVar.f2));
                T0(bundle.getBoolean(d.x2, dVar.g2));
                U0(bundle.getBoolean(d.G2, dVar.h2));
                c1(bundle.getBoolean(d.H2, dVar.i2));
                g1(bundle.getBoolean(d.y2, dVar.j2));
                M1(bundle.getBoolean(d.z2, dVar.k2));
                Y0(bundle.getBoolean(d.A2, dVar.l2));
                X0(bundle.getBoolean(d.I2, dVar.m2));
                this.O = new SparseArray<>();
                K1(bundle);
                this.P = R0(bundle.getIntArray(d.E2));
            }
        }

        public d(a aVar) {
            super(aVar);
            this.Z1 = aVar.A;
            this.a2 = aVar.B;
            this.b2 = aVar.C;
            this.c2 = aVar.D;
            this.d2 = aVar.E;
            this.e2 = aVar.F;
            this.f2 = aVar.G;
            this.g2 = aVar.H;
            this.h2 = aVar.I;
            this.i2 = aVar.J;
            this.j2 = aVar.K;
            this.k2 = aVar.L;
            this.l2 = aVar.M;
            this.m2 = aVar.N;
            this.n2 = aVar.O;
            this.o2 = aVar.P;
        }
    }

    /* renamed from: o.j10$f */
    /* loaded from: classes2.dex */
    public static final class f implements InterfaceC8368nr {
        public static final String Z0 = TD2.R0(0);
        public static final String a1 = TD2.R0(1);
        public static final String b1 = TD2.R0(2);
        public static final InterfaceC8368nr.a<f> c1 = new InterfaceC8368nr.a() { // from class: o.l10
            @Override // o.InterfaceC8368nr.a
            public final InterfaceC8368nr a(Bundle bundle) {
                return C7177j10.f.a(bundle);
            }
        };
        public final int X;
        public final int[] Y;
        public final int Y0;
        public final int Z;

        public f(int i, int... iArr) {
            this(i, iArr, 0);
        }

        public static /* synthetic */ f a(Bundle bundle) {
            boolean z;
            int i = bundle.getInt(Z0, -1);
            int[] intArray = bundle.getIntArray(a1);
            int i2 = bundle.getInt(b1, -1);
            if (i >= 0 && i2 >= 0) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            C9542sf.g(intArray);
            return new f(i, intArray, i2);
        }

        public boolean b(int i) {
            for (int i2 : this.Y) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.InterfaceC8368nr
        public Bundle e() {
            Bundle bundle = new Bundle();
            bundle.putInt(Z0, this.X);
            bundle.putIntArray(a1, this.Y);
            bundle.putInt(b1, this.Y0);
            return bundle;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.X == fVar.X && Arrays.equals(this.Y, fVar.Y) && this.Y0 == fVar.Y0) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.X * 31) + Arrays.hashCode(this.Y)) * 31) + this.Y0;
        }

        public f(int i, int[] iArr, int i2) {
            this.X = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.Y = copyOf;
            this.Z = iArr.length;
            this.Y0 = i2;
            Arrays.sort(copyOf);
        }
    }

    @ES1(32)
    /* renamed from: o.j10$g */
    /* loaded from: classes2.dex */
    public static class g {
        public final Spatializer a;
        public final boolean b;
        @InterfaceC11300zs1
        public Handler c;
        @InterfaceC11300zs1
        public Spatializer$OnSpatializerStateChangedListener d;

        /* renamed from: o.j10$g$a */
        /* loaded from: classes2.dex */
        public class a implements Spatializer$OnSpatializerStateChangedListener {
            public final /* synthetic */ C7177j10 a;

            public a(C7177j10 c7177j10) {
                this.a = c7177j10;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                this.a.S();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                this.a.S();
            }
        }

        public g(Spatializer spatializer) {
            boolean z;
            this.a = spatializer;
            if (C8897q10.a(spatializer) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.b = z;
        }

        @InterfaceC11300zs1
        public static g g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new g(C7906m10.a(audioManager));
        }

        public boolean a(C9546sg c9546sg, C10833xx0 c10833xx0) {
            int i;
            if (C4128Rj1.S.equals(c10833xx0.g1) && c10833xx0.t1 == 16) {
                i = 12;
            } else {
                i = c10833xx0.t1;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(TD2.S(i));
            int i2 = c10833xx0.u1;
            if (i2 != -1) {
                channelMask.setSampleRate(i2);
            }
            return C9389s10.a(this.a, c9546sg.b().a, channelMask.build());
        }

        public void b(C7177j10 c7177j10, Looper looper) {
            if (this.d == null && this.c == null) {
                this.d = new a(c7177j10);
                Handler handler = new Handler(looper);
                this.c = handler;
                Spatializer spatializer = this.a;
                Objects.requireNonNull(handler);
                C8410o10.a(spatializer, new ExecutorC7491kJ(handler), this.d);
            }
        }

        public boolean c() {
            return C8654p10.a(this.a);
        }

        public boolean d() {
            return C8167n10.a(this.a);
        }

        public boolean e() {
            return this.b;
        }

        public void f() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.d;
            if (spatializer$OnSpatializerStateChangedListener != null && this.c != null) {
                C9146r10.a(this.a, spatializer$OnSpatializerStateChangedListener);
                ((Handler) TD2.o(this.c)).removeCallbacksAndMessages(null);
                this.c = null;
                this.d = null;
            }
        }
    }

    /* renamed from: o.j10$h */
    /* loaded from: classes2.dex */
    public static final class h extends i<h> implements Comparable<h> {
        public final int Z0;
        public final boolean a1;
        public final boolean b1;
        public final boolean c1;
        public final int d1;
        public final int e1;
        public final int f1;
        public final int g1;
        public final boolean h1;

        public h(int i, C9593sr2 c9593sr2, int i2, d dVar, int i3, @InterfaceC11300zs1 String str) {
            super(i, c9593sr2, i2);
            boolean z;
            boolean z2;
            AbstractC5317bO0<String> abstractC5317bO0;
            int i4;
            boolean z3;
            boolean z4;
            boolean z5;
            int i5 = 0;
            this.a1 = C7177j10.Q(i3, false);
            int i6 = this.Y0.Y0 & (~dVar.p1);
            if ((i6 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.b1 = z;
            if ((i6 & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.c1 = z2;
            if (dVar.n1.isEmpty()) {
                abstractC5317bO0 = AbstractC5317bO0.M("");
            } else {
                abstractC5317bO0 = dVar.n1;
            }
            int i7 = 0;
            while (true) {
                if (i7 < abstractC5317bO0.size()) {
                    i4 = C7177j10.I(this.Y0, abstractC5317bO0.get(i7), dVar.q1);
                    if (i4 > 0) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = Integer.MAX_VALUE;
                    i4 = 0;
                    break;
                }
            }
            this.d1 = i7;
            this.e1 = i4;
            int M = C7177j10.M(this.Y0.Z0, dVar.o1);
            this.f1 = M;
            if ((this.Y0.Z0 & 1088) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.h1 = z3;
            if (C7177j10.U(str) == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int I = C7177j10.I(this.Y0, str, z4);
            this.g1 = I;
            if (i4 <= 0 && ((!dVar.n1.isEmpty() || M <= 0) && !this.b1 && (!this.c1 || I <= 0))) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (C7177j10.Q(i3, dVar.j2) && z5) {
                i5 = 1;
            }
            this.Z0 = i5;
        }

        public static int h(List<h> list, List<h> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static AbstractC5317bO0<h> j(int i, C9593sr2 c9593sr2, d dVar, int[] iArr, @InterfaceC11300zs1 String str) {
            AbstractC5317bO0.a r = AbstractC5317bO0.r();
            for (int i2 = 0; i2 < c9593sr2.X; i2++) {
                r.g(new h(i, c9593sr2, i2, dVar, iArr[i2], str));
            }
            return r.e();
        }

        @Override // o.C7177j10.i
        public int e() {
            return this.Z0;
        }

        @Override // java.lang.Comparable
        /* renamed from: i */
        public int compareTo(h hVar) {
            AbstractC10587ww1 E;
            AbstractC9452sH k = AbstractC9452sH.n().k(this.a1, hVar.a1).j(Integer.valueOf(this.d1), Integer.valueOf(hVar.d1), AbstractC10587ww1.z().E()).f(this.e1, hVar.e1).f(this.f1, hVar.f1).k(this.b1, hVar.b1);
            Boolean valueOf = Boolean.valueOf(this.c1);
            Boolean valueOf2 = Boolean.valueOf(hVar.c1);
            if (this.e1 == 0) {
                E = AbstractC10587ww1.z();
            } else {
                E = AbstractC10587ww1.z().E();
            }
            AbstractC9452sH f = k.j(valueOf, valueOf2, E).f(this.g1, hVar.g1);
            if (this.f1 == 0) {
                f = f.l(this.h1, hVar.h1);
            }
            return f.m();
        }

        @Override // o.C7177j10.i
        /* renamed from: l */
        public boolean g(h hVar) {
            return false;
        }
    }

    /* renamed from: o.j10$i */
    /* loaded from: classes2.dex */
    public static abstract class i<T extends i<T>> {
        public final int X;
        public final C9593sr2 Y;
        public final C10833xx0 Y0;
        public final int Z;

        /* renamed from: o.j10$i$a */
        /* loaded from: classes2.dex */
        public interface a<T extends i<T>> {
            List<T> a(int i, C9593sr2 c9593sr2, int[] iArr);
        }

        public i(int i, C9593sr2 c9593sr2, int i2) {
            this.X = i;
            this.Y = c9593sr2;
            this.Z = i2;
            this.Y0 = c9593sr2.c(i2);
        }

        public abstract int e();

        public abstract boolean g(T t);
    }

    /* renamed from: o.j10$j */
    /* loaded from: classes2.dex */
    public static final class j extends i<j> {
        public final boolean Z0;
        public final d a1;
        public final boolean b1;
        public final boolean c1;
        public final int d1;
        public final int e1;
        public final int f1;
        public final int g1;
        public final boolean h1;
        public final boolean i1;
        public final int j1;
        public final boolean k1;
        public final boolean l1;
        public final int m1;

        /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00c8 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public j(int i, C9593sr2 c9593sr2, int i2, d dVar, int i3, int i4, boolean z) {
            super(i, c9593sr2, i2);
            int i5;
            boolean z2;
            boolean z3;
            boolean z4;
            int i6;
            boolean z5;
            int i7;
            boolean z6;
            C10833xx0 c10833xx0;
            int i8;
            int i9;
            float f;
            int i10;
            C10833xx0 c10833xx02;
            int i11;
            int i12;
            int i13;
            this.a1 = dVar;
            if (dVar.b2) {
                i5 = 24;
            } else {
                i5 = 16;
            }
            if (dVar.a2 && (i4 & i5) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.i1 = z2;
            if (z && (((i11 = (c10833xx02 = this.Y0).l1) == -1 || i11 <= dVar.X) && ((i12 = c10833xx02.m1) == -1 || i12 <= dVar.Y))) {
                float f2 = c10833xx02.n1;
                if ((f2 == -1.0f || f2 <= dVar.Z) && ((i13 = c10833xx02.c1) == -1 || i13 <= dVar.Y0)) {
                    z3 = true;
                    this.Z0 = z3;
                    if (z && (((i8 = (c10833xx0 = this.Y0).l1) == -1 || i8 >= dVar.Z0) && ((i9 = c10833xx0.m1) == -1 || i9 >= dVar.a1))) {
                        f = c10833xx0.n1;
                        if ((f != -1.0f || f >= dVar.b1) && ((i10 = c10833xx0.c1) == -1 || i10 >= dVar.c1)) {
                            z4 = true;
                            this.b1 = z4;
                            this.c1 = C7177j10.Q(i3, false);
                            C10833xx0 c10833xx03 = this.Y0;
                            this.d1 = c10833xx03.c1;
                            this.e1 = c10833xx03.g();
                            this.g1 = C7177j10.M(this.Y0.Z0, dVar.h1);
                            i6 = this.Y0.Z0;
                            if (i6 == 0 && (i6 & 1) == 0) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            this.h1 = z5;
                            i7 = 0;
                            while (true) {
                                if (i7 >= dVar.g1.size()) {
                                    String str = this.Y0.g1;
                                    if (str != null && str.equals(dVar.g1.get(i7))) {
                                        break;
                                    }
                                    i7++;
                                } else {
                                    i7 = Integer.MAX_VALUE;
                                    break;
                                }
                            }
                            this.f1 = i7;
                            if (InterfaceC10712xR1.l(i3) != 128) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            this.k1 = z6;
                            this.l1 = InterfaceC10712xR1.w(i3) == 64;
                            this.m1 = C7177j10.N(this.Y0.g1);
                            this.j1 = o(i3, i5);
                        }
                    }
                    z4 = false;
                    this.b1 = z4;
                    this.c1 = C7177j10.Q(i3, false);
                    C10833xx0 c10833xx032 = this.Y0;
                    this.d1 = c10833xx032.c1;
                    this.e1 = c10833xx032.g();
                    this.g1 = C7177j10.M(this.Y0.Z0, dVar.h1);
                    i6 = this.Y0.Z0;
                    if (i6 == 0) {
                    }
                    z5 = true;
                    this.h1 = z5;
                    i7 = 0;
                    while (true) {
                        if (i7 >= dVar.g1.size()) {
                        }
                        i7++;
                    }
                    this.f1 = i7;
                    if (InterfaceC10712xR1.l(i3) != 128) {
                    }
                    this.k1 = z6;
                    this.l1 = InterfaceC10712xR1.w(i3) == 64;
                    this.m1 = C7177j10.N(this.Y0.g1);
                    this.j1 = o(i3, i5);
                }
            }
            z3 = false;
            this.Z0 = z3;
            if (z) {
                f = c10833xx0.n1;
                if (f != -1.0f) {
                }
                z4 = true;
                this.b1 = z4;
                this.c1 = C7177j10.Q(i3, false);
                C10833xx0 c10833xx0322 = this.Y0;
                this.d1 = c10833xx0322.c1;
                this.e1 = c10833xx0322.g();
                this.g1 = C7177j10.M(this.Y0.Z0, dVar.h1);
                i6 = this.Y0.Z0;
                if (i6 == 0) {
                }
                z5 = true;
                this.h1 = z5;
                i7 = 0;
                while (true) {
                    if (i7 >= dVar.g1.size()) {
                    }
                    i7++;
                }
                this.f1 = i7;
                if (InterfaceC10712xR1.l(i3) != 128) {
                }
                this.k1 = z6;
                this.l1 = InterfaceC10712xR1.w(i3) == 64;
                this.m1 = C7177j10.N(this.Y0.g1);
                this.j1 = o(i3, i5);
            }
            z4 = false;
            this.b1 = z4;
            this.c1 = C7177j10.Q(i3, false);
            C10833xx0 c10833xx03222 = this.Y0;
            this.d1 = c10833xx03222.c1;
            this.e1 = c10833xx03222.g();
            this.g1 = C7177j10.M(this.Y0.Z0, dVar.h1);
            i6 = this.Y0.Z0;
            if (i6 == 0) {
            }
            z5 = true;
            this.h1 = z5;
            i7 = 0;
            while (true) {
                if (i7 >= dVar.g1.size()) {
                }
                i7++;
            }
            this.f1 = i7;
            if (InterfaceC10712xR1.l(i3) != 128) {
            }
            this.k1 = z6;
            this.l1 = InterfaceC10712xR1.w(i3) == 64;
            this.m1 = C7177j10.N(this.Y0.g1);
            this.j1 = o(i3, i5);
        }

        public static int j(j jVar, j jVar2) {
            AbstractC9452sH k = AbstractC9452sH.n().k(jVar.c1, jVar2.c1).f(jVar.g1, jVar2.g1).k(jVar.h1, jVar2.h1).k(jVar.Z0, jVar2.Z0).k(jVar.b1, jVar2.b1).j(Integer.valueOf(jVar.f1), Integer.valueOf(jVar2.f1), AbstractC10587ww1.z().E()).k(jVar.k1, jVar2.k1).k(jVar.l1, jVar2.l1);
            if (jVar.k1 && jVar.l1) {
                k = k.f(jVar.m1, jVar2.m1);
            }
            return k.m();
        }

        public static int l(j jVar, j jVar2) {
            AbstractC10587ww1 E;
            AbstractC10587ww1 abstractC10587ww1;
            if (jVar.Z0 && jVar.c1) {
                E = C7177j10.q;
            } else {
                E = C7177j10.q.E();
            }
            AbstractC9452sH n = AbstractC9452sH.n();
            Integer valueOf = Integer.valueOf(jVar.d1);
            Integer valueOf2 = Integer.valueOf(jVar2.d1);
            if (!jVar.a1.r1) {
                abstractC10587ww1 = C7177j10.r;
            } else {
                abstractC10587ww1 = C7177j10.q.E();
            }
            return n.j(valueOf, valueOf2, abstractC10587ww1).j(Integer.valueOf(jVar.e1), Integer.valueOf(jVar2.e1), E).j(Integer.valueOf(jVar.d1), Integer.valueOf(jVar2.d1), E).m();
        }

        public static int m(List<j> list, List<j> list2) {
            return AbstractC9452sH.n().j((j) Collections.max(list, new Comparator() { // from class: o.t10
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int j;
                    j = C7177j10.j.j((C7177j10.j) obj, (C7177j10.j) obj2);
                    return j;
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: o.t10
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int j;
                    j = C7177j10.j.j((C7177j10.j) obj, (C7177j10.j) obj2);
                    return j;
                }
            }), new Comparator() { // from class: o.t10
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int j;
                    j = C7177j10.j.j((C7177j10.j) obj, (C7177j10.j) obj2);
                    return j;
                }
            }).f(list.size(), list2.size()).j((j) Collections.max(list, new Comparator() { // from class: o.u10
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int l;
                    l = C7177j10.j.l((C7177j10.j) obj, (C7177j10.j) obj2);
                    return l;
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: o.u10
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int l;
                    l = C7177j10.j.l((C7177j10.j) obj, (C7177j10.j) obj2);
                    return l;
                }
            }), new Comparator() { // from class: o.u10
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int l;
                    l = C7177j10.j.l((C7177j10.j) obj, (C7177j10.j) obj2);
                    return l;
                }
            }).m();
        }

        public static AbstractC5317bO0<j> n(int i, C9593sr2 c9593sr2, d dVar, int[] iArr, int i2) {
            boolean z;
            int J = C7177j10.J(c9593sr2, dVar.d1, dVar.e1, dVar.f1);
            AbstractC5317bO0.a r = AbstractC5317bO0.r();
            for (int i3 = 0; i3 < c9593sr2.X; i3++) {
                int g = c9593sr2.c(i3).g();
                if (J != Integer.MAX_VALUE && (g == -1 || g > J)) {
                    z = false;
                } else {
                    z = true;
                }
                r.g(new j(i, c9593sr2, i3, dVar, iArr[i3], i2, z));
            }
            return r.e();
        }

        @Override // o.C7177j10.i
        public int e() {
            return this.j1;
        }

        public final int o(int i, int i2) {
            if ((this.Y0.Z0 & 16384) != 0 || !C7177j10.Q(i, this.a1.j2)) {
                return 0;
            }
            if (!this.Z0 && !this.a1.Z1) {
                return 0;
            }
            if (C7177j10.Q(i, false) && this.b1 && this.Z0 && this.Y0.c1 != -1) {
                d dVar = this.a1;
                if (!dVar.s1 && !dVar.r1 && (i & i2) != 0) {
                    return 2;
                }
                return 1;
            }
            return 1;
        }

        @Override // o.C7177j10.i
        /* renamed from: p */
        public boolean g(j jVar) {
            if (this.i1 || TD2.g(this.Y0.g1, jVar.Y0.g1)) {
                if (!this.a1.c2) {
                    if (this.k1 != jVar.k1 || this.l1 != jVar.l1) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
    }

    public C7177j10(Context context) {
        this(context, new C8920q7.b());
    }

    public static void E(AbstractC7692l81.a aVar, d dVar, InterfaceC6859hi0.a[] aVarArr) {
        InterfaceC6859hi0.a aVar2;
        int d2 = aVar.d();
        for (int i2 = 0; i2 < d2; i2++) {
            C10079ur2 h2 = aVar.h(i2);
            if (dVar.P(i2, h2)) {
                f O = dVar.O(i2, h2);
                if (O != null && O.Y.length != 0) {
                    aVar2 = new InterfaceC6859hi0.a(h2.b(O.X), O.Y, O.Y0);
                } else {
                    aVar2 = null;
                }
                aVarArr[i2] = aVar2;
            }
        }
    }

    public static void F(AbstractC7692l81.a aVar, C2989Fr2 c2989Fr2, InterfaceC6859hi0.a[] aVarArr) {
        InterfaceC6859hi0.a aVar2;
        int d2 = aVar.d();
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < d2; i2++) {
            H(aVar.h(i2), c2989Fr2, hashMap);
        }
        H(aVar.k(), c2989Fr2, hashMap);
        for (int i3 = 0; i3 < d2; i3++) {
            C2782Dr2 c2782Dr2 = (C2782Dr2) hashMap.get(Integer.valueOf(aVar.g(i3)));
            if (c2782Dr2 != null) {
                if (!c2782Dr2.Y.isEmpty() && aVar.h(i3).c(c2782Dr2.X) != -1) {
                    aVar2 = new InterfaceC6859hi0.a(c2782Dr2.X, C7775lT0.B(c2782Dr2.Y));
                } else {
                    aVar2 = null;
                }
                aVarArr[i3] = aVar2;
            }
        }
    }

    public static void H(C10079ur2 c10079ur2, C2989Fr2 c2989Fr2, Map<Integer, C2782Dr2> map) {
        C2782Dr2 c2782Dr2;
        for (int i2 = 0; i2 < c10079ur2.X; i2++) {
            C2782Dr2 c2782Dr22 = c2989Fr2.t1.get(c10079ur2.b(i2));
            if (c2782Dr22 != null && ((c2782Dr2 = map.get(Integer.valueOf(c2782Dr22.b()))) == null || (c2782Dr2.Y.isEmpty() && !c2782Dr22.Y.isEmpty()))) {
                map.put(Integer.valueOf(c2782Dr22.b()), c2782Dr22);
            }
        }
    }

    public static int I(C10833xx0 c10833xx0, @InterfaceC11300zs1 String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c10833xx0.Z)) {
            return 4;
        }
        String U = U(str);
        String U2 = U(c10833xx0.Z);
        if (U2 != null && U != null) {
            if (!U2.startsWith(U) && !U.startsWith(U2)) {
                if (!TD2.K1(U2, "-")[0].equals(TD2.K1(U, "-")[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z || U2 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int J(C9593sr2 c9593sr2, int i2, int i3, boolean z) {
        int i4;
        int i5 = Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
            for (int i6 = 0; i6 < c9593sr2.X; i6++) {
                C10833xx0 c2 = c9593sr2.c(i6);
                int i7 = c2.l1;
                if (i7 > 0 && (i4 = c2.m1) > 0) {
                    Point K = K(z, i2, i3, i7, i4);
                    int i8 = c2.l1;
                    int i9 = c2.m1;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (K.x * 0.98f)) && i9 >= ((int) (K.y * 0.98f)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000c, code lost:
        if (r1 != r3) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Point K(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        if (z) {
            boolean z3 = false;
            if (i4 > i5) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i2 > i3) {
                z3 = true;
            }
        }
        i3 = i2;
        i2 = i3;
        int i6 = i4 * i2;
        int i7 = i5 * i3;
        if (i6 >= i7) {
            return new Point(i3, TD2.q(i7, i4));
        }
        return new Point(TD2.q(i6, i5), i2);
    }

    public static int M(int i2, int i3) {
        if (i2 != 0 && i2 == i3) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(i2 & i3);
    }

    public static int N(@InterfaceC11300zs1 String str) {
        if (str == null) {
            return 0;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals(C4128Rj1.w)) {
                    c2 = 0;
                    break;
                }
                break;
            case -1662735862:
                if (str.equals(C4128Rj1.n)) {
                    c2 = 1;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals(C4128Rj1.k)) {
                    c2 = 2;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals(C4128Rj1.m)) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return 0;
        }
    }

    public static boolean P(C10833xx0 c10833xx0) {
        String str = c10833xx0.g1;
        if (str == null) {
            return false;
        }
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(C4128Rj1.S)) {
                    c2 = 0;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(C4128Rj1.Q)) {
                    c2 = 1;
                    break;
                }
                break;
            case 187078297:
                if (str.equals(C4128Rj1.T)) {
                    c2 = 2;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(C4128Rj1.R)) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public static boolean Q(int i2, boolean z) {
        int H = InterfaceC10712xR1.H(i2);
        if (H != 4) {
            if (!z || H != 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void R(AbstractC7692l81.a aVar, int[][][] iArr, C10955yR1[] c10955yR1Arr, InterfaceC6859hi0[] interfaceC6859hi0Arr) {
        boolean z;
        boolean z2 = false;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < aVar.d(); i4++) {
            int g2 = aVar.g(i4);
            InterfaceC6859hi0 interfaceC6859hi0 = interfaceC6859hi0Arr[i4];
            if ((g2 == 1 || g2 == 2) && interfaceC6859hi0 != null && V(iArr[i4], aVar.h(i4), interfaceC6859hi0)) {
                if (g2 == 1) {
                    if (i3 != -1) {
                        z = false;
                        break;
                    }
                    i3 = i4;
                } else if (i2 != -1) {
                    z = false;
                    break;
                } else {
                    i2 = i4;
                }
            }
        }
        z = true;
        if (i3 != -1 && i2 != -1) {
            z2 = true;
        }
        if (z & z2) {
            C10955yR1 c10955yR1 = new C10955yR1(true);
            c10955yR1Arr[i3] = c10955yR1;
            c10955yR1Arr[i2] = c10955yR1;
        }
    }

    @InterfaceC11300zs1
    public static String U(@InterfaceC11300zs1 String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, C10323vs.g1)) {
            return str;
        }
        return null;
    }

    public static boolean V(int[][] iArr, C10079ur2 c10079ur2, InterfaceC6859hi0 interfaceC6859hi0) {
        if (interfaceC6859hi0 == null) {
            return false;
        }
        int c2 = c10079ur2.c(interfaceC6859hi0.n());
        for (int i2 = 0; i2 < interfaceC6859hi0.length(); i2++) {
            if (InterfaceC10712xR1.p(iArr[c2][interfaceC6859hi0.g(i2)]) != 32) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int u(Integer num, Integer num2) {
        return 0;
    }

    public static /* synthetic */ int v(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            if (num2.intValue() != -1) {
                return -1;
            }
            return 0;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }

    public static /* synthetic */ List x(final C7177j10 c7177j10, d dVar, boolean z, int i2, C9593sr2 c9593sr2, int[] iArr) {
        c7177j10.getClass();
        return b.j(i2, c9593sr2, dVar, iArr, z, new IF1() { // from class: o.e10
            @Override // o.IF1
            public final boolean apply(Object obj) {
                boolean O;
                O = C7177j10.this.O((C10833xx0) obj);
                return O;
            }
        });
    }

    public d.a G() {
        return c().B();
    }

    @Override // o.AbstractC3283Ir2
    /* renamed from: L */
    public d c() {
        d dVar;
        synchronized (this.d) {
            dVar = this.h;
        }
        return dVar;
    }

    public final boolean O(C10833xx0 c10833xx0) {
        boolean z;
        g gVar;
        g gVar2;
        synchronized (this.d) {
            try {
                if (this.h.i2) {
                    if (!this.g) {
                        if (c10833xx0.t1 > 2) {
                            if (P(c10833xx0)) {
                                if (TD2.a >= 32 && (gVar2 = this.i) != null && gVar2.e()) {
                                }
                            }
                            if (TD2.a < 32 || (gVar = this.i) == null || !gVar.e() || !this.i.c() || !this.i.d() || !this.i.a(this.j, c10833xx0)) {
                                z = false;
                            }
                        }
                    }
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    public final void S() {
        boolean z;
        g gVar;
        synchronized (this.d) {
            try {
                if (this.h.i2 && !this.g && TD2.a >= 32 && (gVar = this.i) != null && gVar.e()) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            f();
        }
    }

    public final void T(InterfaceC10469wR1 interfaceC10469wR1) {
        boolean z;
        synchronized (this.d) {
            z = this.h.m2;
        }
        if (z) {
            g(interfaceC10469wR1);
        }
    }

    public InterfaceC6859hi0.a[] W(AbstractC7692l81.a aVar, int[][][] iArr, int[] iArr2, d dVar) throws C3824Og0 {
        String str;
        int d2 = aVar.d();
        InterfaceC6859hi0.a[] aVarArr = new InterfaceC6859hi0.a[d2];
        Pair<InterfaceC6859hi0.a, Integer> b0 = b0(aVar, iArr, iArr2, dVar);
        if (b0 != null) {
            aVarArr[((Integer) b0.second).intValue()] = (InterfaceC6859hi0.a) b0.first;
        }
        Pair<InterfaceC6859hi0.a, Integer> X = X(aVar, iArr, iArr2, dVar);
        if (X != null) {
            aVarArr[((Integer) X.second).intValue()] = (InterfaceC6859hi0.a) X.first;
        }
        if (X == null) {
            str = null;
        } else {
            Object obj = X.first;
            str = ((InterfaceC6859hi0.a) obj).a.c(((InterfaceC6859hi0.a) obj).b[0]).Z;
        }
        Pair<InterfaceC6859hi0.a, Integer> Z = Z(aVar, iArr, dVar, str);
        if (Z != null) {
            aVarArr[((Integer) Z.second).intValue()] = (InterfaceC6859hi0.a) Z.first;
        }
        for (int i2 = 0; i2 < d2; i2++) {
            int g2 = aVar.g(i2);
            if (g2 != 2 && g2 != 1 && g2 != 3) {
                aVarArr[i2] = Y(g2, aVar.h(i2), iArr[i2], dVar);
            }
        }
        return aVarArr;
    }

    @InterfaceC11300zs1
    public Pair<InterfaceC6859hi0.a, Integer> X(AbstractC7692l81.a aVar, int[][][] iArr, int[] iArr2, final d dVar) throws C3824Og0 {
        final boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < aVar.d()) {
                if (2 == aVar.g(i2) && aVar.h(i2).X > 0) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return a0(1, aVar, iArr, new i.a() { // from class: o.f10
            @Override // o.C7177j10.i.a
            public final List a(int i3, C9593sr2 c9593sr2, int[] iArr3) {
                return C7177j10.x(C7177j10.this, dVar, z, i3, c9593sr2, iArr3);
            }
        }, new Comparator() { // from class: o.g10
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C7177j10.b.h((List) obj, (List) obj2);
            }
        });
    }

    @InterfaceC11300zs1
    public InterfaceC6859hi0.a Y(int i2, C10079ur2 c10079ur2, int[][] iArr, d dVar) throws C3824Og0 {
        C9593sr2 c9593sr2 = null;
        c cVar = null;
        int i3 = 0;
        for (int i4 = 0; i4 < c10079ur2.X; i4++) {
            C9593sr2 b2 = c10079ur2.b(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < b2.X; i5++) {
                if (Q(iArr2[i5], dVar.j2)) {
                    c cVar2 = new c(b2.c(i5), iArr2[i5]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        c9593sr2 = b2;
                        i3 = i5;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (c9593sr2 == null) {
            return null;
        }
        return new InterfaceC6859hi0.a(c9593sr2, i3);
    }

    @InterfaceC11300zs1
    public Pair<InterfaceC6859hi0.a, Integer> Z(AbstractC7692l81.a aVar, int[][][] iArr, final d dVar, @InterfaceC11300zs1 final String str) throws C3824Og0 {
        return a0(3, aVar, iArr, new i.a() { // from class: o.h10
            @Override // o.C7177j10.i.a
            public final List a(int i2, C9593sr2 c9593sr2, int[] iArr2) {
                List j2;
                j2 = C7177j10.h.j(i2, c9593sr2, C7177j10.d.this, iArr2, str);
                return j2;
            }
        }, new Comparator() { // from class: o.i10
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C7177j10.h.h((List) obj, (List) obj2);
            }
        });
    }

    @Override // o.InterfaceC10712xR1.f
    public void a(InterfaceC10469wR1 interfaceC10469wR1) {
        T(interfaceC10469wR1);
    }

    @InterfaceC11300zs1
    public final <T extends i<T>> Pair<InterfaceC6859hi0.a, Integer> a0(int i2, AbstractC7692l81.a aVar, int[][][] iArr, i.a<T> aVar2, Comparator<List<T>> comparator) {
        int i3;
        RandomAccess randomAccess;
        AbstractC7692l81.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int d2 = aVar3.d();
        int i4 = 0;
        while (i4 < d2) {
            if (i2 == aVar3.g(i4)) {
                C10079ur2 h2 = aVar3.h(i4);
                for (int i5 = 0; i5 < h2.X; i5++) {
                    C9593sr2 b2 = h2.b(i5);
                    List<T> a2 = aVar2.a(i4, b2, iArr[i4][i5]);
                    boolean[] zArr = new boolean[b2.X];
                    int i6 = 0;
                    while (i6 < b2.X) {
                        T t = a2.get(i6);
                        int e2 = t.e();
                        if (zArr[i6] || e2 == 0) {
                            i3 = d2;
                        } else {
                            if (e2 == 1) {
                                randomAccess = AbstractC5317bO0.M(t);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t);
                                int i7 = i6 + 1;
                                while (i7 < b2.X) {
                                    T t2 = a2.get(i7);
                                    int i8 = d2;
                                    if (t2.e() == 2 && t.g(t2)) {
                                        arrayList2.add(t2);
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    d2 = i8;
                                }
                                randomAccess = arrayList2;
                            }
                            i3 = d2;
                            arrayList.add(randomAccess);
                        }
                        i6++;
                        d2 = i3;
                    }
                }
            }
            i4++;
            aVar3 = aVar;
            d2 = d2;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((i) list.get(i9)).Z;
        }
        i iVar = (i) list.get(0);
        return Pair.create(new InterfaceC6859hi0.a(iVar.Y, iArr2), Integer.valueOf(iVar.X));
    }

    @InterfaceC11300zs1
    public Pair<InterfaceC6859hi0.a, Integer> b0(AbstractC7692l81.a aVar, int[][][] iArr, final int[] iArr2, final d dVar) throws C3824Og0 {
        return a0(2, aVar, iArr, new i.a() { // from class: o.c10
            @Override // o.C7177j10.i.a
            public final List a(int i2, C9593sr2 c9593sr2, int[] iArr3) {
                List n2;
                n2 = C7177j10.j.n(i2, c9593sr2, C7177j10.d.this, iArr3, iArr2[i2]);
                return n2;
            }
        }, new Comparator() { // from class: o.d10
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C7177j10.j.m((List) obj, (List) obj2);
            }
        });
    }

    public void c0(d.a aVar) {
        e0(aVar.B());
    }

    @Deprecated
    public void d0(e eVar) {
        e0(eVar.B());
    }

    public final void e0(d dVar) {
        boolean equals;
        C9542sf.g(dVar);
        synchronized (this.d) {
            equals = this.h.equals(dVar);
            this.h = dVar;
        }
        if (!equals) {
            if (dVar.i2 && this.e == null) {
                I31.n(k, l);
            }
            f();
        }
    }

    @Override // o.AbstractC3283Ir2
    public boolean h() {
        return true;
    }

    @Override // o.AbstractC3283Ir2
    public void j() {
        g gVar;
        synchronized (this.d) {
            try {
                if (TD2.a >= 32 && (gVar = this.i) != null) {
                    gVar.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.j();
    }

    @Override // o.AbstractC3283Ir2
    public void l(C9546sg c9546sg) {
        boolean equals;
        synchronized (this.d) {
            equals = this.j.equals(c9546sg);
            this.j = c9546sg;
        }
        if (!equals) {
            S();
        }
    }

    @Override // o.AbstractC3283Ir2
    public void m(C2989Fr2 c2989Fr2) {
        if (c2989Fr2 instanceof d) {
            e0((d) c2989Fr2);
        }
        e0(new d.a().J(c2989Fr2).B());
    }

    @Override // o.AbstractC7692l81
    public final Pair<C10955yR1[], InterfaceC6859hi0[]> r(AbstractC7692l81.a aVar, int[][][] iArr, int[] iArr2, InterfaceC7583kh1.b bVar, AbstractC7373jp2 abstractC7373jp2) throws C3824Og0 {
        d dVar;
        C10955yR1 c10955yR1;
        g gVar;
        synchronized (this.d) {
            try {
                dVar = this.h;
                if (dVar.i2 && TD2.a >= 32 && (gVar = this.i) != null) {
                    gVar.b(this, (Looper) C9542sf.k(Looper.myLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int d2 = aVar.d();
        InterfaceC6859hi0.a[] W = W(aVar, iArr, iArr2, dVar);
        F(aVar, dVar, W);
        E(aVar, dVar, W);
        for (int i2 = 0; i2 < d2; i2++) {
            int g2 = aVar.g(i2);
            if (dVar.N(i2) || dVar.u1.contains(Integer.valueOf(g2))) {
                W[i2] = null;
            }
        }
        InterfaceC6859hi0[] a2 = this.f.a(W, b(), bVar, abstractC7373jp2);
        C10955yR1[] c10955yR1Arr = new C10955yR1[d2];
        for (int i3 = 0; i3 < d2; i3++) {
            int g3 = aVar.g(i3);
            if (!dVar.N(i3) && !dVar.u1.contains(Integer.valueOf(g3)) && (aVar.g(i3) == -2 || a2[i3] != null)) {
                c10955yR1 = C10955yR1.b;
            } else {
                c10955yR1 = null;
            }
            c10955yR1Arr[i3] = c10955yR1;
        }
        if (dVar.k2) {
            R(aVar, iArr, c10955yR1Arr, a2);
        }
        return Pair.create(c10955yR1Arr, a2);
    }

    @Deprecated
    /* renamed from: o.j10$e */
    /* loaded from: classes2.dex */
    public static final class e extends C2989Fr2.a {
        public final d.a A;

        @Deprecated
        public e() {
            this.A = new d.a();
        }

        @InterfaceC6181ey
        public e A0(boolean z) {
            this.A.T0(z);
            return this;
        }

        @InterfaceC6181ey
        public e B0(boolean z) {
            this.A.U0(z);
            return this;
        }

        @InterfaceC6181ey
        public e C0(boolean z) {
            this.A.V0(z);
            return this;
        }

        @InterfaceC6181ey
        public e D0(boolean z) {
            this.A.W0(z);
            return this;
        }

        @InterfaceC6181ey
        public e E0(boolean z) {
            this.A.Y0(z);
            return this;
        }

        @InterfaceC6181ey
        public e F0(boolean z) {
            this.A.Z0(z);
            return this;
        }

        @InterfaceC6181ey
        public e G0(boolean z) {
            this.A.a1(z);
            return this;
        }

        @InterfaceC6181ey
        public e H0(boolean z) {
            this.A.b1(z);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public e I0(int i) {
            this.A.d1(i);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        @Deprecated
        /* renamed from: J0 */
        public e K(Set<Integer> set) {
            this.A.K(set);
            return this;
        }

        @InterfaceC6181ey
        public e K0(boolean z) {
            this.A.f1(z);
            return this;
        }

        @InterfaceC6181ey
        public e L0(boolean z) {
            this.A.g1(z);
            return this;
        }

        @InterfaceC6181ey
        public e M0(boolean z) {
            this.A.h1(z);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: N0 */
        public e L(boolean z) {
            this.A.L(z);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: O0 */
        public e M(boolean z) {
            this.A.M(z);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: P0 */
        public e N(int i) {
            this.A.N(i);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: Q0 */
        public e O(int i) {
            this.A.O(i);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: R0 */
        public e P(int i) {
            this.A.P(i);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: S0 */
        public e Q(int i) {
            this.A.Q(i);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: T0 */
        public e R(int i) {
            this.A.R(i);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: U0 */
        public e S(int i, int i2) {
            this.A.S(i, i2);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: V0 */
        public e T() {
            this.A.T();
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: W0 */
        public e U(int i) {
            this.A.U(i);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: X0 */
        public e V(int i) {
            this.A.V(i);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: Y0 */
        public e W(int i, int i2) {
            this.A.W(i, i2);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: Z0 */
        public e X(C2782Dr2 c2782Dr2) {
            this.A.X(c2782Dr2);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: a1 */
        public e Y(@InterfaceC11300zs1 String str) {
            this.A.Y(str);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: b1 */
        public e Z(String... strArr) {
            this.A.Z(strArr);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: c1 */
        public e a0(@InterfaceC11300zs1 String str) {
            this.A.a0(str);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: d1 */
        public e b0(String... strArr) {
            this.A.b0(strArr);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: e1 */
        public e c0(int i) {
            this.A.c0(i);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: f1 */
        public e d0(@InterfaceC11300zs1 String str) {
            this.A.d0(str);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: g1 */
        public e e0(Context context) {
            this.A.e0(context);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: h1 */
        public e g0(String... strArr) {
            this.A.g0(strArr);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: i1 */
        public e h0(int i) {
            this.A.h0(i);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: j1 */
        public e i0(@InterfaceC11300zs1 String str) {
            this.A.i0(str);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: k1 */
        public e j0(String... strArr) {
            this.A.j0(strArr);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: l1 */
        public e k0(int i) {
            this.A.k0(i);
            return this;
        }

        @InterfaceC6181ey
        public e m1(int i, boolean z) {
            this.A.H1(i, z);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: n1 */
        public e l0(boolean z) {
            this.A.l0(z);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public e o1(int i, C10079ur2 c10079ur2, @InterfaceC11300zs1 f fVar) {
            this.A.J1(i, c10079ur2, fVar);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: p0 */
        public e A(C2782Dr2 c2782Dr2) {
            this.A.A(c2782Dr2);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: p1 */
        public e m0(int i, boolean z) {
            this.A.m0(i, z);
            return this;
        }

        @Override // o.C2989Fr2.a
        /* renamed from: q0 */
        public d B() {
            return this.A.B();
        }

        @InterfaceC6181ey
        public e q1(boolean z) {
            this.A.M1(z);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: r0 */
        public e C(C9593sr2 c9593sr2) {
            this.A.C(c9593sr2);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: r1 */
        public e n0(int i, int i2, boolean z) {
            this.A.n0(i, i2, z);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: s0 */
        public e D() {
            this.A.D();
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: s1 */
        public e o0(Context context, boolean z) {
            this.A.o0(context, z);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: t0 */
        public e E(int i) {
            this.A.E(i);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public e u0(int i, C10079ur2 c10079ur2) {
            this.A.K0(i, c10079ur2);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public e v0() {
            this.A.L0();
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public e w0(int i) {
            this.A.M0(i);
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: x0 */
        public e F() {
            this.A.F();
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: y0 */
        public e G() {
            this.A.G();
            return this;
        }

        @Override // o.C2989Fr2.a
        @InterfaceC6181ey
        /* renamed from: z0 */
        public e J(C2989Fr2 c2989Fr2) {
            this.A.J(c2989Fr2);
            return this;
        }

        public e(Context context) {
            this.A = new d.a(context);
        }
    }

    public C7177j10(Context context, InterfaceC6859hi0.b bVar) {
        this(context, d.L(context), bVar);
    }

    public C7177j10(Context context, C2989Fr2 c2989Fr2) {
        this(context, c2989Fr2, new C8920q7.b());
    }

    @Deprecated
    public C7177j10(C2989Fr2 c2989Fr2, InterfaceC6859hi0.b bVar) {
        this(c2989Fr2, bVar, (Context) null);
    }

    public C7177j10(Context context, C2989Fr2 c2989Fr2, InterfaceC6859hi0.b bVar) {
        this(c2989Fr2, bVar, context);
    }

    public C7177j10(C2989Fr2 c2989Fr2, InterfaceC6859hi0.b bVar, @InterfaceC11300zs1 Context context) {
        this.d = new Object();
        this.e = context != null ? context.getApplicationContext() : null;
        this.f = bVar;
        if (c2989Fr2 instanceof d) {
            this.h = (d) c2989Fr2;
        } else {
            this.h = (context == null ? d.p2 : d.L(context)).B().J(c2989Fr2).B();
        }
        this.j = C9546sg.b1;
        boolean z = context != null && TD2.Z0(context);
        this.g = z;
        if (!z && context != null && TD2.a >= 32) {
            this.i = g.g(context);
        }
        if (this.h.i2 && context == null) {
            I31.n(k, l);
        }
    }

    @Override // o.AbstractC3283Ir2
    @InterfaceC11300zs1
    public InterfaceC10712xR1.f d() {
        return this;
    }
}
