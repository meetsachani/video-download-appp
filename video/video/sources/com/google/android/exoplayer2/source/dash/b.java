package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.d;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C10079ur2;
import o.C10323vs;
import o.C10415wE;
import o.C10833xx0;
import o.C11097z20;
import o.C3031Gd2;
import o.C4107Re0;
import o.C4128Rj1;
import o.C4331Tl;
import o.C4896Ze0;
import o.C6067eU;
import o.C7463kC;
import o.C7775lT0;
import o.C7801lb0;
import o.C7935m81;
import o.C8190n7;
import o.C9593sr2;
import o.CC1;
import o.G02;
import o.IX1;
import o.InterfaceC10877y8;
import o.InterfaceC11300zs1;
import o.InterfaceC4261Sr2;
import o.InterfaceC4410Ug1;
import o.InterfaceC6859hi0;
import o.InterfaceC8921q70;
import o.InterfaceC9170r70;
import o.InterfaceC9309rh1;
import o.LZ1;
import o.M11;
import o.ND1;
import o.T11;
import o.TD2;
import o.VI;
import o.ZR1;

@Deprecated
/* loaded from: classes2.dex */
public final class b implements InterfaceC4410Ug1, G02.a<C7463kC<com.google.android.exoplayer2.source.dash.a>>, C7463kC.b<com.google.android.exoplayer2.source.dash.a> {
    public static final Pattern u1 = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern v1 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final int X;
    public final a.InterfaceC0092a Y;
    @InterfaceC11300zs1
    public final C10415wE Y0;
    @InterfaceC11300zs1
    public final InterfaceC4261Sr2 Z;
    public final InterfaceC9170r70 Z0;
    public final M11 a1;
    public final C4331Tl b1;
    public final long c1;
    public final T11 d1;
    public final InterfaceC10877y8 e1;
    public final C10079ur2 f1;
    public final a[] g1;
    public final VI h1;
    public final d i1;
    public final InterfaceC9309rh1.a k1;
    public final InterfaceC8921q70.a l1;
    public final ND1 m1;
    @InterfaceC11300zs1
    public InterfaceC4410Ug1.a n1;
    public G02 q1;
    public C6067eU r1;
    public int s1;
    public List<C4896Ze0> t1;
    public C7463kC<com.google.android.exoplayer2.source.dash.a>[] o1 = F(0);
    public C4107Re0[] p1 = new C4107Re0[0];
    public final IdentityHashMap<C7463kC<com.google.android.exoplayer2.source.dash.a>, d.c> j1 = new IdentityHashMap<>();

    /* loaded from: classes2.dex */
    public static final class a {
        public static final int h = 0;
        public static final int i = 1;
        public static final int j = 2;
        public final int[] a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.google.android.exoplayer2.source.dash.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public @interface InterfaceC0093a {
        }

        public a(int i2, int i3, int[] iArr, int i4, int i5, int i6, int i7) {
            this.b = i2;
            this.a = iArr;
            this.c = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.d = i7;
        }

        public static a a(int[] iArr, int i2) {
            return new a(3, 1, iArr, i2, -1, -1, -1);
        }

        public static a b(int[] iArr, int i2) {
            return new a(5, 1, iArr, i2, -1, -1, -1);
        }

        public static a c(int i2) {
            return new a(5, 2, new int[0], -1, -1, -1, i2);
        }

        public static a d(int i2, int[] iArr, int i3, int i4, int i5) {
            return new a(i2, 0, iArr, i3, i4, i5, -1);
        }
    }

    public b(int i, C6067eU c6067eU, C4331Tl c4331Tl, int i2, a.InterfaceC0092a interfaceC0092a, @InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2, @InterfaceC11300zs1 C10415wE c10415wE, InterfaceC9170r70 interfaceC9170r70, InterfaceC8921q70.a aVar, M11 m11, InterfaceC9309rh1.a aVar2, long j, T11 t11, InterfaceC10877y8 interfaceC10877y8, VI vi, d.b bVar, ND1 nd1) {
        this.X = i;
        this.r1 = c6067eU;
        this.b1 = c4331Tl;
        this.s1 = i2;
        this.Y = interfaceC0092a;
        this.Z = interfaceC4261Sr2;
        this.Y0 = c10415wE;
        this.Z0 = interfaceC9170r70;
        this.l1 = aVar;
        this.a1 = m11;
        this.k1 = aVar2;
        this.c1 = j;
        this.d1 = t11;
        this.e1 = interfaceC10877y8;
        this.h1 = vi;
        this.m1 = nd1;
        this.i1 = new d(c6067eU, bVar, interfaceC10877y8);
        this.q1 = vi.a(this.o1);
        CC1 d = c6067eU.d(i2);
        List<C4896Ze0> list = d.d;
        this.t1 = list;
        Pair<C10079ur2, a[]> v = v(interfaceC9170r70, d.c, list);
        this.f1 = (C10079ur2) v.first;
        this.g1 = (a[]) v.second;
    }

    public static int[][] A(List<C8190n7> list) {
        int i;
        C11097z20 w;
        Integer num;
        int size = list.size();
        HashMap a0 = C7935m81.a0(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            a0.put(Long.valueOf(list.get(i2).a), Integer.valueOf(i2));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i2));
            arrayList.add(arrayList2);
            sparseArray.put(i2, arrayList2);
        }
        for (int i3 = 0; i3 < size; i3++) {
            C8190n7 c8190n7 = list.get(i3);
            C11097z20 y = y(c8190n7.e);
            if (y == null) {
                y = y(c8190n7.f);
            }
            if (y != null && (num = (Integer) a0.get(Long.valueOf(Long.parseLong(y.b)))) != null) {
                i = num.intValue();
            } else {
                i = i3;
            }
            if (i == i3 && (w = w(c8190n7.f)) != null) {
                for (String str : TD2.J1(w.b, ",")) {
                    Integer num2 = (Integer) a0.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null) {
                        i = Math.min(i, num2.intValue());
                    }
                }
            }
            if (i != i3) {
                List list2 = (List) sparseArray.get(i3);
                List list3 = (List) sparseArray.get(i);
                list3.addAll(list2);
                sparseArray.put(i3, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            int[] B = C7775lT0.B((Collection) arrayList.get(i4));
            iArr[i4] = B;
            Arrays.sort(B);
        }
        return iArr;
    }

    public static boolean D(List<C8190n7> list, int[] iArr) {
        for (int i : iArr) {
            List<ZR1> list2 = list.get(i).c;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!list2.get(i2).f.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int E(int i, List<C8190n7> list, int[][] iArr, boolean[] zArr, C10833xx0[][] c10833xx0Arr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (D(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            C10833xx0[] z = z(list, iArr[i3]);
            c10833xx0Arr[i3] = z;
            if (z.length != 0) {
                i2++;
            }
        }
        return i2;
    }

    public static C7463kC<com.google.android.exoplayer2.source.dash.a>[] F(int i) {
        return new C7463kC[i];
    }

    public static C10833xx0[] H(C11097z20 c11097z20, Pattern pattern, C10833xx0 c10833xx0) {
        String str = c11097z20.b;
        if (str == null) {
            return new C10833xx0[]{c10833xx0};
        }
        String[] J1 = TD2.J1(str, ";");
        C10833xx0[] c10833xx0Arr = new C10833xx0[J1.length];
        for (int i = 0; i < J1.length; i++) {
            Matcher matcher = pattern.matcher(J1[i]);
            if (!matcher.matches()) {
                return new C10833xx0[]{c10833xx0};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            C10833xx0.b b = c10833xx0.b();
            c10833xx0Arr[i] = b.U(c10833xx0.X + ":" + parseInt).H(parseInt).X(matcher.group(2)).G();
        }
        return c10833xx0Arr;
    }

    public static void p(List<C4896Ze0> list, C9593sr2[] c9593sr2Arr, a[] aVarArr, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            C4896Ze0 c4896Ze0 = list.get(i2);
            C10833xx0 G = new C10833xx0.b().U(c4896Ze0.a()).g0(C4128Rj1.J0).G();
            c9593sr2Arr[i] = new C9593sr2(c4896Ze0.a() + ":" + i2, G);
            aVarArr[i] = a.c(i2);
            i2++;
            i++;
        }
    }

    public static int t(InterfaceC9170r70 interfaceC9170r70, List<C8190n7> list, int[][] iArr, int i, boolean[] zArr, C10833xx0[][] c10833xx0Arr, C9593sr2[] c9593sr2Arr, a[] aVarArr) {
        String str;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int[] iArr2 = iArr[i4];
            ArrayList arrayList = new ArrayList();
            for (int i6 : iArr2) {
                arrayList.addAll(list.get(i6).c);
            }
            int size = arrayList.size();
            C10833xx0[] c10833xx0Arr2 = new C10833xx0[size];
            for (int i7 = 0; i7 < size; i7++) {
                C10833xx0 c10833xx0 = ((ZR1) arrayList.get(i7)).c;
                c10833xx0Arr2[i7] = c10833xx0.c(interfaceC9170r70.d(c10833xx0));
            }
            C8190n7 c8190n7 = list.get(iArr2[0]);
            long j = c8190n7.a;
            if (j != -1) {
                str = Long.toString(j);
            } else {
                str = "unset:" + i4;
            }
            int i8 = i5 + 1;
            if (zArr[i4]) {
                i2 = i5 + 2;
            } else {
                i2 = i8;
                i8 = -1;
            }
            if (c10833xx0Arr[i4].length != 0) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
                i2 = -1;
            }
            c9593sr2Arr[i5] = new C9593sr2(str, c10833xx0Arr2);
            aVarArr[i5] = a.d(c8190n7.b, iArr2, i5, i8, i2);
            if (i8 != -1) {
                String str2 = str + ":emsg";
                c9593sr2Arr[i8] = new C9593sr2(str2, new C10833xx0.b().U(str2).g0(C4128Rj1.J0).G());
                aVarArr[i8] = a.b(iArr2, i5);
            }
            if (i2 != -1) {
                c9593sr2Arr[i2] = new C9593sr2(str + ":cc", c10833xx0Arr[i4]);
                aVarArr[i2] = a.a(iArr2, i5);
            }
            i4++;
            i5 = i3;
        }
        return i5;
    }

    public static Pair<C10079ur2, a[]> v(InterfaceC9170r70 interfaceC9170r70, List<C8190n7> list, List<C4896Ze0> list2) {
        int[][] A = A(list);
        int length = A.length;
        boolean[] zArr = new boolean[length];
        C10833xx0[][] c10833xx0Arr = new C10833xx0[length];
        int E = E(length, list, A, zArr, c10833xx0Arr) + length + list2.size();
        C9593sr2[] c9593sr2Arr = new C9593sr2[E];
        a[] aVarArr = new a[E];
        p(list2, c9593sr2Arr, aVarArr, t(interfaceC9170r70, list, A, length, zArr, c10833xx0Arr, c9593sr2Arr, aVarArr));
        return Pair.create(new C10079ur2(c9593sr2Arr), aVarArr);
    }

    @InterfaceC11300zs1
    public static C11097z20 w(List<C11097z20> list) {
        return x(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    @InterfaceC11300zs1
    public static C11097z20 x(List<C11097z20> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            C11097z20 c11097z20 = list.get(i);
            if (str.equals(c11097z20.a)) {
                return c11097z20;
            }
        }
        return null;
    }

    @InterfaceC11300zs1
    public static C11097z20 y(List<C11097z20> list) {
        return x(list, "http://dashif.org/guidelines/trickmode");
    }

    public static C10833xx0[] z(List<C8190n7> list, int[] iArr) {
        for (int i : iArr) {
            C8190n7 c8190n7 = list.get(i);
            List<C11097z20> list2 = list.get(i).d;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                C11097z20 c11097z20 = list2.get(i2);
                if ("urn:scte:dash:cc:cea-608:2015".equals(c11097z20.a)) {
                    return H(c11097z20, u1, new C10833xx0.b().g0(C4128Rj1.x0).U(c8190n7.a + ":cea608").G());
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(c11097z20.a)) {
                    return H(c11097z20, v1, new C10833xx0.b().g0(C4128Rj1.y0).U(c8190n7.a + ":cea708").G());
                }
            }
        }
        return new C10833xx0[0];
    }

    public final int B(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.g1[i2].e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.g1[i5].c == 0) {
                return i4;
            }
        }
        return -1;
    }

    public final int[] C(InterfaceC6859hi0[] interfaceC6859hi0Arr) {
        int[] iArr = new int[interfaceC6859hi0Arr.length];
        for (int i = 0; i < interfaceC6859hi0Arr.length; i++) {
            InterfaceC6859hi0 interfaceC6859hi0 = interfaceC6859hi0Arr[i];
            if (interfaceC6859hi0 != null) {
                iArr[i] = this.f1.c(interfaceC6859hi0.n());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }

    @Override // o.G02.a
    /* renamed from: G */
    public void l(C7463kC<com.google.android.exoplayer2.source.dash.a> c7463kC) {
        this.n1.l(this);
    }

    public void I() {
        this.i1.o();
        for (C7463kC<com.google.android.exoplayer2.source.dash.a> c7463kC : this.o1) {
            c7463kC.Q(this);
        }
        this.n1 = null;
    }

    public final void J(InterfaceC6859hi0[] interfaceC6859hi0Arr, boolean[] zArr, IX1[] ix1Arr) {
        for (int i = 0; i < interfaceC6859hi0Arr.length; i++) {
            if (interfaceC6859hi0Arr[i] == null || !zArr[i]) {
                IX1 ix1 = ix1Arr[i];
                if (ix1 instanceof C7463kC) {
                    ((C7463kC) ix1).Q(this);
                } else if (ix1 instanceof C7463kC.a) {
                    ((C7463kC.a) ix1).c();
                }
                ix1Arr[i] = null;
            }
        }
    }

    public final void K(InterfaceC6859hi0[] interfaceC6859hi0Arr, IX1[] ix1Arr, int[] iArr) {
        boolean z;
        for (int i = 0; i < interfaceC6859hi0Arr.length; i++) {
            IX1 ix1 = ix1Arr[i];
            if ((ix1 instanceof C7801lb0) || (ix1 instanceof C7463kC.a)) {
                int B = B(i, iArr);
                if (B == -1) {
                    z = ix1Arr[i] instanceof C7801lb0;
                } else {
                    IX1 ix12 = ix1Arr[i];
                    if ((ix12 instanceof C7463kC.a) && ((C7463kC.a) ix12).X == ix1Arr[B]) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    IX1 ix13 = ix1Arr[i];
                    if (ix13 instanceof C7463kC.a) {
                        ((C7463kC.a) ix13).c();
                    }
                    ix1Arr[i] = null;
                }
            }
        }
    }

    public final void L(InterfaceC6859hi0[] interfaceC6859hi0Arr, IX1[] ix1Arr, boolean[] zArr, long j, int[] iArr) {
        for (int i = 0; i < interfaceC6859hi0Arr.length; i++) {
            InterfaceC6859hi0 interfaceC6859hi0 = interfaceC6859hi0Arr[i];
            if (interfaceC6859hi0 != null) {
                IX1 ix1 = ix1Arr[i];
                if (ix1 == null) {
                    zArr[i] = true;
                    a aVar = this.g1[iArr[i]];
                    int i2 = aVar.c;
                    if (i2 == 0) {
                        ix1Arr[i] = u(aVar, interfaceC6859hi0, j);
                    } else if (i2 == 2) {
                        ix1Arr[i] = new C4107Re0(this.t1.get(aVar.d), interfaceC6859hi0.n().c(0), this.r1.d);
                    }
                } else if (ix1 instanceof C7463kC) {
                    ((com.google.android.exoplayer2.source.dash.a) ((C7463kC) ix1).C()).a(interfaceC6859hi0);
                }
            }
        }
        for (int i3 = 0; i3 < interfaceC6859hi0Arr.length; i3++) {
            if (ix1Arr[i3] == null && interfaceC6859hi0Arr[i3] != null) {
                a aVar2 = this.g1[iArr[i3]];
                if (aVar2.c == 1) {
                    int B = B(i3, iArr);
                    if (B == -1) {
                        ix1Arr[i3] = new C7801lb0();
                    } else {
                        ix1Arr[i3] = ((C7463kC) ix1Arr[B]).T(j, aVar2.b);
                    }
                }
            }
        }
    }

    public void M(C6067eU c6067eU, int i) {
        C4107Re0[] c4107Re0Arr;
        this.r1 = c6067eU;
        this.s1 = i;
        this.i1.q(c6067eU);
        C7463kC<com.google.android.exoplayer2.source.dash.a>[] c7463kCArr = this.o1;
        if (c7463kCArr != null) {
            for (C7463kC<com.google.android.exoplayer2.source.dash.a> c7463kC : c7463kCArr) {
                c7463kC.C().c(c6067eU, i);
            }
            this.n1.l(this);
        }
        this.t1 = c6067eU.d(i).d;
        for (C4107Re0 c4107Re0 : this.p1) {
            Iterator<C4896Ze0> it = this.t1.iterator();
            while (true) {
                if (it.hasNext()) {
                    C4896Ze0 next = it.next();
                    if (next.a().equals(c4107Re0.a())) {
                        boolean z = true;
                        c4107Re0.d(next, (c6067eU.d && i == c6067eU.e() - 1) ? false : false);
                    }
                }
            }
        }
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public boolean a() {
        return this.q1.a();
    }

    @Override // o.C7463kC.b
    public synchronized void b(C7463kC<com.google.android.exoplayer2.source.dash.a> c7463kC) {
        d.c remove = this.j1.remove(c7463kC);
        if (remove != null) {
            remove.n();
        }
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public long c() {
        return this.q1.c();
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public boolean d(long j) {
        return this.q1.d(j);
    }

    @Override // o.InterfaceC4410Ug1
    public long e(long j, LZ1 lz1) {
        C7463kC<com.google.android.exoplayer2.source.dash.a>[] c7463kCArr;
        for (C7463kC<com.google.android.exoplayer2.source.dash.a> c7463kC : this.o1) {
            if (c7463kC.X == 2) {
                return c7463kC.e(j, lz1);
            }
        }
        return j;
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public long f() {
        return this.q1.f();
    }

    @Override // o.InterfaceC4410Ug1, o.G02
    public void g(long j) {
        this.q1.g(j);
    }

    @Override // o.InterfaceC4410Ug1
    public List<C3031Gd2> h(List<InterfaceC6859hi0> list) {
        List<C8190n7> list2 = this.r1.d(this.s1).c;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC6859hi0 interfaceC6859hi0 : list) {
            a aVar = this.g1[this.f1.c(interfaceC6859hi0.n())];
            if (aVar.c == 0) {
                int[] iArr = aVar.a;
                int length = interfaceC6859hi0.length();
                int[] iArr2 = new int[length];
                for (int i = 0; i < interfaceC6859hi0.length(); i++) {
                    iArr2[i] = interfaceC6859hi0.g(i);
                }
                Arrays.sort(iArr2);
                int size = list2.get(iArr[0]).c.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = iArr2[i4];
                    while (true) {
                        int i6 = i3 + size;
                        if (i5 >= i6) {
                            i2++;
                            size = list2.get(iArr[i2]).c.size();
                            i3 = i6;
                        }
                    }
                    arrayList.add(new C3031Gd2(this.s1, iArr[i2], i5 - i3));
                }
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC4410Ug1
    public long i(long j) {
        for (C7463kC<com.google.android.exoplayer2.source.dash.a> c7463kC : this.o1) {
            c7463kC.S(j);
        }
        for (C4107Re0 c4107Re0 : this.p1) {
            c4107Re0.c(j);
        }
        return j;
    }

    @Override // o.InterfaceC4410Ug1
    public long k() {
        return C10323vs.b;
    }

    @Override // o.InterfaceC4410Ug1
    public void m() throws IOException {
        this.d1.b();
    }

    @Override // o.InterfaceC4410Ug1
    public void o(InterfaceC4410Ug1.a aVar, long j) {
        this.n1 = aVar;
        aVar.j(this);
    }

    @Override // o.InterfaceC4410Ug1
    public C10079ur2 q() {
        return this.f1;
    }

    @Override // o.InterfaceC4410Ug1
    public void r(long j, boolean z) {
        for (C7463kC<com.google.android.exoplayer2.source.dash.a> c7463kC : this.o1) {
            c7463kC.r(j, z);
        }
    }

    @Override // o.InterfaceC4410Ug1
    public long s(InterfaceC6859hi0[] interfaceC6859hi0Arr, boolean[] zArr, IX1[] ix1Arr, boolean[] zArr2, long j) {
        int[] C = C(interfaceC6859hi0Arr);
        J(interfaceC6859hi0Arr, zArr, ix1Arr);
        K(interfaceC6859hi0Arr, ix1Arr, C);
        L(interfaceC6859hi0Arr, ix1Arr, zArr2, j, C);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (IX1 ix1 : ix1Arr) {
            if (ix1 instanceof C7463kC) {
                arrayList.add((C7463kC) ix1);
            } else if (ix1 instanceof C4107Re0) {
                arrayList2.add((C4107Re0) ix1);
            }
        }
        C7463kC<com.google.android.exoplayer2.source.dash.a>[] F = F(arrayList.size());
        this.o1 = F;
        arrayList.toArray(F);
        C4107Re0[] c4107Re0Arr = new C4107Re0[arrayList2.size()];
        this.p1 = c4107Re0Arr;
        arrayList2.toArray(c4107Re0Arr);
        this.q1 = this.h1.a(this.o1);
        return j;
    }

    public final C7463kC<com.google.android.exoplayer2.source.dash.a> u(a aVar, InterfaceC6859hi0 interfaceC6859hi0, long j) {
        boolean z;
        int i;
        C9593sr2 c9593sr2;
        boolean z2;
        C9593sr2 c9593sr22;
        int i2;
        int i3 = aVar.f;
        if (i3 != -1) {
            z = true;
        } else {
            z = false;
        }
        d.c cVar = null;
        if (z) {
            c9593sr2 = this.f1.b(i3);
            i = 1;
        } else {
            i = 0;
            c9593sr2 = null;
        }
        int i4 = aVar.g;
        if (i4 != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            c9593sr22 = this.f1.b(i4);
            i += c9593sr22.X;
        } else {
            c9593sr22 = null;
        }
        C10833xx0[] c10833xx0Arr = new C10833xx0[i];
        int[] iArr = new int[i];
        if (z) {
            c10833xx0Arr[0] = c9593sr2.c(0);
            iArr[0] = 5;
            i2 = 1;
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            for (int i5 = 0; i5 < c9593sr22.X; i5++) {
                C10833xx0 c = c9593sr22.c(i5);
                c10833xx0Arr[i2] = c;
                iArr[i2] = 3;
                arrayList.add(c);
                i2++;
            }
        }
        if (this.r1.d && z) {
            cVar = this.i1.k();
        }
        d.c cVar2 = cVar;
        C7463kC<com.google.android.exoplayer2.source.dash.a> c7463kC = new C7463kC<>(aVar.b, iArr, c10833xx0Arr, this.Y.a(this.d1, this.r1, this.b1, this.s1, aVar.a, interfaceC6859hi0, aVar.b, this.c1, z, arrayList, cVar2, this.Z, this.m1, this.Y0), this, this.e1, j, this.Z0, this.l1, this.a1, this.k1);
        synchronized (this) {
            this.j1.put(c7463kC, cVar2);
        }
        return c7463kC;
    }
}
