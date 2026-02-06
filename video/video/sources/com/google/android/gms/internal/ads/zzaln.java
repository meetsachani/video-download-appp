package com.google.android.gms.internal.ads;

import java.util.Map;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzaln {
    @InterfaceC11300zs1
    public static zzalo a(@InterfaceC11300zs1 zzalo zzaloVar, @InterfaceC11300zs1 String[] strArr, Map map) {
        int length;
        int i = 0;
        if (zzaloVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzalo) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzalo zzaloVar2 = new zzalo();
                while (i < length2) {
                    zzaloVar2.z((zzalo) map.get(strArr[i]));
                    i++;
                }
                return zzaloVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            zzaloVar.z((zzalo) map.get(strArr[0]));
            return zzaloVar;
        } else if (strArr != null && (length = strArr.length) > 1) {
            while (i < length) {
                zzaloVar.z((zzalo) map.get(strArr[i]));
                i++;
            }
        }
        return zzaloVar;
    }
}
