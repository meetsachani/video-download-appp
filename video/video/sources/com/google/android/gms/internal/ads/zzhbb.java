package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzhbb implements Iterator {
    public int X = -1;
    public boolean Y;
    public final /* synthetic */ zzhbe Y0;
    public Iterator Z;

    public /* synthetic */ zzhbb(zzhbe zzhbeVar, zzhbd zzhbdVar) {
        this.Y0 = zzhbeVar;
    }

    public final Iterator b() {
        Map map;
        if (this.Z == null) {
            map = this.Y0.Z;
            this.Z = map.entrySet().iterator();
        }
        return this.Z;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        Map map;
        int i2 = this.X + 1;
        zzhbe zzhbeVar = this.Y0;
        i = zzhbeVar.Y;
        if (i2 >= i) {
            map = zzhbeVar.Z;
            if (!map.isEmpty() && b().hasNext()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i;
        Object[] objArr;
        this.Y = true;
        int i2 = this.X + 1;
        this.X = i2;
        zzhbe zzhbeVar = this.Y0;
        i = zzhbeVar.Y;
        if (i2 < i) {
            objArr = zzhbeVar.X;
            return (zzhba) objArr[i2];
        }
        return (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        if (this.Y) {
            this.Y = false;
            zzhbe zzhbeVar = this.Y0;
            zzhbeVar.r();
            int i2 = this.X;
            i = zzhbeVar.Y;
            if (i2 < i) {
                this.X = i2 - 1;
                zzhbeVar.n(i2);
                return;
            }
            b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
