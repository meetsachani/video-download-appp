package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcbx {
    public static final boolean r;
    public final Context a;
    public final String b;
    public final VersionInfoParcel c;
    @InterfaceC11300zs1
    public final zzbdh d;
    @InterfaceC11300zs1
    public final zzbdk e;
    public final com.google.android.gms.ads.internal.util.zzbh f;
    public final long[] g;
    public final String[] h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public zzcbc n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f235o;
    public boolean p;
    public long q;

    static {
        boolean z;
        if (com.google.android.gms.ads.internal.client.zzbb.e().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Wc)).intValue()) {
            z = true;
        } else {
            z = false;
        }
        r = z;
    }

    public zzcbx(Context context, VersionInfoParcel versionInfoParcel, String str, @InterfaceC11300zs1 zzbdk zzbdkVar, @InterfaceC11300zs1 zzbdh zzbdhVar) {
        com.google.android.gms.ads.internal.util.zzbf zzbfVar = new com.google.android.gms.ads.internal.util.zzbf();
        zzbfVar.a("min_1", Double.MIN_VALUE, 1.0d);
        zzbfVar.a("1_5", 1.0d, 5.0d);
        zzbfVar.a("5_10", 5.0d, 10.0d);
        zzbfVar.a("10_20", 10.0d, 20.0d);
        zzbfVar.a("20_30", 20.0d, 30.0d);
        zzbfVar.a("30_max", 30.0d, Double.MAX_VALUE);
        this.f = zzbfVar.b();
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.q = -1L;
        this.a = context;
        this.c = versionInfoParcel;
        this.b = str;
        this.e = zzbdkVar;
        this.d = zzbdhVar;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Q);
        if (str2 == null) {
            this.h = new String[0];
            this.g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.h = new String[length];
        this.g = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.h("Unable to parse frame hash target time number.", e);
                this.g[i] = -1;
            }
        }
    }

    public final void a(zzcbc zzcbcVar) {
        zzbdk zzbdkVar = this.e;
        zzbdc.a(zzbdkVar, this.d, "vpc2");
        this.i = true;
        zzbdkVar.d("vpn", zzcbcVar.s());
        this.n = zzcbcVar;
    }

    public final void b() {
        if (this.i && !this.j) {
            zzbdc.a(this.e, this.d, "vfr2");
            this.j = true;
        }
    }

    public final void c() {
        this.m = true;
        if (this.j && !this.k) {
            zzbdc.a(this.e, this.d, "vfp2");
            this.k = true;
        }
    }

    public final void d() {
        if (r && !this.f235o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.b);
            bundle.putString("player", this.n.s());
            for (com.google.android.gms.ads.internal.util.zzbe zzbeVar : this.f.a()) {
                String str = zzbeVar.a;
                String valueOf = String.valueOf(str);
                bundle.putString("fps_c_".concat(valueOf), Integer.toString(zzbeVar.e));
                String valueOf2 = String.valueOf(str);
                bundle.putString("fps_p_".concat(valueOf2), Double.toString(zzbeVar.d));
            }
            int i = 0;
            while (true) {
                long[] jArr = this.g;
                if (i < jArr.length) {
                    String str2 = this.h[i];
                    if (str2 != null) {
                        bundle.putString("fh_".concat(Long.valueOf(jArr[i]).toString()), str2);
                    }
                    i++;
                } else {
                    com.google.android.gms.ads.internal.zzv.v().O(this.a, this.c.X, "gmob-apps", bundle, true);
                    this.f235o = true;
                    return;
                }
            }
        }
    }

    public final void e() {
        this.m = false;
    }

    public final void f(zzcbc zzcbcVar) {
        long j;
        if (this.k && !this.l) {
            if (com.google.android.gms.ads.internal.util.zze.m() && !this.l) {
                com.google.android.gms.ads.internal.util.zze.k("VideoMetricsMixin first frame");
            }
            zzbdc.a(this.e, this.d, "vff2");
            this.l = true;
        }
        long nanoTime = com.google.android.gms.ads.internal.zzv.d().nanoTime();
        if (this.m && this.p && this.q != -1) {
            this.f.b(TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.q));
        }
        this.p = this.m;
        this.q = nanoTime;
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.R)).longValue();
        long i = zzcbcVar.i();
        int i2 = 0;
        while (true) {
            String[] strArr = this.h;
            if (i2 < strArr.length) {
                if (strArr[i2] == null && longValue > Math.abs(i - this.g[i2])) {
                    int i3 = 8;
                    Bitmap bitmap = zzcbcVar.getBitmap(8, 8);
                    long j2 = 63;
                    long j3 = 0;
                    int i4 = 0;
                    while (i4 < i3) {
                        int i5 = 0;
                        while (i5 < i3) {
                            int pixel = bitmap.getPixel(i5, i4);
                            if (Color.blue(pixel) + Color.red(pixel) + Color.green(pixel) > 128) {
                                j = 1;
                            } else {
                                j = 0;
                            }
                            j3 |= j << ((int) j2);
                            j2--;
                            i5++;
                            i3 = 8;
                        }
                        i4++;
                        i3 = 8;
                    }
                    strArr[i2] = String.format("%016X", Long.valueOf(j3));
                    return;
                }
                i2++;
            } else {
                return;
            }
        }
    }
}
