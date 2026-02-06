package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.C8006mL2;
import o.C9925uD2;
import o.InterfaceC6184ey2;
import o.InterfaceC6768hK;

@InterfaceC6184ey2
/* loaded from: classes3.dex */
public final class zzbc implements InterfaceC6768hK {
    public final Application a;
    public final zzbx b;
    public final zzaq c;
    public final zzbq d;
    public final zzdt e;
    public Dialog f;
    public zzbv g;
    public final AtomicBoolean h = new AtomicBoolean();
    public final AtomicReference i = new AtomicReference();
    public final AtomicReference j = new AtomicReference();
    public final AtomicReference k = new AtomicReference();
    public boolean l = false;

    public zzbc(Application application, zzad zzadVar, zzbx zzbxVar, zzaq zzaqVar, zzbq zzbqVar, zzdt zzdtVar) {
        this.a = application;
        this.b = zzbxVar;
        this.c = zzaqVar;
        this.d = zzbqVar;
        this.e = zzdtVar;
    }

    @Override // o.InterfaceC6768hK
    public final void a(Activity activity, InterfaceC6768hK.a aVar) {
        String str;
        zzcs.a();
        if (!this.h.compareAndSet(false, true)) {
            if (true != this.l) {
                str = "ConsentForm#show can only be invoked once.";
            } else {
                str = "Privacy options form is being loading. Please try again later.";
            }
            aVar.a(new zzg(3, str).a());
            return;
        }
        this.g.c();
        zzaz zzazVar = new zzaz(this, activity);
        this.a.registerActivityLifecycleCallbacks(zzazVar);
        this.k.set(zzazVar);
        this.b.a(activity);
        Dialog dialog = new Dialog(activity, 16973840);
        dialog.setContentView(this.g);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            aVar.a(new zzg(3, "Activity with null windows is passed in.").a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        C8006mL2.c(window, false);
        this.j.set(aVar);
        dialog.show();
        this.f = dialog;
        this.g.d("UMP_messagePresented", "");
    }

    public final zzbv d() {
        return this.g;
    }

    public final void g(C9925uD2.b bVar, C9925uD2.a aVar) {
        zzbv a = ((zzbw) this.e).a();
        this.g = a;
        a.setBackgroundColor(0);
        a.getSettings().setJavaScriptEnabled(true);
        a.getSettings().setAllowFileAccess(false);
        a.getSettings().setAllowContentAccess(false);
        a.setWebViewClient(new zzbt(a, null));
        this.i.set(new zzba(bVar, aVar, null));
        zzbv zzbvVar = this.g;
        zzbq zzbqVar = this.d;
        zzbvVar.loadDataWithBaseURL(zzbqVar.a(), zzbqVar.b(), "text/html", "UTF-8", null);
        zzcs.a.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzay
            @Override // java.lang.Runnable
            public final void run() {
                zzbc.this.k(new zzg(4, "Web view timed out."));
            }
        }, 10000L);
    }

    public final void h(int i) {
        l();
        InterfaceC6768hK.a aVar = (InterfaceC6768hK.a) this.j.getAndSet(null);
        if (aVar == null) {
            return;
        }
        this.c.g(i);
        aVar.a(null);
    }

    public final void i(zzg zzgVar) {
        l();
        InterfaceC6768hK.a aVar = (InterfaceC6768hK.a) this.j.getAndSet(null);
        if (aVar == null) {
            return;
        }
        aVar.a(zzgVar.a());
    }

    public final void j() {
        zzba zzbaVar = (zzba) this.i.getAndSet(null);
        if (zzbaVar == null) {
            return;
        }
        zzbaVar.b(this);
    }

    public final void k(zzg zzgVar) {
        zzba zzbaVar = (zzba) this.i.getAndSet(null);
        if (zzbaVar == null) {
            return;
        }
        zzbaVar.a(zzgVar.a());
    }

    public final void l() {
        Dialog dialog = this.f;
        if (dialog != null) {
            dialog.dismiss();
            this.f = null;
        }
        this.b.a(null);
        zzaz zzazVar = (zzaz) this.k.getAndSet(null);
        if (zzazVar != null) {
            zzaz.a(zzazVar);
        }
    }
}
