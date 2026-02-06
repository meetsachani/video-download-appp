package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes3.dex */
public final class zzdm implements zzdo {
    public zzdr a;

    public static void b(zzdr zzdrVar, zzdr zzdrVar2) {
        zzdm zzdmVar = (zzdm) zzdrVar;
        if (zzdmVar.a == null) {
            zzdmVar.a = zzdrVar2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    public final Object a() {
        zzdr zzdrVar = this.a;
        if (zzdrVar != null) {
            return zzdrVar.a();
        }
        throw new IllegalStateException();
    }
}
