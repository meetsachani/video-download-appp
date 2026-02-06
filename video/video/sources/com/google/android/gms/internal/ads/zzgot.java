package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgot extends RuntimeException {
    public zzgot(String str) {
        super(str);
    }

    public static Object a(zzgos zzgosVar) {
        try {
            return zzgosVar.a();
        } catch (Exception e) {
            throw new zzgot(e);
        }
    }

    public zzgot(String str, Throwable th) {
        super(str, th);
    }

    public zzgot(Throwable th) {
        super(th);
    }
}
