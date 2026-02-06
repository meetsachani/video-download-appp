package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgmm extends zzgex {
    public final String a;
    public final zzguq b;

    public /* synthetic */ zzgmm(String str, zzguq zzguqVar, zzgmn zzgmnVar) {
        this.a = str;
        this.b = zzguqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean a() {
        return this.b != zzguq.RAW;
    }

    public final String toString() {
        String str;
        String str2 = this.a;
        int ordinal = this.b.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "CRUNCHY";
                    }
                } else {
                    str = "RAW";
                }
            } else {
                str = "LEGACY";
            }
        } else {
            str = "TINK";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str2, str);
    }
}
