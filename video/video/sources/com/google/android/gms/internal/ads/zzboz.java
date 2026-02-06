package com.google.android.gms.internal.ads;

import java.util.UUID;
import o.InterfaceFutureC8411o11;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzboz implements zzgcf {
    public final String a = "google.afma.activeView.handleUpdate";
    public final InterfaceFutureC8411o11 b;

    public zzboz(InterfaceFutureC8411o11 interfaceFutureC8411o11, String str, zzbog zzbogVar, zzbof zzbofVar) {
        this.b = interfaceFutureC8411o11;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 a(zzboz zzbozVar, Object obj, zzboa zzboaVar) {
        zzcaf zzcafVar = new zzcaf();
        com.google.android.gms.ads.internal.zzv.v();
        String uuid = UUID.randomUUID().toString();
        zzbjv.f226o.c(uuid, new zzboy(zzbozVar, zzcafVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzboaVar.c1(zzbozVar.a, jSONObject);
        return zzcafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final InterfaceFutureC8411o11 b(Object obj) throws Exception {
        return d(obj);
    }

    public final InterfaceFutureC8411o11 d(final Object obj) {
        return zzgcy.n(this.b, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzbox
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj2) {
                return zzboz.a(zzboz.this, obj, (zzboa) obj2);
            }
        }, zzcaa.g);
    }
}
