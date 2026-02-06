package o;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.AbstractC6044eO0;
import o.ConcurrentMapC6443g21;

@InterfaceC11149zF0
@InterfaceC6086ea0
/* renamed from: o.ct  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5676ct {

    /* renamed from: o  reason: collision with root package name */
    public static final C5365bb2 f708o = C5365bb2.h(',').q();
    public static final C5365bb2 p = C5365bb2.h('=').q();
    public static final AbstractC6044eO0<String, m> q;
    @MB
    @InterfaceC5299bJ2
    public Integer a;
    @MB
    @InterfaceC5299bJ2
    public Long b;
    @MB
    @InterfaceC5299bJ2
    public Long c;
    @MB
    @InterfaceC5299bJ2
    public Integer d;
    @MB
    @InterfaceC5299bJ2
    public ConcurrentMapC6443g21.t e;
    @MB
    @InterfaceC5299bJ2
    public ConcurrentMapC6443g21.t f;
    @MB
    @InterfaceC5299bJ2
    public Boolean g;
    @InterfaceC5299bJ2
    public long h;
    @MB
    @InterfaceC5299bJ2
    public TimeUnit i;
    @InterfaceC5299bJ2
    public long j;
    @MB
    @InterfaceC5299bJ2
    public TimeUnit k;
    @InterfaceC5299bJ2
    public long l;
    @MB
    @InterfaceC5299bJ2
    public TimeUnit m;
    public final String n;

    /* renamed from: o.ct$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ConcurrentMapC6443g21.t.values().length];
            a = iArr;
            try {
                iArr[ConcurrentMapC6443g21.t.Z.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ConcurrentMapC6443g21.t.Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: o.ct$b */
    /* loaded from: classes3.dex */
    public static class b extends d {
        @Override // o.C5676ct.d
        public void b(C5676ct c5676ct, long j, TimeUnit timeUnit) {
            boolean z;
            if (c5676ct.k == null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.e(z, "expireAfterAccess already set");
            c5676ct.j = j;
            c5676ct.k = timeUnit;
        }
    }

    /* renamed from: o.ct$c */
    /* loaded from: classes3.dex */
    public static class c extends f {
        @Override // o.C5676ct.f
        public void b(C5676ct c5676ct, int i) {
            boolean z;
            Integer num = c5676ct.d;
            if (num == null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.u(z, "concurrency level was already set to ", num);
            c5676ct.d = Integer.valueOf(i);
        }
    }

    /* renamed from: o.ct$d */
    /* loaded from: classes3.dex */
    public static abstract class d implements m {
        @Override // o.C5676ct.m
        public void a(C5676ct c5676ct, String str, @MB String str2) {
            TimeUnit timeUnit;
            if (!C6108ef2.d(str2)) {
                try {
                    char charAt = str2.charAt(str2.length() - 1);
                    if (charAt != 'd') {
                        if (charAt != 'h') {
                            if (charAt != 'm') {
                                if (charAt == 's') {
                                    timeUnit = TimeUnit.SECONDS;
                                } else {
                                    throw new IllegalArgumentException(C5676ct.d("key %s invalid unit: was %s, must end with one of [dhms]", str, str2));
                                }
                            } else {
                                timeUnit = TimeUnit.MINUTES;
                            }
                        } else {
                            timeUnit = TimeUnit.HOURS;
                        }
                    } else {
                        timeUnit = TimeUnit.DAYS;
                    }
                    b(c5676ct, Long.parseLong(str2.substring(0, str2.length() - 1)), timeUnit);
                    return;
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException(C5676ct.d("key %s value set to %s, must be integer", str, str2));
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
            sb.append("value of key ");
            sb.append(str);
            sb.append(" omitted");
            throw new IllegalArgumentException(sb.toString());
        }

        public abstract void b(C5676ct c5676ct, long j, TimeUnit timeUnit);
    }

    /* renamed from: o.ct$e */
    /* loaded from: classes3.dex */
    public static class e extends f {
        @Override // o.C5676ct.f
        public void b(C5676ct c5676ct, int i) {
            boolean z;
            Integer num = c5676ct.a;
            if (num == null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.u(z, "initial capacity was already set to ", num);
            c5676ct.a = Integer.valueOf(i);
        }
    }

    /* renamed from: o.ct$f */
    /* loaded from: classes3.dex */
    public static abstract class f implements m {
        @Override // o.C5676ct.m
        public void a(C5676ct c5676ct, String str, String str2) {
            if (!C6108ef2.d(str2)) {
                try {
                    b(c5676ct, Integer.parseInt(str2));
                    return;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException(C5676ct.d("key %s value set to %s, must be integer", str, str2), e);
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
            sb.append("value of key ");
            sb.append(str);
            sb.append(" omitted");
            throw new IllegalArgumentException(sb.toString());
        }

        public abstract void b(C5676ct c5676ct, int i);
    }

    /* renamed from: o.ct$g */
    /* loaded from: classes3.dex */
    public static class g implements m {
        public final ConcurrentMapC6443g21.t a;

        public g(ConcurrentMapC6443g21.t tVar) {
            this.a = tVar;
        }

        @Override // o.C5676ct.m
        public void a(C5676ct c5676ct, String str, @MB String str2) {
            boolean z;
            boolean z2 = false;
            if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.u(z, "key %s does not take values", str);
            ConcurrentMapC6443g21.t tVar = c5676ct.e;
            if (tVar == null) {
                z2 = true;
            }
            C10664xF1.y(z2, "%s was already set to %s", str, tVar);
            c5676ct.e = this.a;
        }
    }

    /* renamed from: o.ct$h */
    /* loaded from: classes3.dex */
    public static abstract class h implements m {
        @Override // o.C5676ct.m
        public void a(C5676ct c5676ct, String str, String str2) {
            if (!C6108ef2.d(str2)) {
                try {
                    b(c5676ct, Long.parseLong(str2));
                    return;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException(C5676ct.d("key %s value set to %s, must be integer", str, str2), e);
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
            sb.append("value of key ");
            sb.append(str);
            sb.append(" omitted");
            throw new IllegalArgumentException(sb.toString());
        }

        public abstract void b(C5676ct c5676ct, long j);
    }

    /* renamed from: o.ct$i */
    /* loaded from: classes3.dex */
    public static class i extends h {
        @Override // o.C5676ct.h
        public void b(C5676ct c5676ct, long j) {
            boolean z;
            Long l = c5676ct.b;
            boolean z2 = false;
            if (l == null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.u(z, "maximum size was already set to ", l);
            Long l2 = c5676ct.c;
            if (l2 == null) {
                z2 = true;
            }
            C10664xF1.u(z2, "maximum weight was already set to ", l2);
            c5676ct.b = Long.valueOf(j);
        }
    }

    /* renamed from: o.ct$j */
    /* loaded from: classes3.dex */
    public static class j extends h {
        @Override // o.C5676ct.h
        public void b(C5676ct c5676ct, long j) {
            boolean z;
            Long l = c5676ct.c;
            boolean z2 = false;
            if (l == null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.u(z, "maximum weight was already set to ", l);
            Long l2 = c5676ct.b;
            if (l2 == null) {
                z2 = true;
            }
            C10664xF1.u(z2, "maximum size was already set to ", l2);
            c5676ct.c = Long.valueOf(j);
        }
    }

    /* renamed from: o.ct$k */
    /* loaded from: classes3.dex */
    public static class k implements m {
        @Override // o.C5676ct.m
        public void a(C5676ct c5676ct, String str, @MB String str2) {
            boolean z;
            boolean z2 = false;
            if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.e(z, "recordStats does not take values");
            if (c5676ct.g == null) {
                z2 = true;
            }
            C10664xF1.e(z2, "recordStats already set");
            c5676ct.g = Boolean.TRUE;
        }
    }

    /* renamed from: o.ct$l */
    /* loaded from: classes3.dex */
    public static class l extends d {
        @Override // o.C5676ct.d
        public void b(C5676ct c5676ct, long j, TimeUnit timeUnit) {
            boolean z;
            if (c5676ct.m == null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.e(z, "refreshAfterWrite already set");
            c5676ct.l = j;
            c5676ct.m = timeUnit;
        }
    }

    /* renamed from: o.ct$m */
    /* loaded from: classes3.dex */
    public interface m {
        void a(C5676ct c5676ct, String str, @MB String str2);
    }

    /* renamed from: o.ct$n */
    /* loaded from: classes3.dex */
    public static class n implements m {
        public final ConcurrentMapC6443g21.t a;

        public n(ConcurrentMapC6443g21.t tVar) {
            this.a = tVar;
        }

        @Override // o.C5676ct.m
        public void a(C5676ct c5676ct, String str, @MB String str2) {
            boolean z;
            boolean z2 = false;
            if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.u(z, "key %s does not take values", str);
            ConcurrentMapC6443g21.t tVar = c5676ct.f;
            if (tVar == null) {
                z2 = true;
            }
            C10664xF1.y(z2, "%s was already set to %s", str, tVar);
            c5676ct.f = this.a;
        }
    }

    /* renamed from: o.ct$o */
    /* loaded from: classes3.dex */
    public static class o extends d {
        @Override // o.C5676ct.d
        public void b(C5676ct c5676ct, long j, TimeUnit timeUnit) {
            boolean z;
            if (c5676ct.i == null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.e(z, "expireAfterWrite already set");
            c5676ct.h = j;
            c5676ct.i = timeUnit;
        }
    }

    static {
        AbstractC6044eO0.b i2 = AbstractC6044eO0.b().i("initialCapacity", new e()).i("maximumSize", new i()).i("maximumWeight", new j()).i("concurrencyLevel", new c());
        ConcurrentMapC6443g21.t tVar = ConcurrentMapC6443g21.t.Z;
        q = i2.i("weakKeys", new g(tVar)).i("softValues", new n(ConcurrentMapC6443g21.t.Y)).i("weakValues", new n(tVar)).i("recordStats", new k()).i("expireAfterAccess", new b()).i("expireAfterWrite", new o()).i("refreshAfterWrite", new l()).i("refreshInterval", new l()).d();
    }

    public C5676ct(String str) {
        this.n = str;
    }

    public static C5676ct b() {
        return e("maximumSize=0");
    }

    @MB
    public static Long c(long j2, @MB TimeUnit timeUnit) {
        if (timeUnit == null) {
            return null;
        }
        return Long.valueOf(timeUnit.toNanos(j2));
    }

    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public static C5676ct e(String str) {
        boolean z;
        String str2;
        C5676ct c5676ct = new C5676ct(str);
        if (!str.isEmpty()) {
            for (String str3 : f708o.n(str)) {
                AbstractC5317bO0 D = AbstractC5317bO0.D(p.n(str3));
                C10664xF1.e(!D.isEmpty(), "blank key-value pair");
                boolean z2 = false;
                if (D.size() <= 2) {
                    z = true;
                } else {
                    z = false;
                }
                C10664xF1.u(z, "key-value pair %s with more than one equals sign", str3);
                String str4 = (String) D.get(0);
                m mVar = q.get(str4);
                if (mVar != null) {
                    z2 = true;
                }
                C10664xF1.u(z2, "unknown key %s", str4);
                if (D.size() == 1) {
                    str2 = null;
                } else {
                    str2 = (String) D.get(1);
                }
                mVar.a(c5676ct, str4, str2);
            }
        }
        return c5676ct;
    }

    public boolean equals(@MB Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5676ct)) {
            return false;
        }
        C5676ct c5676ct = (C5676ct) obj;
        if (C2593Bt1.a(this.a, c5676ct.a) && C2593Bt1.a(this.b, c5676ct.b) && C2593Bt1.a(this.c, c5676ct.c) && C2593Bt1.a(this.d, c5676ct.d) && C2593Bt1.a(this.e, c5676ct.e) && C2593Bt1.a(this.f, c5676ct.f) && C2593Bt1.a(this.g, c5676ct.g) && C2593Bt1.a(c(this.h, this.i), c(c5676ct.h, c5676ct.i)) && C2593Bt1.a(c(this.j, this.k), c(c5676ct.j, c5676ct.k)) && C2593Bt1.a(c(this.l, this.m), c(c5676ct.l, c5676ct.m))) {
            return true;
        }
        return false;
    }

    public C5434bt<Object, Object> f() {
        C5434bt<Object, Object> D = C5434bt.D();
        Integer num = this.a;
        if (num != null) {
            D.x(num.intValue());
        }
        Long l2 = this.b;
        if (l2 != null) {
            D.B(l2.longValue());
        }
        Long l3 = this.c;
        if (l3 != null) {
            D.C(l3.longValue());
        }
        Integer num2 = this.d;
        if (num2 != null) {
            D.e(num2.intValue());
        }
        ConcurrentMapC6443g21.t tVar = this.e;
        if (tVar != null) {
            if (a.a[tVar.ordinal()] == 1) {
                D.M();
            } else {
                throw new AssertionError();
            }
        }
        ConcurrentMapC6443g21.t tVar2 = this.f;
        if (tVar2 != null) {
            int i2 = a.a[tVar2.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    D.J();
                } else {
                    throw new AssertionError();
                }
            } else {
                D.N();
            }
        }
        Boolean bool = this.g;
        if (bool != null && bool.booleanValue()) {
            D.E();
        }
        TimeUnit timeUnit = this.i;
        if (timeUnit != null) {
            D.g(this.h, timeUnit);
        }
        TimeUnit timeUnit2 = this.k;
        if (timeUnit2 != null) {
            D.f(this.j, timeUnit2);
        }
        TimeUnit timeUnit3 = this.m;
        if (timeUnit3 != null) {
            D.F(this.l, timeUnit3);
        }
        return D;
    }

    public String g() {
        return this.n;
    }

    public int hashCode() {
        return C2593Bt1.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, c(this.h, this.i), c(this.j, this.k), c(this.l, this.m));
    }

    public String toString() {
        return C3743Nk1.c(this).s(g()).toString();
    }
}
