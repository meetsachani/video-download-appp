package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgms {
    public static final zzgms b = new zzgmq().a();
    public final Map a;

    public final boolean a() {
        return this.a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgms)) {
            return false;
        }
        return this.a.equals(((zzgms) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
