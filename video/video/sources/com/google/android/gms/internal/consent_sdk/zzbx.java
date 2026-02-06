package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.ContextWrapper;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class zzbx extends ContextWrapper {
    public Activity a;

    public zzbx(Application application) {
        super(application);
    }

    public final void a(Activity activity) {
        this.a = activity;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        Activity activity = this.a;
        if (activity != null) {
            return activity.getSystemService(str);
        }
        return super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        super.startActivity(intent);
    }
}
