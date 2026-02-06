package com.google.android.gms.internal.ads;

import o.C10323vs;

/* loaded from: classes2.dex */
public final class zzkt {
    public long a;
    public float b;
    public long c;

    public zzkt() {
        this.a = C10323vs.b;
        this.b = -3.4028235E38f;
        this.c = C10323vs.b;
    }

    public final zzkt d(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == C10323vs.b) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        zzdc.d(z);
        this.c = j;
        return this;
    }

    public final zzkt e(long j) {
        this.a = j;
        return this;
    }

    public final zzkt f(float f) {
        boolean z = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z = false;
        }
        zzdc.d(z);
        this.b = f;
        return this;
    }

    public final zzkv g() {
        return new zzkv(this, null);
    }

    public /* synthetic */ zzkt(zzkv zzkvVar, zzku zzkuVar) {
        this.a = zzkvVar.a;
        this.b = zzkvVar.b;
        this.c = zzkvVar.c;
    }
}
