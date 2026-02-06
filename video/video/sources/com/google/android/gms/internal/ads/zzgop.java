package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
final class zzgop {
    public final Class a;
    public final Class b;

    public /* synthetic */ zzgop(Class cls, Class cls2, zzgoq zzgoqVar) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgop)) {
            return false;
        }
        zzgop zzgopVar = (zzgop) obj;
        if (!zzgopVar.a.equals(this.a) || !zzgopVar.b.equals(this.b)) {
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
        return simpleName + " with serialization type: " + simpleName2;
    }
}
