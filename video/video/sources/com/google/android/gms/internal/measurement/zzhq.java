package com.google.android.gms.internal.measurement;

import o.C6566gU0;

/* loaded from: classes3.dex */
final class zzhq extends zzhw {
    public final int a1;
    public final int b1;

    public zzhq(byte[] bArr, int i, int i2) {
        super(bArr);
        zzhm.h(i, i + i2, bArr.length);
        this.a1 = i;
        this.b1 = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzhw, com.google.android.gms.internal.measurement.zzhm
    public final int B() {
        return this.b1;
    }

    @Override // com.google.android.gms.internal.measurement.zzhw
    public final int K() {
        return this.a1;
    }

    @Override // com.google.android.gms.internal.measurement.zzhw, com.google.android.gms.internal.measurement.zzhm
    public final byte d(int i) {
        int B = B();
        if (((B - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + C6566gU0.h + B);
        }
        return this.Z0[this.a1 + i];
    }

    @Override // com.google.android.gms.internal.measurement.zzhw, com.google.android.gms.internal.measurement.zzhm
    public final byte w(int i) {
        return this.Z0[this.a1 + i];
    }
}
