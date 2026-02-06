package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zzchc {
    public VersionInfoParcel a;
    public Context b;
    public long c;
    public WeakReference d;

    public final zzchc d(long j) {
        this.c = j;
        return this;
    }

    public final zzchc e(Context context) {
        this.d = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.b = context;
        return this;
    }

    public final zzchc f(VersionInfoParcel versionInfoParcel) {
        this.a = versionInfoParcel;
        return this;
    }
}
