package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
@Deprecated
/* loaded from: classes2.dex */
public final class zzbdi {
    public final Map a = new HashMap();
    public final zzbdk b;

    public zzbdi(zzbdk zzbdkVar) {
        this.b = zzbdkVar;
    }

    public final zzbdk a() {
        return this.b;
    }

    public final void b(String str, @InterfaceC11300zs1 zzbdh zzbdhVar) {
        this.a.put(str, zzbdhVar);
    }

    public final void c(String str, String str2, long j) {
        Map map = this.a;
        zzbdh zzbdhVar = (zzbdh) map.get(str2);
        String[] strArr = {str};
        if (zzbdhVar != null) {
            this.b.e(zzbdhVar, j, strArr);
        }
        map.put(str, new zzbdh(j, null, null));
    }
}
