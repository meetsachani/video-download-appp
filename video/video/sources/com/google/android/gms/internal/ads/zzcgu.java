package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcgu extends MutableContextWrapper {
    @InterfaceC11300zs1
    public Activity a;
    public Context b;
    public Context c;

    public zzcgu(Context context) {
        super(context);
        setBaseContext(context);
    }

    @InterfaceC11300zs1
    public final Activity a() {
        return this.a;
    }

    public final Context b() {
        return this.c;
    }

    public final void c(Intent intent, int i) {
        if (this.a != null) {
            String valueOf = String.valueOf(intent.getData());
            com.google.android.gms.ads.internal.util.zze.k("Starting activity for result with intent: " + valueOf + " and requestCode: 236");
            this.a.startActivityForResult(intent, 236);
            return;
        }
        intent.setFlags(268435456);
        this.b.startActivity(intent);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Activity activity;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        this.a = activity;
        this.c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.b.startActivity(intent);
    }
}
