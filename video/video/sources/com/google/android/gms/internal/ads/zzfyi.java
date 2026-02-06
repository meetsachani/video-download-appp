package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzfyi {
    public static Object a(Iterable iterable, Object obj) {
        zzgai it = ((zzfzy) iterable).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return obj;
    }

    public static boolean b(Iterable iterable, zzfvd zzfvdVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzfvdVar.getClass();
            return d((List) iterable, zzfvdVar);
        }
        Iterator it = iterable.iterator();
        zzfvdVar.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (zzfvdVar.b(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static void c(List list, zzfvd zzfvdVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzfvdVar.b(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                list.remove(i2);
            } else {
                return;
            }
        }
    }

    public static boolean d(List list, zzfvd zzfvdVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzfvdVar.b(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        c(list, zzfvdVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        c(list, zzfvdVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        if (i == i2) {
            return false;
        }
        return true;
    }
}
