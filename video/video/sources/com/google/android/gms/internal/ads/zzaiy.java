package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o.C4128Rj1;

/* loaded from: classes2.dex */
final class zzaiy {
    public static String a(List list) {
        Iterator it = list.iterator();
        String str = null;
        boolean z = false;
        while (it.hasNext()) {
            String str2 = ((zzajk) it.next()).a.g.f301o;
            if (zzay.j(str2)) {
                return C4128Rj1.f;
            }
            if (zzay.h(str2)) {
                z = true;
            } else if (zzay.i(str2)) {
                if (Objects.equals(str2, C4128Rj1.S0)) {
                    str = C4128Rj1.T0;
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z) {
            return C4128Rj1.E;
        }
        if (str != null) {
            return str;
        }
        return C4128Rj1.q0;
    }
}
