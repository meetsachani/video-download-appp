package com.google.android.gms.internal.common;

import java.util.Iterator;
import o.J40;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes2.dex */
public abstract class zzaj implements Iterator {
    @Override // java.util.Iterator
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
