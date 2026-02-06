package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzgmp extends zzgex {
    public final zzgoj a;

    public zzgmp(zzgoj zzgojVar) {
        this.a = zzgojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgex
    public final boolean a() {
        if (this.a.c().x2() != zzguq.RAW) {
            return true;
        }
        return false;
    }

    public final zzgoj b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgmp)) {
            return false;
        }
        zzgoj zzgojVar = ((zzgmp) obj).a;
        zzgoj zzgojVar2 = this.a;
        if (!zzgojVar2.c().x2().equals(zzgojVar.c().x2()) || !zzgojVar2.c().z2().equals(zzgojVar.c().z2()) || !zzgojVar2.c().y2().equals(zzgojVar.c().y2())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        zzgoj zzgojVar = this.a;
        return Objects.hash(zzgojVar.c(), zzgojVar.f());
    }

    public final String toString() {
        String str;
        zzgoj zzgojVar = this.a;
        String z2 = zzgojVar.c().z2();
        int ordinal = zzgojVar.c().x2().ordinal();
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
        return String.format("(typeUrl=%s, outputPrefixType=%s)", z2, str);
    }
}
