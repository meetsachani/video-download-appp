package com.google.android.gms.ads.mediation.customevent;

import java.util.HashMap;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@Deprecated
/* loaded from: classes2.dex */
public final class CustomEventExtras {
    public final HashMap a = new HashMap();

    @InterfaceC11300zs1
    public Object a(@InterfaceC5670cr1 String str) {
        return this.a.get(str);
    }

    public void b(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Object obj) {
        this.a.put(str, obj);
    }
}
