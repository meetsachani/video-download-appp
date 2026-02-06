package com.google.android.gms.internal.ads;

import o.InterfaceC6859hi0;

/* loaded from: classes2.dex */
public final class zzyp {
    public final zzbm a;
    public final int[] b;

    public zzyp(zzbm zzbmVar, int[] iArr, int i) {
        if (iArr.length == 0) {
            zzdx.d(InterfaceC6859hi0.a.d, "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = zzbmVar;
        this.b = iArr;
    }
}
