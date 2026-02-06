package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzgor {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;

    public /* synthetic */ zzgor(zzgon zzgonVar, zzgoq zzgoqVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zzgonVar.a;
        this.a = new HashMap(map);
        map2 = zzgonVar.b;
        this.b = new HashMap(map2);
        map3 = zzgonVar.c;
        this.c = new HashMap(map3);
        map4 = zzgonVar.d;
        this.d = new HashMap(map4);
    }

    public final zzgek a(zzgom zzgomVar, @InterfaceC10571ws1 zzgey zzgeyVar) throws GeneralSecurityException {
        zzgoo zzgooVar = new zzgoo(zzgomVar.getClass(), zzgomVar.f(), null);
        Map map = this.b;
        if (map.containsKey(zzgooVar)) {
            return ((zzgme) map.get(zzgooVar)).a(zzgomVar, zzgeyVar);
        }
        String obj = zzgooVar.toString();
        throw new GeneralSecurityException("No Key Parser for requested key type " + obj + " available");
    }

    public final zzgex b(zzgom zzgomVar) throws GeneralSecurityException {
        zzgoo zzgooVar = new zzgoo(zzgomVar.getClass(), zzgomVar.f(), null);
        Map map = this.d;
        if (map.containsKey(zzgooVar)) {
            return ((zzgno) map.get(zzgooVar)).a(zzgomVar);
        }
        String obj = zzgooVar.toString();
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + obj + " available");
    }

    public final zzgom c(zzgek zzgekVar, Class cls, @InterfaceC10571ws1 zzgey zzgeyVar) throws GeneralSecurityException {
        zzgop zzgopVar = new zzgop(zzgekVar.getClass(), cls, null);
        Map map = this.a;
        if (map.containsKey(zzgopVar)) {
            return ((zzgmi) map.get(zzgopVar)).a(zzgekVar, zzgeyVar);
        }
        String obj = zzgopVar.toString();
        throw new GeneralSecurityException("No Key serializer for " + obj + " available");
    }

    public final zzgom d(zzgex zzgexVar, Class cls) throws GeneralSecurityException {
        zzgop zzgopVar = new zzgop(zzgexVar.getClass(), cls, null);
        Map map = this.c;
        if (map.containsKey(zzgopVar)) {
            return ((zzgns) map.get(zzgopVar)).a(zzgexVar);
        }
        String obj = zzgopVar.toString();
        throw new GeneralSecurityException("No Key Format serializer for " + obj + " available");
    }

    public final boolean i(zzgom zzgomVar) {
        return this.b.containsKey(new zzgoo(zzgomVar.getClass(), zzgomVar.f(), null));
    }

    public final boolean j(zzgom zzgomVar) {
        return this.d.containsKey(new zzgoo(zzgomVar.getClass(), zzgomVar.f(), null));
    }
}
