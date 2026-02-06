package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class zzgev {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static zzgeu a(String str) throws GeneralSecurityException {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            zzgeu zzgeuVar = (zzgeu) it.next();
            if (zzgeuVar.a()) {
                return zzgeuVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
