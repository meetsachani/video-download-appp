package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzfcv {
    public static com.google.android.gms.ads.internal.client.zzr a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfbv zzfbvVar = (zzfbv) it.next();
            if (zzfbvVar.c) {
                arrayList.add(AdSize.r);
            } else {
                arrayList.add(new AdSize(zzfbvVar.a, zzfbvVar.b));
            }
        }
        return new com.google.android.gms.ads.internal.client.zzr(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzfbv b(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        return zzrVar.d1 ? new zzfbv(-3, 0, true) : new zzfbv(zzrVar.Z0, zzrVar.Y, false);
    }
}
