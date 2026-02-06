package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class zzfyc extends zzfxx implements List, RandomAccess {
    public static final zzgaj Y = new zzfya(zzfzo.a1, 0);
    public static final /* synthetic */ int Z = 0;

    public static zzfyc B(Collection collection) {
        if (collection instanceof zzfxx) {
            zzfyc h = ((zzfxx) collection).h();
            if (h.j()) {
                Object[] array = h.toArray();
                return r(array, array.length);
            }
            return h;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzfzm.b(array2, length);
        return r(array2, length);
    }

    public static zzfyc D(Object[] objArr) {
        if (objArr.length == 0) {
            return zzfzo.a1;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzfzm.b(objArr2, length);
        return r(objArr2, length);
    }

    public static zzfyc F() {
        return zzfzo.a1;
    }

    public static zzfyc G(Object obj) {
        Object[] objArr = {obj};
        zzfzm.b(objArr, 1);
        return r(objArr, 1);
    }

    public static zzfyc H(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzfzm.b(objArr, 2);
        return r(objArr, 2);
    }

    public static zzfyc J(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzfzm.b(objArr, 3);
        return r(objArr, 3);
    }

    public static zzfyc K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzfzm.b(objArr, 5);
        return r(objArr, 5);
    }

    public static zzfyc L(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfzm.b(objArr, 6);
        return r(objArr, 6);
    }

    @SafeVarargs
    public static zzfyc M(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        zzfzm.b(objArr2, i);
        return r(objArr2, i);
    }

    public static zzfxz p(int i) {
        zzfwz.a(i, "expectedSize");
        return new zzfxz(i);
    }

    public static zzfyc r(Object[] objArr, int i) {
        if (i == 0) {
            return zzfzo.a1;
        }
        return new zzfzo(objArr, i);
    }

    public static zzfyc w(Iterable iterable) {
        iterable.getClass();
        return B((Collection) iterable);
    }

    @Override // java.util.List
    /* renamed from: Q */
    public final zzgaj listIterator(int i) {
        zzfvc.b(i, size(), "index");
        if (isEmpty()) {
            return Y;
        }
        return new zzfya(this, i);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfxx, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    public int d(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    @Override // java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
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
                if (!zzfuz.a(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        for (Object obj2 : this) {
            if (!it.hasNext() || !zzfuz.a(obj2, it.next())) {
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

    @Override // com.google.android.gms.internal.ads.zzfxx
    @Deprecated
    public final zzfyc h() {
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

    @Override // com.google.android.gms.internal.ads.zzfxx
    public final zzgai i() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
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

    @Override // com.google.android.gms.internal.ads.zzfxx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: l */
    public zzfyc subList(int i, int i2) {
        zzfvc.k(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzfzo.a1;
        }
        return new zzfyb(this, i, i3);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
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
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
