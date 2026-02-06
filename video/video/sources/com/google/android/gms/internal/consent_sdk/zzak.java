package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes3.dex */
final class zzak implements zzax {
    public final zzah a;
    public final zzdr b;
    public final zzdr c;
    public final zzdr d;
    public final zzdr e;
    public final zzdr f;

    public zzak(zzah zzahVar, zzbq zzbqVar) {
        this.a = zzahVar;
        zzdr b = zzdn.b(new zzby(zzahVar.c));
        this.b = b;
        zzdo b2 = zzdp.b(zzbqVar);
        this.c = b2;
        zzdm zzdmVar = new zzdm();
        this.d = zzdmVar;
        zzdr zzdrVar = zzahVar.c;
        zzat zzatVar = zzas.a;
        zzav zzavVar = zzau.a;
        zzdr zzdrVar2 = zzahVar.i;
        zzdr zzdrVar3 = zzahVar.l;
        zzdr zzdrVar4 = zzahVar.d;
        zzcc zzccVar = new zzcc(zzdrVar, b, zzatVar, zzavVar, zzdrVar2, zzdrVar3, zzdmVar, zzdrVar4);
        this.e = zzccVar;
        zzbw zzbwVar = new zzbw(b, zzatVar, zzccVar);
        this.f = zzbwVar;
        zzdm.b(zzdmVar, zzdn.b(new zzbd(zzdrVar, zzahVar.e, b, zzdrVar4, b2, zzbwVar)));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzax
    public final zzbc a() {
        return (zzbc) this.d.a();
    }
}
