package o;

/* loaded from: classes.dex */
public class SG2 {
    public static final String d = "VideoTimebaseConverter";
    public final InterfaceC4540Vo2 a;
    public long b = -1;
    public EnumC5905dp2 c;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC5905dp2.values().length];
            a = iArr;
            try {
                iArr[EnumC5905dp2.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC5905dp2.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public SG2(InterfaceC4540Vo2 interfaceC4540Vo2, EnumC5905dp2 enumC5905dp2) {
        this.a = interfaceC4540Vo2;
        this.c = enumC5905dp2;
    }

    public final long a() {
        long j = Long.MAX_VALUE;
        long j2 = 0;
        for (int i = 0; i < 3; i++) {
            long b = this.a.b();
            long a2 = this.a.a();
            long b2 = this.a.b();
            long j3 = b2 - b;
            if (i == 0 || j3 < j) {
                j2 = a2 - ((b + b2) >> 1);
                j = j3;
            }
        }
        return Math.max(0L, j2);
    }

    public long b(long j) {
        if (this.c == null) {
            if (c(j)) {
                this.c = EnumC5905dp2.REALTIME;
            } else {
                this.c = EnumC5905dp2.UPTIME;
            }
            C7433k41.a(d, "Detect input timebase = " + this.c);
        }
        int i = a.a[this.c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return j;
            }
            throw new AssertionError("Unknown timebase: " + this.c);
        }
        if (this.b == -1) {
            this.b = a();
            C7433k41.a(d, "mUptimeToRealtimeOffsetUs = " + this.b);
        }
        return j - this.b;
    }

    public final boolean c(long j) {
        if (Math.abs(j - this.a.a()) < Math.abs(j - this.a.b())) {
            return true;
        }
        return false;
    }
}
