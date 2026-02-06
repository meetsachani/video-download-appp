package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzfym {
    public static Object a(Iterator it) {
        if (it.hasNext()) {
            Object next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    public static void b(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean c(Collection collection, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }
}
