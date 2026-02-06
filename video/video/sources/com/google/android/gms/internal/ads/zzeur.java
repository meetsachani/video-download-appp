package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzeur implements zzetu {
    @InterfaceC5056aJ2
    public final String a;
    public final int b;

    public /* synthetic */ zzeur(String str, int i, zzeuq zzeuqVar) {
        this.a = str;
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzcuv zzcuvVar = (zzcuv) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ja)).booleanValue()) {
            String str = this.a;
            if (!TextUtils.isEmpty(str)) {
                zzcuvVar.a.putString("topics", str);
            }
            int i = this.b;
            if (i != -1) {
                zzcuvVar.a.putInt("atps", i);
            }
        }
    }
}
