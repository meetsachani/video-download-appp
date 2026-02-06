package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgnu {
    public final Map a = new HashMap();

    public final zzgnu a(zzgwp zzgwpVar, Object obj) throws GeneralSecurityException {
        List list;
        if (zzgwpVar.a() != 0 && zzgwpVar.a() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        Map map = this.a;
        if (map.containsKey(zzgwpVar)) {
            list = (List) map.get(zzgwpVar);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(zzgwpVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
        return this;
    }

    public final zzgnx b() {
        return new zzgnx(this.a, null);
    }
}
