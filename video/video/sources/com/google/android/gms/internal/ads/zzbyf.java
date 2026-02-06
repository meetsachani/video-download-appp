package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class zzbyf implements zzayu {
    public final Context X;
    public final Object Y;
    public boolean Y0;
    public final String Z;

    public zzbyf(Context context, String str) {
        this.X = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.Z = str;
        this.Y0 = false;
        this.Y = new Object();
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final void E0(zzayt zzaytVar) {
        b(zzaytVar.j);
    }

    public final String a() {
        return this.Z;
    }

    public final void b(boolean z) {
        zzbyj s = com.google.android.gms.ads.internal.zzv.s();
        Context context = this.X;
        if (!s.p(context)) {
            return;
        }
        synchronized (this.Y) {
            try {
                if (this.Y0 == z) {
                    return;
                }
                this.Y0 = z;
                String str = this.Z;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (this.Y0) {
                    com.google.android.gms.ads.internal.zzv.s().f(context, str);
                } else {
                    com.google.android.gms.ads.internal.zzv.s().g(context, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
