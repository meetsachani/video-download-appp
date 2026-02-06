package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import o.InterfaceC11300zs1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzeif implements zzedh {
    public final zzejj a;
    public final zzdpt b;

    public zzeif(zzejj zzejjVar, zzdpt zzdptVar) {
        this.a = zzejjVar;
        this.b = zzdptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedh
    @InterfaceC11300zs1
    public final zzedi a(String str, JSONObject jSONObject) throws zzfcw {
        zzbrk zzbrkVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Q1)).booleanValue()) {
            try {
                zzbrkVar = this.b.b(str);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Coundn't create RTB adapter: ", e);
                zzbrkVar = null;
            }
        } else {
            zzbrkVar = this.a.a(str);
        }
        if (zzbrkVar == null) {
            return null;
        }
        return new zzedi(zzbrkVar, new zzeew(), str);
    }
}
