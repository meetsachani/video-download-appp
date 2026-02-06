package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class zzfwy implements zzfza {
    public transient Set X;
    public transient Collection Y;
    public transient Map Z;

    @Override // com.google.android.gms.internal.ads.zzfza
    public boolean a(Object obj, Object obj2) {
        throw null;
    }

    public abstract Collection b();

    public Iterator c() {
        throw null;
    }

    public abstract Map e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfza)) {
            return false;
        }
        return s().equals(((zzfza) obj).s());
    }

    public abstract Set f();

    public final Set g() {
        Set set = this.X;
        if (set == null) {
            Set f = f();
            this.X = f;
            return f;
        }
        return set;
    }

    public final int hashCode() {
        return s().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfza
    public final Map s() {
        Map map = this.Z;
        if (map == null) {
            Map e = e();
            this.Z = e;
            return e;
        }
        return map;
    }

    public final String toString() {
        return s().toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfza
    public final Collection x() {
        Collection collection = this.Y;
        if (collection == null) {
            Collection b = b();
            this.Y = b;
            return b;
        }
        return collection;
    }
}
