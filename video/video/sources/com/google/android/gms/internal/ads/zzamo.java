package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C4128Rj1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzamo implements zzaoe {
    public final List a;

    public zzamo(int i, List list) {
        this.a = list;
    }

    @Override // com.google.android.gms.internal.ads.zzaoe
    public final SparseArray a() {
        return new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.zzaoe
    @InterfaceC11300zs1
    public final zzaog b(int i, zzaod zzaodVar) {
        if (i != 2) {
            if (i != 3 && i != 4) {
                if (i != 21) {
                    if (i != 27) {
                        if (i != 36) {
                            if (i != 45) {
                                if (i != 89) {
                                    if (i != 172) {
                                        if (i != 257) {
                                            if (i != 128) {
                                                if (i != 129) {
                                                    if (i != 138) {
                                                        if (i != 139) {
                                                            switch (i) {
                                                                case 15:
                                                                    return new zzanl(new zzamn(false, zzaodVar.b, zzaodVar.a(), C4128Rj1.f601o));
                                                                case 16:
                                                                    return new zzanl(new zzamw(d(zzaodVar), C4128Rj1.f601o));
                                                                case 17:
                                                                    return new zzanl(new zzanc(zzaodVar.b, zzaodVar.a(), C4128Rj1.f601o));
                                                                default:
                                                                    switch (i) {
                                                                        case 134:
                                                                            return new zzant(new zzank(C4128Rj1.H0, C4128Rj1.f601o));
                                                                        case 135:
                                                                            break;
                                                                        case 136:
                                                                            break;
                                                                        default:
                                                                            return null;
                                                                    }
                                                            }
                                                        } else {
                                                            return new zzanl(new zzamp(zzaodVar.b, zzaodVar.a(), 5408, C4128Rj1.f601o));
                                                        }
                                                    }
                                                    return new zzanl(new zzamp(zzaodVar.b, zzaodVar.a(), 4096, C4128Rj1.f601o));
                                                }
                                                return new zzanl(new zzamj(zzaodVar.b, zzaodVar.a(), C4128Rj1.f601o));
                                            }
                                        } else {
                                            return new zzant(new zzank(C4128Rj1.N0, C4128Rj1.f601o));
                                        }
                                    } else {
                                        return new zzanl(new zzaml(zzaodVar.b, zzaodVar.a(), C4128Rj1.f601o));
                                    }
                                } else {
                                    return new zzanl(new zzamq(zzaodVar.d, C4128Rj1.f601o));
                                }
                            } else {
                                return new zzanl(new zzane(C4128Rj1.f601o));
                            }
                        } else {
                            return new zzanl(new zzana(c(zzaodVar), C4128Rj1.f601o));
                        }
                    } else {
                        return new zzanl(new zzamy(c(zzaodVar), false, false, C4128Rj1.f601o));
                    }
                } else {
                    return new zzanl(new zzanb(C4128Rj1.f601o));
                }
            } else {
                return new zzanl(new zzand(zzaodVar.b, zzaodVar.a(), C4128Rj1.f601o));
            }
        }
        return new zzanl(new zzamt(d(zzaodVar), C4128Rj1.f601o));
    }

    public final zzanv c(zzaod zzaodVar) {
        return new zzanv(e(zzaodVar), C4128Rj1.f601o);
    }

    public final zzaoi d(zzaod zzaodVar) {
        return new zzaoi(e(zzaodVar), C4128Rj1.f601o);
    }

    public final List e(zzaod zzaodVar) {
        boolean z;
        String str;
        int i;
        List list;
        zzek zzekVar = new zzek(zzaodVar.e);
        List list2 = this.a;
        while (zzekVar.u() > 0) {
            int G = zzekVar.G();
            int w = zzekVar.w() + zzekVar.G();
            if (G == 134) {
                list2 = new ArrayList();
                int G2 = zzekVar.G() & 31;
                for (int i2 = 0; i2 < G2; i2++) {
                    String b = zzekVar.b(3, StandardCharsets.UTF_8);
                    int G3 = zzekVar.G();
                    if ((G3 & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = G3 & 63;
                        str = C4128Rj1.y0;
                    } else {
                        str = C4128Rj1.x0;
                        i = 1;
                    }
                    byte G4 = (byte) zzekVar.G();
                    zzekVar.m(1);
                    if (z) {
                        int i3 = G4 & 64;
                        int i4 = zzdh.d;
                        list = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzx zzxVar = new zzx();
                    zzxVar.E(str);
                    zzxVar.s(b);
                    zzxVar.u0(i);
                    zzxVar.p(list);
                    list2.add(zzxVar.K());
                }
            }
            zzekVar.l(w);
        }
        return list2;
    }

    public zzamo() {
        this(0);
    }

    public zzamo(int i) {
        this.a = zzfyc.F();
    }
}
