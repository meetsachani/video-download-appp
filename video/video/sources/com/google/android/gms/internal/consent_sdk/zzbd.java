package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: classes3.dex */
public final class zzbd implements zzdo {
    public final zzdr a;
    public final zzdr b;
    public final zzdr c;
    public final zzdr d;
    public final zzdr e;
    public final zzdr f;

    public zzbd(zzdr zzdrVar, zzdr zzdrVar2, zzdr zzdrVar3, zzdr zzdrVar4, zzdr zzdrVar5, zzdr zzdrVar6) {
        this.a = zzdrVar;
        this.b = zzdrVar2;
        this.c = zzdrVar3;
        this.d = zzdrVar4;
        this.e = zzdrVar5;
        this.f = zzdrVar6;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    public final /* bridge */ /* synthetic */ Object a() {
        return new zzbc((Application) this.a.a(), (zzad) this.b.a(), (zzbx) this.c.a(), (zzaq) this.d.a(), (zzbq) this.e.a(), this.f);
    }
}
