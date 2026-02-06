package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzflv implements zzfly {
    public static final zzflv e = new zzflv(new zzflz());
    public Date a;
    public boolean b;
    public final zzflz c;
    public boolean d;

    public zzflv(zzflz zzflzVar) {
        this.c = zzflzVar;
    }

    public static zzflv b() {
        return e;
    }

    @Override // com.google.android.gms.internal.ads.zzfly
    public final void a(boolean z) {
        if (!this.d && z) {
            Date date = new Date();
            Date date2 = this.a;
            if (date2 == null || date.after(date2)) {
                this.a = date;
                if (this.b) {
                    for (zzflf zzflfVar : zzflx.a().b()) {
                        zzflfVar.g().g(c());
                    }
                }
            }
        }
        this.d = z;
    }

    public final Date c() {
        Date date = this.a;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void d(@InterfaceC5670cr1 Context context) {
        if (!this.b) {
            zzflz zzflzVar = this.c;
            zzflzVar.d(context);
            zzflzVar.e(this);
            zzflzVar.f();
            this.d = zzflzVar.Y;
            this.b = true;
        }
    }
}
