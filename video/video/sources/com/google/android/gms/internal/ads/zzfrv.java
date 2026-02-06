package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfrv {
    public static zzfrv b;
    public final zzfrr a;

    public zzfrv(Context context) {
        this.a = zzfrr.b(context);
        zzfrq.a(context);
    }

    public static final zzfrv a(Context context) {
        zzfrv zzfrvVar;
        synchronized (zzfrv.class) {
            try {
                if (b == null) {
                    b = new zzfrv(context);
                }
                zzfrvVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfrvVar;
    }

    public final void b(@InterfaceC11300zs1 zzfrp zzfrpVar) throws IOException {
        synchronized (zzfrv.class) {
            zzfrr zzfrrVar = this.a;
            zzfrrVar.e("vendor_scoped_gpid_v2_id");
            zzfrrVar.e("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
