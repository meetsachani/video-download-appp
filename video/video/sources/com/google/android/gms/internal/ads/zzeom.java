package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import o.InterfaceFutureC8411o11;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeom {
    public final InterfaceFutureC8411o11 a;
    public final long b;
    public final Clock c;

    public zzeom(InterfaceFutureC8411o11 interfaceFutureC8411o11, long j, Clock clock) {
        this.a = interfaceFutureC8411o11;
        this.c = clock;
        this.b = clock.b() + j;
    }

    public final boolean a() {
        if (this.b < this.c.b()) {
            return true;
        }
        return false;
    }
}
