package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import o.C10101ux0;
import o.C7252jK;
import o.InterfaceC11300zs1;
import o.InterfaceC7011iK;

/* loaded from: classes3.dex */
public final class zzj implements InterfaceC7011iK {
    public final zzaq a;
    public final zzw b;
    public final zzbo c;
    public final Object d = new Object();
    public final Object e = new Object();
    public boolean f = false;
    public boolean g = false;
    public C7252jK h = new C7252jK.a().a();

    public zzj(zzaq zzaqVar, zzw zzwVar, zzbo zzboVar) {
        this.a = zzaqVar;
        this.b = zzwVar;
        this.c = zzboVar;
    }

    @Override // o.InterfaceC7011iK
    public final int a() {
        if (!h()) {
            return 0;
        }
        return this.a.a();
    }

    @Override // o.InterfaceC7011iK
    public final boolean b() {
        return this.c.f();
    }

    @Override // o.InterfaceC7011iK
    public final InterfaceC7011iK.d c() {
        if (!h()) {
            return InterfaceC7011iK.d.UNKNOWN;
        }
        return this.a.b();
    }

    @Override // o.InterfaceC7011iK
    public final boolean d() {
        int a;
        zzaq zzaqVar = this.a;
        if (!zzaqVar.k()) {
            if (!h()) {
                a = 0;
            } else {
                a = zzaqVar.a();
            }
            if (a != 1 && a != 3) {
                return false;
            }
        }
        return true;
    }

    @Override // o.InterfaceC7011iK
    public final void e(@InterfaceC11300zs1 Activity activity, C7252jK c7252jK, InterfaceC7011iK.c cVar, InterfaceC7011iK.b bVar) {
        synchronized (this.d) {
            this.f = true;
        }
        this.h = c7252jK;
        this.b.c(activity, c7252jK, cVar, bVar);
    }

    public final void f(@InterfaceC11300zs1 Activity activity) {
        if (h() && !i()) {
            g(true);
            this.b.c(activity, this.h, new InterfaceC7011iK.c() { // from class: com.google.android.gms.internal.consent_sdk.zzh
                @Override // o.InterfaceC7011iK.c
                public final void a() {
                    zzj.this.g(false);
                }
            }, new InterfaceC7011iK.b() { // from class: com.google.android.gms.internal.consent_sdk.zzi
                @Override // o.InterfaceC7011iK.b
                public final void a(C10101ux0 c10101ux0) {
                    zzj.this.g(false);
                }
            });
            return;
        }
        boolean h = h();
        boolean i = i();
        Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + h + ", retryRequestIsInProgress=" + i);
    }

    public final void g(boolean z) {
        synchronized (this.e) {
            this.g = z;
        }
    }

    public final boolean h() {
        boolean z;
        synchronized (this.d) {
            z = this.f;
        }
        return z;
    }

    public final boolean i() {
        boolean z;
        synchronized (this.e) {
            z = this.g;
        }
        return z;
    }

    @Override // o.InterfaceC7011iK
    public final void reset() {
        this.c.d(null);
        this.a.e();
        synchronized (this.d) {
            this.f = false;
        }
    }
}
