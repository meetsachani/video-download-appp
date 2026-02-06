package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzbdv;
import com.google.android.gms.internal.ads.zzbdw;
import com.google.android.gms.internal.ads.zzhgl;
import o.C10229vT;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzo implements zzbdv {
    public final /* synthetic */ zzbdw a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Uri c;

    public zzo(zzs zzsVar, zzbdw zzbdwVar, Context context, Uri uri) {
        this.a = zzbdwVar;
        this.b = context;
        this.c = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbdv
    public final void a() {
        zzbdw zzbdwVar = this.a;
        C10229vT d = new C10229vT.i(zzbdwVar.a()).d();
        Intent intent = d.a;
        Context context = this.b;
        intent.setPackage(zzhgl.a(context));
        d.t(context, this.c);
        zzbdwVar.f((Activity) context);
    }
}
