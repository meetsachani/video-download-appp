package com.google.android.gms.internal.ads;

import java.util.UUID;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;
import o.InterfaceFutureC8411o11;
import org.json.JSONObject;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzbor implements zzbod {
    public final zzbof a;
    public final zzbog b;
    public final zzbnz c;
    public final String d;

    public zzbor(zzbnz zzbnzVar, String str, zzbog zzbogVar, zzbof zzbofVar) {
        this.c = zzbnzVar;
        this.d = str;
        this.b = zzbogVar;
        this.a = zzbofVar;
    }

    public static /* bridge */ /* synthetic */ void d(zzbor zzborVar, zzbnt zzbntVar, zzboa zzboaVar, Object obj, zzcaf zzcafVar) {
        try {
            com.google.android.gms.ads.internal.zzv.v();
            String uuid = UUID.randomUUID().toString();
            zzbjv.f226o.c(uuid, new zzboq(zzborVar, zzbntVar, zzcafVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", zzborVar.b.c(obj));
            zzboaVar.c1(zzborVar.d, jSONObject);
        } catch (Exception e) {
            try {
                zzcafVar.d(e);
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Unable to invokeJavascript", e);
            } finally {
                zzbntVar.h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final InterfaceFutureC8411o11 b(@InterfaceC11300zs1 Object obj) throws Exception {
        return c(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final InterfaceFutureC8411o11 c(Object obj) {
        zzcaf zzcafVar = new zzcaf();
        zzbnt b = this.c.b(null);
        com.google.android.gms.ads.internal.util.zze.k("callJs > getEngine: Promise created");
        b.f(new zzboo(this, b, obj, zzcafVar), new zzbop(this, zzcafVar, b));
        return zzcafVar;
    }
}
