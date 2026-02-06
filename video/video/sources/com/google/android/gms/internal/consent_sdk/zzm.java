package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: classes3.dex */
public final class zzm implements zzdo {
    public final zzdr a;
    public final zzdr b;

    public zzm(zzdr zzdrVar, zzdr zzdrVar2) {
        this.a = zzdrVar;
        this.b = zzdrVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    public final /* bridge */ /* synthetic */ Object a() {
        return new zzl((Application) this.a.a(), (zzam) this.b.a());
    }
}
