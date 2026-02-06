package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzfrt extends zzfrs {
    public static zzfrt i;

    public zzfrt(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfrt k(Context context) {
        zzfrt zzfrtVar;
        synchronized (zzfrt.class) {
            try {
                if (i == null) {
                    i = new zzfrt(context);
                }
                zzfrtVar = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfrtVar;
    }

    public final zzfrp i(long j, boolean z) throws IOException {
        zzfrp b;
        synchronized (zzfrt.class) {
            b = b(null, null, j, z);
        }
        return b;
    }

    public final zzfrp j(String str, String str2, long j, boolean z) throws IOException {
        zzfrp b;
        synchronized (zzfrt.class) {
            b = b(str, str2, j, z);
        }
        return b;
    }

    public final void l() throws IOException {
        synchronized (zzfrt.class) {
            f(false);
        }
    }

    public final void m() throws IOException {
        synchronized (zzfrt.class) {
            f(true);
        }
    }
}
