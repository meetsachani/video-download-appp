package com.google.android.gms.internal.ads;

import o.C9811tl1;

/* loaded from: classes2.dex */
final class zzfvh extends zzfva {
    public final Object X;

    public zzfvh(Object obj) {
        this.X = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    public final zzfva a(zzfur zzfurVar) {
        Object apply = zzfurVar.apply(this.X);
        zzfvc.c(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzfvh(apply);
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    public final Object b(Object obj) {
        return this.X;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfvh) {
            return this.X.equals(((zzfvh) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.X.toString();
        return "Optional.of(" + obj + C9811tl1.d;
    }
}
