package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbi extends zzay {
    public zzbi() {
        this.a.add(zzbv.FOR_IN);
        this.a.add(zzbv.FOR_IN_CONST);
        this.a.add(zzbv.FOR_IN_LET);
        this.a.add(zzbv.FOR_LET);
        this.a.add(zzbv.FOR_OF);
        this.a.add(zzbv.FOR_OF_CONST);
        this.a.add(zzbv.FOR_OF_LET);
        this.a.add(zzbv.WHILE);
    }

    public static zzaq c(zzbm zzbmVar, zzaq zzaqVar, zzaq zzaqVar2) {
        return d(zzbmVar, zzaqVar.h(), zzaqVar2);
    }

    public static zzaq d(zzbm zzbmVar, Iterator<zzaq> it, zzaq zzaqVar) {
        if (it != null) {
            while (it.hasNext()) {
                zzaq a = zzbmVar.a(it.next()).a((zzaf) zzaqVar);
                if (a instanceof zzaj) {
                    zzaj zzajVar = (zzaj) a;
                    if ("break".equals(zzajVar.b())) {
                        return zzaq.i;
                    }
                    if ("return".equals(zzajVar.b())) {
                        return zzajVar;
                    }
                }
            }
        }
        return zzaq.i;
    }

    public static zzaq e(zzbm zzbmVar, zzaq zzaqVar, zzaq zzaqVar2) {
        if (zzaqVar instanceof Iterable) {
            return d(zzbmVar, ((Iterable) zzaqVar).iterator(), zzaqVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq b(String str, zzh zzhVar, List<zzaq> list) {
        switch (zzbl.a[zzg.c(str).ordinal()]) {
            case 1:
                zzg.f(zzbv.FOR_IN, 3, list);
                if (list.get(0) instanceof zzas) {
                    return c(new zzbp(zzhVar, list.get(0).e()), zzhVar.b(list.get(1)), zzhVar.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
            case 2:
                zzg.f(zzbv.FOR_IN_CONST, 3, list);
                if (list.get(0) instanceof zzas) {
                    return c(new zzbk(zzhVar, list.get(0).e()), zzhVar.b(list.get(1)), zzhVar.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
            case 3:
                zzg.f(zzbv.FOR_IN_LET, 3, list);
                if (list.get(0) instanceof zzas) {
                    return c(new zzbn(zzhVar, list.get(0).e()), zzhVar.b(list.get(1)), zzhVar.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
            case 4:
                zzg.f(zzbv.FOR_LET, 4, list);
                zzaq b = zzhVar.b(list.get(0));
                if (b instanceof zzaf) {
                    zzaf zzafVar = (zzaf) b;
                    zzaq zzaqVar = list.get(1);
                    zzaq zzaqVar2 = list.get(2);
                    zzaq b2 = zzhVar.b(list.get(3));
                    zzh d = zzhVar.d();
                    for (int i = 0; i < zzafVar.B(); i++) {
                        String e = zzafVar.l(i).e();
                        d.h(e, zzhVar.c(e));
                    }
                    while (zzhVar.b(zzaqVar).f().booleanValue()) {
                        zzaq a = zzhVar.a((zzaf) b2);
                        if (a instanceof zzaj) {
                            zzaj zzajVar = (zzaj) a;
                            if (!"break".equals(zzajVar.b())) {
                                if ("return".equals(zzajVar.b())) {
                                    return zzajVar;
                                }
                            } else {
                                return zzaq.i;
                            }
                        }
                        zzh d2 = zzhVar.d();
                        for (int i2 = 0; i2 < zzafVar.B(); i2++) {
                            String e2 = zzafVar.l(i2).e();
                            d2.h(e2, d.c(e2));
                        }
                        d2.b(zzaqVar2);
                        d = d2;
                    }
                    return zzaq.i;
                }
                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
            case 5:
                zzg.f(zzbv.FOR_OF, 3, list);
                if (list.get(0) instanceof zzas) {
                    return e(new zzbp(zzhVar, list.get(0).e()), zzhVar.b(list.get(1)), zzhVar.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
            case 6:
                zzg.f(zzbv.FOR_OF_CONST, 3, list);
                if (list.get(0) instanceof zzas) {
                    return e(new zzbk(zzhVar, list.get(0).e()), zzhVar.b(list.get(1)), zzhVar.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
            case 7:
                zzg.f(zzbv.FOR_OF_LET, 3, list);
                if (list.get(0) instanceof zzas) {
                    return e(new zzbn(zzhVar, list.get(0).e()), zzhVar.b(list.get(1)), zzhVar.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
            case 8:
                zzg.f(zzbv.WHILE, 4, list);
                zzaq zzaqVar3 = list.get(0);
                zzaq zzaqVar4 = list.get(1);
                zzaq b3 = zzhVar.b(list.get(3));
                if (zzhVar.b(list.get(2)).f().booleanValue()) {
                    zzaq a2 = zzhVar.a((zzaf) b3);
                    if (a2 instanceof zzaj) {
                        zzaj zzajVar2 = (zzaj) a2;
                        if (!"break".equals(zzajVar2.b())) {
                            if ("return".equals(zzajVar2.b())) {
                                return zzajVar2;
                            }
                        }
                        return zzaq.i;
                    }
                }
                while (zzhVar.b(zzaqVar3).f().booleanValue()) {
                    zzaq a3 = zzhVar.a((zzaf) b3);
                    if (a3 instanceof zzaj) {
                        zzaj zzajVar3 = (zzaj) a3;
                        if (!"break".equals(zzajVar3.b())) {
                            if ("return".equals(zzajVar3.b())) {
                                return zzajVar3;
                            }
                        } else {
                            return zzaq.i;
                        }
                    }
                    zzhVar.b(zzaqVar4);
                }
                return zzaq.i;
            default:
                return super.a(str);
        }
    }
}
