package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzhfv;
import com.google.android.gms.internal.ads.zzhge;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class CsiParamDefaults_Factory implements zzhfv<CsiParamDefaults> {
    public final zzhge a;
    public final zzhge b;

    public CsiParamDefaults_Factory(zzhge<Context> zzhgeVar, zzhge<VersionInfoParcel> zzhgeVar2) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
    }

    public static CsiParamDefaults_Factory a(zzhge<Context> zzhgeVar, zzhge<VersionInfoParcel> zzhgeVar2) {
        return new CsiParamDefaults_Factory(zzhgeVar, zzhgeVar2);
    }

    @InterfaceC5670cr1
    public static CsiParamDefaults d(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 VersionInfoParcel versionInfoParcel) {
        return new CsiParamDefaults(context, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    @InterfaceC5670cr1
    /* renamed from: c */
    public CsiParamDefaults b() {
        return d((Context) this.a.b(), (VersionInfoParcel) this.b.b());
    }
}
