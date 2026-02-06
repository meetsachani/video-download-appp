package o;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import java.util.ArrayList;
import o.AbstractC5317bO0;
import o.AbstractC7373jp2;
import o.C8322nf1;
import o.InterfaceC8368nr;
import o.J6;

@Deprecated
/* renamed from: o.jp2 */
/* loaded from: classes2.dex */
public abstract class AbstractC7373jp2 implements InterfaceC8368nr {
    public static final AbstractC7373jp2 X = new a();
    public static final String Y = TD2.R0(0);
    public static final String Z = TD2.R0(1);
    public static final String Y0 = TD2.R0(2);
    public static final InterfaceC8368nr.a<AbstractC7373jp2> Z0 = new InterfaceC8368nr.a() { // from class: o.ip2
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            return AbstractC7373jp2.a(bundle);
        }
    };

    /* renamed from: o.jp2$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractC7373jp2 {
        @Override // o.AbstractC7373jp2
        public int g(Object obj) {
            return -1;
        }

        @Override // o.AbstractC7373jp2
        public b l(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // o.AbstractC7373jp2
        public int n() {
            return 0;
        }

        @Override // o.AbstractC7373jp2
        public Object t(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // o.AbstractC7373jp2
        public d v(int i, d dVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // o.AbstractC7373jp2
        public int w() {
            return 0;
        }
    }

    /* renamed from: o.jp2$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8368nr {
        public static final String c1 = TD2.R0(0);
        public static final String d1 = TD2.R0(1);
        public static final String e1 = TD2.R0(2);
        public static final String f1 = TD2.R0(3);
        public static final String g1 = TD2.R0(4);
        public static final InterfaceC8368nr.a<b> h1 = new InterfaceC8368nr.a() { // from class: o.kp2
            @Override // o.InterfaceC8368nr.a
            public final InterfaceC8368nr a(Bundle bundle) {
                return AbstractC7373jp2.b.a(bundle);
            }
        };
        @InterfaceC11300zs1
        public Object X;
        @InterfaceC11300zs1
        public Object Y;
        public long Y0;
        public int Z;
        public long Z0;
        public boolean a1;
        public J6 b1 = J6.g1;

        public static /* synthetic */ b a(Bundle bundle) {
            return c(bundle);
        }

        public static b c(Bundle bundle) {
            J6 j6;
            int i = bundle.getInt(c1, 0);
            long j = bundle.getLong(d1, C10323vs.b);
            long j2 = bundle.getLong(e1, 0L);
            boolean z = bundle.getBoolean(f1, false);
            Bundle bundle2 = bundle.getBundle(g1);
            if (bundle2 != null) {
                j6 = J6.m1.a(bundle2);
            } else {
                j6 = J6.g1;
            }
            J6 j62 = j6;
            b bVar = new b();
            bVar.z(null, null, i, j, j2, j62, z);
            return bVar;
        }

        public int d(int i) {
            return this.b1.g(i).Y;
        }

        @Override // o.InterfaceC8368nr
        public Bundle e() {
            Bundle bundle = new Bundle();
            int i = this.Z;
            if (i != 0) {
                bundle.putInt(c1, i);
            }
            long j = this.Y0;
            if (j != C10323vs.b) {
                bundle.putLong(d1, j);
            }
            long j2 = this.Z0;
            if (j2 != 0) {
                bundle.putLong(e1, j2);
            }
            boolean z = this.a1;
            if (z) {
                bundle.putBoolean(f1, z);
            }
            if (!this.b1.equals(J6.g1)) {
                bundle.putBundle(g1, this.b1.e());
            }
            return bundle;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (TD2.g(this.X, bVar.X) && TD2.g(this.Y, bVar.Y) && this.Z == bVar.Z && this.Y0 == bVar.Y0 && this.Z0 == bVar.Z0 && this.a1 == bVar.a1 && TD2.g(this.b1, bVar.b1)) {
                    return true;
                }
            }
            return false;
        }

        public long f(int i, int i2) {
            J6.b g = this.b1.g(i);
            if (g.Y != -1) {
                return g.a1[i2];
            }
            return C10323vs.b;
        }

        public int g() {
            return this.b1.Y;
        }

        public int h(long j) {
            return this.b1.h(j, this.Y0);
        }

        public int hashCode() {
            int hashCode;
            Object obj = this.X;
            int i = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i2 = (217 + hashCode) * 31;
            Object obj2 = this.Y;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            long j = this.Y0;
            long j2 = this.Z0;
            return ((((((((((i2 + i) * 31) + this.Z) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.a1 ? 1 : 0)) * 31) + this.b1.hashCode();
        }

        public int i(long j) {
            return this.b1.i(j, this.Y0);
        }

        public long j(int i) {
            return this.b1.g(i).X;
        }

        public long k() {
            return this.b1.Z;
        }

        public int l(int i, int i2) {
            J6.b g = this.b1.g(i);
            if (g.Y != -1) {
                return g.Z0[i2];
            }
            return 0;
        }

        @InterfaceC11300zs1
        public Object m() {
            return this.b1.X;
        }

        public long n(int i) {
            return this.b1.g(i).b1;
        }

        public long o() {
            return TD2.b2(this.Y0);
        }

        public long p() {
            return this.Y0;
        }

        public int q(int i) {
            return this.b1.g(i).g();
        }

        public int r(int i, int i2) {
            return this.b1.g(i).h(i2);
        }

        public long s() {
            return TD2.b2(this.Z0);
        }

        public long t() {
            return this.Z0;
        }

        public int u() {
            return this.b1.Z0;
        }

        public boolean v(int i) {
            return !this.b1.g(i).i();
        }

        public boolean w(int i) {
            if (i == g() - 1 && this.b1.k(i)) {
                return true;
            }
            return false;
        }

        public boolean x(int i) {
            return this.b1.g(i).c1;
        }

        @InterfaceC6181ey
        public b y(@InterfaceC11300zs1 Object obj, @InterfaceC11300zs1 Object obj2, int i, long j, long j2) {
            return z(obj, obj2, i, j, j2, J6.g1, false);
        }

        @InterfaceC6181ey
        public b z(@InterfaceC11300zs1 Object obj, @InterfaceC11300zs1 Object obj2, int i, long j, long j2, J6 j6, boolean z) {
            this.X = obj;
            this.Y = obj2;
            this.Z = i;
            this.Y0 = j;
            this.Z0 = j2;
            this.b1 = j6;
            this.a1 = z;
            return this;
        }
    }

    /* renamed from: o.jp2$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC7373jp2 {
        public final AbstractC5317bO0<d> a1;
        public final AbstractC5317bO0<b> b1;
        public final int[] c1;
        public final int[] d1;

        public c(AbstractC5317bO0<d> abstractC5317bO0, AbstractC5317bO0<b> abstractC5317bO02, int[] iArr) {
            boolean z;
            if (abstractC5317bO0.size() == iArr.length) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            this.a1 = abstractC5317bO0;
            this.b1 = abstractC5317bO02;
            this.c1 = iArr;
            this.d1 = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.d1[iArr[i]] = i;
            }
        }

        @Override // o.AbstractC7373jp2
        public int f(boolean z) {
            if (x()) {
                return -1;
            }
            if (!z) {
                return 0;
            }
            return this.c1[0];
        }

        @Override // o.AbstractC7373jp2
        public int g(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC7373jp2
        public int h(boolean z) {
            if (x()) {
                return -1;
            }
            if (z) {
                return this.c1[w() - 1];
            }
            return w() - 1;
        }

        @Override // o.AbstractC7373jp2
        public int j(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i == h(z)) {
                if (i2 == 2) {
                    return f(z);
                }
                return -1;
            } else if (z) {
                return this.c1[this.d1[i] + 1];
            } else {
                return i + 1;
            }
        }

        @Override // o.AbstractC7373jp2
        public b l(int i, b bVar, boolean z) {
            b bVar2 = this.b1.get(i);
            bVar.z(bVar2.X, bVar2.Y, bVar2.Z, bVar2.Y0, bVar2.Z0, bVar2.b1, bVar2.a1);
            return bVar;
        }

        @Override // o.AbstractC7373jp2
        public int n() {
            return this.b1.size();
        }

        @Override // o.AbstractC7373jp2
        public int s(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i == f(z)) {
                if (i2 == 2) {
                    return h(z);
                }
                return -1;
            } else if (z) {
                return this.c1[this.d1[i] - 1];
            } else {
                return i - 1;
            }
        }

        @Override // o.AbstractC7373jp2
        public Object t(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // o.AbstractC7373jp2
        public d v(int i, d dVar, long j) {
            d dVar2 = this.a1.get(i);
            dVar.l(dVar2.X, dVar2.Z, dVar2.Y0, dVar2.Z0, dVar2.a1, dVar2.b1, dVar2.c1, dVar2.d1, dVar2.f1, dVar2.h1, dVar2.i1, dVar2.j1, dVar2.k1, dVar2.l1);
            dVar.g1 = dVar2.g1;
            return dVar;
        }

        @Override // o.AbstractC7373jp2
        public int w() {
            return this.a1.size();
        }
    }

    /* renamed from: o.jp2$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8368nr {
        @InterfaceC11300zs1
        @Deprecated
        public Object Y;
        @InterfaceC11300zs1
        public Object Y0;
        public long Z0;
        public long a1;
        public long b1;
        public boolean c1;
        public boolean d1;
        @Deprecated
        public boolean e1;
        @InterfaceC11300zs1
        public C8322nf1.g f1;
        public boolean g1;
        public long h1;
        public long i1;
        public int j1;
        public int k1;
        public long l1;
        public static final Object m1 = new Object();
        public static final Object n1 = new Object();
        public static final C8322nf1 o1 = new C8322nf1.c().D("com.google.android.exoplayer2.Timeline").L(Uri.EMPTY).a();
        public static final String p1 = TD2.R0(1);
        public static final String q1 = TD2.R0(2);
        public static final String r1 = TD2.R0(3);
        public static final String s1 = TD2.R0(4);
        public static final String t1 = TD2.R0(5);
        public static final String u1 = TD2.R0(6);
        public static final String v1 = TD2.R0(7);
        public static final String w1 = TD2.R0(8);
        public static final String x1 = TD2.R0(9);
        public static final String y1 = TD2.R0(10);
        public static final String z1 = TD2.R0(11);
        public static final String A1 = TD2.R0(12);
        public static final String B1 = TD2.R0(13);
        public static final InterfaceC8368nr.a<d> C1 = new InterfaceC8368nr.a() { // from class: o.lp2
            @Override // o.InterfaceC8368nr.a
            public final InterfaceC8368nr a(Bundle bundle) {
                return AbstractC7373jp2.d.a(bundle);
            }
        };
        public Object X = m1;
        public C8322nf1 Z = o1;

        public static /* synthetic */ d a(Bundle bundle) {
            return b(bundle);
        }

        public static d b(Bundle bundle) {
            C8322nf1 c8322nf1;
            C8322nf1.g gVar;
            Bundle bundle2 = bundle.getBundle(p1);
            if (bundle2 != null) {
                c8322nf1 = C8322nf1.l1.a(bundle2);
            } else {
                c8322nf1 = C8322nf1.e1;
            }
            C8322nf1 c8322nf12 = c8322nf1;
            long j = bundle.getLong(q1, C10323vs.b);
            long j2 = bundle.getLong(r1, C10323vs.b);
            long j3 = bundle.getLong(s1, C10323vs.b);
            boolean z = bundle.getBoolean(t1, false);
            boolean z2 = bundle.getBoolean(u1, false);
            Bundle bundle3 = bundle.getBundle(v1);
            if (bundle3 != null) {
                gVar = C8322nf1.g.g1.a(bundle3);
            } else {
                gVar = null;
            }
            C8322nf1.g gVar2 = gVar;
            boolean z3 = bundle.getBoolean(w1, false);
            long j4 = bundle.getLong(x1, 0L);
            long j5 = bundle.getLong(y1, C10323vs.b);
            int i = bundle.getInt(z1, 0);
            int i2 = bundle.getInt(A1, 0);
            long j6 = bundle.getLong(B1, 0L);
            d dVar = new d();
            dVar.l(n1, c8322nf12, null, j, j2, j3, z, z2, gVar2, j4, j5, i, i2, j6);
            dVar.g1 = z3;
            return dVar;
        }

        public long c() {
            return TD2.t0(this.b1);
        }

        public long d() {
            return TD2.b2(this.h1);
        }

        @Override // o.InterfaceC8368nr
        public Bundle e() {
            Bundle bundle = new Bundle();
            if (!C8322nf1.e1.equals(this.Z)) {
                bundle.putBundle(p1, this.Z.e());
            }
            long j = this.Z0;
            if (j != C10323vs.b) {
                bundle.putLong(q1, j);
            }
            long j2 = this.a1;
            if (j2 != C10323vs.b) {
                bundle.putLong(r1, j2);
            }
            long j3 = this.b1;
            if (j3 != C10323vs.b) {
                bundle.putLong(s1, j3);
            }
            boolean z = this.c1;
            if (z) {
                bundle.putBoolean(t1, z);
            }
            boolean z2 = this.d1;
            if (z2) {
                bundle.putBoolean(u1, z2);
            }
            C8322nf1.g gVar = this.f1;
            if (gVar != null) {
                bundle.putBundle(v1, gVar.e());
            }
            boolean z3 = this.g1;
            if (z3) {
                bundle.putBoolean(w1, z3);
            }
            long j4 = this.h1;
            if (j4 != 0) {
                bundle.putLong(x1, j4);
            }
            long j5 = this.i1;
            if (j5 != C10323vs.b) {
                bundle.putLong(y1, j5);
            }
            int i = this.j1;
            if (i != 0) {
                bundle.putInt(z1, i);
            }
            int i2 = this.k1;
            if (i2 != 0) {
                bundle.putInt(A1, i2);
            }
            long j6 = this.l1;
            if (j6 != 0) {
                bundle.putLong(B1, j6);
            }
            return bundle;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class.equals(obj.getClass())) {
                d dVar = (d) obj;
                if (TD2.g(this.X, dVar.X) && TD2.g(this.Z, dVar.Z) && TD2.g(this.Y0, dVar.Y0) && TD2.g(this.f1, dVar.f1) && this.Z0 == dVar.Z0 && this.a1 == dVar.a1 && this.b1 == dVar.b1 && this.c1 == dVar.c1 && this.d1 == dVar.d1 && this.g1 == dVar.g1 && this.h1 == dVar.h1 && this.i1 == dVar.i1 && this.j1 == dVar.j1 && this.k1 == dVar.k1 && this.l1 == dVar.l1) {
                    return true;
                }
            }
            return false;
        }

        public long f() {
            return this.h1;
        }

        public long g() {
            return TD2.b2(this.i1);
        }

        public long h() {
            return this.i1;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = (((217 + this.X.hashCode()) * 31) + this.Z.hashCode()) * 31;
            Object obj = this.Y0;
            int i = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i2 = (hashCode2 + hashCode) * 31;
            C8322nf1.g gVar = this.f1;
            if (gVar != null) {
                i = gVar.hashCode();
            }
            long j = this.Z0;
            long j2 = this.a1;
            long j3 = this.b1;
            long j4 = this.h1;
            long j5 = this.i1;
            long j6 = this.l1;
            return ((((((((((((((((((((((i2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.c1 ? 1 : 0)) * 31) + (this.d1 ? 1 : 0)) * 31) + (this.g1 ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.j1) * 31) + this.k1) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }

        public long i() {
            return TD2.b2(this.l1);
        }

        public long j() {
            return this.l1;
        }

        public boolean k() {
            boolean z;
            boolean z2;
            boolean z3 = this.e1;
            if (this.f1 != null) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9542sf.i(z2);
            if (this.f1 == null) {
                return false;
            }
            return true;
        }

        @InterfaceC6181ey
        public d l(Object obj, @InterfaceC11300zs1 C8322nf1 c8322nf1, @InterfaceC11300zs1 Object obj2, long j, long j2, long j3, boolean z, boolean z2, @InterfaceC11300zs1 C8322nf1.g gVar, long j4, long j5, int i, int i2, long j6) {
            C8322nf1 c8322nf12;
            Object obj3;
            boolean z3;
            C8322nf1.h hVar;
            this.X = obj;
            if (c8322nf1 != null) {
                c8322nf12 = c8322nf1;
            } else {
                c8322nf12 = o1;
            }
            this.Z = c8322nf12;
            if (c8322nf1 != null && (hVar = c8322nf1.Y) != null) {
                obj3 = hVar.d1;
            } else {
                obj3 = null;
            }
            this.Y = obj3;
            this.Y0 = obj2;
            this.Z0 = j;
            this.a1 = j2;
            this.b1 = j3;
            this.c1 = z;
            this.d1 = z2;
            if (gVar != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.e1 = z3;
            this.f1 = gVar;
            this.h1 = j4;
            this.i1 = j5;
            this.j1 = i;
            this.k1 = i2;
            this.l1 = j6;
            this.g1 = false;
            return this;
        }
    }

    public static /* synthetic */ AbstractC7373jp2 a(Bundle bundle) {
        return b(bundle);
    }

    public static AbstractC7373jp2 b(Bundle bundle) {
        AbstractC5317bO0 c2 = c(d.C1, C8125mr.a(bundle, Y));
        AbstractC5317bO0 c3 = c(b.h1, C8125mr.a(bundle, Z));
        int[] intArray = bundle.getIntArray(Y0);
        if (intArray == null) {
            intArray = d(c2.size());
        }
        return new c(c2, c3, intArray);
    }

    public static <T extends InterfaceC8368nr> AbstractC5317bO0<T> c(InterfaceC8368nr.a<T> aVar, @InterfaceC11300zs1 IBinder iBinder) {
        if (iBinder == null) {
            return AbstractC5317bO0.L();
        }
        AbstractC5317bO0.a aVar2 = new AbstractC5317bO0.a();
        AbstractC5317bO0<Bundle> a2 = BinderC7864lr.a(iBinder);
        for (int i = 0; i < a2.size(); i++) {
            aVar2.g(aVar.a(a2.get(i)));
        }
        return aVar2.e();
    }

    public static int[] d(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    @Override // o.InterfaceC8368nr
    public final Bundle e() {
        ArrayList arrayList = new ArrayList();
        int w = w();
        d dVar = new d();
        for (int i = 0; i < w; i++) {
            arrayList.add(v(i, dVar, 0L).e());
        }
        ArrayList arrayList2 = new ArrayList();
        int n = n();
        b bVar = new b();
        for (int i2 = 0; i2 < n; i2++) {
            arrayList2.add(l(i2, bVar, false).e());
        }
        int[] iArr = new int[w];
        if (w > 0) {
            iArr[0] = f(true);
        }
        for (int i3 = 1; i3 < w; i3++) {
            iArr[i3] = j(iArr[i3 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        C8125mr.c(bundle, Y, new BinderC7864lr(arrayList));
        C8125mr.c(bundle, Z, new BinderC7864lr(arrayList2));
        bundle.putIntArray(Y0, iArr);
        return bundle;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        int h;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC7373jp2)) {
            return false;
        }
        AbstractC7373jp2 abstractC7373jp2 = (AbstractC7373jp2) obj;
        if (abstractC7373jp2.w() != w() || abstractC7373jp2.n() != n()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i = 0; i < w(); i++) {
            if (!u(i, dVar).equals(abstractC7373jp2.u(i, dVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < n(); i2++) {
            if (!l(i2, bVar, true).equals(abstractC7373jp2.l(i2, bVar2, true))) {
                return false;
            }
        }
        int f = f(true);
        if (f != abstractC7373jp2.f(true) || (h = h(true)) != abstractC7373jp2.h(true)) {
            return false;
        }
        while (f != h) {
            int j = j(f, 0, true);
            if (j != abstractC7373jp2.j(f, 0, true)) {
                return false;
            }
            f = j;
        }
        return true;
    }

    public int f(boolean z) {
        if (x()) {
            return -1;
        }
        return 0;
    }

    public abstract int g(Object obj);

    public int h(boolean z) {
        if (x()) {
            return -1;
        }
        return w() - 1;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int w = 217 + w();
        for (int i = 0; i < w(); i++) {
            w = (w * 31) + u(i, dVar).hashCode();
        }
        int n = (w * 31) + n();
        for (int i2 = 0; i2 < n(); i2++) {
            n = (n * 31) + l(i2, bVar, true).hashCode();
        }
        int f = f(true);
        while (f != -1) {
            n = (n * 31) + f;
            f = j(f, 0, true);
        }
        return n;
    }

    public final int i(int i, b bVar, d dVar, int i2, boolean z) {
        int i3 = k(i, bVar).Z;
        if (u(i3, dVar).k1 == i) {
            int j = j(i3, i2, z);
            if (j == -1) {
                return -1;
            }
            return u(j, dVar).j1;
        }
        return i + 1;
    }

    public int j(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == h(z)) {
                        return f(z);
                    }
                    return i + 1;
                }
                throw new IllegalStateException();
            }
            return i;
        } else if (i == h(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public final b k(int i, b bVar) {
        return l(i, bVar, false);
    }

    public abstract b l(int i, b bVar, boolean z);

    public b m(Object obj, b bVar) {
        return l(g(obj), bVar, true);
    }

    public abstract int n();

    @Deprecated
    @VP0(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs)")
    public final Pair<Object, Long> o(d dVar, b bVar, int i, long j) {
        return q(dVar, bVar, i, j);
    }

    @InterfaceC11300zs1
    @Deprecated
    @VP0(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs, defaultPositionProjectionUs)")
    public final Pair<Object, Long> p(d dVar, b bVar, int i, long j, long j2) {
        return r(dVar, bVar, i, j, j2);
    }

    public final Pair<Object, Long> q(d dVar, b bVar, int i, long j) {
        return (Pair) C9542sf.g(r(dVar, bVar, i, j, 0L));
    }

    @InterfaceC11300zs1
    public final Pair<Object, Long> r(d dVar, b bVar, int i, long j, long j2) {
        C9542sf.c(i, 0, w());
        v(i, dVar, j2);
        if (j == C10323vs.b) {
            j = dVar.f();
            if (j == C10323vs.b) {
                return null;
            }
        }
        int i2 = dVar.j1;
        k(i2, bVar);
        while (i2 < dVar.k1 && bVar.Z0 != j) {
            int i3 = i2 + 1;
            if (k(i3, bVar).Z0 > j) {
                break;
            }
            i2 = i3;
        }
        l(i2, bVar, true);
        long j3 = j - bVar.Z0;
        long j4 = bVar.Y0;
        if (j4 != C10323vs.b) {
            j3 = Math.min(j3, j4 - 1);
        }
        return Pair.create(C9542sf.g(bVar.Y), Long.valueOf(Math.max(0L, j3)));
    }

    public int s(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == f(z)) {
                        return h(z);
                    }
                    return i - 1;
                }
                throw new IllegalStateException();
            }
            return i;
        } else if (i == f(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    public abstract Object t(int i);

    public final d u(int i, d dVar) {
        return v(i, dVar, 0L);
    }

    public abstract d v(int i, d dVar, long j);

    public abstract int w();

    public final boolean x() {
        if (w() == 0) {
            return true;
        }
        return false;
    }

    public final boolean y(int i, b bVar, d dVar, int i2, boolean z) {
        if (i(i, bVar, dVar, i2, z) == -1) {
            return true;
        }
        return false;
    }

    public final Bundle z(int i) {
        d v = v(i, new d(), 0L);
        ArrayList arrayList = new ArrayList();
        b bVar = new b();
        int i2 = v.j1;
        while (true) {
            int i3 = v.k1;
            if (i2 <= i3) {
                l(i2, bVar, false);
                bVar.Z = 0;
                arrayList.add(bVar.e());
                i2++;
            } else {
                v.k1 = i3 - v.j1;
                v.j1 = 0;
                Bundle e = v.e();
                Bundle bundle = new Bundle();
                C8125mr.c(bundle, Y, new BinderC7864lr(AbstractC5317bO0.M(e)));
                C8125mr.c(bundle, Z, new BinderC7864lr(arrayList));
                bundle.putIntArray(Y0, new int[]{0});
                return bundle;
            }
        }
    }
}
