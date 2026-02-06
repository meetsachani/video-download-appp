package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzapu;
import com.google.android.gms.internal.ads.zzaqa;
import com.google.android.gms.internal.ads.zzaqr;
import com.google.android.gms.internal.ads.zzcaf;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbm extends zzapu {
    public final zzcaf h1;
    public final com.google.android.gms.ads.internal.util.client.zzl i1;

    public zzbm(String str, Map map, zzcaf zzcafVar) {
        super(0, str, new zzbl(zzcafVar));
        this.h1 = zzcafVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.i1 = zzlVar;
        zzlVar.d(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final zzaqa m(zzapq zzapqVar) {
        return zzaqa.b(zzapqVar, zzaqr.b(zzapqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final /* bridge */ /* synthetic */ void t(Object obj) {
        zzapq zzapqVar = (zzapq) obj;
        Map map = zzapqVar.c;
        int i = zzapqVar.a;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.i1;
        zzlVar.f(map, i);
        byte[] bArr = zzapqVar.b;
        if (com.google.android.gms.ads.internal.util.client.zzl.k() && bArr != null) {
            zzlVar.h(bArr);
        }
        this.h1.c(zzapqVar);
    }
}
