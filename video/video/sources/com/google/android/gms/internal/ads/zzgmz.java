package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzgmz {
    public static final zzgmy b = new zzgmy() { // from class: com.google.android.gms.internal.ads.zzgmx
        @Override // com.google.android.gms.internal.ads.zzgmy
        public final zzgek a(zzgex zzgexVar, Integer num) {
            int i = zzgmz.d;
            zzgtq c2 = ((zzgmp) zzgexVar).b().c();
            zzgel b2 = zzgma.c().b(c2.z2());
            if (zzgma.c().e(c2.z2())) {
                zzgtm c3 = b2.c(c2.y2());
                return new zzgmo(zzgoi.a(c3.x2(), c3.w2(), c3.t2(), c2.x2(), num), zzgej.a());
            }
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
    };
    public static final zzgmz c = e();
    public static final /* synthetic */ int d = 0;
    public final Map a = new HashMap();

    public static zzgmz b() {
        return c;
    }

    public static zzgmz e() {
        zzgmz zzgmzVar = new zzgmz();
        try {
            zzgmzVar.c(b, zzgmp.class);
            return zzgmzVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final zzgek a(zzgex zzgexVar, @InterfaceC10571ws1 Integer num) throws GeneralSecurityException {
        return d(zzgexVar, num);
    }

    public final synchronized void c(zzgmy zzgmyVar, Class cls) throws GeneralSecurityException {
        try {
            Map map = this.a;
            zzgmy zzgmyVar2 = (zzgmy) map.get(cls);
            if (zzgmyVar2 != null && !zzgmyVar2.equals(zzgmyVar)) {
                String obj = cls.toString();
                throw new GeneralSecurityException("Different key creator for parameters class " + obj + " already inserted");
            }
            map.put(cls, zzgmyVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzgek d(zzgex zzgexVar, @InterfaceC10571ws1 Integer num) throws GeneralSecurityException {
        zzgmy zzgmyVar;
        zzgmyVar = (zzgmy) this.a.get(zzgexVar.getClass());
        if (zzgmyVar != null) {
        } else {
            String obj = zzgexVar.toString();
            throw new GeneralSecurityException("Cannot create a new key for parameters " + obj + ": no key creator for this class was registered.");
        }
        return zzgmyVar.a(zzgexVar, num);
    }
}
