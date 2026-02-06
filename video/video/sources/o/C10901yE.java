package o;

import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.AbstractC6044eO0;

@Deprecated
/* renamed from: o.yE  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10901yE {
    public static final String h = "d";
    public static final String i = "h";
    public static final String j = "s";
    public static final String k = "v";
    public static final String l = "l";
    public static final String m = "i";
    public static final String n = "a";

    /* renamed from: o  reason: collision with root package name */
    public static final String f914o = "v";
    public static final String p = "av";
    public final C10415wE a;
    public final InterfaceC6859hi0 b;
    public final long c;
    public final String d;
    public final boolean e;
    public long f;
    @InterfaceC11300zs1
    public String g;

    /* renamed from: o.yE$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final long c;
        @InterfaceC11300zs1
        public final String d;
        @InterfaceC11300zs1
        public final String e;

        /* renamed from: o.yE$b$a */
        /* loaded from: classes2.dex */
        public static final class a {
            public int a = C10323vs.f;
            public int b = C10323vs.f;
            public long c = C10323vs.b;
            @InterfaceC11300zs1
            public String d;
            @InterfaceC11300zs1
            public String e;

            public b f() {
                return new b(this);
            }

            @InterfaceC6181ey
            public a g(int i) {
                this.a = i;
                return this;
            }

            @InterfaceC6181ey
            public a h(@InterfaceC11300zs1 String str) {
                this.e = str;
                return this;
            }

            @InterfaceC6181ey
            public a i(long j) {
                boolean z;
                if (j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                C9542sf.a(z);
                this.c = j;
                return this;
            }

            @InterfaceC6181ey
            public a j(@InterfaceC11300zs1 String str) {
                this.d = str;
                return this;
            }

            @InterfaceC6181ey
            public a k(int i) {
                this.b = i;
                return this;
            }
        }

        public void a(AbstractC6044eO0.b<String, String> bVar) {
            StringBuilder sb = new StringBuilder();
            int i = this.a;
            if (i != -2147483647) {
                sb.append(TD2.M("%s=%d,", "br", Integer.valueOf(i)));
            }
            int i2 = this.b;
            if (i2 != -2147483647) {
                sb.append(TD2.M("%s=%d,", "tb", Integer.valueOf(i2)));
            }
            long j = this.c;
            if (j != C10323vs.b) {
                sb.append(TD2.M("%s=%d,", "d", Long.valueOf(j)));
            }
            if (!TextUtils.isEmpty(this.d)) {
                sb.append(TD2.M("%s=%s,", C10415wE.t, this.d));
            }
            if (!TextUtils.isEmpty(this.e)) {
                sb.append(TD2.M("%s,", this.e));
            }
            if (sb.length() == 0) {
                return;
            }
            sb.setLength(sb.length() - 1);
            bVar.i(C10415wE.e, sb.toString());
        }

        public b(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
        }
    }

    /* renamed from: o.yE$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public final long a;
        public final long b;
        @InterfaceC11300zs1
        public final String c;

        /* renamed from: o.yE$c$a */
        /* loaded from: classes2.dex */
        public static final class a {
            public long a = C10323vs.b;
            public long b = Long.MIN_VALUE;
            @InterfaceC11300zs1
            public String c;

            public c d() {
                return new c(this);
            }

            @InterfaceC6181ey
            public a e(long j) {
                boolean z;
                if (j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                C9542sf.a(z);
                this.a = ((j + 50) / 100) * 100;
                return this;
            }

            @InterfaceC6181ey
            public a f(@InterfaceC11300zs1 String str) {
                this.c = str;
                return this;
            }

            @InterfaceC6181ey
            public a g(long j) {
                boolean z;
                if (j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                C9542sf.a(z);
                this.b = ((j + 50) / 100) * 100;
                return this;
            }
        }

        public void a(AbstractC6044eO0.b<String, String> bVar) {
            StringBuilder sb = new StringBuilder();
            long j = this.a;
            if (j != C10323vs.b) {
                sb.append(TD2.M("%s=%d,", C10415wE.j, Long.valueOf(j)));
            }
            long j2 = this.b;
            if (j2 != Long.MIN_VALUE) {
                sb.append(TD2.M("%s=%d,", C10415wE.s, Long.valueOf(j2)));
            }
            if (!TextUtils.isEmpty(this.c)) {
                sb.append(TD2.M("%s,", this.c));
            }
            if (sb.length() == 0) {
                return;
            }
            sb.setLength(sb.length() - 1);
            bVar.i(C10415wE.f, sb.toString());
        }

        public c(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
        }
    }

    /* renamed from: o.yE$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public static final int f = 1;
        @InterfaceC11300zs1
        public final String a;
        @InterfaceC11300zs1
        public final String b;
        @InterfaceC11300zs1
        public final String c;
        @InterfaceC11300zs1
        public final String d;
        @InterfaceC11300zs1
        public final String e;

        /* renamed from: o.yE$d$a */
        /* loaded from: classes2.dex */
        public static final class a {
            @InterfaceC11300zs1
            public String a;
            @InterfaceC11300zs1
            public String b;
            @InterfaceC11300zs1
            public String c;
            @InterfaceC11300zs1
            public String d;
            @InterfaceC11300zs1
            public String e;

            public d f() {
                return new d(this);
            }

            @InterfaceC6181ey
            public a g(@InterfaceC11300zs1 String str) {
                boolean z;
                if (str != null && str.length() > 64) {
                    z = false;
                } else {
                    z = true;
                }
                C9542sf.a(z);
                this.a = str;
                return this;
            }

            @InterfaceC6181ey
            public a h(@InterfaceC11300zs1 String str) {
                this.e = str;
                return this;
            }

            @InterfaceC6181ey
            public a i(@InterfaceC11300zs1 String str) {
                boolean z;
                if (str != null && str.length() > 64) {
                    z = false;
                } else {
                    z = true;
                }
                C9542sf.a(z);
                this.b = str;
                return this;
            }

            @InterfaceC6181ey
            public a j(@InterfaceC11300zs1 String str) {
                this.d = str;
                return this;
            }

            @InterfaceC6181ey
            public a k(@InterfaceC11300zs1 String str) {
                this.c = str;
                return this;
            }
        }

        public void a(AbstractC6044eO0.b<String, String> bVar) {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.a)) {
                sb.append(TD2.M("%s=\"%s\",", C10415wE.k, this.a));
            }
            if (!TextUtils.isEmpty(this.b)) {
                sb.append(TD2.M("%s=\"%s\",", C10415wE.l, this.b));
            }
            if (!TextUtils.isEmpty(this.c)) {
                sb.append(TD2.M("%s=%s,", C10415wE.n, this.c));
            }
            if (!TextUtils.isEmpty(this.d)) {
                sb.append(TD2.M("%s=%s,", "st", this.d));
            }
            if (!TextUtils.isEmpty(this.e)) {
                sb.append(TD2.M("%s,", this.e));
            }
            if (sb.length() == 0) {
                return;
            }
            sb.setLength(sb.length() - 1);
            bVar.i(C10415wE.g, sb.toString());
        }

        public d(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
        }
    }

    /* renamed from: o.yE$e */
    /* loaded from: classes2.dex */
    public static final class e {
        public final int a;
        @InterfaceC11300zs1
        public final String b;

        /* renamed from: o.yE$e$a */
        /* loaded from: classes2.dex */
        public static final class a {
            public int a = C10323vs.f;
            @InterfaceC11300zs1
            public String b;

            public e c() {
                return new e(this);
            }

            @InterfaceC6181ey
            public a d(@InterfaceC11300zs1 String str) {
                this.b = str;
                return this;
            }

            @InterfaceC6181ey
            public a e(int i) {
                boolean z;
                if (i != -2147483647 && i < 0) {
                    z = false;
                } else {
                    z = true;
                }
                C9542sf.a(z);
                if (i != -2147483647) {
                    i = ((i + 50) / 100) * 100;
                }
                this.a = i;
                return this;
            }
        }

        public void a(AbstractC6044eO0.b<String, String> bVar) {
            StringBuilder sb = new StringBuilder();
            int i = this.a;
            if (i != -2147483647) {
                sb.append(TD2.M("%s=%d,", C10415wE.m, Integer.valueOf(i)));
            }
            if (!TextUtils.isEmpty(this.b)) {
                sb.append(TD2.M("%s,", this.b));
            }
            if (sb.length() == 0) {
                return;
            }
            sb.setLength(sb.length() - 1);
            bVar.i(C10415wE.h, sb.toString());
        }

        public e(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.yE$f */
    /* loaded from: classes2.dex */
    public @interface f {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.yE$g */
    /* loaded from: classes2.dex */
    public @interface g {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.yE$h */
    /* loaded from: classes2.dex */
    public @interface h {
    }

    public C10901yE(C10415wE c10415wE, InterfaceC6859hi0 interfaceC6859hi0, long j2, String str, boolean z) {
        boolean z2;
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9542sf.a(z2);
        this.a = c10415wE;
        this.b = interfaceC6859hi0;
        this.c = j2;
        this.d = str;
        this.e = z;
        this.f = C10323vs.b;
    }

    @InterfaceC11300zs1
    public static String c(InterfaceC6859hi0 interfaceC6859hi0) {
        boolean z;
        if (interfaceC6859hi0 != null) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        int l2 = C4128Rj1.l(interfaceC6859hi0.t().g1);
        if (l2 == -1) {
            l2 = C4128Rj1.l(interfaceC6859hi0.t().f1);
        }
        if (l2 == 1) {
            return "a";
        }
        if (l2 == 2) {
            return "v";
        }
        return null;
    }

    public AbstractC6044eO0<String, String> a() {
        String str;
        AbstractC6044eO0<String, String> c2 = this.a.c.c();
        int q = TD2.q(this.b.t().c1, 1000);
        b.a h2 = new b.a().h(c2.get(C10415wE.e));
        if (!b()) {
            if (this.a.a()) {
                h2.g(q);
            }
            if (this.a.k()) {
                C9593sr2 n2 = this.b.n();
                int i2 = this.b.t().c1;
                for (int i3 = 0; i3 < n2.X; i3++) {
                    i2 = Math.max(i2, n2.c(i3).c1);
                }
                h2.k(TD2.q(i2, 1000));
            }
            if (this.a.f()) {
                long j2 = this.f;
                if (j2 != C10323vs.b) {
                    h2.i(j2 / 1000);
                }
            }
        }
        if (this.a.g()) {
            h2.j(this.g);
        }
        c.a f2 = new c.a().f(c2.get(C10415wE.f));
        if (!b() && this.a.b()) {
            f2.e(this.c / 1000);
        }
        if (this.a.e() && this.b.c() != Long.MIN_VALUE) {
            f2.g(TD2.r(this.b.c(), 1000L));
        }
        d.a h3 = new d.a().h(c2.get(C10415wE.g));
        if (this.a.c()) {
            h3.g(this.a.b);
        }
        if (this.a.h()) {
            h3.i(this.a.a);
        }
        if (this.a.j()) {
            h3.k(this.d);
        }
        if (this.a.i()) {
            if (this.e) {
                str = l;
            } else {
                str = "v";
            }
            h3.j(str);
        }
        e.a d2 = new e.a().d(c2.get(C10415wE.h));
        if (this.a.d()) {
            d2.e(this.a.c.b(q));
        }
        AbstractC6044eO0.b<String, String> b2 = AbstractC6044eO0.b();
        h2.f().a(b2);
        f2.d().a(b2);
        h3.f().a(b2);
        d2.c().a(b2);
        return b2.d();
    }

    public final boolean b() {
        String str = this.g;
        if (str != null && str.equals("i")) {
            return true;
        }
        return false;
    }

    @InterfaceC6181ey
    public C10901yE d(long j2) {
        boolean z;
        if (j2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        this.f = j2;
        return this;
    }

    @InterfaceC6181ey
    public C10901yE e(@InterfaceC11300zs1 String str) {
        this.g = str;
        return this;
    }
}
