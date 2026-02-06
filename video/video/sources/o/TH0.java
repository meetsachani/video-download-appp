package o;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import o.C10833xx0;
import o.C6020eI0;
import o.InterfaceC4410Ug1;
import o.InterfaceC8921q70;
import o.InterfaceC9309rh1;
import o.M11;
import o.VH0;
import o.ZH0;

@Deprecated
/* loaded from: classes2.dex */
public final class TH0 implements InterfaceC4410Ug1, ZH0.b {
    public final PH0 X;
    public final ZH0 Y;
    @InterfaceC11300zs1
    public final InterfaceC4261Sr2 Y0;
    public final NH0 Z;
    @InterfaceC11300zs1
    public final C10415wE Z0;
    public final InterfaceC9170r70 a1;
    public final InterfaceC8921q70.a b1;
    public final M11 c1;
    public final InterfaceC9309rh1.a d1;
    public final InterfaceC10877y8 e1;
    public final VI h1;
    public final boolean i1;
    public final int j1;
    public final boolean k1;
    public final ND1 l1;
    public final long n1;
    @InterfaceC11300zs1
    public InterfaceC4410Ug1.a o1;
    public int p1;
    public C10079ur2 q1;
    public int u1;
    public G02 v1;
    public final C6020eI0.b m1 = new b();
    public final IdentityHashMap<IX1, Integer> f1 = new IdentityHashMap<>();
    public final C10314vp2 g1 = new C10314vp2();
    public C6020eI0[] r1 = new C6020eI0[0];
    public C6020eI0[] s1 = new C6020eI0[0];
    public int[][] t1 = new int[0];

    /* loaded from: classes2.dex */
    public class b implements C6020eI0.b {
        public b() {
        }

        @Override // o.G02.a
        /* renamed from: a */
        public void l(C6020eI0 c6020eI0) {
            TH0.this.o1.l(TH0.this);
        }

        @Override // o.C6020eI0.b
        public void n(Uri uri) {
            TH0.this.Y.e(uri);
        }

        @Override // o.C6020eI0.b
        public void onPrepared() {
            C6020eI0[] c6020eI0Arr;
            if (TH0.l(TH0.this) <= 0) {
                int i = 0;
                for (C6020eI0 c6020eI0 : TH0.this.r1) {
                    i += c6020eI0.q().X;
                }
                C9593sr2[] c9593sr2Arr = new C9593sr2[i];
                int i2 = 0;
                for (C6020eI0 c6020eI02 : TH0.this.r1) {
                    int i3 = c6020eI02.q().X;
                    int i4 = 0;
                    while (i4 < i3) {
                        c9593sr2Arr[i2] = c6020eI02.q().b(i4);
                        i4++;
                        i2++;
                    }
                }
                TH0.this.q1 = new C10079ur2(c9593sr2Arr);
                TH0.this.o1.j(TH0.this);
            }
        }
    }

    public TH0(PH0 ph0, ZH0 zh0, NH0 nh0, @InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2, @InterfaceC11300zs1 C10415wE c10415wE, InterfaceC9170r70 interfaceC9170r70, InterfaceC8921q70.a aVar, M11 m11, InterfaceC9309rh1.a aVar2, InterfaceC10877y8 interfaceC10877y8, VI vi, boolean z, int i, boolean z2, ND1 nd1, long j) {
        this.X = ph0;
        this.Y = zh0;
        this.Z = nh0;
        this.Y0 = interfaceC4261Sr2;
        this.Z0 = c10415wE;
        this.a1 = interfaceC9170r70;
        this.b1 = aVar;
        this.c1 = m11;
        this.d1 = aVar2;
        this.e1 = interfaceC10877y8;
        this.h1 = vi;
        this.i1 = z;
        this.j1 = i;
        this.k1 = z2;
        this.l1 = nd1;
        this.n1 = j;
        this.v1 = vi.a(new G02[0]);
    }

    public static Map<String, C6960i70> A(List<C6960i70> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < arrayList.size()) {
            C6960i70 c6960i70 = list.get(i);
            String str = c6960i70.Z;
            i++;
            int i2 = i;
            while (i2 < arrayList.size()) {
                C6960i70 c6960i702 = (C6960i70) arrayList.get(i2);
                if (TextUtils.equals(c6960i702.Z, str)) {
                    c6960i70 = c6960i70.f(c6960i702);
                    arrayList.remove(i2);
                } else {
                    i2++;
                }
            }
            hashMap.put(str, c6960i70);
        }
        return hashMap;
    }

    public static C10833xx0 B(C10833xx0 c10833xx0) {
        String Y = TD2.Y(c10833xx0.d1, 2);
        return new C10833xx0.b().U(c10833xx0.X).W(c10833xx0.Y).M(c10833xx0.f1).g0(C4128Rj1.g(Y)).K(Y).Z(c10833xx0.e1).I(c10833xx0.a1).b0(c10833xx0.b1).n0(c10833xx0.l1).S(c10833xx0.m1).R(c10833xx0.n1).i0(c10833xx0.Y0).e0(c10833xx0.Z0).G();
    }

    public static /* synthetic */ int l(TH0 th0) {
        int i = th0.p1 - 1;
        th0.p1 = i;
        return i;
    }

    public static C10833xx0 z(C10833xx0 c10833xx0, @InterfaceC11300zs1 C10833xx0 c10833xx02, boolean z) {
        String Y;
        C4224Si1 c4224Si1;
        int i;
        String str;
        int i2;
        int i3;
        String str2;
        int i4;
        int i5 = -1;
        if (c10833xx02 != null) {
            Y = c10833xx02.d1;
            c4224Si1 = c10833xx02.e1;
            i2 = c10833xx02.t1;
            i = c10833xx02.Y0;
            i3 = c10833xx02.Z0;
            str = c10833xx02.Z;
            str2 = c10833xx02.Y;
        } else {
            Y = TD2.Y(c10833xx0.d1, 1);
            c4224Si1 = c10833xx0.e1;
            if (z) {
                i2 = c10833xx0.t1;
                i = c10833xx0.Y0;
                i3 = c10833xx0.Z0;
                str = c10833xx0.Z;
                str2 = c10833xx0.Y;
            } else {
                i = 0;
                str = null;
                i2 = -1;
                i3 = 0;
                str2 = null;
            }
        }
        String g = C4128Rj1.g(Y);
        if (z) {
            i4 = c10833xx0.a1;
        } else {
            i4 = -1;
        }
        if (z) {
            i5 = c10833xx0.b1;
        }
        return new C10833xx0.b().U(c10833xx0.X).W(str2).M(c10833xx0.f1).g0(g).K(Y).Z(c4224Si1).I(i4).b0(i5).J(i2).i0(i).e0(i3).X(str).G();
    }

    public void C() {
        this.Y.g(this);
        for (C6020eI0 c6020eI0 : this.r1) {
            c6020eI0.h0();
        }
        this.o1 = null;
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public boolean a() {
        return this.v1.a();
    }

    @Override // o.ZH0.b
    public boolean b(Uri uri, M11.d dVar, boolean z) {
        boolean z2 = true;
        for (C6020eI0 c6020eI0 : this.r1) {
            z2 &= c6020eI0.c0(uri, dVar, z);
        }
        this.o1.l(this);
        return z2;
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public long c() {
        return this.v1.c();
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public boolean d(long j) {
        if (this.q1 == null) {
            for (C6020eI0 c6020eI0 : this.r1) {
                c6020eI0.A();
            }
            return false;
        }
        return this.v1.d(j);
    }

    @Override // o.InterfaceC4410Ug1
    public long e(long j, LZ1 lz1) {
        C6020eI0[] c6020eI0Arr;
        for (C6020eI0 c6020eI0 : this.s1) {
            if (c6020eI0.T()) {
                return c6020eI0.e(j, lz1);
            }
        }
        return j;
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public long f() {
        return this.v1.f();
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public void g(long j) {
        this.v1.g(j);
    }

    @Override // o.InterfaceC4410Ug1
    public List<C3031Gd2> h(List<InterfaceC6859hi0> list) {
        int[] iArr;
        C10079ur2 c10079ur2;
        int i;
        int i2;
        int i3;
        TH0 th0 = this;
        VH0 vh0 = (VH0) C9542sf.g(th0.Y.d());
        boolean isEmpty = vh0.e.isEmpty();
        int i4 = !isEmpty;
        int length = th0.r1.length - vh0.h.size();
        int i5 = 0;
        if (!isEmpty) {
            C6020eI0 c6020eI0 = th0.r1[0];
            iArr = th0.t1[0];
            c10079ur2 = c6020eI0.q();
            i = c6020eI0.L();
        } else {
            iArr = new int[0];
            c10079ur2 = C10079ur2.Z0;
            i = 0;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        for (InterfaceC6859hi0 interfaceC6859hi0 : list) {
            C9593sr2 n = interfaceC6859hi0.n();
            int c = c10079ur2.c(n);
            if (c != -1) {
                if (c == i) {
                    for (int i6 = i5; i6 < interfaceC6859hi0.length(); i6++) {
                        arrayList.add(new C3031Gd2(i5, iArr[interfaceC6859hi0.g(i6)]));
                    }
                    i2 = i5;
                    z2 = true;
                } else {
                    i2 = i5;
                    z = true;
                }
            } else {
                int i7 = i4;
                i2 = i5;
                while (true) {
                    C6020eI0[] c6020eI0Arr = th0.r1;
                    if (i7 >= c6020eI0Arr.length) {
                        break;
                    } else if (c6020eI0Arr[i7].q().c(n) != -1) {
                        if (i7 < length) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                        int[] iArr2 = th0.t1[i7];
                        for (int i8 = i2; i8 < interfaceC6859hi0.length(); i8++) {
                            arrayList.add(new C3031Gd2(i3, iArr2[interfaceC6859hi0.g(i8)]));
                        }
                    } else {
                        i7++;
                        th0 = this;
                    }
                }
            }
            th0 = this;
            i5 = i2;
        }
        int i9 = i5;
        if (z && !z2) {
            int i10 = iArr[i9];
            int i11 = vh0.e.get(i10).b.c1;
            for (int i12 = 1; i12 < iArr.length; i12++) {
                int i13 = vh0.e.get(iArr[i12]).b.c1;
                if (i13 < i11) {
                    i10 = iArr[i12];
                    i11 = i13;
                }
            }
            arrayList.add(new C3031Gd2(i9, i10));
        }
        return arrayList;
    }

    @Override // o.InterfaceC4410Ug1
    public long i(long j) {
        C6020eI0[] c6020eI0Arr = this.s1;
        if (c6020eI0Arr.length > 0) {
            boolean k0 = c6020eI0Arr[0].k0(j, false);
            int i = 1;
            while (true) {
                C6020eI0[] c6020eI0Arr2 = this.s1;
                if (i >= c6020eI0Arr2.length) {
                    break;
                }
                c6020eI0Arr2[i].k0(j, k0);
                i++;
            }
            if (k0) {
                this.g1.b();
            }
        }
        return j;
    }

    @Override // o.ZH0.b
    public void j() {
        for (C6020eI0 c6020eI0 : this.r1) {
            c6020eI0.d0();
        }
        this.o1.l(this);
    }

    @Override // o.InterfaceC4410Ug1
    public long k() {
        return C10323vs.b;
    }

    @Override // o.InterfaceC4410Ug1
    public void m() throws IOException {
        for (C6020eI0 c6020eI0 : this.r1) {
            c6020eI0.m();
        }
    }

    @Override // o.InterfaceC4410Ug1
    public void o(InterfaceC4410Ug1.a aVar, long j) {
        this.o1 = aVar;
        this.Y.b(this);
        x(j);
    }

    @Override // o.InterfaceC4410Ug1
    public C10079ur2 q() {
        return (C10079ur2) C9542sf.g(this.q1);
    }

    @Override // o.InterfaceC4410Ug1
    public void r(long j, boolean z) {
        for (C6020eI0 c6020eI0 : this.s1) {
            c6020eI0.r(j, z);
        }
    }

    @Override // o.InterfaceC4410Ug1
    public long s(InterfaceC6859hi0[] interfaceC6859hi0Arr, boolean[] zArr, IX1[] ix1Arr, boolean[] zArr2, long j) {
        boolean z;
        boolean z2;
        IX1 ix1;
        int intValue;
        int[] iArr = new int[interfaceC6859hi0Arr.length];
        int[] iArr2 = new int[interfaceC6859hi0Arr.length];
        for (int i = 0; i < interfaceC6859hi0Arr.length; i++) {
            IX1 ix12 = ix1Arr[i];
            if (ix12 == null) {
                intValue = -1;
            } else {
                intValue = this.f1.get(ix12).intValue();
            }
            iArr[i] = intValue;
            iArr2[i] = -1;
            InterfaceC6859hi0 interfaceC6859hi0 = interfaceC6859hi0Arr[i];
            if (interfaceC6859hi0 != null) {
                C9593sr2 n = interfaceC6859hi0.n();
                int i2 = 0;
                while (true) {
                    C6020eI0[] c6020eI0Arr = this.r1;
                    if (i2 >= c6020eI0Arr.length) {
                        break;
                    } else if (c6020eI0Arr[i2].q().c(n) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        this.f1.clear();
        int length = interfaceC6859hi0Arr.length;
        IX1[] ix1Arr2 = new IX1[length];
        IX1[] ix1Arr3 = new IX1[interfaceC6859hi0Arr.length];
        InterfaceC6859hi0[] interfaceC6859hi0Arr2 = new InterfaceC6859hi0[interfaceC6859hi0Arr.length];
        C6020eI0[] c6020eI0Arr2 = new C6020eI0[this.r1.length];
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        while (i3 < this.r1.length) {
            for (int i5 = 0; i5 < interfaceC6859hi0Arr.length; i5++) {
                InterfaceC6859hi0 interfaceC6859hi02 = null;
                if (iArr[i5] == i3) {
                    ix1 = ix1Arr[i5];
                } else {
                    ix1 = null;
                }
                ix1Arr3[i5] = ix1;
                if (iArr2[i5] == i3) {
                    interfaceC6859hi02 = interfaceC6859hi0Arr[i5];
                }
                interfaceC6859hi0Arr2[i5] = interfaceC6859hi02;
            }
            C6020eI0 c6020eI0 = this.r1[i3];
            int[] iArr3 = iArr;
            int i6 = i3;
            int i7 = i4;
            boolean l0 = c6020eI0.l0(interfaceC6859hi0Arr2, zArr, ix1Arr3, zArr2, j, z3);
            boolean z4 = false;
            for (int i8 = 0; i8 < interfaceC6859hi0Arr.length; i8++) {
                IX1 ix13 = ix1Arr3[i8];
                if (iArr2[i8] == i6) {
                    C9542sf.g(ix13);
                    ix1Arr2[i8] = ix13;
                    this.f1.put(ix13, Integer.valueOf(i6));
                    z4 = true;
                } else if (iArr3[i8] == i6) {
                    if (ix13 == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C9542sf.i(z2);
                }
            }
            if (z4) {
                c6020eI0Arr2[i7] = c6020eI0;
                i4 = i7 + 1;
                if (i7 == 0) {
                    c6020eI0.o0(true);
                    if (!l0) {
                        C6020eI0[] c6020eI0Arr3 = this.s1;
                        if (c6020eI0Arr3.length != 0 && c6020eI0 == c6020eI0Arr3[0]) {
                        }
                    }
                    this.g1.b();
                    z3 = true;
                } else {
                    if (i6 < this.u1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c6020eI0.o0(z);
                }
            } else {
                i4 = i7;
            }
            i3 = i6 + 1;
            iArr = iArr3;
        }
        System.arraycopy(ix1Arr2, 0, ix1Arr, 0, length);
        C6020eI0[] c6020eI0Arr4 = (C6020eI0[]) TD2.p1(c6020eI0Arr2, i4);
        this.s1 = c6020eI0Arr4;
        this.v1 = this.h1.a(c6020eI0Arr4);
        return j;
    }

    public final void v(long j, List<VH0.a> list, List<C6020eI0> list2, List<int[]> list3, Map<String, C6960i70> map) {
        boolean z;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z2 = true;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (TD2.g(str, list.get(i2).d)) {
                        VH0.a aVar = list.get(i2);
                        arrayList3.add(Integer.valueOf(i2));
                        arrayList.add(aVar.a);
                        arrayList2.add(aVar.b);
                        if (TD2.X(aVar.b.d1, 1) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 &= z;
                    }
                }
                String str2 = "audio:" + str;
                C6020eI0 y = y(str2, 1, (Uri[]) arrayList.toArray((Uri[]) TD2.p(new Uri[0])), (C10833xx0[]) arrayList2.toArray(new C10833xx0[0]), null, Collections.EMPTY_LIST, map, j);
                list3.add(C7775lT0.B(arrayList3));
                list2.add(y);
                if (this.i1 && z2) {
                    y.f0(new C9593sr2[]{new C9593sr2(str2, (C10833xx0[]) arrayList2.toArray(new C10833xx0[0]))}, 0, new int[0]);
                }
            }
        }
    }

    public final void w(VH0 vh0, long j, List<C6020eI0> list, List<int[]> list2, Map<String, C6960i70> map) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int size = vh0.e.size();
        int[] iArr = new int[size];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < vh0.e.size(); i4++) {
            C10833xx0 c10833xx0 = vh0.e.get(i4).b;
            if (c10833xx0.m1 <= 0 && TD2.Y(c10833xx0.d1, 2) == null) {
                if (TD2.Y(c10833xx0.d1, 1) != null) {
                    iArr[i4] = 1;
                    i3++;
                } else {
                    iArr[i4] = -1;
                }
            } else {
                iArr[i4] = 2;
                i2++;
            }
        }
        if (i2 > 0) {
            size = i2;
            z = true;
            z2 = false;
        } else if (i3 < size) {
            size -= i3;
            z = false;
            z2 = true;
        } else {
            z = false;
            z2 = false;
        }
        Uri[] uriArr = new Uri[size];
        C10833xx0[] c10833xx0Arr = new C10833xx0[size];
        int[] iArr2 = new int[size];
        int i5 = 0;
        for (int i6 = 0; i6 < vh0.e.size(); i6++) {
            if ((!z || iArr[i6] == 2) && (!z2 || iArr[i6] != 1)) {
                VH0.b bVar = vh0.e.get(i6);
                uriArr[i5] = bVar.a;
                c10833xx0Arr[i5] = bVar.b;
                iArr2[i5] = i6;
                i5++;
            }
        }
        String str = c10833xx0Arr[0].d1;
        int X = TD2.X(str, 2);
        int X2 = TD2.X(str, 1);
        if ((X2 == 1 || (X2 == 0 && vh0.g.isEmpty())) && X <= 1 && X2 + X > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z && X2 > 0) {
            i = 1;
        } else {
            i = 0;
        }
        C6020eI0 y = y("main", i, uriArr, c10833xx0Arr, vh0.j, vh0.k, map, j);
        list.add(y);
        list2.add(iArr2);
        if (this.i1 && z3) {
            ArrayList arrayList = new ArrayList();
            if (X > 0) {
                C10833xx0[] c10833xx0Arr2 = new C10833xx0[size];
                for (int i7 = 0; i7 < size; i7++) {
                    c10833xx0Arr2[i7] = B(c10833xx0Arr[i7]);
                }
                arrayList.add(new C9593sr2("main", c10833xx0Arr2));
                if (X2 > 0 && (vh0.j != null || vh0.g.isEmpty())) {
                    arrayList.add(new C9593sr2("main:audio", z(c10833xx0Arr[0], vh0.j, false)));
                }
                List<C10833xx0> list3 = vh0.k;
                if (list3 != null) {
                    for (int i8 = 0; i8 < list3.size(); i8++) {
                        arrayList.add(new C9593sr2("main:cc:" + i8, list3.get(i8)));
                    }
                }
            } else {
                C10833xx0[] c10833xx0Arr3 = new C10833xx0[size];
                for (int i9 = 0; i9 < size; i9++) {
                    c10833xx0Arr3[i9] = z(c10833xx0Arr[i9], vh0.j, true);
                }
                arrayList.add(new C9593sr2("main", c10833xx0Arr3));
            }
            C9593sr2 c9593sr2 = new C9593sr2("main:id3", new C10833xx0.b().U("ID3").g0(C4128Rj1.w0).G());
            arrayList.add(c9593sr2);
            y.f0((C9593sr2[]) arrayList.toArray(new C9593sr2[0]), 0, arrayList.indexOf(c9593sr2));
        }
    }

    public final void x(long j) {
        Map<String, C6960i70> map;
        VH0 vh0 = (VH0) C9542sf.g(this.Y.d());
        if (this.k1) {
            map = A(vh0.m);
        } else {
            map = Collections.EMPTY_MAP;
        }
        Map<String, C6960i70> map2 = map;
        boolean isEmpty = vh0.e.isEmpty();
        List<VH0.a> list = vh0.g;
        List<VH0.a> list2 = vh0.h;
        this.p1 = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!isEmpty) {
            w(vh0, j, arrayList, arrayList2, map2);
        }
        v(j, list, arrayList, arrayList2, map2);
        this.u1 = arrayList.size();
        for (int i = 0; i < list2.size(); i++) {
            VH0.a aVar = list2.get(i);
            String str = "subtitle:" + i + ":" + aVar.d;
            Map<String, C6960i70> map3 = map2;
            C6020eI0 y = y(str, 3, new Uri[]{aVar.a}, new C10833xx0[]{aVar.b}, null, Collections.EMPTY_LIST, map3, j);
            map2 = map3;
            arrayList2.add(new int[]{i});
            arrayList.add(y);
            y.f0(new C9593sr2[]{new C9593sr2(str, aVar.b)}, 0, new int[0]);
        }
        this.r1 = (C6020eI0[]) arrayList.toArray(new C6020eI0[0]);
        this.t1 = (int[][]) arrayList2.toArray(new int[0]);
        this.p1 = this.r1.length;
        for (int i2 = 0; i2 < this.u1; i2++) {
            this.r1[i2].o0(true);
        }
        for (C6020eI0 c6020eI0 : this.r1) {
            c6020eI0.A();
        }
        this.s1 = this.r1;
    }

    public final C6020eI0 y(String str, int i, Uri[] uriArr, C10833xx0[] c10833xx0Arr, @InterfaceC11300zs1 C10833xx0 c10833xx0, @InterfaceC11300zs1 List<C10833xx0> list, Map<String, C6960i70> map, long j) {
        return new C6020eI0(str, i, this.m1, new MH0(this.X, this.Y, uriArr, c10833xx0Arr, this.Z, this.Y0, this.g1, this.n1, list, this.l1, this.Z0), map, this.e1, j, c10833xx0, this.a1, this.b1, this.c1, this.d1, this.j1);
    }
}
