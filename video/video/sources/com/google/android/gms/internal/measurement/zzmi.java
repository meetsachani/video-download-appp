package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
abstract class zzmi {
    public abstract int a(int i, byte[] bArr, int i2, int i3);

    public abstract int b(CharSequence charSequence, byte[] bArr, int i, int i2);

    public abstract String c(byte[] bArr, int i, int i2) throws zzji;

    public final boolean d(byte[] bArr, int i, int i2) {
        if (a(0, bArr, i, i2) != 0) {
            return false;
        }
        return true;
    }
}
