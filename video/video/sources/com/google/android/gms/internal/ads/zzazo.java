package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzazo {
    public final Object a = new Object();
    public zzazm b = null;
    public boolean c = false;

    @InterfaceC11300zs1
    public final Activity a() {
        synchronized (this.a) {
            try {
                zzazm zzazmVar = this.b;
                if (zzazmVar != null) {
                    return zzazmVar.a();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC11300zs1
    public final Context b() {
        synchronized (this.a) {
            try {
                zzazm zzazmVar = this.b;
                if (zzazmVar != null) {
                    return zzazmVar.b();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(zzazn zzaznVar) {
        synchronized (this.a) {
            try {
                if (this.b == null) {
                    this.b = new zzazm();
                }
                this.b.f(zzaznVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Context context) {
        Application application;
        synchronized (this.a) {
            try {
                if (!this.c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    if (application == null) {
                        int i = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.g("Can not cast Context to Application");
                        return;
                    }
                    if (this.b == null) {
                        this.b = new zzazm();
                    }
                    this.b.g(application, context);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(zzazn zzaznVar) {
        synchronized (this.a) {
            try {
                zzazm zzazmVar = this.b;
                if (zzazmVar == null) {
                    return;
                }
                zzazmVar.h(zzaznVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
