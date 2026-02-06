package com.google.android.gms.measurement.internal;

import android.os.Handler;
import o.InterfaceC10697xN2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmc {
    public zzmb a;
    public final /* synthetic */ zzlx b;

    public zzmc(zzlx zzlxVar) {
        this.b = zzlxVar;
    }

    @InterfaceC10697xN2
    public final void a() {
        Handler handler;
        this.b.n();
        if (this.a != null) {
            handler = this.b.c;
            handler.removeCallbacks(this.a);
        }
        this.b.h().s.a(false);
        this.b.D(false);
    }

    @InterfaceC10697xN2
    public final void b(long j) {
        Handler handler;
        this.a = new zzmb(this, this.b.b().a(), j);
        handler = this.b.c;
        handler.postDelayed(this.a, 2000L);
    }
}
