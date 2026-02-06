package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgnx {
    public static final zzgwp b = zzgwp.b(new byte[0]);
    public final Map a;

    public final Iterable a(byte[] bArr) {
        List list;
        Map map = this.a;
        List list2 = (List) map.get(b);
        if (bArr.length >= 5) {
            list = (List) map.get(zzgwp.c(bArr, 0, 5));
        } else {
            list = null;
        }
        if (list2 == null && list == null) {
            return new ArrayList();
        }
        if (list2 == null) {
            return list;
        }
        if (list == null) {
            return list2;
        }
        return new zzgnt(this, list, list2);
    }
}
