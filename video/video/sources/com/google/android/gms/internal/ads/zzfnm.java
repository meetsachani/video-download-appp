package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfnm extends zzfni {
    public zzfnm(zzfnb zzfnbVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfnbVar, hashSet, jSONObject, j);
    }

    @Override // com.google.android.gms.internal.ads.zzfnj
    public final void a(String str) {
        c(str);
        super.onPostExecute(str);
    }

    public final void c(String str) {
        zzflx a = zzflx.a();
        if (a != null) {
            for (zzflf zzflfVar : a.c()) {
                if (this.c.contains(zzflfVar.h())) {
                    zzflfVar.g().d(str, this.e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.d.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfnj, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        c(str);
        super.onPostExecute(str);
    }
}
