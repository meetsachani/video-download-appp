package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzgeq {
    public final List a = new ArrayList();
    public final zzgms b = zzgms.b;
    public boolean c = false;

    public static /* bridge */ /* synthetic */ void c(zzgeq zzgeqVar) {
        zzgeqVar.d();
    }

    public final zzgeq a(zzgeo zzgeoVar) {
        zzgeq zzgeqVar;
        boolean z;
        zzgeqVar = zzgeoVar.f;
        if (zzgeqVar == null) {
            z = zzgeoVar.a;
            if (z) {
                d();
            }
            zzgeoVar.f = this;
            this.a.add(zzgeoVar);
            return this;
        }
        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
    }

    public final zzget b() throws GeneralSecurityException {
        zzgep zzgepVar;
        zzgep zzgepVar2;
        zzgep zzgepVar3;
        int i;
        zzgex zzgexVar;
        Integer num;
        zzgex zzgexVar2;
        zzgem zzgemVar;
        boolean z;
        zzgem zzgemVar2;
        int i2;
        boolean z2;
        zzgem zzgemVar3;
        zzgep zzgepVar4;
        zzgep zzgepVar5;
        zzgep zzgepVar6;
        zzgep zzgepVar7;
        zzgem unused;
        zzgep unused2;
        if (!this.c) {
            char c = 1;
            this.c = true;
            List<zzgeo> list = this.a;
            zzgtu s2 = zzgty.s2();
            ArrayList arrayList = new ArrayList(list.size());
            int i3 = 0;
            int i4 = 0;
            while (i4 < list.size() - 1) {
                int i5 = i4 + 1;
                zzgepVar4 = ((zzgeo) list.get(i4)).e;
                zzgepVar5 = zzgep.a;
                if (zzgepVar4 == zzgepVar5) {
                    zzgepVar6 = ((zzgeo) list.get(i5)).e;
                    zzgepVar7 = zzgep.a;
                    if (zzgepVar6 != zzgepVar7) {
                        throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                    }
                }
                i4 = i5;
            }
            HashSet hashSet = new HashSet();
            Integer num2 = null;
            for (zzgeo zzgeoVar : list) {
                unused = zzgeoVar.b;
                zzgepVar = zzgeoVar.e;
                if (zzgepVar != null) {
                    zzgepVar2 = zzgeoVar.e;
                    zzgepVar3 = zzgep.a;
                    if (zzgepVar2 != zzgepVar3) {
                        unused2 = zzgeoVar.e;
                        i = i3;
                    } else {
                        int i6 = i3;
                        while (true) {
                            if (i6 != 0 && !hashSet.contains(Integer.valueOf(i6))) {
                                break;
                            }
                            int i7 = zzgou.a;
                            i6 = i3;
                            while (i6 == 0) {
                                byte[] b = zzgol.b(4);
                                i6 = (b[3] & 255) | ((b[i3] & 255) << 24) | ((b[c] & 255) << 16) | ((b[2] & 255) << 8);
                            }
                        }
                        i = i6;
                    }
                    Integer valueOf = Integer.valueOf(i);
                    if (!hashSet.contains(valueOf)) {
                        hashSet.add(valueOf);
                        zzgeo.a(zzgeoVar);
                        zzgexVar = zzgeoVar.d;
                        if (c != zzgexVar.a()) {
                            num = null;
                        } else {
                            num = valueOf;
                        }
                        zzgmz b2 = zzgmz.b();
                        zzgexVar2 = zzgeoVar.d;
                        zzgek a = b2.a(zzgexVar2, num);
                        zzgemVar = zzgeoVar.b;
                        z = zzgeoVar.a;
                        zzger zzgerVar = new zzger(a, zzgemVar, i, z, null);
                        int i8 = i;
                        zzgemVar2 = zzgeoVar.b;
                        zzgoi zzgoiVar = (zzgoi) zzgnj.c().d(a, zzgoi.class, zzgey.a());
                        Integer e = zzgoiVar.e();
                        if (e != null && e.intValue() != i8) {
                            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                        }
                        zzgem zzgemVar4 = zzgem.b;
                        if (zzgemVar4.equals(zzgemVar2)) {
                            i2 = 3;
                        } else if (zzgem.c.equals(zzgemVar2)) {
                            i2 = 4;
                        } else if (zzgem.d.equals(zzgemVar2)) {
                            i2 = 5;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                        zzgtv t2 = zzgtw.t2();
                        zzgtj s22 = zzgtm.s2();
                        s22.Z1(zzgoiVar.g());
                        s22.a2(zzgoiVar.d());
                        s22.Y1(zzgoiVar.b());
                        t2.Y1(s22);
                        t2.b2(i2);
                        t2.Z1(i8);
                        t2.a2(zzgoiVar.c());
                        s2.Y1((zzgtw) t2.V1());
                        z2 = zzgeoVar.a;
                        if (z2) {
                            if (num2 == null) {
                                zzgemVar3 = zzgeoVar.b;
                                if (zzgemVar3 == zzgemVar4) {
                                    num2 = valueOf;
                                } else {
                                    throw new GeneralSecurityException("Primary key is not enabled");
                                }
                            } else {
                                throw new GeneralSecurityException("Two primaries were set");
                            }
                        }
                        arrayList.add(zzgerVar);
                        c = 1;
                        i3 = 0;
                    } else {
                        throw new GeneralSecurityException("Id " + i + " is used twice in the keyset");
                    }
                } else {
                    throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                }
            }
            if (num2 != null) {
                s2.Z1(num2.intValue());
                zzgty zzgtyVar = (zzgty) s2.V1();
                zzget.j(zzgtyVar);
                return new zzget(zzgtyVar, arrayList, this.b);
            }
            throw new GeneralSecurityException("No primary was set");
        }
        throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
    }

    public final void d() {
        for (zzgeo zzgeoVar : this.a) {
            zzgeoVar.a = false;
        }
    }
}
