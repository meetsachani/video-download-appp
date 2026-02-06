package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgod {
    public final Map a;
    public final Map b;

    private zzgod() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public final zzgod a(zzgob zzgobVar) throws GeneralSecurityException {
        if (zzgobVar != null) {
            zzgoe zzgoeVar = new zzgoe(zzgobVar.c(), zzgobVar.d(), null);
            Map map = this.a;
            if (map.containsKey(zzgoeVar)) {
                zzgob zzgobVar2 = (zzgob) map.get(zzgoeVar);
                if (zzgobVar2.equals(zzgobVar) && zzgobVar.equals(zzgobVar2)) {
                    return this;
                }
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgoeVar.toString()));
            }
            map.put(zzgoeVar, zzgobVar);
            return this;
        }
        throw new NullPointerException("primitive constructor must be non-null");
    }

    public final zzgod b(zzgoh zzgohVar) throws GeneralSecurityException {
        Map map = this.b;
        Class b = zzgohVar.b();
        if (map.containsKey(b)) {
            zzgoh zzgohVar2 = (zzgoh) map.get(b);
            if (zzgohVar2.equals(zzgohVar) && zzgohVar.equals(zzgohVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(b.toString()));
        }
        map.put(b, zzgohVar);
        return this;
    }

    public final zzgog c() {
        return new zzgog(this, null);
    }

    public /* synthetic */ zzgod(zzgof zzgofVar) {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public /* synthetic */ zzgod(zzgog zzgogVar, zzgof zzgofVar) {
        this.a = new HashMap(zzgog.d(zzgogVar));
        this.b = new HashMap(zzgog.e(zzgogVar));
    }
}
