package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzget implements zzgmj {
    public final zzgty a;
    public final List b;
    public final zzgms c;

    public static final zzget d(zzgty zzgtyVar) throws GeneralSecurityException {
        j(zzgtyVar);
        return new zzget(zzgtyVar, i(zzgtyVar), zzgms.b);
    }

    public static final zzget e(zzgex zzgexVar) throws GeneralSecurityException {
        zzgeq zzgeqVar = new zzgeq();
        zzgeo zzgeoVar = new zzgeo(zzgexVar, null);
        zzgeoVar.d();
        zzgeoVar.c();
        zzgeqVar.a(zzgeoVar);
        return zzgeqVar.b();
    }

    public static List i(zzgty zzgtyVar) throws GeneralSecurityException {
        Integer valueOf;
        zzgek a;
        zzgem zzgemVar;
        ArrayList arrayList = new ArrayList(zzgtyVar.a());
        for (zzgtw zzgtwVar : zzgtyVar.w2()) {
            int a2 = zzgtwVar.a();
            try {
                int a3 = zzgtwVar.a();
                if (zzgtwVar.v2() == zzguq.RAW) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(a3);
                }
                zzgoi a4 = zzgoi.a(zzgtwVar.s2().x2(), zzgtwVar.s2().w2(), zzgtwVar.s2().t2(), zzgtwVar.v2(), valueOf);
                zzgnj c = zzgnj.c();
                zzgey a5 = zzgey.a();
                if (!c.j(a4)) {
                    a = new zzgmo(a4, a5);
                } else {
                    a = c.a(a4, a5);
                }
                int z2 = zzgtwVar.z2() - 2;
                boolean z = true;
                if (z2 != 1) {
                    if (z2 != 2) {
                        if (z2 == 3) {
                            zzgemVar = zzgem.d;
                        } else {
                            throw new GeneralSecurityException("Unknown key status");
                            break;
                        }
                    } else {
                        zzgemVar = zzgem.c;
                    }
                } else {
                    zzgemVar = zzgem.b;
                }
                if (a2 != zzgtyVar.b()) {
                    z = false;
                }
                arrayList.add(new zzger(a, zzgemVar, a2, z, null));
            } catch (GeneralSecurityException e) {
                if (!zzglp.a.a()) {
                    arrayList.add(null);
                } else {
                    throw new GeneralSecurityException("Parsing of a single key failed (maybe wrong status?) and Tink is configured via validateKeysetsOnParsing to reject such keysets.", e);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void j(zzgty zzgtyVar) throws GeneralSecurityException {
        if (zzgtyVar != null && zzgtyVar.a() > 0) {
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final int a() {
        return this.b.size();
    }

    public final zzger b(int i) {
        if (i >= 0 && i < a()) {
            List list = this.b;
            if (list.get(i) != null) {
                return (zzger) list.get(i);
            }
            throw new IllegalStateException("Keyset-Entry at position " + i + " has wrong status or key parsing failed");
        }
        int a = a();
        throw new IndexOutOfBoundsException("Invalid index " + i + " for keyset of size " + a);
    }

    public final zzger c() {
        for (zzger zzgerVar : this.b) {
            if (zzgerVar != null && zzgerVar.d()) {
                if (zzgerVar.c() == zzgem.b) {
                    return zzgerVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public final zzgty f() {
        return this.a;
    }

    public final Object g(zzgei zzgeiVar, Class cls) throws GeneralSecurityException {
        boolean z;
        if (zzgeiVar instanceof zzglz) {
            zzglz zzglzVar = (zzglz) zzgeiVar;
            zzgty zzgtyVar = this.a;
            int i = zzgfa.a;
            int b = zzgtyVar.b();
            boolean z2 = true;
            int i2 = 0;
            boolean z3 = false;
            for (zzgtw zzgtwVar : zzgtyVar.w2()) {
                if (zzgtwVar.z2() == 3) {
                    if (zzgtwVar.j()) {
                        if (zzgtwVar.v2() != zzguq.UNKNOWN_PREFIX) {
                            if (zzgtwVar.z2() != 2) {
                                if (zzgtwVar.a() == b) {
                                    if (!z3) {
                                        z3 = true;
                                    } else {
                                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                                    }
                                }
                                if (zzgtwVar.s2().t2() != zzgtk.ASYMMETRIC_PUBLIC) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                z2 &= z;
                                i2++;
                            } else {
                                throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgtwVar.a())));
                            }
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgtwVar.a())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgtwVar.a())));
                    }
                }
            }
            if (i2 != 0) {
                if (!z3 && !z2) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                for (int i3 = 0; i3 < a(); i3++) {
                    if (this.b.get(i3) == null) {
                        throw new GeneralSecurityException("Key parsing of key with index " + i3 + " and type_url " + zzgtyVar.t2(i3).s2().x2() + " failed, unable to get primitive");
                    }
                }
                return zzglzVar.a(this, this.c, cls);
            }
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
    }

    public final String toString() {
        int i = zzgfa.a;
        zzgtz s2 = zzgud.s2();
        zzgty zzgtyVar = this.a;
        s2.Z1(zzgtyVar.b());
        for (zzgtw zzgtwVar : zzgtyVar.w2()) {
            zzgua s22 = zzgub.s2();
            s22.a2(zzgtwVar.s2().x2());
            s22.b2(zzgtwVar.z2());
            s22.Z1(zzgtwVar.v2());
            s22.Y1(zzgtwVar.a());
            s2.Y1((zzgub) s22.V1());
        }
        return ((zzgud) s2.V1()).toString();
    }

    public zzget(zzgty zzgtyVar, List list, zzgms zzgmsVar) throws GeneralSecurityException {
        this.a = zzgtyVar;
        this.b = list;
        this.c = zzgmsVar;
        if (zzglp.a.a()) {
            HashSet hashSet = new HashSet();
            for (zzgtw zzgtwVar : zzgtyVar.w2()) {
                if (!hashSet.contains(Integer.valueOf(zzgtwVar.a()))) {
                    hashSet.add(Integer.valueOf(zzgtwVar.a()));
                } else {
                    int a = zzgtwVar.a();
                    throw new GeneralSecurityException("KeyID " + a + " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                }
            }
            if (!hashSet.contains(Integer.valueOf(zzgtyVar.b()))) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
    }
}
