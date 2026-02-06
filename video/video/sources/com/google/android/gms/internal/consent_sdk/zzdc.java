package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdc extends zzcz {
    public final zzde Z;

    public zzdc(zzde zzdeVar, int i) {
        super(zzdeVar.size(), i);
        this.Z = zzdeVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcz
    public final Object b(int i) {
        return this.Z.get(i);
    }
}
