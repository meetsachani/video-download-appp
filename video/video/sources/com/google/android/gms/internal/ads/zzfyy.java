package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class zzfyy extends AbstractMap {
    public transient Set X;
    public transient Set Y;
    public transient Collection Z;

    public abstract Set a();

    public Set b() {
        return new zzfyw(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.X;
        if (set == null) {
            Set a = a();
            this.X = a;
            return a;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.Y;
        if (set == null) {
            Set b = b();
            this.Y = b;
            return b;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.Z;
        if (collection == null) {
            zzfyx zzfyxVar = new zzfyx(this);
            this.Z = zzfyxVar;
            return zzfyxVar;
        }
        return collection;
    }
}
