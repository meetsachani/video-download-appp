package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcdb implements Iterable {
    public final List X = new ArrayList();

    @InterfaceC11300zs1
    public final zzcda d(zzcbw zzcbwVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcda zzcdaVar = (zzcda) it.next();
            if (zzcdaVar.c == zzcbwVar) {
                return zzcdaVar;
            }
        }
        return null;
    }

    public final void e(zzcda zzcdaVar) {
        this.X.add(zzcdaVar);
    }

    public final void f(zzcda zzcdaVar) {
        this.X.remove(zzcdaVar);
    }

    public final boolean h(zzcbw zzcbwVar) {
        ArrayList<zzcda> arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcda zzcdaVar = (zzcda) it.next();
            if (zzcdaVar.c == zzcbwVar) {
                arrayList.add(zzcdaVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (zzcda zzcdaVar2 : arrayList) {
            zzcdaVar2.d.l();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.X.iterator();
    }
}
