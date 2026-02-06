package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzey implements zzau {
    public final int a;

    public zzey(int i) {
        this.a = i;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void a(zzar zzarVar) {
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zzey) && this.a == ((zzey) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.a;
    }
}
