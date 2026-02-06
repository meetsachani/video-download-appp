package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;
import o.C10323vs;
import o.C6118ei0;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzqm {
    public long A;
    public boolean B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public zzdg G;
    public final zzql a;
    public final long[] b;
    @InterfaceC11300zs1
    public AudioTrack c;
    public int d;
    @InterfaceC11300zs1
    public zzqk e;
    public int f;
    public long g;
    public float h;
    public boolean i;
    public long j;
    public long k;
    @InterfaceC11300zs1
    public Method l;
    public long m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f291o;
    public long p;
    public long q;
    public long r;
    public long s;
    public int t;
    public int u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public zzqm(zzql zzqlVar) {
        this.a = zzqlVar;
        try {
            this.l = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
        this.G = zzdg.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a() {
        long j;
        boolean f;
        long L;
        long max;
        long j2;
        Method method;
        AudioTrack audioTrack;
        AudioTrack audioTrack2 = this.c;
        audioTrack2.getClass();
        long j3 = 1000;
        if (audioTrack2.getPlayState() == 3) {
            long c = this.G.c() / 1000;
            if (c - this.k >= 30000) {
                long m = m();
                if (m != 0) {
                    long[] jArr = this.b;
                    jArr[this.t] = zzeu.M(m, this.h) - c;
                    this.t = (this.t + 1) % 10;
                    int i = this.u;
                    if (i < 10) {
                        this.u = i + 1;
                    }
                    this.k = c;
                    this.j = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = this.u;
                        if (i2 >= i3) {
                            break;
                        }
                        this.j += jArr[i2] / i3;
                        i2++;
                        j3 = j3;
                    }
                }
            }
            j = j3;
            zzqk zzqkVar = this.e;
            zzqkVar.getClass();
            if (zzqkVar.g(c)) {
                long b = zzqkVar.b();
                long a = zzqkVar.a();
                long m2 = m();
                if (Math.abs(b - c) > 5000000) {
                    this.a.f(a, b, c, m2);
                    zzqkVar.d();
                } else if (Math.abs(zzeu.O(a, this.f) - m2) > 5000000) {
                    this.a.e(a, b, c, m2);
                    c = c;
                    zzqkVar.d();
                } else {
                    c = c;
                    zzqkVar.c();
                }
            }
            if (this.f291o && (method = this.l) != null && c - this.p >= C6118ei0.r2) {
                try {
                } catch (Exception unused) {
                    this.l = null;
                }
                if (this.c != null) {
                    String str = zzeu.a;
                    long intValue = (((Integer) method.invoke(audioTrack, null)).intValue() * j) - this.g;
                    this.m = intValue;
                    long max2 = Math.max(intValue, 0L);
                    this.m = max2;
                    if (max2 > 5000000) {
                        this.a.s(max2);
                        this.m = 0L;
                    }
                    this.p = c;
                } else {
                    throw null;
                }
            }
            long c2 = this.G.c() / j;
            zzqk zzqkVar2 = this.e;
            zzqkVar2.getClass();
            f = zzqkVar2.f();
            if (!f) {
                max = zzeu.O(zzqkVar2.a(), this.f) + zzeu.L(c2 - zzqkVar2.b(), this.h);
            } else {
                if (this.u == 0) {
                    if (this.v != C10323vs.b) {
                        L = zzeu.O(n(), this.f);
                    } else {
                        L = m();
                    }
                } else {
                    L = zzeu.L(this.j + c2, this.h);
                }
                max = Math.max(0L, L - this.m);
                if (this.v != C10323vs.b) {
                    max = Math.min(zzeu.O(this.y, this.f), max);
                }
            }
            if (this.B != f) {
                this.D = this.A;
                this.C = this.z;
            }
            j2 = c2 - this.D;
            if (j2 < 1000000) {
                long j4 = (j2 * j) / 1000000;
                max = ((max * j4) + ((j - j4) * (this.C + zzeu.L(j2, this.h)))) / j;
            }
            if (!this.i && max > this.z && audioTrack2.getPlayState() == 3) {
                this.i = true;
                String str2 = zzeu.a;
                this.a.a(this.G.a() - zzeu.Q(zzeu.M(zzeu.Q(max - this.z), this.h)));
            }
            this.A = c2;
            this.z = max;
            this.B = f;
            return max;
        }
        j = 1000;
        long c22 = this.G.c() / j;
        zzqk zzqkVar22 = this.e;
        zzqkVar22.getClass();
        f = zzqkVar22.f();
        if (!f) {
        }
        if (this.B != f) {
        }
        j2 = c22 - this.D;
        if (j2 < 1000000) {
        }
        if (!this.i) {
            this.i = true;
            String str22 = zzeu.a;
            this.a.a(this.G.a() - zzeu.Q(zzeu.M(zzeu.Q(max - this.z), this.h)));
        }
        this.A = c22;
        this.z = max;
        this.B = f;
        return max;
    }

    public final void b(long j) {
        this.x = l();
        this.v = zzeu.N(this.G.b());
        this.y = j;
    }

    public final void c() {
        o();
        this.c = null;
        this.e = null;
    }

    public final void d(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        long j;
        this.c = audioTrack;
        this.d = i3;
        this.e = new zzqk(audioTrack);
        this.f = audioTrack.getSampleRate();
        boolean k = zzeu.k(i);
        this.f291o = k;
        if (k) {
            j = zzeu.O(i3 / i2, this.f);
        } else {
            j = -9223372036854775807L;
        }
        this.g = j;
        this.r = 0L;
        this.s = 0L;
        this.E = false;
        this.F = 0L;
        this.n = false;
        this.v = C10323vs.b;
        this.w = C10323vs.b;
        this.p = 0L;
        this.m = 0L;
        this.h = 1.0f;
    }

    public final void e(zzdg zzdgVar) {
        this.G = zzdgVar;
    }

    public final void f() {
        if (this.v != C10323vs.b) {
            this.v = zzeu.N(this.G.b());
        }
        zzqk zzqkVar = this.e;
        zzqkVar.getClass();
        zzqkVar.e();
    }

    public final boolean g(long j) {
        if (j <= zzeu.K(a(), this.f)) {
            return false;
        }
        return true;
    }

    public final boolean h() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            return true;
        }
        return false;
    }

    public final boolean i(long j) {
        if (this.w != C10323vs.b && j > 0 && this.G.b() - this.w >= 200) {
            return true;
        }
        return false;
    }

    public final boolean j(long j) {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        boolean z = this.n;
        boolean g = g(j);
        this.n = g;
        if (z && !g && playState != 1) {
            this.a.d(this.d, zzeu.Q(this.g));
        }
        return true;
    }

    public final boolean k() {
        o();
        if (this.v == C10323vs.b) {
            zzqk zzqkVar = this.e;
            zzqkVar.getClass();
            zzqkVar.e();
            return true;
        }
        this.x = l();
        return false;
    }

    public final long l() {
        if (this.v != C10323vs.b) {
            return Math.min(this.y, n());
        }
        long b = this.G.b();
        if (b - this.q >= 5) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0) {
                        if (this.r > 0 && playState == 3) {
                            if (this.w == C10323vs.b) {
                                this.w = b;
                            }
                        } else {
                            playbackHeadPosition = 0;
                        }
                    }
                    this.w = C10323vs.b;
                }
                if (this.r > playbackHeadPosition) {
                    this.s++;
                }
                this.r = playbackHeadPosition;
            }
            this.q = b;
        }
        return this.r + this.F + (this.s << 32);
    }

    public final long m() {
        return zzeu.O(l(), this.f);
    }

    public final long n() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.x;
        }
        return this.x + zzeu.K(zzeu.L(zzeu.N(this.G.b()) - this.v, this.h), this.f);
    }

    public final void o() {
        this.j = 0L;
        this.u = 0;
        this.t = 0;
        this.k = 0L;
        this.A = 0L;
        this.D = 0L;
        this.i = false;
    }
}
