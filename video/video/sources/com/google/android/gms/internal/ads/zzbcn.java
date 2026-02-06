package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbcn {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final List c = new ArrayList();

    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (zzbcm zzbcmVar : this.b) {
            String str = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbcw.a());
        return arrayList;
    }

    public final List b() {
        List a = a();
        for (zzbcm zzbcmVar : this.c) {
            String str = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar);
            if (!TextUtils.isEmpty(str)) {
                a.add(str);
            }
        }
        a.addAll(zzbcw.b());
        return a;
    }

    public final void c(zzbcm zzbcmVar) {
        this.b.add(zzbcmVar);
    }

    public final void d(zzbcm zzbcmVar) {
        this.a.add(zzbcmVar);
    }

    public final void e(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzbcm zzbcmVar : this.a) {
            if (zzbcmVar.e() == 1) {
                zzbcmVar.d(editor, zzbcmVar.a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.d("Flag Json is null.");
        }
    }
}
