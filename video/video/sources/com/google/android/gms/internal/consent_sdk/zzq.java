package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: classes3.dex */
public final class zzq implements zzdo {
    public final zzdr a;
    public final zzdr b;

    public zzq(zzdr zzdrVar, zzdr zzdrVar2) {
        this.a = zzdrVar;
        this.b = zzdrVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    /* renamed from: b */
    public final zzn a() {
        return new zzn((Application) this.a.a(), (zzaq) this.b.a());
    }
}
