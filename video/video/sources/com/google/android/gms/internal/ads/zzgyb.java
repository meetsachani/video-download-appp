package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgyb {
    public final Object a;
    public final int b;

    public zzgyb(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgyb)) {
            return false;
        }
        zzgyb zzgybVar = (zzgyb) obj;
        if (this.a != zzgybVar.a || this.b != zzgybVar.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
