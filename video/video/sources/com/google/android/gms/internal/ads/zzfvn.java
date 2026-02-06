package com.google.android.gms.internal.ads;

import o.S92;

/* loaded from: classes2.dex */
final class zzfvn extends zzfvp {
    public zzfvn(zzfvr zzfvrVar, CharSequence charSequence, int i) {
        super(zzfvrVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzfvp
    public final int d(int i) {
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfvp
    public final int e(int i) {
        CharSequence charSequence = this.Z;
        int i2 = i + S92.y;
        if (i2 < charSequence.length()) {
            return i2;
        }
        return -1;
    }
}
