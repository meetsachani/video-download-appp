package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzetj implements zzetv {
    public final zzgdj a;
    public final Context b;
    public final VersionInfoParcel c;
    @InterfaceC11300zs1
    public final String d;

    public zzetj(zzgdj zzgdjVar, Context context, VersionInfoParcel versionInfoParcel, @InterfaceC11300zs1 String str) {
        this.a = zzgdjVar;
        this.b = context;
        this.c = versionInfoParcel;
        this.d = str;
    }

    public static /* synthetic */ zzetk c(zzetj zzetjVar) {
        int i;
        Context context = zzetjVar.b;
        boolean g = Wrappers.a(context).g();
        com.google.android.gms.ads.internal.zzv.v();
        boolean f = com.google.android.gms.ads.internal.util.zzs.f(context);
        String str = zzetjVar.c.X;
        com.google.android.gms.ads.internal.zzv.v();
        boolean g2 = com.google.android.gms.ads.internal.util.zzs.g();
        com.google.android.gms.ads.internal.zzv.v();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            i = 0;
        } else {
            i = applicationInfo.targetSdkVersion;
        }
        return new zzetk(g, f, str, g2, i, DynamiteModule.c(context, ModuleDescriptor.MODULE_ID), DynamiteModule.a(context, ModuleDescriptor.MODULE_ID), zzetjVar.d);
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzeti
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzetj.c(zzetj.this);
            }
        });
    }
}
