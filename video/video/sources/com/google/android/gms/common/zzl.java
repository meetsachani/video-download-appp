package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
abstract class zzl extends zzj {
    public static final WeakReference Z = new WeakReference(null);
    public WeakReference Y;

    public zzl(byte[] bArr) {
        super(bArr);
        this.Y = Z;
    }

    @Override // com.google.android.gms.common.zzj
    public final byte[] V3() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.Y.get();
                if (bArr == null) {
                    bArr = r4();
                    this.Y = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    public abstract byte[] r4();
}
