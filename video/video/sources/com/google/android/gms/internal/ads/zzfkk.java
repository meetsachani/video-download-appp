package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Objects;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfkk {
    public final String a;
    @InterfaceC11300zs1
    public final AdFormat b;

    public /* synthetic */ zzfkk(zzfki zzfkiVar, zzfkj zzfkjVar) {
        String str;
        AdFormat adFormat;
        str = zzfkiVar.a;
        this.a = str;
        adFormat = zzfkiVar.b;
        this.b = adFormat;
    }

    public final String a() {
        AdFormat adFormat = this.b;
        if (adFormat == null) {
            return "unknown";
        }
        return adFormat.name().toLowerCase(Locale.ENGLISH);
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        AdFormat adFormat;
        AdFormat adFormat2;
        if (obj instanceof zzfkk) {
            zzfkk zzfkkVar = (zzfkk) obj;
            if (this.a.equals(zzfkkVar.a) && (adFormat = this.b) != null && (adFormat2 = zzfkkVar.b) != null && adFormat.equals(adFormat2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
