package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzbdl extends zzbdm {
    public final com.google.android.gms.ads.internal.zzg X;
    @InterfaceC11300zs1
    public final String Y;
    public final String Z;

    public zzbdl(com.google.android.gms.ads.internal.zzg zzgVar, @InterfaceC11300zs1 String str, String str2) {
        this.X = zzgVar;
        this.Y = str;
        this.Z = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzbdn
    public final void L0(@InterfaceC11300zs1 IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return;
        }
        this.X.a((View) ObjectWrapper.o1(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbdn
    public final String b() {
        return this.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzbdn
    public final String c() {
        return this.Z;
    }

    @Override // com.google.android.gms.internal.ads.zzbdn
    public final void d() {
        this.X.b();
    }

    @Override // com.google.android.gms.internal.ads.zzbdn
    public final void e() {
        this.X.c();
    }
}
