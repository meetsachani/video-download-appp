package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbcw {
    public static List a() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, zzbef.c("gad:dynamite_module:experiment_id", ""));
        c(arrayList, zzbes.a);
        c(arrayList, zzbes.b);
        c(arrayList, zzbes.c);
        c(arrayList, zzbes.d);
        c(arrayList, zzbes.e);
        c(arrayList, zzbes.u);
        c(arrayList, zzbes.f);
        c(arrayList, zzbes.m);
        c(arrayList, zzbes.n);
        c(arrayList, zzbes.f225o);
        c(arrayList, zzbes.p);
        c(arrayList, zzbes.q);
        c(arrayList, zzbes.r);
        c(arrayList, zzbes.s);
        c(arrayList, zzbes.t);
        c(arrayList, zzbes.g);
        c(arrayList, zzbes.h);
        c(arrayList, zzbes.i);
        c(arrayList, zzbes.j);
        c(arrayList, zzbes.k);
        c(arrayList, zzbes.l);
        return arrayList;
    }

    public static List b() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, zzbfg.a);
        return arrayList;
    }

    public static void c(List list, zzbef zzbefVar) {
        String str = (String) zzbefVar.e();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}
