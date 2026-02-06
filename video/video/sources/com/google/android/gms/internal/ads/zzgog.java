package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgog {
    public final Map a;
    public final Map b;

    public /* synthetic */ zzgog(zzgod zzgodVar, zzgof zzgofVar) {
        this.a = new HashMap(zzgod.d(zzgodVar));
        this.b = new HashMap(zzgod.e(zzgodVar));
    }

    public static zzgod a() {
        return new zzgod(null);
    }

    public final Object b(zzgek zzgekVar, Class cls) throws GeneralSecurityException {
        zzgoe zzgoeVar = new zzgoe(zzgekVar.getClass(), cls, null);
        Map map = this.a;
        if (map.containsKey(zzgoeVar)) {
            return ((zzgob) map.get(zzgoeVar)).a(zzgekVar);
        }
        String obj = zzgoeVar.toString();
        throw new GeneralSecurityException("No PrimitiveConstructor for " + obj + " available, see https://developers.google.com/tink/faq/registration_errors");
    }

    public final Object c(zzgmj zzgmjVar, zzgms zzgmsVar, Class cls) throws GeneralSecurityException {
        Map map = this.b;
        if (map.containsKey(cls)) {
            zzgoh zzgohVar = (zzgoh) map.get(cls);
            return zzgohVar.c(zzgmjVar, zzgmsVar, new zzgoc(this, zzgohVar));
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
    }
}
