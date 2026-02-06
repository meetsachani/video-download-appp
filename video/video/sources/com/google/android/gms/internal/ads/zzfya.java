package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfya extends zzfwc {
    public final zzfyc Z;

    public zzfya(zzfyc zzfycVar, int i) {
        super(zzfycVar.size(), i);
        this.Z = zzfycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final Object b(int i) {
        return this.Z.get(i);
    }
}
