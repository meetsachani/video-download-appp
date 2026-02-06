package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzli implements Iterator<Map.Entry<Object, Object>> {
    public int X;
    public Iterator<Map.Entry<Object, Object>> Y;
    public final /* synthetic */ zzlg Z;

    public final Iterator<Map.Entry<Object, Object>> b() {
        Map map;
        if (this.Y == null) {
            map = this.Z.a1;
            this.Y = map.entrySet().iterator();
        }
        return this.Y;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.X;
        if (i > 0) {
            list = this.Z.Y;
            if (i <= list.size()) {
                return true;
            }
        }
        if (b().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Map.Entry<Object, Object> next() {
        List list;
        if (!b().hasNext()) {
            list = this.Z.Y;
            int i = this.X - 1;
            this.X = i;
            return (Map.Entry) list.get(i);
        }
        return b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public zzli(zzlg zzlgVar) {
        List list;
        this.Z = zzlgVar;
        list = zzlgVar.Y;
        this.X = list.size();
    }
}
