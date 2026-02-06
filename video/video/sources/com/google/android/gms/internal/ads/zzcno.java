package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcno implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;

    public zzcno(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        VersionInfoParcel a = ((zzchw) this.a).a();
        JSONObject jSONObject = (JSONObject) this.b.b();
        String str = (String) this.c.b();
        boolean equals = "native".equals(str);
        com.google.android.gms.ads.internal.zzv.v();
        return new zzayq(UUID.randomUUID().toString(), a, str, jSONObject, false, equals);
    }
}
