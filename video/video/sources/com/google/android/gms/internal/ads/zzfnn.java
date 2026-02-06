package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfnn extends zzfni {
    public zzfnn(zzfnb zzfnbVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfnbVar, hashSet, jSONObject, j);
    }

    @Override // com.google.android.gms.internal.ads.zzfnj
    public final void a(String str) {
        zzflx a;
        if (!TextUtils.isEmpty(str) && (a = zzflx.a()) != null) {
            for (zzflf zzflfVar : a.c()) {
                if (this.c.contains(zzflfVar.h())) {
                    zzflfVar.g().h(str, this.e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zzfnb zzfnbVar = this.b;
        JSONObject jSONObject = this.d;
        if (zzfmt.g(jSONObject, zzfnbVar.a())) {
            return null;
        }
        zzfnbVar.e(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfnj, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
