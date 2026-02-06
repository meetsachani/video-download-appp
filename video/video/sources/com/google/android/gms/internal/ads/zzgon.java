package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgon {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;

    public zzgon() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public final zzgon a(zzgme zzgmeVar) throws GeneralSecurityException {
        zzgoo zzgooVar = new zzgoo(zzgmeVar.d(), zzgmeVar.c(), null);
        Map map = this.b;
        if (map.containsKey(zzgooVar)) {
            zzgme zzgmeVar2 = (zzgme) map.get(zzgooVar);
            if (zzgmeVar2.equals(zzgmeVar) && zzgmeVar.equals(zzgmeVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgooVar.toString()));
        }
        map.put(zzgooVar, zzgmeVar);
        return this;
    }

    public final zzgon b(zzgmi zzgmiVar) throws GeneralSecurityException {
        zzgop zzgopVar = new zzgop(zzgmiVar.c(), zzgmiVar.d(), null);
        Map map = this.a;
        if (map.containsKey(zzgopVar)) {
            zzgmi zzgmiVar2 = (zzgmi) map.get(zzgopVar);
            if (zzgmiVar2.equals(zzgmiVar) && zzgmiVar.equals(zzgmiVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgopVar.toString()));
        }
        map.put(zzgopVar, zzgmiVar);
        return this;
    }

    public final zzgon c(zzgno zzgnoVar) throws GeneralSecurityException {
        zzgoo zzgooVar = new zzgoo(zzgnoVar.d(), zzgnoVar.c(), null);
        Map map = this.d;
        if (map.containsKey(zzgooVar)) {
            zzgno zzgnoVar2 = (zzgno) map.get(zzgooVar);
            if (zzgnoVar2.equals(zzgnoVar) && zzgnoVar.equals(zzgnoVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgooVar.toString()));
        }
        map.put(zzgooVar, zzgnoVar);
        return this;
    }

    public final zzgon d(zzgns zzgnsVar) throws GeneralSecurityException {
        zzgop zzgopVar = new zzgop(zzgnsVar.c(), zzgnsVar.d(), null);
        Map map = this.c;
        if (map.containsKey(zzgopVar)) {
            zzgns zzgnsVar2 = (zzgns) map.get(zzgopVar);
            if (zzgnsVar2.equals(zzgnsVar) && zzgnsVar.equals(zzgnsVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgopVar.toString()));
        }
        map.put(zzgopVar, zzgnsVar);
        return this;
    }

    public zzgon(zzgor zzgorVar) {
        this.a = new HashMap(zzgor.f(zzgorVar));
        this.b = new HashMap(zzgor.e(zzgorVar));
        this.c = new HashMap(zzgor.h(zzgorVar));
        this.d = new HashMap(zzgor.g(zzgorVar));
    }
}
