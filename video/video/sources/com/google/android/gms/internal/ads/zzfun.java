package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class zzfun implements zzfvd {
    public static zzfun c(char c) {
        return new zzfuk(c);
    }

    public abstract boolean a(char c);

    @Override // com.google.android.gms.internal.ads.zzfvd
    @Deprecated
    public final /* synthetic */ boolean b(Object obj) {
        return a(((Character) obj).charValue());
    }
}
