package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C2638Cg0;
import o.C3855Oo;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzbqr implements NativeMediationAdRequest {
    public final Date d;
    public final int e;
    public final Set f;
    public final boolean g;
    public final Location h;
    public final int i;
    public final zzbfv j;
    public final boolean l;
    public final List k = new ArrayList();
    public final Map m = new HashMap();

    public zzbqr(@InterfaceC11300zs1 Date date, int i, @InterfaceC11300zs1 Set set, @InterfaceC11300zs1 Location location, boolean z, int i2, zzbfv zzbfvVar, List list, boolean z2, int i3, String str) {
        this.d = date;
        this.e = i;
        this.f = set;
        this.h = location;
        this.g = z;
        this.i = i2;
        this.j = zzbfvVar;
        this.l = z2;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.m.put(split[1], Boolean.TRUE);
                        } else if (C3855Oo.a.equals(split[2])) {
                            this.m.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.k.add(str2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map a() {
        return this.m;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean b() {
        if (this.k.contains(C2638Cg0.Z4)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    @InterfaceC5670cr1
    public final NativeAdOptions c() {
        return zzbfv.m0(this.j);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int d() {
        return this.i;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean e() {
        return this.l;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date f() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean g() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.formats.NativeAdOptions h() {
        Parcelable.Creator<zzbfv> creator = zzbfv.CREATOR;
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        zzbfv zzbfvVar = this.j;
        if (zzbfvVar == null) {
            return builder.a();
        }
        int i = zzbfvVar.X;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    builder.e(zzbfvVar.b1);
                    builder.d(zzbfvVar.c1);
                }
                builder.g(zzbfvVar.Y);
                builder.c(zzbfvVar.Z);
                builder.f(zzbfvVar.Y0);
                return builder.a();
            }
            com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzbfvVar.a1;
            if (zzfwVar != null) {
                builder.h(new VideoOptions(zzfwVar));
            }
        }
        builder.b(zzbfvVar.Z0);
        builder.g(zzbfvVar.Y);
        builder.c(zzbfvVar.Z);
        builder.f(zzbfvVar.Y0);
        return builder.a();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean i() {
        return com.google.android.gms.ads.internal.client.zzet.j().C();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int j() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean k() {
        if (this.k.contains("6")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float l() {
        return com.google.android.gms.ads.internal.client.zzet.j().e();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> m() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location n() {
        return this.h;
    }
}
