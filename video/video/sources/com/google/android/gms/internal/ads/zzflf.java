package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzflf extends zzflb {
    public final zzfld a;
    public zzfno c;
    public zzfmn d;
    public final String g;
    public final zzfmb b = new zzfmb();
    public boolean e = false;
    public boolean f = false;

    public zzflf(zzflc zzflcVar, zzfld zzfldVar, String str) {
        this.a = zzfldVar;
        this.g = str;
        k(null);
        if (zzfldVar.d() != zzfle.HTML && zzfldVar.d() != zzfle.JAVASCRIPT) {
            this.d = new zzfmr(str, zzfldVar.i(), null);
        } else {
            this.d = new zzfmo(str, zzfldVar.a());
        }
        this.d.o();
        zzflx.a().d(this);
        this.d.f(zzflcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzflb
    public final void b(View view, zzfli zzfliVar, @InterfaceC11300zs1 String str) {
        if (this.f) {
            return;
        }
        this.b.b(view, zzfliVar, "Ad overlay");
    }

    @Override // com.google.android.gms.internal.ads.zzflb
    public final void c() {
        if (this.f) {
            return;
        }
        this.c.clear();
        if (!this.f) {
            this.b.c();
        }
        this.f = true;
        this.d.e();
        zzflx.a().e(this);
        this.d.c();
        this.d = null;
    }

    @Override // com.google.android.gms.internal.ads.zzflb
    public final void d(@InterfaceC11300zs1 View view) {
        if (!this.f && f() != view) {
            k(view);
            this.d.b();
            Collection<zzflf> c = zzflx.a().c();
            if (c != null && !c.isEmpty()) {
                for (zzflf zzflfVar : c) {
                    if (zzflfVar != this && zzflfVar.f() == view) {
                        zzflfVar.c.clear();
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflb
    public final void e() {
        if (!this.e && this.d != null) {
            this.e = true;
            zzflx.a().f(this);
            this.d.l(zzfmf.c().b());
            this.d.g(zzflv.b().c());
            this.d.i(this, this.a);
        }
    }

    public final View f() {
        return (View) this.c.get();
    }

    public final zzfmn g() {
        return this.d;
    }

    public final String h() {
        return this.g;
    }

    public final List i() {
        return this.b.a();
    }

    public final boolean j() {
        return this.e && !this.f;
    }

    public final void k(@InterfaceC11300zs1 View view) {
        this.c = new zzfno(view);
    }
}
