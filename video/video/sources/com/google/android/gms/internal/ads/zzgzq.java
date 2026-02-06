package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class zzgzq {
    public static final List a(Object obj, long j) {
        int i;
        zzgze zzgzeVar = (zzgze) zzhbp.p(obj, j);
        if (!zzgzeVar.c()) {
            int size = zzgzeVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            zzgze S = zzgzeVar.S(i);
            zzhbp.D(obj, j, S);
            return S;
        }
        return zzgzeVar;
    }
}
