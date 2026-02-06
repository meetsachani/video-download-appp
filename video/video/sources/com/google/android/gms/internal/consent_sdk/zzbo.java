package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o.C10101ux0;
import o.C9925uD2;
import o.InterfaceC10697xN2;
import o.InterfaceC6768hK;
import o.InterfaceC7011iK;

/* loaded from: classes3.dex */
public final class zzbo {
    public final zzdt a;
    public final Executor b;
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference d = new AtomicReference();

    public zzbo(zzdt zzdtVar, Executor executor) {
        this.a = zzdtVar;
        this.b = executor;
    }

    public static /* synthetic */ void a(zzbo zzboVar, zzbc zzbcVar) {
        final AtomicReference atomicReference = zzboVar.d;
        Objects.requireNonNull(atomicReference);
        zzbcVar.g(new C9925uD2.b() { // from class: com.google.android.gms.internal.consent_sdk.zzbf
            @Override // o.C9925uD2.b
            public final void b(InterfaceC6768hK interfaceC6768hK) {
                atomicReference.set(interfaceC6768hK);
            }
        }, new C9925uD2.a() { // from class: com.google.android.gms.internal.consent_sdk.zzbg
            @Override // o.C9925uD2.a
            public final void a(C10101ux0 c10101ux0) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(c10101ux0.b())));
            }
        });
    }

    public final void b(C9925uD2.b bVar, C9925uD2.a aVar) {
        zzcs.a();
        zzbq zzbqVar = (zzbq) this.c.get();
        if (zzbqVar == null) {
            aVar.a(new zzg(3, "No available form can be built.").a());
        } else {
            ((zzaw) this.a.a()).a(zzbqVar).b().a().g(bVar, aVar);
        }
    }

    @InterfaceC10697xN2
    public final void c() {
        zzbq zzbqVar = (zzbq) this.c.get();
        if (zzbqVar == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        final zzbc a = ((zzaw) this.a.a()).a(zzbqVar).b().a();
        a.l = true;
        zzcs.a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbe
            @Override // java.lang.Runnable
            public final void run() {
                zzbo.a(zzbo.this, a);
            }
        });
    }

    public final void d(zzbq zzbqVar) {
        this.c.set(zzbqVar);
    }

    public final void e(Activity activity, final InterfaceC6768hK.a aVar) {
        zzcs.a();
        zzj b = zza.a(activity).b();
        if (b == null) {
            zzcs.a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbh
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC6768hK.a.this.a(new zzg(1, "No consentInformation.").a());
                }
            });
        } else if (!b.b() && b.c() != InterfaceC7011iK.d.NOT_REQUIRED) {
            zzcs.a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbi
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC6768hK.a.this.a(new zzg(3, "No valid response received yet.").a());
                }
            });
            b.f(activity);
        } else if (b.c() == InterfaceC7011iK.d.NOT_REQUIRED) {
            zzcs.a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbj
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC6768hK.a.this.a(new zzg(3, "Privacy options form is not required.").a());
                }
            });
        } else {
            InterfaceC6768hK interfaceC6768hK = (InterfaceC6768hK) this.d.get();
            if (interfaceC6768hK == null) {
                zzcs.a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbk
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC6768hK.a.this.a(new zzg(3, "Privacy options form is being loading. Please try again later.").a());
                    }
                });
                return;
            }
            interfaceC6768hK.a(activity, aVar);
            this.b.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbl
                @Override // java.lang.Runnable
                public final void run() {
                    zzbo.this.c();
                }
            });
        }
    }

    public final boolean f() {
        if (this.c.get() != null) {
            return true;
        }
        return false;
    }
}
