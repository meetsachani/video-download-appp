package com.google.android.gms.internal.common;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;
import o.InterfaceC6181ey;
import o.J40;
import o.L40;
import o.MB;
import org.jspecify.nullness.NullMarked;

@L40("Use ImmutableList.of or another implementation")
@NullMarked
/* loaded from: classes2.dex */
public abstract class zzac extends AbstractCollection implements Serializable {
    public static final Object[] X = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @InterfaceC6181ey
    public int d(Object[] objArr, int i) {
        throw null;
    }

    public int e() {
        throw null;
    }

    public int f() {
        throw null;
    }

    public zzag h() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: i */
    public abstract zzaj iterator();

    public abstract boolean j();

    @MB
    public Object[] k() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@MB Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(X);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @InterfaceC6181ey
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] k = k();
            if (k == null) {
                if (length != 0) {
                    objArr = Arrays.copyOf(objArr, 0);
                }
                objArr = Arrays.copyOf(objArr, size);
            } else {
                return Arrays.copyOfRange(k, f(), e(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        d(objArr, 0);
        return objArr;
    }
}
