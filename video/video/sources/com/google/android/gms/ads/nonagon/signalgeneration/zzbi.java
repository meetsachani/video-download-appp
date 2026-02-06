package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbvl;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzdyr;
import com.google.android.gms.internal.ads.zzgcf;
import com.google.android.gms.internal.ads.zzgcy;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import o.InterfaceFutureC8411o11;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzbi implements zzgcf {
    public final Executor a;
    public final zzdxh b;

    public zzbi(Executor executor, zzdxh zzdxhVar) {
        this.a = executor;
        this.b = zzdxhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ InterfaceFutureC8411o11 b(Object obj) throws Exception {
        final zzbvl zzbvlVar = (zzbvl) obj;
        return zzgcy.n(this.b.c(zzbvlVar), new zzgcf() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbh
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj2) {
                zzdyr zzdyrVar = (zzdyr) obj2;
                zzbk zzbkVar = new zzbk(new JsonReader(new InputStreamReader(zzdyrVar.b())), zzdyrVar.a());
                zzbvl zzbvlVar2 = zzbvl.this;
                try {
                    zzbkVar.b = com.google.android.gms.ads.internal.client.zzbb.b().o(zzbvlVar2.X).toString();
                } catch (JSONException unused) {
                    zzbkVar.b = "{}";
                }
                Bundle bundle = zzbvlVar2.i1;
                if (!bundle.isEmpty()) {
                    try {
                        zzbkVar.c = com.google.android.gms.ads.internal.client.zzbb.b().o(bundle).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return zzgcy.h(zzbkVar);
            }
        }, this.a);
    }
}
