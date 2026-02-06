package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzlq implements Iterator<Map.Entry<Object, Object>> {
    public int X;
    public boolean Y;
    public final /* synthetic */ zzlg Y0;
    public Iterator<Map.Entry<Object, Object>> Z;

    public final Iterator<Map.Entry<Object, Object>> b() {
        Map map;
        if (this.Z == null) {
            map = this.Y0.Z;
            this.Z = map.entrySet().iterator();
        }
        return this.Z;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.X + 1;
        list = this.Y0.Y;
        if (i >= list.size()) {
            map = this.Y0.Z;
            if (map.isEmpty() || !b().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Map.Entry<Object, Object> next() {
        List list;
        List list2;
        this.Y = true;
        int i = this.X + 1;
        this.X = i;
        list = this.Y0.Y;
        if (i < list.size()) {
            list2 = this.Y0.Y;
            return (Map.Entry) list2.get(this.X);
        }
        return b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.Y) {
            this.Y = false;
            this.Y0.u();
            int i = this.X;
            list = this.Y0.Y;
            if (i < list.size()) {
                zzlg zzlgVar = this.Y0;
                int i2 = this.X;
                this.X = i2 - 1;
                zzlgVar.l(i2);
                return;
            }
            b().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    public zzlq(zzlg zzlgVar) {
        this.Y0 = zzlgVar;
        this.X = -1;
    }
}
