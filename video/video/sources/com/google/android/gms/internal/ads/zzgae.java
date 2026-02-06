package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public final class zzgae {
    public static int a(Set set) {
        int i;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    public static zzgac b(Set set, Set set2) {
        zzfvc.c(set, "set1");
        zzfvc.c(set2, "set2");
        return new zzfzy(set, set2);
    }

    public static Set c(Set set, zzfvd zzfvdVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof zzfzz) {
                zzfzz zzfzzVar = (zzfzz) sortedSet;
                return new zzgaa((SortedSet) zzfzzVar.X, zzfvg.a(zzfzzVar.Y, zzfvdVar));
            }
            sortedSet.getClass();
            return new zzgaa(sortedSet, zzfvdVar);
        } else if (set instanceof zzfzz) {
            zzfzz zzfzzVar2 = (zzfzz) set;
            return new zzfzz((Set) zzfzzVar2.X, zzfvg.a(zzfzzVar2.Y, zzfvdVar));
        } else {
            set.getClass();
            return new zzfzz(set, zzfvdVar);
        }
    }

    public static boolean d(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean e(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzfzk) {
            collection = ((zzfzk) collection).a();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            Iterator it = set.iterator();
            collection.getClass();
            boolean z = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        return f(set, collection.iterator());
    }

    public static boolean f(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
