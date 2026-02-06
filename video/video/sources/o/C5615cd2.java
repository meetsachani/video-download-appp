package o;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: o.cd2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5615cd2 {
    public static final long h = 1000000;
    public final String a;
    public c b;
    public b c;
    public long d;
    public long e;
    public long f;
    public long g;

    /* renamed from: o.cd2$b */
    /* loaded from: classes4.dex */
    public enum b {
        SPLIT,
        UNSPLIT
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.cd2$c */
    /* loaded from: classes4.dex */
    public static abstract class c {
        public static final c X;
        public static final c Y;
        public static final c Y0;
        public static final c Z;
        public static final /* synthetic */ c[] Z0;

        /* renamed from: o.cd2$c$a */
        /* loaded from: classes4.dex */
        public enum a extends c {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // o.C5615cd2.c
            public boolean e() {
                return true;
            }

            @Override // o.C5615cd2.c
            public boolean g() {
                return false;
            }

            @Override // o.C5615cd2.c
            public boolean h() {
                return false;
            }
        }

        /* renamed from: o.cd2$c$b */
        /* loaded from: classes4.dex */
        public enum b extends c {
            public b(String str, int i) {
                super(str, i);
            }

            @Override // o.C5615cd2.c
            public boolean e() {
                return false;
            }

            @Override // o.C5615cd2.c
            public boolean g() {
                return true;
            }

            @Override // o.C5615cd2.c
            public boolean h() {
                return false;
            }
        }

        /* renamed from: o.cd2$c$c  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public enum C0265c extends c {
            public C0265c(String str, int i) {
                super(str, i);
            }

            @Override // o.C5615cd2.c
            public boolean e() {
                return true;
            }

            @Override // o.C5615cd2.c
            public boolean g() {
                return false;
            }

            @Override // o.C5615cd2.c
            public boolean h() {
                return true;
            }
        }

        /* renamed from: o.cd2$c$d */
        /* loaded from: classes4.dex */
        public enum d extends c {
            public d(String str, int i) {
                super(str, i);
            }

            @Override // o.C5615cd2.c
            public boolean e() {
                return false;
            }

            @Override // o.C5615cd2.c
            public boolean g() {
                return true;
            }

            @Override // o.C5615cd2.c
            public boolean h() {
                return false;
            }
        }

        static {
            a aVar = new a(DV.b, 0);
            X = aVar;
            b bVar = new b("STOPPED", 1);
            Y = bVar;
            C0265c c0265c = new C0265c(DV.c, 2);
            Z = c0265c;
            d dVar = new d("UNSTARTED", 3);
            Y0 = dVar;
            Z0 = new c[]{aVar, bVar, c0265c, dVar};
        }

        public c(String str, int i) {
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) Z0.clone();
        }

        public abstract boolean e();

        public abstract boolean g();

        public abstract boolean h();
    }

    public C5615cd2() {
        this(null);
    }

    public static C5615cd2 a() {
        return new C5615cd2();
    }

    public static C5615cd2 b() {
        C5615cd2 c5615cd2 = new C5615cd2();
        c5615cd2.s();
        return c5615cd2;
    }

    public String c() {
        return C5738d80.d(h());
    }

    public String d() {
        return C5738d80.d(k());
    }

    public String e() {
        return this.a;
    }

    public long f() {
        long j;
        long j2;
        c cVar = this.b;
        if (cVar != c.Y && cVar != c.Z) {
            if (cVar == c.Y0) {
                return 0L;
            }
            if (cVar == c.X) {
                j = System.nanoTime();
                j2 = this.d;
            } else {
                throw new IllegalStateException("Illegal running state has occurred.");
            }
        } else {
            j = this.g;
            j2 = this.d;
        }
        return j - j2;
    }

    public long g() {
        if (this.c == b.SPLIT) {
            return this.g - this.d;
        }
        throw new IllegalStateException("Stopwatch must be split to get the split time.");
    }

    public long h() {
        return g() / 1000000;
    }

    public long i() {
        if (this.b != c.Y0) {
            return this.e;
        }
        throw new IllegalStateException("Stopwatch has not been started");
    }

    public long j() {
        if (this.b != c.Y0) {
            return this.f;
        }
        throw new IllegalStateException("Stopwatch has not been started");
    }

    public long k() {
        return f() / 1000000;
    }

    public long l(TimeUnit timeUnit) {
        return timeUnit.convert(f(), TimeUnit.NANOSECONDS);
    }

    public boolean m() {
        return this.b.e();
    }

    public boolean n() {
        return this.b.g();
    }

    public boolean o() {
        return this.b.h();
    }

    public void p() {
        this.b = c.Y0;
        this.c = b.UNSPLIT;
    }

    public void q() {
        if (this.b == c.Z) {
            this.d += System.nanoTime() - this.g;
            this.b = c.X;
            return;
        }
        throw new IllegalStateException("Stopwatch must be suspended to resume. ");
    }

    public void r() {
        if (this.b == c.X) {
            this.g = System.nanoTime();
            this.c = b.SPLIT;
            return;
        }
        throw new IllegalStateException("Stopwatch is not running. ");
    }

    public void s() {
        c cVar = this.b;
        if (cVar != c.Y) {
            if (cVar == c.Y0) {
                this.d = System.nanoTime();
                this.e = System.currentTimeMillis();
                this.b = c.X;
                return;
            }
            throw new IllegalStateException("Stopwatch already started. ");
        }
        throw new IllegalStateException("Stopwatch must be reset before being restarted. ");
    }

    public void t() {
        c cVar = this.b;
        c cVar2 = c.X;
        if (cVar != cVar2 && cVar != c.Z) {
            throw new IllegalStateException("Stopwatch is not running. ");
        }
        if (cVar == cVar2) {
            this.g = System.nanoTime();
            this.f = System.currentTimeMillis();
        }
        this.b = c.Y;
    }

    public String toString() {
        String objects = Objects.toString(this.a, "");
        String d = d();
        if (objects.isEmpty()) {
            return d;
        }
        return objects + C4500Ve2.b + d;
    }

    public void u() {
        if (this.b == c.X) {
            this.g = System.nanoTime();
            this.f = System.currentTimeMillis();
            this.b = c.Z;
            return;
        }
        throw new IllegalStateException("Stopwatch must be running to suspend. ");
    }

    public String v() {
        String objects = Objects.toString(this.a, "");
        String c2 = c();
        if (objects.isEmpty()) {
            return c2;
        }
        return objects + C4500Ve2.b + c2;
    }

    public void w() {
        if (this.c == b.SPLIT) {
            this.c = b.UNSPLIT;
            return;
        }
        throw new IllegalStateException("Stopwatch has not been split. ");
    }

    public C5615cd2(String str) {
        this.b = c.Y0;
        this.c = b.UNSPLIT;
        this.a = str;
    }
}
