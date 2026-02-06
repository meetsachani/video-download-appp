package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: classes3.dex */
public final class zzx implements zzdo {
    public final zzdr a;
    public final zzdr b;
    public final zzdr c;
    public final zzdr d;
    public final zzdr e;
    public final zzdr f;
    public final zzdr g;

    public zzx(zzdr zzdrVar, zzdr zzdrVar2, zzdr zzdrVar3, zzdr zzdrVar4, zzdr zzdrVar5, zzdr zzdrVar6, zzdr zzdrVar7, zzdr zzdrVar8, zzdr zzdrVar9) {
        this.a = zzdrVar;
        this.b = zzdrVar2;
        this.c = zzdrVar5;
        this.d = zzdrVar6;
        this.e = zzdrVar7;
        this.f = zzdrVar8;
        this.g = zzdrVar9;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    /* renamed from: b */
    public final zzw a() {
        return new zzw((Application) this.a.a(), (zzad) this.b.a(), zzat.b(), zzav.b(), (zzaq) this.c.a(), (zzbo) this.d.a(), ((zzq) this.e).a(), ((zzac) this.f).a(), (zze) this.g.a());
    }
}
