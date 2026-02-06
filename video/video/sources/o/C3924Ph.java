package o;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: o.Ph  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3924Ph {
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 3;
    public static final long K = 5000000;
    public static final long L = 5000000;
    public static final long M = 1000000;
    public static final long N = 5;
    public static final long O = 200;
    public static final int P = 10;
    public static final int Q = 30000;
    public static final int R = 500000;
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;
    public final a a;
    public final long[] b;
    @InterfaceC11300zs1
    public AudioTrack c;
    public int d;
    public int e;
    @InterfaceC11300zs1
    public C3827Oh f;
    public int g;
    public boolean h;
    public long i;
    public float j;
    public boolean k;
    public long l;
    public long m;
    @InterfaceC11300zs1
    public Method n;

    /* renamed from: o  reason: collision with root package name */
    public long f585o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public int w;
    public int x;
    public long y;
    public long z;

    /* renamed from: o.Ph$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i, long j);

        void b(long j);

        void c(long j);

        void d(long j, long j2, long j3, long j4);

        void e(long j, long j2, long j3, long j4);
    }

    public C3924Ph(a aVar) {
        this.a = (a) C9542sf.g(aVar);
        if (TD2.a >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    public static boolean n(int i) {
        if (TD2.a < 23) {
            if (i == 5 || i == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean a() {
        if (this.h && ((AudioTrack) C9542sf.g(this.c)).getPlayState() == 2 && d() == 0) {
            return true;
        }
        return false;
    }

    public int b(long j) {
        return this.e - ((int) (j - (d() * this.d)));
    }

    public long c(boolean z) {
        long s0;
        if (((AudioTrack) C9542sf.g(this.c)).getPlayState() == 3) {
            l();
        }
        long nanoTime = System.nanoTime() / 1000;
        C3827Oh c3827Oh = (C3827Oh) C9542sf.g(this.f);
        boolean d = c3827Oh.d();
        if (d) {
            s0 = TD2.B1(c3827Oh.b(), this.g) + TD2.s0(nanoTime - c3827Oh.c(), this.j);
        } else {
            if (this.x == 0) {
                s0 = e();
            } else {
                s0 = TD2.s0(this.l + nanoTime, this.j);
            }
            if (!z) {
                s0 = Math.max(0L, s0 - this.f585o);
            }
        }
        if (this.E != d) {
            this.G = this.D;
            this.F = this.C;
        }
        long j = nanoTime - this.G;
        if (j < 1000000) {
            long j2 = (j * 1000) / 1000000;
            s0 = ((s0 * j2) + ((1000 - j2) * (this.F + TD2.s0(j, this.j)))) / 1000;
        }
        if (!this.k) {
            long j3 = this.C;
            if (s0 > j3) {
                this.k = true;
                this.a.c(System.currentTimeMillis() - TD2.b2(TD2.x0(TD2.b2(s0 - j3), this.j)));
            }
        }
        this.D = nanoTime;
        this.C = s0;
        this.E = d;
        return s0;
    }

    public final long d() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.y;
        if (j != C10323vs.b) {
            return Math.min(this.B, this.A + TD2.J(TD2.s0((elapsedRealtime * 1000) - j, this.j), this.g));
        }
        if (elapsedRealtime - this.s >= 5) {
            u(elapsedRealtime);
            this.s = elapsedRealtime;
        }
        return this.t + (this.u << 32);
    }

    public final long e() {
        return TD2.B1(d(), this.g);
    }

    public void f(long j) {
        this.A = d();
        this.y = SystemClock.elapsedRealtime() * 1000;
        this.B = j;
    }

    public boolean g(long j) {
        if (j <= TD2.J(c(false), this.g) && !a()) {
            return false;
        }
        return true;
    }

    public boolean h() {
        if (((AudioTrack) C9542sf.g(this.c)).getPlayState() == 3) {
            return true;
        }
        return false;
    }

    public boolean i(long j) {
        if (this.z != C10323vs.b && j > 0 && SystemClock.elapsedRealtime() - this.z >= 200) {
            return true;
        }
        return false;
    }

    public boolean j(long j) {
        int playState = ((AudioTrack) C9542sf.g(this.c)).getPlayState();
        if (this.h) {
            if (playState == 2) {
                this.p = false;
                return false;
            } else if (playState == 1 && d() == 0) {
                return false;
            }
        }
        boolean z = this.p;
        boolean g = g(j);
        this.p = g;
        if (z && !g && playState != 1) {
            this.a.a(this.e, TD2.b2(this.i));
        }
        return true;
    }

    public final void k(long j) {
        C3827Oh c3827Oh = (C3827Oh) C9542sf.g(this.f);
        if (!c3827Oh.f(j)) {
            return;
        }
        long c = c3827Oh.c();
        long b = c3827Oh.b();
        long e = e();
        if (Math.abs(c - j) > 5000000) {
            this.a.e(b, c, j, e);
            c3827Oh.g();
        } else if (Math.abs(TD2.B1(b, this.g) - e) > 5000000) {
            this.a.d(b, c, j, e);
            c3827Oh.g();
        } else {
            c3827Oh.a();
        }
    }

    public final void l() {
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.m >= 30000) {
            long e = e();
            if (e != 0) {
                this.b[this.w] = TD2.x0(e, this.j) - nanoTime;
                this.w = (this.w + 1) % 10;
                int i = this.x;
                if (i < 10) {
                    this.x = i + 1;
                }
                this.m = nanoTime;
                this.l = 0L;
                int i2 = 0;
                while (true) {
                    int i3 = this.x;
                    if (i2 >= i3) {
                        break;
                    }
                    this.l += this.b[i2] / i3;
                    i2++;
                }
            } else {
                return;
            }
        }
        if (this.h) {
            return;
        }
        k(nanoTime);
        m(nanoTime);
    }

    public final void m(long j) {
        Method method;
        if (this.q && (method = this.n) != null && j - this.r >= C6118ei0.r2) {
            try {
                long intValue = (((Integer) TD2.o((Integer) method.invoke(C9542sf.g(this.c), null))).intValue() * 1000) - this.i;
                this.f585o = intValue;
                long max = Math.max(intValue, 0L);
                this.f585o = max;
                if (max > 5000000) {
                    this.a.b(max);
                    this.f585o = 0L;
                }
            } catch (Exception unused) {
                this.n = null;
            }
            this.r = j;
        }
    }

    public boolean o() {
        q();
        if (this.y == C10323vs.b) {
            ((C3827Oh) C9542sf.g(this.f)).h();
            return true;
        }
        return false;
    }

    public void p() {
        q();
        this.c = null;
        this.f = null;
    }

    public final void q() {
        this.l = 0L;
        this.x = 0;
        this.w = 0;
        this.m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.k = false;
    }

    public void r(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        boolean z2;
        long j;
        this.c = audioTrack;
        this.d = i2;
        this.e = i3;
        this.f = new C3827Oh(audioTrack);
        this.g = audioTrack.getSampleRate();
        if (z && n(i)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.h = z2;
        boolean U0 = TD2.U0(i);
        this.q = U0;
        if (U0) {
            j = TD2.B1(i3 / i2, this.g);
        } else {
            j = -9223372036854775807L;
        }
        this.i = j;
        this.t = 0L;
        this.u = 0L;
        this.v = 0L;
        this.p = false;
        this.y = C10323vs.b;
        this.z = C10323vs.b;
        this.r = 0L;
        this.f585o = 0L;
        this.j = 1.0f;
    }

    public void s(float f) {
        this.j = f;
        C3827Oh c3827Oh = this.f;
        if (c3827Oh != null) {
            c3827Oh.h();
        }
        q();
    }

    public void t() {
        ((C3827Oh) C9542sf.g(this.f)).h();
    }

    public final void u(long j) {
        AudioTrack audioTrack;
        int playState = ((AudioTrack) C9542sf.g(this.c)).getPlayState();
        if (playState != 1) {
            long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
            if (this.h) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.v = this.t;
                }
                playbackHeadPosition += this.v;
            }
            if (TD2.a <= 29) {
                if (playbackHeadPosition == 0 && this.t > 0 && playState == 3) {
                    if (this.z == C10323vs.b) {
                        this.z = j;
                        return;
                    }
                    return;
                }
                this.z = C10323vs.b;
            }
            if (this.t > playbackHeadPosition) {
                this.u++;
            }
            this.t = playbackHeadPosition;
        }
    }
}
