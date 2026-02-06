package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzfhn implements Runnable {
    public final zzfhq Y;
    public String Z;
    public String Z0;
    public zzfcf a1;
    public com.google.android.gms.ads.internal.client.zze b1;
    public Future c1;
    public final List X = new ArrayList();
    public int d1 = 2;
    public zzfhs Y0 = zzfhs.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public zzfhn(zzfhq zzfhqVar) {
        this.Y = zzfhqVar;
    }

    public final synchronized zzfhn a(zzfhc zzfhcVar) {
        try {
            if (((Boolean) zzbeo.c.e()).booleanValue()) {
                List list = this.X;
                zzfhcVar.j();
                list.add(zzfhcVar);
                Future future = this.c1;
                if (future != null) {
                    future.cancel(false);
                }
                this.c1 = zzcaa.d.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c9)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfhn b(String str) {
        if (((Boolean) zzbeo.c.e()).booleanValue() && zzfhm.e(str)) {
            this.Z = str;
        }
        return this;
    }

    public final synchronized zzfhn c(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbeo.c.e()).booleanValue()) {
            this.b1 = zzeVar;
        }
        return this;
    }

    public final synchronized zzfhn d(ArrayList arrayList) {
        try {
            if (((Boolean) zzbeo.c.e()).booleanValue()) {
                if (!arrayList.contains("banner") && !arrayList.contains(AdFormat.BANNER.name())) {
                    if (!arrayList.contains("interstitial") && !arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                        if (!arrayList.contains("native") && !arrayList.contains(AdFormat.NATIVE.name())) {
                            if (!arrayList.contains("rewarded") && !arrayList.contains(AdFormat.REWARDED.name())) {
                                if (arrayList.contains("app_open_ad")) {
                                    this.d1 = 7;
                                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                    this.d1 = 6;
                                }
                            }
                            this.d1 = 5;
                        }
                        this.d1 = 8;
                    }
                    this.d1 = 4;
                }
                this.d1 = 3;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfhn e(String str) {
        if (((Boolean) zzbeo.c.e()).booleanValue()) {
            this.Z0 = str;
        }
        return this;
    }

    public final synchronized zzfhn f(Bundle bundle) {
        if (((Boolean) zzbeo.c.e()).booleanValue()) {
            this.Y0 = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.a(bundle);
        }
        return this;
    }

    public final synchronized zzfhn g(zzfcf zzfcfVar) {
        if (((Boolean) zzbeo.c.e()).booleanValue()) {
            this.a1 = zzfcfVar;
        }
        return this;
    }

    public final synchronized void h() {
        try {
            if (!((Boolean) zzbeo.c.e()).booleanValue()) {
                return;
            }
            Future future = this.c1;
            if (future != null) {
                future.cancel(false);
            }
            List<zzfhc> list = this.X;
            for (zzfhc zzfhcVar : list) {
                int i = this.d1;
                if (i != 2) {
                    zzfhcVar.b(i);
                }
                if (!TextUtils.isEmpty(this.Z)) {
                    zzfhcVar.u(this.Z);
                }
                if (!TextUtils.isEmpty(this.Z0) && !zzfhcVar.l()) {
                    zzfhcVar.p0(this.Z0);
                }
                zzfcf zzfcfVar = this.a1;
                if (zzfcfVar != null) {
                    zzfhcVar.e(zzfcfVar);
                } else {
                    com.google.android.gms.ads.internal.client.zze zzeVar = this.b1;
                    if (zzeVar != null) {
                        zzfhcVar.g(zzeVar);
                    }
                }
                zzfhcVar.d(this.Y0);
                this.Y.c(zzfhcVar.m());
            }
            list.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzfhn i(int i) {
        if (((Boolean) zzbeo.c.e()).booleanValue()) {
            this.d1 = i;
        }
        return this;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
