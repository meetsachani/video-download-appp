package com.google.android.gms.internal.ads;

import java.util.HashMap;
import o.C10323vs;
import o.C10980yZ;
import o.C5865df1;
import o.C6118ei0;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzig implements zzks {
    public final zzzg a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final HashMap g;
    public long h;

    public zzig() {
        zzzg zzzgVar = new zzzg(true, 65536);
        l(1000, 0, "bufferForPlaybackMs", "0");
        l(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        l(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        l(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        l(50000, 50000, "maxBufferMs", "minBufferMs");
        l(0, 0, "backBufferDurationMs", "0");
        this.a = zzzgVar;
        this.b = zzeu.N(C5865df1.d.u);
        this.c = zzeu.N(C5865df1.d.u);
        this.d = zzeu.N(1000L);
        this.e = zzeu.N(2000L);
        this.f = zzeu.N(0L);
        this.g = new HashMap();
        this.h = -1L;
    }

    public static void l(int i, int i2, String str, String str2) {
        boolean z;
        String str3 = str + " cannot be less than " + str2;
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        zzdc.e(z, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final boolean a(zzbl zzblVar, zzvb zzvbVar, long j) {
        for (zzie zzieVar : this.g.values()) {
            if (zzieVar.a) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void b(zzkr zzkrVar, zzxe zzxeVar, zzyq[] zzyqVarArr) {
        zzie zzieVar = (zzie) this.g.get(zzkrVar.a);
        zzieVar.getClass();
        int length = zzyqVarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 13107200;
            if (i < length) {
                zzyq zzyqVar = zzyqVarArr[i];
                if (zzyqVar != null) {
                    switch (zzyqVar.c().c) {
                        case -1:
                        case 1:
                            break;
                        case 0:
                            i3 = C10980yZ.A;
                            break;
                        case 2:
                            i3 = C10980yZ.u;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        default:
                            i3 = 131072;
                            break;
                    }
                    i2 += i3;
                }
                i++;
            } else {
                zzieVar.b = Math.max(13107200, i2);
                n();
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final boolean c(zzkr zzkrVar) {
        zzie zzieVar = (zzie) this.g.get(zzkrVar.a);
        zzieVar.getClass();
        int a = this.a.a();
        int j = j();
        long j2 = this.b;
        float f = zzkrVar.c;
        if (f > 1.0f) {
            j2 = Math.min(zzeu.L(j2, f), this.c);
        }
        long j3 = zzkrVar.b;
        int i = (j3 > Math.max(j2, (long) C6118ei0.r2) ? 1 : (j3 == Math.max(j2, (long) C6118ei0.r2) ? 0 : -1));
        boolean z = false;
        if (i < 0) {
            if (a < j) {
                z = true;
            }
            zzieVar.a = z;
            if (!z && j3 < C6118ei0.r2) {
                zzdx.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= this.c || a >= j) {
            zzieVar.a = false;
        }
        return zzieVar.a;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void d(zzpc zzpcVar) {
        m(zzpcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final boolean e(zzkr zzkrVar) {
        long j;
        boolean z = zzkrVar.d;
        long M = zzeu.M(zzkrVar.b, zzkrVar.c);
        if (z) {
            j = this.e;
        } else {
            j = this.d;
        }
        long j2 = zzkrVar.e;
        if (j2 != C10323vs.b) {
            j = Math.min(j2 / 2, j);
        }
        if (j > 0 && M < j && this.a.a() < j()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final boolean f(zzpc zzpcVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void g(zzpc zzpcVar) {
        m(zzpcVar);
        if (this.g.isEmpty()) {
            this.h = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final long h(zzpc zzpcVar) {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final void i(zzpc zzpcVar) {
        long id = Thread.currentThread().getId();
        long j = this.h;
        boolean z = true;
        if (j != -1 && j != id) {
            z = false;
        }
        zzdc.g(z, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.h = id;
        HashMap hashMap = this.g;
        if (!hashMap.containsKey(zzpcVar)) {
            hashMap.put(zzpcVar, new zzie(null));
        }
        zzie zzieVar = (zzie) hashMap.get(zzpcVar);
        zzieVar.getClass();
        zzieVar.b = 13107200;
        zzieVar.a = false;
    }

    @InterfaceC5056aJ2
    public final int j() {
        int i = 0;
        for (zzie zzieVar : this.g.values()) {
            i += zzieVar.b;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final zzzg k() {
        return this.a;
    }

    public final void m(zzpc zzpcVar) {
        if (this.g.remove(zzpcVar) != null) {
            n();
        }
    }

    public final void n() {
        if (this.g.isEmpty()) {
            this.a.e();
        } else {
            this.a.f(j());
        }
    }
}
