package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzfrq {
    public static zzfrq b;
    public final zzfrr a;

    public zzfrq(Context context) {
        this.a = zzfrr.b(context);
    }

    public static final zzfrq a(Context context) {
        zzfrq zzfrqVar;
        synchronized (zzfrq.class) {
            try {
                if (b == null) {
                    b = new zzfrq(context);
                }
                zzfrqVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfrqVar;
    }

    public final void b(boolean z) throws IOException {
        synchronized (zzfrq.class) {
            this.a.d("paidv2_user_option", Boolean.valueOf(z));
        }
    }

    public final void c(boolean z) throws IOException {
        synchronized (zzfrq.class) {
            try {
                zzfrr zzfrrVar = this.a;
                zzfrrVar.d("paidv2_publisher_option", Boolean.valueOf(z));
                if (!z) {
                    zzfrrVar.e("paidv2_creation_time");
                    zzfrrVar.e("paidv2_id");
                    zzfrrVar.e("vendor_scoped_gpid_v2_id");
                    zzfrrVar.e("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        boolean f;
        synchronized (zzfrq.class) {
            f = this.a.f("paidv2_publisher_option", true);
        }
        return f;
    }

    public final boolean e() {
        boolean f;
        synchronized (zzfrq.class) {
            f = this.a.f("paidv2_user_option", true);
        }
        return f;
    }
}
