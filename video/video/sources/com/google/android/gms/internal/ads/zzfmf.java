package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class zzfmf implements zzfly {
    public static zzfmf d;
    public float a = 0.0f;
    public zzflt b;
    public zzflx c;

    public zzfmf(zzflu zzfluVar, zzflr zzflrVar) {
    }

    public static zzfmf c() {
        if (d == null) {
            d = new zzfmf(new zzflu(), new zzflr());
        }
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzfly
    public final void a(boolean z) {
        if (z) {
            zzfnh.d().i();
        } else {
            zzfnh.d().h();
        }
    }

    public final float b() {
        return this.a;
    }

    public final void d(Context context) {
        this.b = new zzflt(new Handler(), context, new zzflq(), this);
    }

    public final void e(float f) {
        this.a = f;
        if (this.c == null) {
            this.c = zzflx.a();
        }
        for (zzflf zzflfVar : this.c.b()) {
            zzflfVar.g().l(f);
        }
    }

    public final void f() {
        zzflw.i().e(this);
        zzflw.i().f();
        zzfnh.d().i();
        this.b.c();
    }

    public final void g() {
        zzfnh.d().j();
        zzflw.i().g();
        this.b.d();
    }
}
