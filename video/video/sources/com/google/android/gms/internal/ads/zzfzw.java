package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class zzfzw extends zzfzn implements Serializable {
    public final zzfzn X;

    public zzfzw(zzfzn zzfznVar) {
        this.X = zzfznVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzn, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.X.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfzw) {
            return this.X.equals(((zzfzw) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return -this.X.hashCode();
    }

    public final String toString() {
        return this.X.toString().concat(".reverse()");
    }
}
