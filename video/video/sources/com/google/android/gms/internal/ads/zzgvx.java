package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzgvx {
    public static final zzgvx b = new zzgvx(new zzgvy());
    public static final zzgvx c = new zzgvx(new zzgwc());
    public final zzgvv a;

    static {
        new zzgvx(new zzgwe());
        new zzgvx(new zzgwd());
        new zzgvx(new zzgvz());
        new zzgvx(new zzgwb());
        new zzgvx(new zzgwa());
    }

    public zzgvx(zzgwf zzgwfVar) {
        zzgvv zzgvuVar;
        if (!zzgls.b()) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                zzgvuVar = new zzgvs(zzgwfVar, null);
            } else {
                zzgvuVar = new zzgvt(zzgwfVar, null);
            }
        } else {
            zzgvuVar = new zzgvu(zzgwfVar, null);
        }
        this.a = zzgvuVar;
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object a(String str) throws GeneralSecurityException {
        return this.a.w(str);
    }
}
