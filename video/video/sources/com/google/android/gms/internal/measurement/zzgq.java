package com.google.android.gms.internal.measurement;

import android.util.Log;
import o.InterfaceC10571ws1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgq extends zzgn<Boolean> {
    public zzgq(zzgv zzgvVar, String str, Boolean bool, boolean z) {
        super(zzgvVar, str, bool);
    }

    @Override // com.google.android.gms.internal.measurement.zzgn
    @InterfaceC10571ws1
    public final /* synthetic */ Boolean g(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzfr.c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzfr.d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String k = super.k();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid boolean value for " + k + ": " + valueOf);
        return null;
    }
}
