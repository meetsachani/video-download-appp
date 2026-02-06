package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcfh implements zzgcu {
    public final /* synthetic */ List a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ zzcfj d;

    public zzcfh(zzcfj zzcfjVar, List list, String str, Uri uri) {
        this.a = list;
        this.b = str;
        this.c = uri;
        this.d = zzcfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        String valueOf = String.valueOf(this.c);
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("Failed to parse gmsg params for: ".concat(valueOf));
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        List list = this.a;
        String str = this.b;
        this.d.x((Map) obj, list, str);
    }
}
