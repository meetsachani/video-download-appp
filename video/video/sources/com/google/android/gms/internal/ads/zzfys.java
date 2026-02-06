package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzfys {
    public static ArrayList a(int i) {
        zzfwz.a(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List b(List list, zzfur zzfurVar) {
        if (list instanceof RandomAccess) {
            return new zzfyp(list, zzfurVar);
        }
        return new zzfyr(list, zzfurVar);
    }
}
