package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import o.C6525gK;
import o.C7252jK;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzn {
    public final Application a;
    public final zzaq b;

    public zzn(Application application, zzaq zzaqVar) {
        this.a = application;
        this.b = zzaqVar;
    }

    public final zzcj c(Activity activity, C7252jK c7252jK) throws zzg {
        C6525gK a = c7252jK.a();
        if (a == null) {
            a = new C6525gK.a(this.a).b();
        }
        return zzp.a(new zzp(this, activity, a, c7252jK, null));
    }
}
