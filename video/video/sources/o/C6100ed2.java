package o;

import java.util.concurrent.TimeUnit;

@InterfaceC10420wF0(emulated = true)
@InterfaceC8301na0
/* renamed from: o.ed2 */
/* loaded from: classes3.dex */
public final class C6100ed2 {
    public final AbstractC10799xo2 a;
    public boolean b;
    public long c;
    public long d;

    /* renamed from: o.ed2$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public C6100ed2() {
        this.a = AbstractC10799xo2.b();
    }

    public static String a(TimeUnit timeUnit) {
        switch (a.a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return C10901yE.i;
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    public static TimeUnit b(long j) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        if (timeUnit7.convert(j, timeUnit2) > 0) {
            return timeUnit7;
        }
        return timeUnit2;
    }

    public static C6100ed2 c() {
        return new C6100ed2().k();
    }

    public static C6100ed2 d(AbstractC10799xo2 abstractC10799xo2) {
        return new C6100ed2(abstractC10799xo2).k();
    }

    public static C6100ed2 e() {
        return new C6100ed2();
    }

    public static C6100ed2 f(AbstractC10799xo2 abstractC10799xo2) {
        return new C6100ed2(abstractC10799xo2);
    }

    public long g(TimeUnit timeUnit) {
        return timeUnit.convert(h(), TimeUnit.NANOSECONDS);
    }

    public final long h() {
        if (this.b) {
            return (this.a.a() - this.d) + this.c;
        }
        return this.c;
    }

    public boolean i() {
        return this.b;
    }

    @InterfaceC6181ey
    public C6100ed2 j() {
        this.c = 0L;
        this.b = false;
        return this;
    }

    @InterfaceC6181ey
    public C6100ed2 k() {
        C10664xF1.h0(!this.b, "This stopwatch is already running.");
        this.b = true;
        this.d = this.a.a();
        return this;
    }

    @InterfaceC6181ey
    public C6100ed2 l() {
        long a2 = this.a.a();
        C10664xF1.h0(this.b, "This stopwatch is already stopped.");
        this.b = false;
        this.c += a2 - this.d;
        return this;
    }

    public String toString() {
        long h = h();
        TimeUnit b = b(h);
        String d = C7226jD1.d(h / TimeUnit.NANOSECONDS.convert(1L, b));
        String a2 = a(b);
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 1 + String.valueOf(a2).length());
        sb.append(d);
        sb.append(C4500Ve2.b);
        sb.append(a2);
        return sb.toString();
    }

    public C6100ed2(AbstractC10799xo2 abstractC10799xo2) {
        this.a = (AbstractC10799xo2) C10664xF1.F(abstractC10799xo2, "ticker");
    }
}
