package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzeis implements com.google.android.gms.ads.internal.zzg {
    public final zzcvr a;
    public final zzcwl b;
    public final zzdea c;
    public final zzdds d;
    public final zzcnk e;
    public final AtomicBoolean f = new AtomicBoolean(false);

    public zzeis(zzcvr zzcvrVar, zzcwl zzcwlVar, zzdea zzdeaVar, zzdds zzddsVar, zzcnk zzcnkVar) {
        this.a = zzcvrVar;
        this.b = zzcwlVar;
        this.c = zzdeaVar;
        this.d = zzddsVar;
        this.e = zzcnkVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void a(View view) {
        if (!this.f.compareAndSet(false, true)) {
            return;
        }
        this.e.s();
        this.d.n1(view);
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void b() {
        if (this.f.get()) {
            this.a.y();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void c() {
        if (this.f.get()) {
            this.b.a();
            this.c.a();
        }
    }
}
