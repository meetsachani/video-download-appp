package o;

@Deprecated
/* renamed from: o.yZ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C10980yZ implements L11 {
    public static final int A = 144310272;
    public static final int B = 13107200;
    public static final int m = 50000;
    public static final int n = 50000;

    /* renamed from: o  reason: collision with root package name */
    public static final int f917o = 2500;
    public static final int p = 5000;
    public static final int q = -1;
    public static final boolean r = false;
    public static final int s = 0;
    public static final boolean t = false;
    public static final int u = 131072000;
    public static final int v = 13107200;
    public static final int w = 131072;
    public static final int x = 131072;
    public static final int y = 131072;
    public static final int z = 131072;
    public final CW b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final int g;
    public final boolean h;
    public final long i;
    public final boolean j;
    public int k;
    public boolean l;

    /* renamed from: o.yZ$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @InterfaceC11300zs1
        public CW a;
        public int b = 50000;
        public int c = 50000;
        public int d = 2500;
        public int e = 5000;
        public int f = -1;
        public boolean g = false;
        public int h = 0;
        public boolean i = false;
        public boolean j;

        public C10980yZ a() {
            C9542sf.i(!this.j);
            this.j = true;
            if (this.a == null) {
                this.a = new CW(true, 65536);
            }
            return new C10980yZ(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        @InterfaceC6181ey
        public a b(CW cw) {
            C9542sf.i(!this.j);
            this.a = cw;
            return this;
        }

        @InterfaceC6181ey
        public a c(int i, boolean z) {
            C9542sf.i(!this.j);
            C10980yZ.l(i, 0, "backBufferDurationMs", "0");
            this.h = i;
            this.i = z;
            return this;
        }

        @InterfaceC6181ey
        public a d(int i, int i2, int i3, int i4) {
            C9542sf.i(!this.j);
            C10980yZ.l(i3, 0, "bufferForPlaybackMs", "0");
            C10980yZ.l(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
            C10980yZ.l(i, i3, "minBufferMs", "bufferForPlaybackMs");
            C10980yZ.l(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            C10980yZ.l(i2, i, "maxBufferMs", "minBufferMs");
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            return this;
        }

        @InterfaceC6181ey
        public a e(boolean z) {
            C9542sf.i(!this.j);
            this.g = z;
            return this;
        }

        @InterfaceC6181ey
        public a f(int i) {
            C9542sf.i(!this.j);
            this.f = i;
            return this;
        }
    }

    public C10980yZ() {
        this(new CW(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    public static void l(int i, int i2, String str, String str2) {
        boolean z2;
        if (i >= i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9542sf.b(z2, str + " cannot be less than " + str2);
    }

    public static int n(int i) {
        switch (i) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return A;
            case 1:
                return 13107200;
            case 2:
                return u;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    @Override // o.L11
    public boolean a() {
        return this.j;
    }

    @Override // o.L11
    public long b() {
        return this.i;
    }

    @Override // o.L11
    public void c(AbstractC7373jp2 abstractC7373jp2, C4604Wg1 c4604Wg1, InterfaceC10469wR1[] interfaceC10469wR1Arr, C10079ur2 c10079ur2, InterfaceC6859hi0[] interfaceC6859hi0Arr) {
        int i = this.g;
        if (i == -1) {
            i = m(interfaceC10469wR1Arr, interfaceC6859hi0Arr);
        }
        this.k = i;
        this.b.h(i);
    }

    @Override // o.L11
    public InterfaceC10877y8 e() {
        return this.b;
    }

    @Override // o.L11
    public void f() {
        o(true);
    }

    @Override // o.L11
    public boolean g(AbstractC7373jp2 abstractC7373jp2, C4604Wg1 c4604Wg1, long j, float f, boolean z2, long j2) {
        long j3;
        long x0 = TD2.x0(j, f);
        if (z2) {
            j3 = this.f;
        } else {
            j3 = this.e;
        }
        if (j2 != C10323vs.b) {
            j3 = Math.min(j2 / 2, j3);
        }
        if (j3 > 0 && x0 < j3) {
            if (this.h || this.b.d() < this.k) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // o.L11
    public void h() {
        o(true);
    }

    @Override // o.L11
    public boolean i(long j, long j2, float f) {
        boolean z2;
        boolean z3 = true;
        if (this.b.d() >= this.k) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j3 = this.c;
        if (f > 1.0f) {
            j3 = Math.min(TD2.s0(j3, f), this.d);
        }
        if (j2 < Math.max(j3, (long) C6118ei0.r2)) {
            if (!this.h && z2) {
                z3 = false;
            }
            this.l = z3;
            if (!z3 && j2 < C6118ei0.r2) {
                I31.n("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.d || z2) {
            this.l = false;
        }
        return this.l;
    }

    public int m(InterfaceC10469wR1[] interfaceC10469wR1Arr, InterfaceC6859hi0[] interfaceC6859hi0Arr) {
        int i = 0;
        for (int i2 = 0; i2 < interfaceC10469wR1Arr.length; i2++) {
            if (interfaceC6859hi0Arr[i2] != null) {
                i += n(interfaceC10469wR1Arr[i2].d());
            }
        }
        return Math.max(13107200, i);
    }

    public final void o(boolean z2) {
        int i = this.g;
        if (i == -1) {
            i = 13107200;
        }
        this.k = i;
        this.l = false;
        if (z2) {
            this.b.g();
        }
    }

    @Override // o.L11
    public void onPrepared() {
        o(false);
    }

    public C10980yZ(CW cw, int i, int i2, int i3, int i4, int i5, boolean z2, int i6, boolean z3) {
        l(i3, 0, "bufferForPlaybackMs", "0");
        l(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        l(i, i3, "minBufferMs", "bufferForPlaybackMs");
        l(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        l(i2, i, "maxBufferMs", "minBufferMs");
        l(i6, 0, "backBufferDurationMs", "0");
        this.b = cw;
        this.c = TD2.j1(i);
        this.d = TD2.j1(i2);
        this.e = TD2.j1(i3);
        this.f = TD2.j1(i4);
        this.g = i5;
        this.k = i5 == -1 ? 13107200 : i5;
        this.h = z2;
        this.i = TD2.j1(i6);
        this.j = z3;
    }
}
