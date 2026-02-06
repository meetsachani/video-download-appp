package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmi {
    public final Clock a;
    public long b;

    public zzmi(Clock clock) {
        Preconditions.r(clock);
        this.a = clock;
    }

    public final void a() {
        this.b = 0L;
    }

    public final boolean b(long j) {
        if (this.b == 0 || this.a.b() - this.b >= 3600000) {
            return true;
        }
        return false;
    }

    public final void c() {
        this.b = this.a.b();
    }
}
