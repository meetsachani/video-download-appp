package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzevb implements zzetv {
    public final Executor a;
    public final String b;

    public zzevb(zzbze zzbzeVar, Executor executor, String str, @InterfaceC11300zs1 PackageInfo packageInfo, int i) {
        this.a = executor;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        InterfaceFutureC8411o11 h = zzgcy.h(this.b);
        zzfur zzfurVar = new zzfur() { // from class: com.google.android.gms.internal.ads.zzeuz
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                return new zzevc((String) obj);
            }
        };
        Executor executor = this.a;
        return zzgcy.f(zzgcy.m(h, zzfurVar, executor), Throwable.class, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzeva
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                InterfaceFutureC8411o11 h2;
                Throwable th = (Throwable) obj;
                h2 = zzgcy.h(new zzevc(zzevb.this.b));
                return h2;
            }
        }, executor);
    }
}
