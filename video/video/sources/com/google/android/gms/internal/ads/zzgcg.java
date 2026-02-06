package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgcg extends zzgci {
    public zzgcg(zzfxx zzfxxVar, boolean z) {
        super(zzfxxVar, z);
        O();
    }

    @Override // com.google.android.gms.internal.ads.zzgci
    public final /* bridge */ /* synthetic */ Object P(List list) {
        Object obj;
        ArrayList a = zzfys.a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgch zzgchVar = (zzgch) it.next();
            if (zzgchVar != null) {
                obj = zzgchVar.a;
            } else {
                obj = null;
            }
            a.add(obj);
        }
        return Collections.unmodifiableList(a);
    }
}
