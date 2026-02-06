package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbqd implements MediationAdRequest {
    public final Date d;
    public final int e;
    public final Set f;
    public final boolean g;
    public final Location h;
    public final int i;
    public final boolean j;

    public zzbqd(@InterfaceC11300zs1 Date date, int i, @InterfaceC11300zs1 Set set, @InterfaceC11300zs1 Location location, boolean z, int i2, boolean z2, int i3, String str) {
        this.d = date;
        this.e = i;
        this.f = set;
        this.h = location;
        this.g = z;
        this.i = i2;
        this.j = z2;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int d() {
        return this.i;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean e() {
        return this.j;
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

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int j() {
        return this.e;
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
