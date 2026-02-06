package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzccv extends zzard {
    public static final zzccv c = new zzccv();

    @Override // com.google.android.gms.internal.ads.zzard
    public final zzarh b(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzarj();
        }
        if ("mvhd".equals(str)) {
            return new zzark();
        }
        return new zzarl(str);
    }
}
