package o;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o.AbstractC5317bO0;
import o.C8322nf1;
import o.InterfaceC8368nr;

@Deprecated
/* renamed from: o.nf1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8322nf1 implements InterfaceC8368nr {
    public static final String d1 = "";
    public static final C8322nf1 e1 = new c().a();
    public static final String f1 = TD2.R0(0);
    public static final String g1 = TD2.R0(1);
    public static final String h1 = TD2.R0(2);
    public static final String i1 = TD2.R0(3);
    public static final String j1 = TD2.R0(4);
    public static final String k1 = TD2.R0(5);
    public static final InterfaceC8368nr.a<C8322nf1> l1 = new InterfaceC8368nr.a() { // from class: o.mf1
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            C8322nf1 c2;
            c2 = C8322nf1.c(bundle);
            return c2;
        }
    };
    public final String X;
    @InterfaceC11300zs1
    public final h Y;
    public final g Y0;
    @InterfaceC11300zs1
    @Deprecated
    public final h Z;
    public final C11005yf1 Z0;
    public final d a1;
    @Deprecated
    public final e b1;
    public final i c1;

    /* renamed from: o.nf1$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8368nr {
        public final Uri X;
        @InterfaceC11300zs1
        public final Object Y;
        public static final String Z = TD2.R0(0);
        public static final InterfaceC8368nr.a<b> Y0 = new InterfaceC8368nr.a() { // from class: o.of1
            @Override // o.InterfaceC8368nr.a
            public final InterfaceC8368nr a(Bundle bundle) {
                C8322nf1.b c;
                c = C8322nf1.b.c(bundle);
                return c;
            }
        };

        /* renamed from: o.nf1$b$a */
        /* loaded from: classes2.dex */
        public static final class a {
            public Uri a;
            @InterfaceC11300zs1
            public Object b;

            public a(Uri uri) {
                this.a = uri;
            }

            public b c() {
                return new b(this);
            }

            @InterfaceC6181ey
            public a d(Uri uri) {
                this.a = uri;
                return this;
            }

            @InterfaceC6181ey
            public a e(@InterfaceC11300zs1 Object obj) {
                this.b = obj;
                return this;
            }
        }

        public static b c(Bundle bundle) {
            Uri uri = (Uri) bundle.getParcelable(Z);
            C9542sf.g(uri);
            return new a(uri).c();
        }

        public a b() {
            return new a(this.X).e(this.Y);
        }

        @Override // o.InterfaceC8368nr
        public Bundle e() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(Z, this.X);
            return bundle;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.X.equals(bVar.X) && TD2.g(this.Y, bVar.Y)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = this.X.hashCode() * 31;
            Object obj = this.Y;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            return hashCode + i;
        }

        public b(a aVar) {
            this.X = aVar.a;
            this.Y = aVar.b;
        }
    }

    /* renamed from: o.nf1$c */
    /* loaded from: classes2.dex */
    public static final class c {
        @InterfaceC11300zs1
        public String a;
        @InterfaceC11300zs1
        public Uri b;
        @InterfaceC11300zs1
        public String c;
        public d.a d;
        public f.a e;
        public List<C3031Gd2> f;
        @InterfaceC11300zs1
        public String g;
        public AbstractC5317bO0<k> h;
        @InterfaceC11300zs1
        public b i;
        @InterfaceC11300zs1
        public Object j;
        @InterfaceC11300zs1
        public C11005yf1 k;
        public g.a l;
        public i m;

        @InterfaceC6181ey
        @Deprecated
        public c A(long j) {
            this.l.i(j);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c B(float f) {
            this.l.j(f);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c C(long j) {
            this.l.k(j);
            return this;
        }

        @InterfaceC6181ey
        public c D(String str) {
            this.a = (String) C9542sf.g(str);
            return this;
        }

        @InterfaceC6181ey
        public c E(C11005yf1 c11005yf1) {
            this.k = c11005yf1;
            return this;
        }

        @InterfaceC6181ey
        public c F(@InterfaceC11300zs1 String str) {
            this.c = str;
            return this;
        }

        @InterfaceC6181ey
        public c G(i iVar) {
            this.m = iVar;
            return this;
        }

        @InterfaceC6181ey
        public c H(@InterfaceC11300zs1 List<C3031Gd2> list) {
            List<C3031Gd2> list2;
            if (list != null && !list.isEmpty()) {
                list2 = Collections.unmodifiableList(new ArrayList(list));
            } else {
                list2 = Collections.EMPTY_LIST;
            }
            this.f = list2;
            return this;
        }

        @InterfaceC6181ey
        public c I(List<k> list) {
            this.h = AbstractC5317bO0.F(list);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c J(@InterfaceC11300zs1 List<j> list) {
            AbstractC5317bO0<k> L;
            if (list != null) {
                L = AbstractC5317bO0.F(list);
            } else {
                L = AbstractC5317bO0.L();
            }
            this.h = L;
            return this;
        }

        @InterfaceC6181ey
        public c K(@InterfaceC11300zs1 Object obj) {
            this.j = obj;
            return this;
        }

        @InterfaceC6181ey
        public c L(@InterfaceC11300zs1 Uri uri) {
            this.b = uri;
            return this;
        }

        @InterfaceC6181ey
        public c M(@InterfaceC11300zs1 String str) {
            Uri parse;
            if (str == null) {
                parse = null;
            } else {
                parse = Uri.parse(str);
            }
            return L(parse);
        }

        public C8322nf1 a() {
            boolean z;
            h hVar;
            if (this.e.b != null && this.e.a == null) {
                z = false;
            } else {
                z = true;
            }
            C9542sf.i(z);
            Uri uri = this.b;
            f fVar = null;
            if (uri != null) {
                String str = this.c;
                if (this.e.a != null) {
                    fVar = this.e.j();
                }
                hVar = new h(uri, str, fVar, this.i, this.f, this.g, this.h, this.j);
            } else {
                hVar = null;
            }
            String str2 = this.a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            e g = this.d.g();
            g f = this.l.f();
            C11005yf1 c11005yf1 = this.k;
            if (c11005yf1 == null) {
                c11005yf1 = C11005yf1.Q2;
            }
            return new C8322nf1(str3, g, hVar, f, c11005yf1, this.m);
        }

        @InterfaceC6181ey
        @Deprecated
        public c b(@InterfaceC11300zs1 Uri uri) {
            return c(uri, null);
        }

        @InterfaceC6181ey
        @Deprecated
        public c c(@InterfaceC11300zs1 Uri uri, @InterfaceC11300zs1 Object obj) {
            b bVar;
            if (uri != null) {
                bVar = new b.a(uri).e(obj).c();
            } else {
                bVar = null;
            }
            this.i = bVar;
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c d(@InterfaceC11300zs1 String str) {
            Uri uri;
            if (str != null) {
                uri = Uri.parse(str);
            } else {
                uri = null;
            }
            return b(uri);
        }

        @InterfaceC6181ey
        public c e(@InterfaceC11300zs1 b bVar) {
            this.i = bVar;
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c f(long j) {
            this.d.h(j);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c g(boolean z) {
            this.d.i(z);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c h(boolean z) {
            this.d.j(z);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c i(@BR0(from = 0) long j) {
            this.d.k(j);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c j(boolean z) {
            this.d.l(z);
            return this;
        }

        @InterfaceC6181ey
        public c k(d dVar) {
            this.d = dVar.b();
            return this;
        }

        @InterfaceC6181ey
        public c l(@InterfaceC11300zs1 String str) {
            this.g = str;
            return this;
        }

        @InterfaceC6181ey
        public c m(@InterfaceC11300zs1 f fVar) {
            f.a aVar;
            if (fVar != null) {
                aVar = fVar.c();
            } else {
                aVar = new f.a();
            }
            this.e = aVar;
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c n(boolean z) {
            this.e.l(z);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c o(@InterfaceC11300zs1 byte[] bArr) {
            this.e.o(bArr);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c p(@InterfaceC11300zs1 Map<String, String> map) {
            f.a aVar = this.e;
            if (map == null) {
                map = AbstractC6044eO0.u();
            }
            aVar.p(map);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c q(@InterfaceC11300zs1 Uri uri) {
            this.e.q(uri);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c r(@InterfaceC11300zs1 String str) {
            this.e.r(str);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c s(boolean z) {
            this.e.s(z);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c t(boolean z) {
            this.e.u(z);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c u(boolean z) {
            this.e.m(z);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c v(@InterfaceC11300zs1 List<Integer> list) {
            f.a aVar = this.e;
            if (list == null) {
                list = AbstractC5317bO0.L();
            }
            aVar.n(list);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c w(@InterfaceC11300zs1 UUID uuid) {
            this.e.t(uuid);
            return this;
        }

        @InterfaceC6181ey
        public c x(g gVar) {
            this.l = gVar.b();
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c y(long j) {
            this.l.g(j);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public c z(float f) {
            this.l.h(f);
            return this;
        }

        public c() {
            this.d = new d.a();
            this.e = new f.a();
            this.f = Collections.EMPTY_LIST;
            this.h = AbstractC5317bO0.L();
            this.l = new g.a();
            this.m = i.Y0;
        }

        public c(C8322nf1 c8322nf1) {
            this();
            f.a aVar;
            this.d = c8322nf1.a1.b();
            this.a = c8322nf1.X;
            this.k = c8322nf1.Z0;
            this.l = c8322nf1.Y0.b();
            this.m = c8322nf1.c1;
            h hVar = c8322nf1.Y;
            if (hVar != null) {
                this.g = hVar.a1;
                this.c = hVar.Y;
                this.b = hVar.X;
                this.f = hVar.Z0;
                this.h = hVar.b1;
                this.j = hVar.d1;
                f fVar = hVar.Z;
                if (fVar != null) {
                    aVar = fVar.c();
                } else {
                    aVar = new f.a();
                }
                this.e = aVar;
                this.i = hVar.Y0;
            }
        }
    }

    /* renamed from: o.nf1$d */
    /* loaded from: classes2.dex */
    public static class d implements InterfaceC8368nr {
        public static final d a1 = new a().f();
        public static final String b1 = TD2.R0(0);
        public static final String c1 = TD2.R0(1);
        public static final String d1 = TD2.R0(2);
        public static final String e1 = TD2.R0(3);
        public static final String f1 = TD2.R0(4);
        public static final InterfaceC8368nr.a<e> g1 = new InterfaceC8368nr.a() { // from class: o.pf1
            @Override // o.InterfaceC8368nr.a
            public final InterfaceC8368nr a(Bundle bundle) {
                return C8322nf1.d.a(bundle);
            }
        };
        @BR0(from = 0)
        public final long X;
        public final long Y;
        public final boolean Y0;
        public final boolean Z;
        public final boolean Z0;

        /* renamed from: o.nf1$d$a */
        /* loaded from: classes2.dex */
        public static final class a {
            public long a;
            public long b;
            public boolean c;
            public boolean d;
            public boolean e;

            public d f() {
                return g();
            }

            @Deprecated
            public e g() {
                return new e(this);
            }

            @InterfaceC6181ey
            public a h(long j) {
                boolean z;
                if (j != Long.MIN_VALUE && j < 0) {
                    z = false;
                } else {
                    z = true;
                }
                C9542sf.a(z);
                this.b = j;
                return this;
            }

            @InterfaceC6181ey
            public a i(boolean z) {
                this.d = z;
                return this;
            }

            @InterfaceC6181ey
            public a j(boolean z) {
                this.c = z;
                return this;
            }

            @InterfaceC6181ey
            public a k(@BR0(from = 0) long j) {
                boolean z;
                if (j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                C9542sf.a(z);
                this.a = j;
                return this;
            }

            @InterfaceC6181ey
            public a l(boolean z) {
                this.e = z;
                return this;
            }

            public a() {
                this.b = Long.MIN_VALUE;
            }

            public a(d dVar) {
                this.a = dVar.X;
                this.b = dVar.Y;
                this.c = dVar.Z;
                this.d = dVar.Y0;
                this.e = dVar.Z0;
            }
        }

        public static /* synthetic */ e a(Bundle bundle) {
            a aVar = new a();
            String str = b1;
            d dVar = a1;
            return aVar.k(bundle.getLong(str, dVar.X)).h(bundle.getLong(c1, dVar.Y)).j(bundle.getBoolean(d1, dVar.Z)).i(bundle.getBoolean(e1, dVar.Y0)).l(bundle.getBoolean(f1, dVar.Z0)).g();
        }

        public a b() {
            return new a();
        }

        @Override // o.InterfaceC8368nr
        public Bundle e() {
            Bundle bundle = new Bundle();
            long j = this.X;
            d dVar = a1;
            if (j != dVar.X) {
                bundle.putLong(b1, j);
            }
            long j2 = this.Y;
            if (j2 != dVar.Y) {
                bundle.putLong(c1, j2);
            }
            boolean z = this.Z;
            if (z != dVar.Z) {
                bundle.putBoolean(d1, z);
            }
            boolean z2 = this.Y0;
            if (z2 != dVar.Y0) {
                bundle.putBoolean(e1, z2);
            }
            boolean z3 = this.Z0;
            if (z3 != dVar.Z0) {
                bundle.putBoolean(f1, z3);
            }
            return bundle;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.X == dVar.X && this.Y == dVar.Y && this.Z == dVar.Z && this.Y0 == dVar.Y0 && this.Z0 == dVar.Z0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j = this.X;
            long j2 = this.Y;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.Z ? 1 : 0)) * 31) + (this.Y0 ? 1 : 0)) * 31) + (this.Z0 ? 1 : 0);
        }

        public d(a aVar) {
            this.X = aVar.a;
            this.Y = aVar.b;
            this.Z = aVar.c;
            this.Y0 = aVar.d;
            this.Z0 = aVar.e;
        }
    }

    @Deprecated
    /* renamed from: o.nf1$e */
    /* loaded from: classes2.dex */
    public static final class e extends d {
        public static final e h1 = new d.a().g();

        public e(d.a aVar) {
            super(aVar);
        }
    }

    /* renamed from: o.nf1$f */
    /* loaded from: classes2.dex */
    public static final class f implements InterfaceC8368nr {
        public static final String g1 = TD2.R0(0);
        public static final String h1 = TD2.R0(1);
        public static final String i1 = TD2.R0(2);
        public static final String j1 = TD2.R0(3);
        public static final String k1 = TD2.R0(4);
        public static final String l1 = TD2.R0(5);
        public static final String m1 = TD2.R0(6);
        public static final String n1 = TD2.R0(7);
        public static final InterfaceC8368nr.a<f> o1 = new InterfaceC8368nr.a() { // from class: o.qf1
            @Override // o.InterfaceC8368nr.a
            public final InterfaceC8368nr a(Bundle bundle) {
                C8322nf1.f d;
                d = C8322nf1.f.d(bundle);
                return d;
            }
        };
        public final UUID X;
        @Deprecated
        public final UUID Y;
        @Deprecated
        public final AbstractC6044eO0<String, String> Y0;
        @InterfaceC11300zs1
        public final Uri Z;
        public final AbstractC6044eO0<String, String> Z0;
        public final boolean a1;
        public final boolean b1;
        public final boolean c1;
        @Deprecated
        public final AbstractC5317bO0<Integer> d1;
        public final AbstractC5317bO0<Integer> e1;
        @InterfaceC11300zs1
        public final byte[] f1;

        public static f d(Bundle bundle) {
            UUID fromString = UUID.fromString((String) C9542sf.g(bundle.getString(g1)));
            AbstractC6044eO0<String, String> b = C8855pr.b(C8855pr.f(bundle, i1, Bundle.EMPTY));
            boolean z = bundle.getBoolean(j1, false);
            boolean z2 = bundle.getBoolean(k1, false);
            boolean z3 = bundle.getBoolean(l1, false);
            AbstractC5317bO0 F = AbstractC5317bO0.F(C8855pr.g(bundle, m1, new ArrayList()));
            return new a(fromString).q((Uri) bundle.getParcelable(h1)).p(b).s(z).l(z3).u(z2).n(F).o(bundle.getByteArray(n1)).j();
        }

        public a c() {
            return new a();
        }

        @Override // o.InterfaceC8368nr
        public Bundle e() {
            Bundle bundle = new Bundle();
            bundle.putString(g1, this.X.toString());
            Uri uri = this.Z;
            if (uri != null) {
                bundle.putParcelable(h1, uri);
            }
            if (!this.Z0.isEmpty()) {
                bundle.putBundle(i1, C8855pr.h(this.Z0));
            }
            boolean z = this.a1;
            if (z) {
                bundle.putBoolean(j1, z);
            }
            boolean z2 = this.b1;
            if (z2) {
                bundle.putBoolean(k1, z2);
            }
            boolean z3 = this.c1;
            if (z3) {
                bundle.putBoolean(l1, z3);
            }
            if (!this.e1.isEmpty()) {
                bundle.putIntegerArrayList(m1, new ArrayList<>(this.e1));
            }
            byte[] bArr = this.f1;
            if (bArr != null) {
                bundle.putByteArray(n1, bArr);
            }
            return bundle;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (this.X.equals(fVar.X) && TD2.g(this.Z, fVar.Z) && TD2.g(this.Z0, fVar.Z0) && this.a1 == fVar.a1 && this.c1 == fVar.c1 && this.b1 == fVar.b1 && this.e1.equals(fVar.e1) && Arrays.equals(this.f1, fVar.f1)) {
                return true;
            }
            return false;
        }

        @InterfaceC11300zs1
        public byte[] f() {
            byte[] bArr = this.f1;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public int hashCode() {
            int i;
            int hashCode = this.X.hashCode() * 31;
            Uri uri = this.Z;
            if (uri != null) {
                i = uri.hashCode();
            } else {
                i = 0;
            }
            return ((((((((((((hashCode + i) * 31) + this.Z0.hashCode()) * 31) + (this.a1 ? 1 : 0)) * 31) + (this.c1 ? 1 : 0)) * 31) + (this.b1 ? 1 : 0)) * 31) + this.e1.hashCode()) * 31) + Arrays.hashCode(this.f1);
        }

        /* renamed from: o.nf1$f$a */
        /* loaded from: classes2.dex */
        public static final class a {
            @InterfaceC11300zs1
            public UUID a;
            @InterfaceC11300zs1
            public Uri b;
            public AbstractC6044eO0<String, String> c;
            public boolean d;
            public boolean e;
            public boolean f;
            public AbstractC5317bO0<Integer> g;
            @InterfaceC11300zs1
            public byte[] h;

            public f j() {
                return new f(this);
            }

            @InterfaceC6181ey
            @Deprecated
            @VP0(replacement = "this.setForceSessionsForAudioAndVideoTracks(forceSessionsForAudioAndVideoTracks)")
            public a k(boolean z) {
                return m(z);
            }

            @InterfaceC6181ey
            public a l(boolean z) {
                this.f = z;
                return this;
            }

            @InterfaceC6181ey
            public a m(boolean z) {
                AbstractC5317bO0 L;
                if (z) {
                    L = AbstractC5317bO0.Q(2, 1);
                } else {
                    L = AbstractC5317bO0.L();
                }
                n(L);
                return this;
            }

            @InterfaceC6181ey
            public a n(List<Integer> list) {
                this.g = AbstractC5317bO0.F(list);
                return this;
            }

            @InterfaceC6181ey
            public a o(@InterfaceC11300zs1 byte[] bArr) {
                byte[] bArr2;
                if (bArr != null) {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                } else {
                    bArr2 = null;
                }
                this.h = bArr2;
                return this;
            }

            @InterfaceC6181ey
            public a p(Map<String, String> map) {
                this.c = AbstractC6044eO0.g(map);
                return this;
            }

            @InterfaceC6181ey
            public a q(@InterfaceC11300zs1 Uri uri) {
                this.b = uri;
                return this;
            }

            @InterfaceC6181ey
            public a r(@InterfaceC11300zs1 String str) {
                Uri parse;
                if (str == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(str);
                }
                this.b = parse;
                return this;
            }

            @InterfaceC6181ey
            public a s(boolean z) {
                this.d = z;
                return this;
            }

            @InterfaceC6181ey
            @Deprecated
            public final a t(@InterfaceC11300zs1 UUID uuid) {
                this.a = uuid;
                return this;
            }

            @InterfaceC6181ey
            public a u(boolean z) {
                this.e = z;
                return this;
            }

            @InterfaceC6181ey
            public a v(UUID uuid) {
                this.a = uuid;
                return this;
            }

            public a(UUID uuid) {
                this.a = uuid;
                this.c = AbstractC6044eO0.u();
                this.g = AbstractC5317bO0.L();
            }

            @Deprecated
            public a() {
                this.c = AbstractC6044eO0.u();
                this.g = AbstractC5317bO0.L();
            }

            public a(f fVar) {
                this.a = fVar.X;
                this.b = fVar.Z;
                this.c = fVar.Z0;
                this.d = fVar.a1;
                this.e = fVar.b1;
                this.f = fVar.c1;
                this.g = fVar.e1;
                this.h = fVar.f1;
            }
        }

        public f(a aVar) {
            C9542sf.i((aVar.f && aVar.b == null) ? false : true);
            UUID uuid = (UUID) C9542sf.g(aVar.a);
            this.X = uuid;
            this.Y = uuid;
            this.Z = aVar.b;
            this.Y0 = aVar.c;
            this.Z0 = aVar.c;
            this.a1 = aVar.d;
            this.c1 = aVar.f;
            this.b1 = aVar.e;
            this.d1 = aVar.g;
            this.e1 = aVar.g;
            this.f1 = aVar.h != null ? Arrays.copyOf(aVar.h, aVar.h.length) : null;
        }
    }

    /* renamed from: o.nf1$g */
    /* loaded from: classes2.dex */
    public static final class g implements InterfaceC8368nr {
        public static final g a1 = new a().f();
        public static final String b1 = TD2.R0(0);
        public static final String c1 = TD2.R0(1);
        public static final String d1 = TD2.R0(2);
        public static final String e1 = TD2.R0(3);
        public static final String f1 = TD2.R0(4);
        public static final InterfaceC8368nr.a<g> g1 = new InterfaceC8368nr.a() { // from class: o.rf1
            @Override // o.InterfaceC8368nr.a
            public final InterfaceC8368nr a(Bundle bundle) {
                return C8322nf1.g.a(bundle);
            }
        };
        public final long X;
        public final long Y;
        public final float Y0;
        public final long Z;
        public final float Z0;

        /* renamed from: o.nf1$g$a */
        /* loaded from: classes2.dex */
        public static final class a {
            public long a;
            public long b;
            public long c;
            public float d;
            public float e;

            public g f() {
                return new g(this);
            }

            @InterfaceC6181ey
            public a g(long j) {
                this.c = j;
                return this;
            }

            @InterfaceC6181ey
            public a h(float f) {
                this.e = f;
                return this;
            }

            @InterfaceC6181ey
            public a i(long j) {
                this.b = j;
                return this;
            }

            @InterfaceC6181ey
            public a j(float f) {
                this.d = f;
                return this;
            }

            @InterfaceC6181ey
            public a k(long j) {
                this.a = j;
                return this;
            }

            public a() {
                this.a = C10323vs.b;
                this.b = C10323vs.b;
                this.c = C10323vs.b;
                this.d = -3.4028235E38f;
                this.e = -3.4028235E38f;
            }

            public a(g gVar) {
                this.a = gVar.X;
                this.b = gVar.Y;
                this.c = gVar.Z;
                this.d = gVar.Y0;
                this.e = gVar.Z0;
            }
        }

        public static /* synthetic */ g a(Bundle bundle) {
            String str = b1;
            g gVar = a1;
            return new g(bundle.getLong(str, gVar.X), bundle.getLong(c1, gVar.Y), bundle.getLong(d1, gVar.Z), bundle.getFloat(e1, gVar.Y0), bundle.getFloat(f1, gVar.Z0));
        }

        public a b() {
            return new a();
        }

        @Override // o.InterfaceC8368nr
        public Bundle e() {
            Bundle bundle = new Bundle();
            long j = this.X;
            g gVar = a1;
            if (j != gVar.X) {
                bundle.putLong(b1, j);
            }
            long j2 = this.Y;
            if (j2 != gVar.Y) {
                bundle.putLong(c1, j2);
            }
            long j3 = this.Z;
            if (j3 != gVar.Z) {
                bundle.putLong(d1, j3);
            }
            float f = this.Y0;
            if (f != gVar.Y0) {
                bundle.putFloat(e1, f);
            }
            float f2 = this.Z0;
            if (f2 != gVar.Z0) {
                bundle.putFloat(f1, f2);
            }
            return bundle;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (this.X == gVar.X && this.Y == gVar.Y && this.Z == gVar.Z && this.Y0 == gVar.Y0 && this.Z0 == gVar.Z0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            long j = this.X;
            long j2 = this.Y;
            long j3 = this.Z;
            int i2 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.Y0;
            int i3 = 0;
            if (f != 0.0f) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i4 = (i2 + i) * 31;
            float f2 = this.Z0;
            if (f2 != 0.0f) {
                i3 = Float.floatToIntBits(f2);
            }
            return i4 + i3;
        }

        public g(a aVar) {
            this(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e);
        }

        @Deprecated
        public g(long j, long j2, long j3, float f, float f2) {
            this.X = j;
            this.Y = j2;
            this.Z = j3;
            this.Y0 = f;
            this.Z0 = f2;
        }
    }

    /* renamed from: o.nf1$h */
    /* loaded from: classes2.dex */
    public static final class h implements InterfaceC8368nr {
        public static final String e1 = TD2.R0(0);
        public static final String f1 = TD2.R0(1);
        public static final String g1 = TD2.R0(2);
        public static final String h1 = TD2.R0(3);
        public static final String i1 = TD2.R0(4);
        public static final String j1 = TD2.R0(5);
        public static final String k1 = TD2.R0(6);
        public static final InterfaceC8368nr.a<h> l1 = new InterfaceC8368nr.a() { // from class: o.sf1
            @Override // o.InterfaceC8368nr.a
            public final InterfaceC8368nr a(Bundle bundle) {
                C8322nf1.h b;
                b = C8322nf1.h.b(bundle);
                return b;
            }
        };
        public final Uri X;
        @InterfaceC11300zs1
        public final String Y;
        @InterfaceC11300zs1
        public final b Y0;
        @InterfaceC11300zs1
        public final f Z;
        public final List<C3031Gd2> Z0;
        @InterfaceC11300zs1
        public final String a1;
        public final AbstractC5317bO0<k> b1;
        @Deprecated
        public final List<j> c1;
        @InterfaceC11300zs1
        public final Object d1;

        public static h b(Bundle bundle) {
            f a;
            AbstractC5317bO0 d;
            AbstractC5317bO0 d2;
            Bundle bundle2 = bundle.getBundle(g1);
            b bVar = null;
            if (bundle2 == null) {
                a = null;
            } else {
                a = f.o1.a(bundle2);
            }
            Bundle bundle3 = bundle.getBundle(h1);
            if (bundle3 != null) {
                bVar = b.Y0.a(bundle3);
            }
            b bVar2 = bVar;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(i1);
            if (parcelableArrayList == null) {
                d = AbstractC5317bO0.L();
            } else {
                d = C8855pr.d(new InterfaceC8368nr.a() { // from class: o.tf1
                    @Override // o.InterfaceC8368nr.a
                    public final InterfaceC8368nr a(Bundle bundle4) {
                        return C3031Gd2.h(bundle4);
                    }
                }, parcelableArrayList);
            }
            AbstractC5317bO0 abstractC5317bO0 = d;
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(k1);
            if (parcelableArrayList2 == null) {
                d2 = AbstractC5317bO0.L();
            } else {
                d2 = C8855pr.d(k.j1, parcelableArrayList2);
            }
            return new h((Uri) C9542sf.g((Uri) bundle.getParcelable(e1)), bundle.getString(f1), a, bVar2, abstractC5317bO0, bundle.getString(j1), d2, null);
        }

        @Override // o.InterfaceC8368nr
        public Bundle e() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(e1, this.X);
            String str = this.Y;
            if (str != null) {
                bundle.putString(f1, str);
            }
            f fVar = this.Z;
            if (fVar != null) {
                bundle.putBundle(g1, fVar.e());
            }
            b bVar = this.Y0;
            if (bVar != null) {
                bundle.putBundle(h1, bVar.e());
            }
            if (!this.Z0.isEmpty()) {
                bundle.putParcelableArrayList(i1, C8855pr.i(this.Z0));
            }
            String str2 = this.a1;
            if (str2 != null) {
                bundle.putString(j1, str2);
            }
            if (!this.b1.isEmpty()) {
                bundle.putParcelableArrayList(k1, C8855pr.i(this.b1));
            }
            return bundle;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (this.X.equals(hVar.X) && TD2.g(this.Y, hVar.Y) && TD2.g(this.Z, hVar.Z) && TD2.g(this.Y0, hVar.Y0) && this.Z0.equals(hVar.Z0) && TD2.g(this.a1, hVar.a1) && this.b1.equals(hVar.b1) && TD2.g(this.d1, hVar.d1)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5 = this.X.hashCode() * 31;
            String str = this.Y;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode5 + hashCode) * 31;
            f fVar = this.Z;
            if (fVar == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = fVar.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            b bVar = this.Y0;
            if (bVar == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = bVar.hashCode();
            }
            int hashCode6 = (((i3 + hashCode3) * 31) + this.Z0.hashCode()) * 31;
            String str2 = this.a1;
            if (str2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str2.hashCode();
            }
            int hashCode7 = (((hashCode6 + hashCode4) * 31) + this.b1.hashCode()) * 31;
            Object obj = this.d1;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode7 + i;
        }

        public h(Uri uri, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 f fVar, @InterfaceC11300zs1 b bVar, List<C3031Gd2> list, @InterfaceC11300zs1 String str2, AbstractC5317bO0<k> abstractC5317bO0, @InterfaceC11300zs1 Object obj) {
            this.X = uri;
            this.Y = str;
            this.Z = fVar;
            this.Y0 = bVar;
            this.Z0 = list;
            this.a1 = str2;
            this.b1 = abstractC5317bO0;
            AbstractC5317bO0.a r = AbstractC5317bO0.r();
            for (int i = 0; i < abstractC5317bO0.size(); i++) {
                r.g(abstractC5317bO0.get(i).b().j());
            }
            this.c1 = r.e();
            this.d1 = obj;
        }
    }

    /* renamed from: o.nf1$i */
    /* loaded from: classes2.dex */
    public static final class i implements InterfaceC8368nr {
        public static final i Y0 = new a().d();
        public static final String Z0 = TD2.R0(0);
        public static final String a1 = TD2.R0(1);
        public static final String b1 = TD2.R0(2);
        public static final InterfaceC8368nr.a<i> c1 = new InterfaceC8368nr.a() { // from class: o.uf1
            @Override // o.InterfaceC8368nr.a
            public final InterfaceC8368nr a(Bundle bundle) {
                C8322nf1.i d;
                d = new C8322nf1.i.a().f((Uri) bundle.getParcelable(C8322nf1.i.Z0)).g(bundle.getString(C8322nf1.i.a1)).e(bundle.getBundle(C8322nf1.i.b1)).d();
                return d;
            }
        };
        @InterfaceC11300zs1
        public final Uri X;
        @InterfaceC11300zs1
        public final String Y;
        @InterfaceC11300zs1
        public final Bundle Z;

        /* renamed from: o.nf1$i$a */
        /* loaded from: classes2.dex */
        public static final class a {
            @InterfaceC11300zs1
            public Uri a;
            @InterfaceC11300zs1
            public String b;
            @InterfaceC11300zs1
            public Bundle c;

            public i d() {
                return new i(this);
            }

            @InterfaceC6181ey
            public a e(@InterfaceC11300zs1 Bundle bundle) {
                this.c = bundle;
                return this;
            }

            @InterfaceC6181ey
            public a f(@InterfaceC11300zs1 Uri uri) {
                this.a = uri;
                return this;
            }

            @InterfaceC6181ey
            public a g(@InterfaceC11300zs1 String str) {
                this.b = str;
                return this;
            }

            public a() {
            }

            public a(i iVar) {
                this.a = iVar.X;
                this.b = iVar.Y;
                this.c = iVar.Z;
            }
        }

        public a b() {
            return new a();
        }

        @Override // o.InterfaceC8368nr
        public Bundle e() {
            Bundle bundle = new Bundle();
            Uri uri = this.X;
            if (uri != null) {
                bundle.putParcelable(Z0, uri);
            }
            String str = this.Y;
            if (str != null) {
                bundle.putString(a1, str);
            }
            Bundle bundle2 = this.Z;
            if (bundle2 != null) {
                bundle.putBundle(b1, bundle2);
            }
            return bundle;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (TD2.g(this.X, iVar.X) && TD2.g(this.Y, iVar.Y)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            Uri uri = this.X;
            int i = 0;
            if (uri == null) {
                hashCode = 0;
            } else {
                hashCode = uri.hashCode();
            }
            int i2 = hashCode * 31;
            String str = this.Y;
            if (str != null) {
                i = str.hashCode();
            }
            return i2 + i;
        }

        public i(a aVar) {
            this.X = aVar.a;
            this.Y = aVar.b;
            this.Z = aVar.c;
        }
    }

    @Deprecated
    /* renamed from: o.nf1$j */
    /* loaded from: classes2.dex */
    public static final class j extends k {
        @Deprecated
        public j(Uri uri, String str, @InterfaceC11300zs1 String str2) {
            this(uri, str, str2, 0);
        }

        @Deprecated
        public j(Uri uri, String str, @InterfaceC11300zs1 String str2, int i) {
            this(uri, str, str2, i, 0, null);
        }

        @Deprecated
        public j(Uri uri, String str, @InterfaceC11300zs1 String str2, int i, int i2, @InterfaceC11300zs1 String str3) {
            super(uri, str, str2, i, i2, str3, null);
        }

        public j(k.a aVar) {
            super(aVar);
        }
    }

    public static C8322nf1 c(Bundle bundle) {
        g a2;
        C11005yf1 a3;
        e a4;
        i a5;
        h a6;
        String str = (String) C9542sf.g(bundle.getString(f1, ""));
        Bundle bundle2 = bundle.getBundle(g1);
        if (bundle2 == null) {
            a2 = g.a1;
        } else {
            a2 = g.g1.a(bundle2);
        }
        g gVar = a2;
        Bundle bundle3 = bundle.getBundle(h1);
        if (bundle3 == null) {
            a3 = C11005yf1.Q2;
        } else {
            a3 = C11005yf1.y3.a(bundle3);
        }
        C11005yf1 c11005yf1 = a3;
        Bundle bundle4 = bundle.getBundle(i1);
        if (bundle4 == null) {
            a4 = e.h1;
        } else {
            a4 = d.g1.a(bundle4);
        }
        e eVar = a4;
        Bundle bundle5 = bundle.getBundle(j1);
        if (bundle5 == null) {
            a5 = i.Y0;
        } else {
            a5 = i.c1.a(bundle5);
        }
        i iVar = a5;
        Bundle bundle6 = bundle.getBundle(k1);
        if (bundle6 == null) {
            a6 = null;
        } else {
            a6 = h.l1.a(bundle6);
        }
        return new C8322nf1(str, eVar, a6, gVar, c11005yf1, iVar);
    }

    public static C8322nf1 d(Uri uri) {
        return new c().L(uri).a();
    }

    public static C8322nf1 f(String str) {
        return new c().M(str).a();
    }

    private Bundle g(boolean z) {
        h hVar;
        Bundle bundle = new Bundle();
        if (!this.X.equals("")) {
            bundle.putString(f1, this.X);
        }
        if (!this.Y0.equals(g.a1)) {
            bundle.putBundle(g1, this.Y0.e());
        }
        if (!this.Z0.equals(C11005yf1.Q2)) {
            bundle.putBundle(h1, this.Z0.e());
        }
        if (!this.a1.equals(d.a1)) {
            bundle.putBundle(i1, this.a1.e());
        }
        if (!this.c1.equals(i.Y0)) {
            bundle.putBundle(j1, this.c1.e());
        }
        if (z && (hVar = this.Y) != null) {
            bundle.putBundle(k1, hVar.e());
        }
        return bundle;
    }

    public c b() {
        return new c();
    }

    @Override // o.InterfaceC8368nr
    public Bundle e() {
        return g(false);
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8322nf1)) {
            return false;
        }
        C8322nf1 c8322nf1 = (C8322nf1) obj;
        if (TD2.g(this.X, c8322nf1.X) && this.a1.equals(c8322nf1.a1) && TD2.g(this.Y, c8322nf1.Y) && TD2.g(this.Y0, c8322nf1.Y0) && TD2.g(this.Z0, c8322nf1.Z0) && TD2.g(this.c1, c8322nf1.c1)) {
            return true;
        }
        return false;
    }

    public Bundle h() {
        return g(true);
    }

    public int hashCode() {
        int i2;
        int hashCode = this.X.hashCode() * 31;
        h hVar = this.Y;
        if (hVar != null) {
            i2 = hVar.hashCode();
        } else {
            i2 = 0;
        }
        return ((((((((hashCode + i2) * 31) + this.Y0.hashCode()) * 31) + this.a1.hashCode()) * 31) + this.Z0.hashCode()) * 31) + this.c1.hashCode();
    }

    /* renamed from: o.nf1$k */
    /* loaded from: classes2.dex */
    public static class k implements InterfaceC8368nr {
        public static final String c1 = TD2.R0(0);
        public static final String d1 = TD2.R0(1);
        public static final String e1 = TD2.R0(2);
        public static final String f1 = TD2.R0(3);
        public static final String g1 = TD2.R0(4);
        public static final String h1 = TD2.R0(5);
        public static final String i1 = TD2.R0(6);
        public static final InterfaceC8368nr.a<k> j1 = new InterfaceC8368nr.a() { // from class: o.vf1
            @Override // o.InterfaceC8368nr.a
            public final InterfaceC8368nr a(Bundle bundle) {
                C8322nf1.k c;
                c = C8322nf1.k.c(bundle);
                return c;
            }
        };
        public final Uri X;
        @InterfaceC11300zs1
        public final String Y;
        public final int Y0;
        @InterfaceC11300zs1
        public final String Z;
        public final int Z0;
        @InterfaceC11300zs1
        public final String a1;
        @InterfaceC11300zs1
        public final String b1;

        /* renamed from: o.nf1$k$a */
        /* loaded from: classes2.dex */
        public static final class a {
            public Uri a;
            @InterfaceC11300zs1
            public String b;
            @InterfaceC11300zs1
            public String c;
            public int d;
            public int e;
            @InterfaceC11300zs1
            public String f;
            @InterfaceC11300zs1
            public String g;

            public k i() {
                return new k(this);
            }

            public final j j() {
                return new j(this);
            }

            @InterfaceC6181ey
            public a k(@InterfaceC11300zs1 String str) {
                this.g = str;
                return this;
            }

            @InterfaceC6181ey
            public a l(@InterfaceC11300zs1 String str) {
                this.f = str;
                return this;
            }

            @InterfaceC6181ey
            public a m(@InterfaceC11300zs1 String str) {
                this.c = str;
                return this;
            }

            @InterfaceC6181ey
            public a n(@InterfaceC11300zs1 String str) {
                this.b = str;
                return this;
            }

            @InterfaceC6181ey
            public a o(int i) {
                this.e = i;
                return this;
            }

            @InterfaceC6181ey
            public a p(int i) {
                this.d = i;
                return this;
            }

            @InterfaceC6181ey
            public a q(Uri uri) {
                this.a = uri;
                return this;
            }

            public a(Uri uri) {
                this.a = uri;
            }

            public a(k kVar) {
                this.a = kVar.X;
                this.b = kVar.Y;
                this.c = kVar.Z;
                this.d = kVar.Y0;
                this.e = kVar.Z0;
                this.f = kVar.a1;
                this.g = kVar.b1;
            }
        }

        public static k c(Bundle bundle) {
            String string = bundle.getString(d1);
            String string2 = bundle.getString(e1);
            int i = bundle.getInt(f1, 0);
            int i2 = bundle.getInt(g1, 0);
            String string3 = bundle.getString(h1);
            return new a((Uri) C9542sf.g((Uri) bundle.getParcelable(c1))).n(string).m(string2).p(i).o(i2).l(string3).k(bundle.getString(i1)).i();
        }

        public a b() {
            return new a();
        }

        @Override // o.InterfaceC8368nr
        public Bundle e() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(c1, this.X);
            String str = this.Y;
            if (str != null) {
                bundle.putString(d1, str);
            }
            String str2 = this.Z;
            if (str2 != null) {
                bundle.putString(e1, str2);
            }
            int i = this.Y0;
            if (i != 0) {
                bundle.putInt(f1, i);
            }
            int i2 = this.Z0;
            if (i2 != 0) {
                bundle.putInt(g1, i2);
            }
            String str3 = this.a1;
            if (str3 != null) {
                bundle.putString(h1, str3);
            }
            String str4 = this.b1;
            if (str4 != null) {
                bundle.putString(i1, str4);
            }
            return bundle;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (this.X.equals(kVar.X) && TD2.g(this.Y, kVar.Y) && TD2.g(this.Z, kVar.Z) && this.Y0 == kVar.Y0 && this.Z0 == kVar.Z0 && TD2.g(this.a1, kVar.a1) && TD2.g(this.b1, kVar.b1)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.X.hashCode() * 31;
            String str = this.Y;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode4 + hashCode) * 31;
            String str2 = this.Z;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (((((i2 + hashCode2) * 31) + this.Y0) * 31) + this.Z0) * 31;
            String str3 = this.a1;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str4 = this.b1;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return i4 + i;
        }

        public k(Uri uri, String str, @InterfaceC11300zs1 String str2, int i, int i2, @InterfaceC11300zs1 String str3, @InterfaceC11300zs1 String str4) {
            this.X = uri;
            this.Y = str;
            this.Z = str2;
            this.Y0 = i;
            this.Z0 = i2;
            this.a1 = str3;
            this.b1 = str4;
        }

        public k(a aVar) {
            this.X = aVar.a;
            this.Y = aVar.b;
            this.Z = aVar.c;
            this.Y0 = aVar.d;
            this.Z0 = aVar.e;
            this.a1 = aVar.f;
            this.b1 = aVar.g;
        }
    }

    public C8322nf1(String str, e eVar, @InterfaceC11300zs1 h hVar, g gVar, C11005yf1 c11005yf1, i iVar) {
        this.X = str;
        this.Y = hVar;
        this.Z = hVar;
        this.Y0 = gVar;
        this.Z0 = c11005yf1;
        this.a1 = eVar;
        this.b1 = eVar;
        this.c1 = iVar;
    }
}
