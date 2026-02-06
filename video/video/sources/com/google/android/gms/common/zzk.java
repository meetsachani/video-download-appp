package com.google.android.gms.common;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzk extends zzj {
    public final byte[] Y;

    public zzk(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.Y = bArr;
    }

    @Override // com.google.android.gms.common.zzj
    public final byte[] V3() {
        return this.Y;
    }
}
