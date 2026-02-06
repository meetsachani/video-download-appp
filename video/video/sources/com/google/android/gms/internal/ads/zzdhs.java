package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdhs implements zzhfv {
    public final zzhge a;

    public zzdhs(zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzhgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* synthetic */ Object b() {
        VersionInfoParcel a = ((zzchw) this.a).a();
        com.google.android.gms.ads.internal.zzv.v();
        return new zzayq(UUID.randomUUID().toString(), a, "native", new JSONObject(), false, true);
    }
}
