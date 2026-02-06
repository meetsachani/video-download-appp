package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class zzfxn extends zzfzn implements Serializable {
    public final Comparator X;

    public zzfxn(Comparator comparator) {
        this.X = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfzn, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.X.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfxn) {
            return this.X.equals(((zzfxn) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        return this.X.toString();
    }
}
