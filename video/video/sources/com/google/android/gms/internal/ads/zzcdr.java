package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzcdr extends zzcdi implements zzcbm {
    public static final /* synthetic */ int f1 = 0;
    public zzcbn Y0;
    public String Z0;
    public boolean a1;
    public boolean b1;
    public zzcda c1;
    public long d1;
    public long e1;

    public zzcdr(zzcbw zzcbwVar, zzcbv zzcbvVar) {
        super(zzcbwVar);
        zzcej zzcejVar = new zzcej(zzcbwVar.getContext(), zzcbvVar, (zzcbw) this.Z.get(), null);
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f("ExoPlayerAdapter initialized.");
        this.Y0 = zzcejVar;
        zzcejVar.C(this);
    }

    public static /* synthetic */ void A(zzcdr zzcdrVar) {
        long longValue;
        long intValue;
        boolean booleanValue;
        long j;
        long j2;
        long j3;
        boolean z;
        long j4;
        long j5;
        String B = B(zzcdrVar.Z0);
        try {
            longValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.N)).longValue() * 1000;
            intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.t)).intValue();
            booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c2)).booleanValue();
        } catch (Exception e) {
            String str = "Failed to preload url " + zzcdrVar.Z0 + " Exception: " + e.getMessage();
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g(str);
            com.google.android.gms.ads.internal.zzv.t().w(e, "VideoStreamExoPlayerCache.preload");
            zzcdrVar.g();
            zzcdrVar.m(zzcdrVar.Z0, B, "error", C("error", e));
        }
        synchronized (zzcdrVar) {
            if (com.google.android.gms.ads.internal.zzv.d().a() - zzcdrVar.d1 <= longValue) {
                if (!zzcdrVar.a1) {
                    if (!zzcdrVar.b1) {
                        if (zzcdrVar.Y0.M()) {
                            long V = zzcdrVar.Y0.V();
                            if (V > 0) {
                                long R = zzcdrVar.Y0.R();
                                if (R != zzcdrVar.e1) {
                                    if (R > 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    String str2 = zzcdrVar.Z0;
                                    long j6 = -1;
                                    if (booleanValue) {
                                        j4 = zzcdrVar.Y0.a();
                                    } else {
                                        j4 = -1;
                                    }
                                    if (booleanValue) {
                                        j5 = zzcdrVar.Y0.T();
                                    } else {
                                        j5 = -1;
                                    }
                                    if (booleanValue) {
                                        j6 = zzcdrVar.Y0.s();
                                    }
                                    j = intValue;
                                    j2 = V;
                                    j3 = R;
                                    zzcdrVar.r(str2, B, j3, j2, z, j4, j5, j6, zzcbn.O(), zzcbn.Q());
                                    zzcdrVar.e1 = j3;
                                } else {
                                    j = intValue;
                                    j2 = V;
                                    j3 = R;
                                }
                                if (j3 >= j2) {
                                    zzcdrVar.o(zzcdrVar.Z0, B, j2);
                                } else if (zzcdrVar.Y0.S() >= j && j3 > 0) {
                                }
                            }
                            zzcdrVar.D(((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.O)).longValue());
                            return;
                        }
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    com.google.android.gms.ads.internal.zzv.a().f(zzcdrVar.c1);
                    return;
                }
                throw new IOException("Abort requested before buffering finished. ");
            }
            throw new IOException("Timeout reached. Limit: " + longValue + " ms");
        }
    }

    public static final String B(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.l(str)));
    }

    public static String C(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + RemoteSettings.i + canonicalName + ":" + message;
    }

    public final void D(long j) {
        com.google.android.gms.ads.internal.util.zzs.l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdq
            @Override // java.lang.Runnable
            public final void run() {
                zzcdr.A(zzcdr.this);
            }
        }, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void a(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void b(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void c(String str, Exception exc) {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.h("Precache exception", exc);
        com.google.android.gms.ads.internal.zzv.t().w(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void d(final boolean z, final long j) {
        final zzcbw zzcbwVar = (zzcbw) this.Z.get();
        if (zzcbwVar != null) {
            zzcaa.f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdp
                @Override // java.lang.Runnable
                public final void run() {
                    zzcbw.this.D0(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void e(String str, Exception exc) {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.h("Precache error", exc);
        com.google.android.gms.ads.internal.zzv.t().w(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcdi, com.google.android.gms.common.api.Releasable
    public final void g() {
        zzcbn zzcbnVar = this.Y0;
        if (zzcbnVar != null) {
            zzcbnVar.C(null);
            this.Y0.y();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdi
    public final void l() {
        synchronized (this) {
            this.a1 = true;
            notify();
            g();
        }
        String str = this.Z0;
        if (str != null) {
            m(this.Z0, B(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbm
    public final void q() {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcdi
    public final void s(int i) {
        this.Y0.A(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdi
    public final void t(int i) {
        this.Y0.B(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdi
    public final void u(int i) {
        this.Y0.D(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdi
    public final void v(int i) {
        this.Y0.E(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdi
    public final boolean w(String str) {
        return x(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzcdi
    public final boolean x(String str, String[] strArr) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        boolean z;
        long j7;
        long j8;
        long j9;
        this.Z0 = str;
        String B = B(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.Y0.w(uriArr, this.Y);
            zzcbw zzcbwVar = (zzcbw) this.Z.get();
            if (zzcbwVar != null) {
                zzcbwVar.z(B, this);
            }
            Clock d = com.google.android.gms.ads.internal.zzv.d();
            long a = d.a();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.O)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.N)).longValue() * 1000;
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.t)).intValue();
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c2)).booleanValue();
            long j10 = -1;
            while (true) {
                synchronized (this) {
                    if (d.a() - a <= longValue2) {
                        if (!this.a1) {
                            if (!this.b1) {
                                if (this.Y0.M()) {
                                    long V = this.Y0.V();
                                    if (V > 0) {
                                        long R = this.Y0.R();
                                        if (R != j10) {
                                            if (R > 0) {
                                                j6 = intValue;
                                                z = true;
                                            } else {
                                                j6 = intValue;
                                                z = false;
                                            }
                                            if (booleanValue) {
                                                j7 = this.Y0.a();
                                            } else {
                                                j7 = -1;
                                            }
                                            if (booleanValue) {
                                                j8 = this.Y0.T();
                                            } else {
                                                j8 = -1;
                                            }
                                            if (booleanValue) {
                                                j9 = this.Y0.s();
                                            } else {
                                                j9 = -1;
                                            }
                                            long j11 = longValue;
                                            j5 = R;
                                            long j12 = j7;
                                            j2 = j6;
                                            j = longValue2;
                                            j4 = V;
                                            j3 = j11;
                                            r(str, B, j5, j4, z, j12, j8, j9, zzcbn.O(), zzcbn.Q());
                                            j10 = j5;
                                        } else {
                                            j3 = longValue;
                                            j = longValue2;
                                            j2 = intValue;
                                            j4 = V;
                                            j5 = R;
                                        }
                                        if (j5 >= j4) {
                                            o(str, B, j4);
                                        } else if (this.Y0.S() < j2 || j5 <= 0) {
                                            longValue = j3;
                                        }
                                    } else {
                                        j = longValue2;
                                        j2 = intValue;
                                    }
                                    try {
                                        wait(longValue);
                                    } catch (InterruptedException unused) {
                                        throw new IOException("Wait interrupted.");
                                    }
                                } else {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                            }
                        } else {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                    } else {
                        throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                    }
                }
                intValue = j2;
                longValue2 = j;
            }
            return true;
        } catch (Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Failed to preload url " + str + " Exception: " + e.getMessage());
            com.google.android.gms.ads.internal.zzv.t().w(e, "VideoStreamExoPlayerCache.preload");
            g();
            m(str, B, "error", C("error", e));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdi
    public final boolean y(String str, String[] strArr, zzcda zzcdaVar) {
        this.Z0 = str;
        this.c1 = zzcdaVar;
        String B = B(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.Y0.w(uriArr, this.Y);
            zzcbw zzcbwVar = (zzcbw) this.Z.get();
            if (zzcbwVar != null) {
                zzcbwVar.z(B, this);
            }
            this.d1 = com.google.android.gms.ads.internal.zzv.d().a();
            this.e1 = -1L;
            D(0L);
            return true;
        } catch (Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Failed to preload url " + str + " Exception: " + e.getMessage());
            com.google.android.gms.ads.internal.zzv.t().w(e, "VideoStreamExoPlayerCache.preload");
            g();
            m(str, B, "error", C("error", e));
            return false;
        }
    }

    public final zzcbn z() {
        synchronized (this) {
            this.b1 = true;
            notify();
        }
        this.Y0.C(null);
        zzcbn zzcbnVar = this.Y0;
        this.Y0 = null;
        return zzcbnVar;
    }
}
