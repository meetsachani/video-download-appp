package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzahh implements zzau {
    public final float a;
    public final int b;

    public zzahh(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void a(zzar zzarVar) {
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahh.class == obj.getClass()) {
            zzahh zzahhVar = (zzahh) obj;
            if (this.a == zzahhVar.a && this.b == zzahhVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }
}
