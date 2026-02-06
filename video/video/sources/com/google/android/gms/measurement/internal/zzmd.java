package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzoh;
import o.InterfaceC10697xN2;
import o.InterfaceC5056aJ2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmd {
    @InterfaceC5056aJ2
    public long a;
    @InterfaceC5056aJ2
    public long b;
    public final zzaw c;
    public final /* synthetic */ zzlx d;

    public zzmd(zzlx zzlxVar) {
        this.d = zzlxVar;
        this.c = new zzmg(this, zzlxVar.a);
        long b = zzlxVar.b().b();
        this.a = b;
        this.b = b;
    }

    public static /* synthetic */ void c(zzmd zzmdVar) {
        zzmdVar.d.n();
        zzmdVar.d(false, false, zzmdVar.d.b().b());
        zzmdVar.d.o().v(zzmdVar.d.b().b());
    }

    @InterfaceC5056aJ2
    @InterfaceC10697xN2
    public final long a(long j) {
        long j2 = j - this.b;
        this.b = j;
        return j2;
    }

    public final void b() {
        this.c.a();
        this.a = 0L;
        this.b = 0L;
    }

    @InterfaceC10697xN2
    public final boolean d(boolean z, boolean z2, long j) {
        this.d.n();
        this.d.v();
        if (!zzoh.a() || !this.d.d().s(zzbi.q0) || this.d.a.p()) {
            this.d.h().p.b(this.d.b().a());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            this.d.j().K().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = a(j);
        }
        this.d.j().K().b("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        zznd.W(this.d.s().C(!this.d.d().Q()), bundle, true);
        if (!z2) {
            this.d.r().A0("auto", "_e", bundle);
        }
        this.a = j;
        this.c.a();
        this.c.b(3600000L);
        return true;
    }

    @InterfaceC10697xN2
    public final void e(long j) {
        this.c.a();
    }

    @InterfaceC10697xN2
    public final void f(long j) {
        this.d.n();
        this.c.a();
        this.a = j;
        this.b = j;
    }
}
