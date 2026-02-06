package com.google.android.gms.internal.common;

import java.util.ListIterator;
import o.J40;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes2.dex */
public abstract class zzak extends zzaj implements ListIterator {
    @Override // java.util.ListIterator
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
