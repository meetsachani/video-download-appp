package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzuh implements zzvm, zzrx {
    public final Object a;
    public zzvl b;
    public zzrw c;
    public final /* synthetic */ zzuj d;

    public zzuh(zzuj zzujVar, Object obj) {
        this.d = zzujVar;
        this.b = zzujVar.p(null);
        this.c = zzujVar.n(null);
        this.a = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void F(int i, @InterfaceC11300zs1 zzvb zzvbVar, zzux zzuxVar) {
        if (e(0, zzvbVar)) {
            zzvl zzvlVar = this.b;
            a(zzuxVar, zzvbVar);
            zzvlVar.d(zzuxVar);
        }
    }

    public final zzux a(zzux zzuxVar, @InterfaceC11300zs1 zzvb zzvbVar) {
        zzuj zzujVar = this.d;
        Object obj = this.a;
        zzujVar.B(obj, zzuxVar.c, zzvbVar);
        zzujVar.B(obj, zzuxVar.d, zzvbVar);
        return zzuxVar;
    }

    public final boolean e(int i, @InterfaceC11300zs1 zzvb zzvbVar) {
        zzvb zzvbVar2;
        if (zzvbVar != null) {
            zzvbVar2 = this.d.D(this.a, zzvbVar);
            if (zzvbVar2 == null) {
                return false;
            }
        } else {
            zzvbVar2 = null;
        }
        zzuj zzujVar = this.d;
        zzujVar.A(this.a, 0);
        zzvl zzvlVar = this.b;
        int i2 = zzvlVar.a;
        if (!Objects.equals(zzvlVar.b, zzvbVar2)) {
            this.b = zzujVar.r(0, zzvbVar2);
        }
        zzrw zzrwVar = this.c;
        int i3 = zzrwVar.a;
        if (!Objects.equals(zzrwVar.b, zzvbVar2)) {
            this.c = zzujVar.o(0, zzvbVar2);
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void h(int i, @InterfaceC11300zs1 zzvb zzvbVar, zzus zzusVar, zzux zzuxVar, IOException iOException, boolean z) {
        if (e(0, zzvbVar)) {
            zzvl zzvlVar = this.b;
            a(zzuxVar, zzvbVar);
            zzvlVar.g(zzusVar, zzuxVar, iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void i(int i, @InterfaceC11300zs1 zzvb zzvbVar, zzus zzusVar, zzux zzuxVar) {
        if (e(0, zzvbVar)) {
            zzvl zzvlVar = this.b;
            a(zzuxVar, zzvbVar);
            zzvlVar.f(zzusVar, zzuxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void l(int i, @InterfaceC11300zs1 zzvb zzvbVar, zzus zzusVar, zzux zzuxVar) {
        if (e(0, zzvbVar)) {
            zzvl zzvlVar = this.b;
            a(zzuxVar, zzvbVar);
            zzvlVar.e(zzusVar, zzuxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void y(int i, @InterfaceC11300zs1 zzvb zzvbVar, zzus zzusVar, zzux zzuxVar, int i2) {
        if (e(0, zzvbVar)) {
            zzvl zzvlVar = this.b;
            a(zzuxVar, zzvbVar);
            zzvlVar.h(zzusVar, zzuxVar, i2);
        }
    }
}
