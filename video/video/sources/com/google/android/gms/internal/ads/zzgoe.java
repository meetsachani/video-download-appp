package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
final class zzgoe {
    public final Class a;
    public final Class b;

    public /* synthetic */ zzgoe(Class cls, Class cls2, zzgof zzgofVar) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgoe)) {
            return false;
        }
        zzgoe zzgoeVar = (zzgoe) obj;
        if (!zzgoeVar.a.equals(this.a) || !zzgoeVar.b.equals(this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        Class cls = this.b;
        String simpleName = this.a.getSimpleName();
        String simpleName2 = cls.getSimpleName();
        return simpleName + " with primitive type: " + simpleName2;
    }
}
