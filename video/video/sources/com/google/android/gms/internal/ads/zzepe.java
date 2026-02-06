package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzepe implements zzhfv {
    public static zzepe a() {
        return zzepd.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* synthetic */ Object b() {
        List arrayList = new ArrayList();
        zzbcm zzbcmVar = zzbcv.ac;
        if (!((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).split(","));
        }
        zzhgd.b(arrayList);
        return arrayList;
    }
}
