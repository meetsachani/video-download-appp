package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzmh {
    public boolean a;

    public zzmh(Context context, Looper looper, zzdg zzdgVar) {
        context.getApplicationContext();
        zzdgVar.d(looper, null);
    }

    public final void a(boolean z) {
        if (this.a == z) {
            return;
        }
        this.a = z;
    }
}
