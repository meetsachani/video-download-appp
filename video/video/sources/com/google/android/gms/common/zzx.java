package com.google.android.gms.common;

import android.util.Log;
import o.InterfaceC10571ws1;
import o.InterfaceC5670cr1;
import o.QB;

/* JADX INFO: Access modifiers changed from: package-private */
@QB
/* loaded from: classes2.dex */
public class zzx {
    public static final zzx e = new zzx(true, 3, 1, null, null);
    public final boolean a;
    @InterfaceC10571ws1
    public final String b;
    @InterfaceC10571ws1
    public final Throwable c;
    public final int d;

    public zzx(boolean z, int i, int i2, @InterfaceC10571ws1 String str, @InterfaceC10571ws1 Throwable th) {
        this.a = z;
        this.d = i;
        this.b = str;
        this.c = th;
    }

    @Deprecated
    public static zzx b() {
        return e;
    }

    public static zzx c(@InterfaceC5670cr1 String str) {
        return new zzx(false, 1, 5, str, null);
    }

    public static zzx d(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Throwable th) {
        return new zzx(false, 1, 5, str, th);
    }

    public static zzx f(int i) {
        return new zzx(true, i, 1, null, null);
    }

    public static zzx g(int i, int i2, @InterfaceC5670cr1 String str, @InterfaceC10571ws1 Throwable th) {
        return new zzx(false, i, i2, str, th);
    }

    @InterfaceC10571ws1
    public String a() {
        return this.b;
    }

    public final void e() {
        if (!this.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.c != null) {
                Log.d("GoogleCertificatesRslt", a(), this.c);
            } else {
                Log.d("GoogleCertificatesRslt", a());
            }
        }
    }
}
