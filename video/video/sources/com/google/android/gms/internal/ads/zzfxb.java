package com.google.android.gms.internal.ads;

import java.util.Collection;

/* loaded from: classes2.dex */
public final class zzfxb {
    public static boolean a(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
