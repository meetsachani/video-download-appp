package com.google.android.gms.internal.ads;

import android.content.Context;
import o.C10201vM;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzelp implements zzetv {
    public final Context a;

    public zzelp(Context context) {
        this.a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        boolean z;
        if (C10201vM.a(this.a, "com.google.android.gms.permission.AD_ID") == 0) {
            z = true;
        } else {
            z = false;
        }
        return zzgcy.h(new zzelq(z));
    }
}
