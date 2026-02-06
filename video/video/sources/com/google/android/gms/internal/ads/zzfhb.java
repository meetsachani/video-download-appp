package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzfhb {
    public static zzfhc a(Context context, int i) {
        boolean booleanValue;
        if (zzfhq.a()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) zzbeo.c.e()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) zzbeo.d.e()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) zzbeo.b.e()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) zzbeo.e.e()).booleanValue();
            }
            if (booleanValue) {
                return new zzfhe(context, i);
            }
        }
        return new zzfij();
    }

    public static zzfhc b(Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzfhc a = a(context, i);
        if (a instanceof zzfhe) {
            a.i();
            a.b(i2);
            a.d(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.a(zzmVar.h1));
            String str = zzmVar.k1;
            if (zzfhm.e(str)) {
                a.u(str);
            }
        }
        return a;
    }
}
