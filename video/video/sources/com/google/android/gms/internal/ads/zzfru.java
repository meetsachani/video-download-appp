package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzfru extends zzfrs {
    public static zzfru i;

    public zzfru(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfru j(Context context) {
        zzfru zzfruVar;
        synchronized (zzfru.class) {
            try {
                if (i == null) {
                    i = new zzfru(context);
                }
                zzfruVar = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfruVar;
    }

    public final zzfrp i(long j, boolean z) throws IOException {
        synchronized (zzfru.class) {
            try {
                if (!this.g.d()) {
                    return new zzfrp();
                }
                return b(null, null, j, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() throws IOException {
        synchronized (zzfru.class) {
            try {
                if (g(false)) {
                    f(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
