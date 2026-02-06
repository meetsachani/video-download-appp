package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzetf implements zzetv {
    public final zzbyj a;
    public final zzgdj b;
    public final Context c;

    public zzetf(zzbyj zzbyjVar, zzgdj zzgdjVar, Context context) {
        this.a = zzbyjVar;
        this.b = zzgdjVar;
        this.c = context;
    }

    public static /* synthetic */ zzetg c(zzetf zzetfVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        zzbyj zzbyjVar = zzetfVar.a;
        Context context = zzetfVar.c;
        if (!zzbyjVar.p(context)) {
            return new zzetg(null, null, null, null, null);
        }
        String e = zzbyjVar.e(context);
        if (e == null) {
            str = "";
        } else {
            str = e;
        }
        String c = zzbyjVar.c(context);
        if (c == null) {
            str2 = "";
        } else {
            str2 = c;
        }
        String b = zzbyjVar.b(context);
        if (b == null) {
            str3 = "";
        } else {
            str3 = b;
        }
        boolean p = zzbyjVar.p(context);
        Long l = null;
        if (true != p) {
            str4 = null;
        } else {
            str4 = "fa";
        }
        if ("TIME_OUT".equals(str2)) {
            l = (Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x0);
        }
        Long l2 = l;
        if (str4 == null) {
            str5 = "";
        } else {
            str5 = str4;
        }
        return new zzetg(str, str2, str3, str5, l2);
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.b.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzete
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzetf.c(zzetf.this);
            }
        });
    }
}
