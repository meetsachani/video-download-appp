package com.google.android.gms.internal.ads;

import android.os.Bundle;
import o.InterfaceC10571ws1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzeou implements zzetu {
    @InterfaceC10571ws1
    public final JSONObject a;
    @InterfaceC10571ws1
    public final JSONObject b;

    public zzeou(@InterfaceC10571ws1 JSONObject jSONObject, @InterfaceC10571ws1 JSONObject jSONObject2) {
        this.a = jSONObject;
        this.b = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        JSONObject jSONObject = this.b;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (jSONObject != null) {
            zzcuvVar.b.putString("fwd_common_cld", jSONObject.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((zzcuv) obj).a;
        JSONObject jSONObject = this.a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
