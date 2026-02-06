package com.google.android.gms.internal.measurement;

import android.util.Log;
import o.InterfaceC10571ws1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgr extends zzgn<Long> {
    public zzgr(zzgv zzgvVar, String str, Long l, boolean z) {
        super(zzgvVar, str, l);
    }

    @Override // com.google.android.gms.internal.measurement.zzgn
    @InterfaceC10571ws1
    /* renamed from: o */
    public final Long g(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String k = super.k();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid long value for " + k + ": " + valueOf);
        return null;
    }
}
