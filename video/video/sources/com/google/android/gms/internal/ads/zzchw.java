package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class zzchw implements zzhfv {
    public final zzche a;

    public zzchw(zzche zzcheVar) {
        this.a = zzcheVar;
    }

    public static VersionInfoParcel c(zzche zzcheVar) {
        VersionInfoParcel e = zzcheVar.e();
        zzhgd.b(e);
        return e;
    }

    public final VersionInfoParcel a() {
        return c(this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* synthetic */ Object b() {
        return c(this.a);
    }
}
