package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
final class zzgoo {
    public final Class a;
    public final zzgwp b;

    public /* synthetic */ zzgoo(Class cls, zzgwp zzgwpVar, zzgoq zzgoqVar) {
        this.a = cls;
        this.b = zzgwpVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgoo)) {
            return false;
        }
        zzgoo zzgooVar = (zzgoo) obj;
        if (!zzgooVar.a.equals(this.a) || !zzgooVar.b.equals(this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        zzgwp zzgwpVar = this.b;
        String simpleName = this.a.getSimpleName();
        String valueOf = String.valueOf(zzgwpVar);
        return simpleName + ", object identifier: " + valueOf;
    }
}
