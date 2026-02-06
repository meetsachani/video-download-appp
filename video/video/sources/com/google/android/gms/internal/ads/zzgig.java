package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgig {
    public static final zzgig b = new zzgig("ASSUME_AES_GCM");
    public static final zzgig c = new zzgig("ASSUME_XCHACHA20POLY1305");
    public static final zzgig d = new zzgig("ASSUME_CHACHA20POLY1305");
    public static final zzgig e = new zzgig("ASSUME_AES_CTR_HMAC");
    public static final zzgig f = new zzgig("ASSUME_AES_EAX");
    public static final zzgig g = new zzgig("ASSUME_AES_GCM_SIV");
    public final String a;

    public zzgig(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
