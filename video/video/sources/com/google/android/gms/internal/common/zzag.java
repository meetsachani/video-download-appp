package com.google.android.gms.internal.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import o.InterfaceC6181ey;
import o.J40;
import o.MB;
import o.VP0;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes2.dex */
public abstract class zzag extends zzac implements List, RandomAccess {
    public static final zzak Y = new zzae(zzai.Z0, 0);

    public static zzag B() {
        return zzai.Z0;
    }

    public static zzag D(Object obj) {
        Object[] objArr = {obj};
        zzah.a(objArr, 1);
        return p(objArr, 1);
    }

    public static zzag F(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzah.a(objArr, 2);
        return p(objArr, 2);
    }

    public static zzag p(Object[] objArr, int i) {
        if (i == 0) {
            return zzai.Z0;
        }
        return new zzai(objArr, i);
    }

    public static zzag r(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return w((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return zzai.Z0;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return D(next);
        }
        zzad zzadVar = new zzad(4);
        zzadVar.b(next);
        zzadVar.c(it);
        zzadVar.c = true;
        return p(zzadVar.a, zzadVar.b);
    }

    public static zzag w(Collection collection) {
        if (collection instanceof zzac) {
            zzag h = ((zzac) collection).h();
            if (h.j()) {
                Object[] array = h.toArray();
                return p(array, array.length);
            }
            return h;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzah.a(array2, length);
        return p(array2, length);
    }

    @Override // java.util.List
    /* renamed from: G */
    public final zzak listIterator(int i) {
        zzs.b(i, size(), "index");
        if (isEmpty()) {
            return Y;
        }
        return new zzae(this, i);
    }

    @Override // java.util.List
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@MB Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public int d(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    @Override // java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!zzr.a(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        for (Object obj2 : this) {
            if (!it.hasNext() || !zzr.a(obj2, it.next())) {
                return false;
            }
            while (r1.hasNext()) {
            }
        }
        if (!it.hasNext()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzac
    @Deprecated
    @VP0(replacement = "this")
    public final zzag h() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final zzaj i() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int indexOf(@MB Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzac, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: l */
    public zzag subList(int i, int i2) {
        zzs.c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzai.Z0;
        }
        return new zzaf(this, i, i3);
    }

    @Override // java.util.List
    public final int lastIndexOf(@MB Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
