package com.google.android.gms.internal.ads;

import android.content.Context;

@Deprecated
/* loaded from: classes2.dex */
public final class zzme {
    public final zzit a;

    @Deprecated
    public zzme(Context context, zzceh zzcehVar) {
        this.a = new zzit(context, zzcehVar);
    }

    @Deprecated
    public final zzme a(final zzks zzksVar) {
        zzit zzitVar = this.a;
        zzdc.f(!zzitVar.r);
        zzksVar.getClass();
        zzitVar.f = new zzfvu() { // from class: com.google.android.gms.internal.ads.zzil
            @Override // com.google.android.gms.internal.ads.zzfvu
            public final Object a() {
                return zzks.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzme b(final zzyx zzyxVar) {
        zzit zzitVar = this.a;
        zzdc.f(!zzitVar.r);
        zzyxVar.getClass();
        zzitVar.e = new zzfvu() { // from class: com.google.android.gms.internal.ads.zzis
            @Override // com.google.android.gms.internal.ads.zzfvu
            public final Object a() {
                return zzyx.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzmf c() {
        zzit zzitVar = this.a;
        zzdc.f(!zzitVar.r);
        zzitVar.r = true;
        return new zzmf(zzitVar);
    }
}
