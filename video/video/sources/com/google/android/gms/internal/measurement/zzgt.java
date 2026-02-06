package com.google.android.gms.internal.measurement;

import android.util.Log;
import o.InterfaceC10571ws1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgt extends zzgn<Double> {
    public zzgt(zzgv zzgvVar, String str, Double d, boolean z) {
        super(zzgvVar, str, d);
    }

    @Override // com.google.android.gms.internal.measurement.zzgn
    @InterfaceC10571ws1
    /* renamed from: o */
    public final Double g(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String k = super.k();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid double value for " + k + ": " + valueOf);
        return null;
    }
}
