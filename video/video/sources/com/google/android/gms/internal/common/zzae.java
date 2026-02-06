package com.google.android.gms.internal.common;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzae extends zzz {
    public final zzag Z;

    public zzae(zzag zzagVar, int i) {
        super(zzagVar.size(), i);
        this.Z = zzagVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    public final Object b(int i) {
        return this.Z.get(i);
    }
}
