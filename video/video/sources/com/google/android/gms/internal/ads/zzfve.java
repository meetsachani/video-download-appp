package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
final class zzfve implements Serializable, zzfvd {
    public final List X;

    @Override // com.google.android.gms.internal.ads.zzfvd
    public final boolean b(Object obj) {
        int i = 0;
        while (true) {
            List list = this.X;
            if (i < list.size()) {
                if (!((zzfvd) list.get(i)).b(obj)) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfve) {
            return this.X.equals(((zzfve) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z = true;
        for (Object obj : this.X) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
