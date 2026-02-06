package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: classes3.dex */
public final class zzcc implements zzdo {
    public final zzdr a;
    public final zzdr b;
    public final zzdr c;
    public final zzdr d;
    public final zzdr e;
    public final zzdr f;

    public zzcc(zzdr zzdrVar, zzdr zzdrVar2, zzdr zzdrVar3, zzdr zzdrVar4, zzdr zzdrVar5, zzdr zzdrVar6, zzdr zzdrVar7, zzdr zzdrVar8) {
        this.a = zzdrVar;
        this.b = zzdrVar2;
        this.c = zzdrVar5;
        this.d = zzdrVar6;
        this.e = zzdrVar7;
        this.f = zzdrVar8;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    /* renamed from: b */
    public final zzcb a() {
        return new zzcb((Application) this.a.a(), (zzbx) this.b.a(), zzat.b(), zzav.b(), (zze) this.c.a(), ((zzap) this.d).a(), (zzbc) this.e.a(), (zzaq) this.f.a());
    }
}
