package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzge {
    public static <V> V a(zzgd<V> zzgdVar) {
        try {
            return zzgdVar.a();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzgdVar.a();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
