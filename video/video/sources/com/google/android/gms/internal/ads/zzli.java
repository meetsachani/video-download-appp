package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.List;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzli implements zzvm, zzrx {
    public final zzlk a;
    public final /* synthetic */ zzlm b;

    public zzli(zzlm zzlmVar, zzlk zzlkVar) {
        this.b = zzlmVar;
        this.a = zzlkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void F(int i, @InterfaceC11300zs1 zzvb zzvbVar, final zzux zzuxVar) {
        zzdq zzdqVar;
        final Pair a = a(0, zzvbVar);
        if (a != null) {
            zzdqVar = this.b.i;
            zzdqVar.h(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlg
                @Override // java.lang.Runnable
                public final void run() {
                    zzmj zzmjVar;
                    Pair pair = a;
                    zzmjVar = zzli.this.b.h;
                    zzmjVar.F(((Integer) pair.first).intValue(), (zzvb) pair.second, zzuxVar);
                }
            });
        }
    }

    @InterfaceC11300zs1
    public final Pair a(int i, @InterfaceC11300zs1 zzvb zzvbVar) {
        zzvb zzvbVar2;
        zzvb zzvbVar3 = null;
        if (zzvbVar != null) {
            zzlk zzlkVar = this.a;
            int i2 = 0;
            while (true) {
                List list = zzlkVar.c;
                if (i2 < list.size()) {
                    if (((zzvb) list.get(i2)).d == zzvbVar.d) {
                        Object obj = zzvbVar.a;
                        Object obj2 = zzlkVar.b;
                        int i3 = zzlt.k;
                        zzvbVar2 = zzvbVar.a(Pair.create(obj2, obj));
                        break;
                    }
                    i2++;
                } else {
                    zzvbVar2 = null;
                    break;
                }
            }
            if (zzvbVar2 == null) {
                return null;
            }
            zzvbVar3 = zzvbVar2;
        }
        return Pair.create(Integer.valueOf(this.a.d), zzvbVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void h(int i, @InterfaceC11300zs1 zzvb zzvbVar, final zzus zzusVar, final zzux zzuxVar, final IOException iOException, final boolean z) {
        zzdq zzdqVar;
        final Pair a = a(0, zzvbVar);
        if (a != null) {
            zzdqVar = this.b.i;
            zzdqVar.h(new Runnable() { // from class: com.google.android.gms.internal.ads.zzle
                @Override // java.lang.Runnable
                public final void run() {
                    zzmj zzmjVar;
                    Pair pair = a;
                    zzmjVar = zzli.this.b.h;
                    zzmjVar.h(((Integer) pair.first).intValue(), (zzvb) pair.second, zzusVar, zzuxVar, iOException, z);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void i(int i, @InterfaceC11300zs1 zzvb zzvbVar, final zzus zzusVar, final zzux zzuxVar) {
        zzdq zzdqVar;
        final Pair a = a(0, zzvbVar);
        if (a != null) {
            zzdqVar = this.b.i;
            zzdqVar.h(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlh
                @Override // java.lang.Runnable
                public final void run() {
                    zzmj zzmjVar;
                    Pair pair = a;
                    zzmjVar = zzli.this.b.h;
                    zzmjVar.i(((Integer) pair.first).intValue(), (zzvb) pair.second, zzusVar, zzuxVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void l(int i, @InterfaceC11300zs1 zzvb zzvbVar, final zzus zzusVar, final zzux zzuxVar) {
        zzdq zzdqVar;
        final Pair a = a(0, zzvbVar);
        if (a != null) {
            zzdqVar = this.b.i;
            zzdqVar.h(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlf
                @Override // java.lang.Runnable
                public final void run() {
                    zzmj zzmjVar;
                    Pair pair = a;
                    zzmjVar = zzli.this.b.h;
                    zzmjVar.l(((Integer) pair.first).intValue(), (zzvb) pair.second, zzusVar, zzuxVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void y(int i, @InterfaceC11300zs1 zzvb zzvbVar, final zzus zzusVar, final zzux zzuxVar, final int i2) {
        zzdq zzdqVar;
        final Pair a = a(0, zzvbVar);
        if (a != null) {
            zzdqVar = this.b.i;
            zzdqVar.h(new Runnable() { // from class: com.google.android.gms.internal.ads.zzld
                @Override // java.lang.Runnable
                public final void run() {
                    zzmj zzmjVar;
                    Pair pair = a;
                    zzmjVar = zzli.this.b.h;
                    zzmjVar.y(((Integer) pair.first).intValue(), (zzvb) pair.second, zzusVar, zzuxVar, i2);
                }
            });
        }
    }
}
