package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import o.CT;
import org.json.JSONException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbdz extends QueryInfoGenerationCallback {
    public final /* synthetic */ String a;
    public final /* synthetic */ zzbea b;

    public zzbdz(zzbea zzbeaVar, String str) {
        this.a = str;
        this.b = zzbeaVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void a(String str) {
        CT ct;
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbea zzbeaVar = this.b;
            ct = zzbeaVar.g;
            ct.l(zzbeaVar.c(this.a, str).toString(), null);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("Error creating PACT Error Response JSON: ", e);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void b(QueryInfo queryInfo) {
        CT ct;
        String c = queryInfo.c();
        try {
            zzbea zzbeaVar = this.b;
            ct = zzbeaVar.g;
            ct.l(zzbeaVar.d(this.a, c).toString(), null);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Error creating PACT Signal Response JSON: ", e);
        }
    }
}
