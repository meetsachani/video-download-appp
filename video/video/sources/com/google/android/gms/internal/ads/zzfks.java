package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfks implements Runnable {
    public final /* synthetic */ zzfkt X;

    public zzfks(zzfkt zzfktVar) {
        this.X = zzfktVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfkc zzfkcVar;
        zzfkc zzfkcVar2;
        Clock clock;
        zzfkk zzfkkVar;
        zzfkt zzfktVar = this.X;
        zzfkcVar = zzfktVar.n;
        if (zzfkcVar != null) {
            zzfkcVar2 = zzfktVar.n;
            clock = zzfktVar.f283o;
            long a = clock.a();
            zzfkkVar = zzfktVar.p;
            zzfkcVar2.d(a, zzfkkVar);
        }
    }
}
