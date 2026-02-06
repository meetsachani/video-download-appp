package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import o.AbstractC4253Sp2;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class MapUtils {
    @KeepForSdk
    public static void a(@InterfaceC5670cr1 StringBuilder sb, @InterfaceC5670cr1 HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = hashMap.get(str);
            sb.append(AbstractC4253Sp2.b.x1);
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(AbstractC4253Sp2.b.x1);
                sb.append(str2);
                sb.append(AbstractC4253Sp2.b.x1);
            }
            z = false;
        }
        sb.append("}");
    }
}
