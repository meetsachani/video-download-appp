package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import o.C9755tW1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdwz implements zzhfv {
    public final zzhge a;

    public zzdwz(zzhge zzhgeVar) {
        this.a = zzhgeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L10;
     */
    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object b() {
        String valueOf;
        zzfcp a = ((zzcvk) this.a).a();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.u7)).booleanValue()) {
            String str = a.d.s1;
            if (!TextUtils.isEmpty(str)) {
                try {
                    valueOf = new JSONObject(str).getString(C9755tW1.f875o);
                } catch (JSONException unused) {
                }
            }
            com.google.android.gms.ads.internal.client.zzc zzcVar = a.d.n1;
            if (zzcVar != null) {
                try {
                    valueOf = new JSONObject(zzcVar.X).getString(C9755tW1.f875o);
                } catch (JSONException unused2) {
                }
            }
        }
        valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbb.e().nextInt() & Integer.MAX_VALUE);
        zzhgd.b(valueOf);
        return valueOf;
    }
}
