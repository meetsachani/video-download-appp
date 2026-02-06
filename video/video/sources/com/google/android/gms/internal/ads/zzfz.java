package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public abstract class zzfz implements zzgg {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    @InterfaceC11300zs1
    public zzgl d;

    public zzfz(boolean z) {
        this.a = z;
    }

    public final void A(int i) {
        zzgl zzglVar = this.d;
        String str = zzeu.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((zzhg) this.b.get(i2)).f(this, zzglVar, this.a, i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void b(zzhg zzhgVar) {
        zzhgVar.getClass();
        ArrayList arrayList = this.b;
        if (!arrayList.contains(zzhgVar)) {
            arrayList.add(zzhgVar);
            this.c++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public /* synthetic */ Map d() {
        return Collections.EMPTY_MAP;
    }

    public final void g() {
        zzgl zzglVar = this.d;
        String str = zzeu.a;
        for (int i = 0; i < this.c; i++) {
            ((zzhg) this.b.get(i)).j(this, zzglVar, this.a);
        }
        this.d = null;
    }

    public final void h(zzgl zzglVar) {
        for (int i = 0; i < this.c; i++) {
            ((zzhg) this.b.get(i)).i(this, zzglVar, this.a);
        }
    }

    public final void i(zzgl zzglVar) {
        this.d = zzglVar;
        for (int i = 0; i < this.c; i++) {
            ((zzhg) this.b.get(i)).h(this, zzglVar, this.a);
        }
    }
}
