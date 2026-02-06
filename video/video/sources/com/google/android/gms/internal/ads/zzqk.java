package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import o.C6118ei0;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzqk {
    @InterfaceC11300zs1
    public final zzqj a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public zzqk(AudioTrack audioTrack) {
        this.a = new zzqj(audioTrack);
        h(0);
    }

    public final long a() {
        return this.a.a();
    }

    public final long b() {
        return this.a.b();
    }

    public final void c() {
        if (this.b == 4) {
            h(0);
        }
    }

    public final void d() {
        h(4);
    }

    public final void e() {
        h(0);
    }

    public final boolean f() {
        return this.b == 2;
    }

    public final boolean g(long j) {
        if (j - this.e < this.d) {
            return false;
        }
        this.e = j;
        zzqj zzqjVar = this.a;
        boolean c = zzqjVar.c();
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return c;
                    }
                    if (!c) {
                        return false;
                    }
                    h(0);
                    return true;
                } else if (c) {
                    return true;
                } else {
                    h(0);
                    return false;
                }
            } else if (c) {
                if (zzqjVar.a() <= this.f) {
                    return true;
                }
                h(2);
                return true;
            } else {
                h(0);
                return false;
            }
        } else if (c) {
            if (zzqjVar.b() < this.c) {
                return false;
            }
            this.f = zzqjVar.a();
            h(1);
            return true;
        } else if (j - this.c <= C6118ei0.r2) {
            return false;
        } else {
            h(3);
            return false;
        }
    }

    public final void h(int i) {
        this.b = i;
        long j = 10000;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    j = C6118ei0.r2;
                } else {
                    j = 10000000;
                }
            } else {
                this.d = 10000L;
                return;
            }
        } else {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
        }
        this.d = j;
    }
}
