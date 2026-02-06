package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbc extends zzay {
    public zzbc() {
        this.a.add(zzbv.APPLY);
        this.a.add(zzbv.BLOCK);
        this.a.add(zzbv.BREAK);
        this.a.add(zzbv.CASE);
        this.a.add(zzbv.DEFAULT);
        this.a.add(zzbv.CONTINUE);
        this.a.add(zzbv.DEFINE_FUNCTION);
        this.a.add(zzbv.FN);
        this.a.add(zzbv.IF);
        this.a.add(zzbv.QUOTE);
        this.a.add(zzbv.RETURN);
        this.a.add(zzbv.SWITCH);
        this.a.add(zzbv.TERNARY);
    }

    public static zzaq c(zzh zzhVar, List<zzaq> list) {
        zzg.j(zzbv.FN, 2, list);
        zzaq b = zzhVar.b(list.get(0));
        zzaq b2 = zzhVar.b(list.get(1));
        if (b2 instanceof zzaf) {
            List<zzaq> K = ((zzaf) b2).K();
            List<zzaq> arrayList = new ArrayList<>();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new zzar(b.e(), K, arrayList, zzhVar);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", b2.getClass().getCanonicalName()));
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq b(String str, zzh zzhVar, List<zzaq> list) {
        zzaq zzaqVar;
        zzaq zzaqVar2;
        int i = 0;
        switch (zzbf.a[zzg.c(str).ordinal()]) {
            case 1:
                zzg.f(zzbv.APPLY, 3, list);
                zzaq b = zzhVar.b(list.get(0));
                String e = zzhVar.b(list.get(1)).e();
                zzaq b2 = zzhVar.b(list.get(2));
                if (b2 instanceof zzaf) {
                    if (!e.isEmpty()) {
                        return b.i(e, zzhVar, ((zzaf) b2).K());
                    }
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", b2.getClass().getCanonicalName()));
            case 2:
                return zzhVar.d().a(new zzaf(list));
            case 3:
                zzg.f(zzbv.BREAK, 0, list);
                return zzaq.l;
            case 4:
            case 5:
                if (!list.isEmpty()) {
                    zzaq b3 = zzhVar.b(list.get(0));
                    if (b3 instanceof zzaf) {
                        return zzhVar.a((zzaf) b3);
                    }
                }
                return zzaq.i;
            case 6:
                zzg.f(zzbv.BREAK, 0, list);
                return zzaq.k;
            case 7:
                zzg.j(zzbv.DEFINE_FUNCTION, 2, list);
                zzar zzarVar = (zzar) c(zzhVar, list);
                if (zzarVar.b() == null) {
                    zzhVar.h("", zzarVar);
                    return zzarVar;
                }
                zzhVar.h(zzarVar.b(), zzarVar);
                return zzarVar;
            case 8:
                return c(zzhVar, list);
            case 9:
                zzg.j(zzbv.IF, 2, list);
                zzaq b4 = zzhVar.b(list.get(0));
                zzaq b5 = zzhVar.b(list.get(1));
                if (list.size() > 2) {
                    zzaqVar = zzhVar.b(list.get(2));
                } else {
                    zzaqVar = null;
                }
                zzaq zzaqVar3 = zzaq.i;
                if (b4.f().booleanValue()) {
                    zzaqVar2 = zzhVar.a((zzaf) b5);
                } else if (zzaqVar != null) {
                    zzaqVar2 = zzhVar.a((zzaf) zzaqVar);
                } else {
                    zzaqVar2 = zzaqVar3;
                }
                if (zzaqVar2 instanceof zzaj) {
                    return zzaqVar2;
                }
                return zzaqVar3;
            case 10:
                return new zzaf(list);
            case 11:
                if (list.isEmpty()) {
                    return zzaq.m;
                }
                zzg.f(zzbv.RETURN, 1, list);
                return new zzaj("return", zzhVar.b(list.get(0)));
            case 12:
                zzg.f(zzbv.SWITCH, 3, list);
                zzaq b6 = zzhVar.b(list.get(0));
                zzaq b7 = zzhVar.b(list.get(1));
                zzaq b8 = zzhVar.b(list.get(2));
                if (b7 instanceof zzaf) {
                    if (b8 instanceof zzaf) {
                        zzaf zzafVar = (zzaf) b7;
                        zzaf zzafVar2 = (zzaf) b8;
                        boolean z = false;
                        while (true) {
                            if (i < zzafVar.B()) {
                                if (z || b6.equals(zzhVar.b(zzafVar.l(i)))) {
                                    zzaq b9 = zzhVar.b(zzafVar2.l(i));
                                    if (b9 instanceof zzaj) {
                                        if (!((zzaj) b9).b().equals("break")) {
                                            return b9;
                                        }
                                    } else {
                                        z = true;
                                    }
                                }
                                i++;
                            } else if (zzafVar.B() + 1 == zzafVar2.B()) {
                                zzaq b10 = zzhVar.b(zzafVar2.l(zzafVar.B()));
                                if (b10 instanceof zzaj) {
                                    String b11 = ((zzaj) b10).b();
                                    if (b11.equals("return") || b11.equals("continue")) {
                                        return b10;
                                    }
                                }
                            }
                        }
                        return zzaq.i;
                    }
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
            case 13:
                zzg.f(zzbv.TERNARY, 3, list);
                if (zzhVar.b(list.get(0)).f().booleanValue()) {
                    return zzhVar.b(list.get(1));
                }
                return zzhVar.b(list.get(2));
            default:
                return super.a(str);
        }
    }
}
