package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: classes3.dex */
public final class zzap implements zzdo {
    public final zzdr a;
    public final zzdr b;
    public final zzdr c;

    public zzap(zzdr zzdrVar, zzdr zzdrVar2, zzdr zzdrVar3, zzdr zzdrVar4) {
        this.a = zzdrVar;
        this.b = zzdrVar2;
        this.c = zzdrVar3;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    /* renamed from: b */
    public final zzao a() {
        return new zzao((Application) this.a.a(), (zzaq) this.b.a(), (zzl) this.c.a(), zzav.b());
    }
}
