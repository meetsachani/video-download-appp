package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.C8206nB;

/* loaded from: classes3.dex */
public final class zzbe {
    public static zzaf a(zzaf zzafVar, zzh zzhVar, zzal zzalVar) {
        return b(zzafVar, zzhVar, zzalVar, null, null);
    }

    public static zzaf b(zzaf zzafVar, zzh zzhVar, zzal zzalVar, Boolean bool, Boolean bool2) {
        zzaf zzafVar2 = new zzaf();
        Iterator<Integer> J = zzafVar.J();
        while (J.hasNext()) {
            int intValue = J.next().intValue();
            if (zzafVar.H(intValue)) {
                zzaq a = zzalVar.a(zzhVar, Arrays.asList(zzafVar.l(intValue), new zzai(Double.valueOf(intValue)), zzafVar));
                if (a.f().equals(bool)) {
                    break;
                } else if (bool2 == null || a.f().equals(bool2)) {
                    zzafVar2.G(intValue, a);
                }
            }
        }
        return zzafVar2;
    }

    public static zzaq c(zzaf zzafVar, zzh zzhVar, List<zzaq> list, boolean z) {
        zzaq zzaqVar;
        int i;
        int i2;
        int i3;
        zzg.k("reduce", 1, list);
        zzg.n("reduce", 2, list);
        zzaq b = zzhVar.b(list.get(0));
        if (b instanceof zzal) {
            if (list.size() == 2) {
                zzaqVar = zzhVar.b(list.get(1));
                if (zzaqVar instanceof zzaj) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (zzafVar.B() != 0) {
                zzaqVar = null;
            } else {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            zzal zzalVar = (zzal) b;
            int B = zzafVar.B();
            if (z) {
                i = 0;
            } else {
                i = B - 1;
            }
            if (z) {
                i2 = B - 1;
            } else {
                i2 = 0;
            }
            if (z) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            if (zzaqVar == null) {
                zzaqVar = zzafVar.l(i);
                i += i3;
            }
            while ((i2 - i) * i3 >= 0) {
                if (zzafVar.H(i)) {
                    zzaqVar = zzalVar.a(zzhVar, Arrays.asList(zzaqVar, zzafVar.l(i), new zzai(Double.valueOf(i)), zzafVar));
                    if (zzaqVar instanceof zzaj) {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                    i += i3;
                } else {
                    i += i3;
                }
            }
            return zzaqVar;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }

    public static zzaq d(String str, zzaf zzafVar, zzh zzhVar, List<zzaq> list) {
        double a;
        String str2;
        zzal zzalVar;
        double min;
        zzh zzhVar2;
        Double d;
        char c;
        Double valueOf = Double.valueOf(-1.0d);
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    c2 = 2;
                    break;
                }
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c2 = 3;
                    break;
                }
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c = 4;
                    c2 = c;
                    break;
                }
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c = 5;
                    c2 = c;
                    break;
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 6;
                    c2 = c;
                    break;
                }
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c = 7;
                    c2 = c;
                    break;
                }
                break;
            case 107868:
                if (str.equals("map")) {
                    c = '\b';
                    c2 = c;
                    break;
                }
                break;
            case 111185:
                if (str.equals("pop")) {
                    c = '\t';
                    c2 = c;
                    break;
                }
                break;
            case 3267882:
                if (str.equals("join")) {
                    c = '\n';
                    c2 = c;
                    break;
                }
                break;
            case 3452698:
                if (str.equals("push")) {
                    c = 11;
                    c2 = c;
                    break;
                }
                break;
            case 3536116:
                if (str.equals("some")) {
                    c = '\f';
                    c2 = c;
                    break;
                }
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c = C8206nB.d;
                    c2 = c;
                    break;
                }
                break;
            case 96891675:
                if (str.equals("every")) {
                    c = 14;
                    c2 = c;
                    break;
                }
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c = 15;
                    c2 = c;
                    break;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = 16;
                    c2 = c;
                    break;
                }
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c = 17;
                    c2 = c;
                    break;
                }
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c = 18;
                    c2 = c;
                    break;
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = 19;
                    c2 = c;
                    break;
                }
                break;
        }
        double d2 = 0.0d;
        switch (c2) {
            case 0:
                zzg.g("toString", 0, list);
                return new zzas(zzafVar.toString());
            case 1:
                zzaf zzafVar2 = (zzaf) zzafVar.c();
                if (!list.isEmpty()) {
                    for (zzaq zzaqVar : list) {
                        zzaq b = zzhVar.b(zzaqVar);
                        if (!(b instanceof zzaj)) {
                            int B = zzafVar2.B();
                            if (b instanceof zzaf) {
                                zzaf zzafVar3 = (zzaf) b;
                                Iterator<Integer> J = zzafVar3.J();
                                while (J.hasNext()) {
                                    Integer next = J.next();
                                    zzafVar2.G(next.intValue() + B, zzafVar3.l(next.intValue()));
                                }
                            } else {
                                zzafVar2.G(B, b);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                }
                return zzafVar2;
            case 2:
                zzg.g("filter", 1, list);
                zzaq b2 = zzhVar.b(list.get(0));
                if (b2 instanceof zzar) {
                    if (zzafVar.k() == 0) {
                        return new zzaf();
                    }
                    zzaf zzafVar4 = (zzaf) zzafVar.c();
                    zzaf b3 = b(zzafVar, zzhVar, (zzar) b2, null, Boolean.TRUE);
                    zzaf zzafVar5 = new zzaf();
                    Iterator<Integer> J2 = b3.J();
                    while (J2.hasNext()) {
                        zzafVar5.r(zzafVar4.l(J2.next().intValue()));
                    }
                    return zzafVar5;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 3:
                return c(zzafVar, zzhVar, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new zzaf();
                }
                int a2 = (int) zzg.a(zzhVar.b(list.get(0)).d().doubleValue());
                if (a2 < 0) {
                    a2 = Math.max(0, a2 + zzafVar.B());
                } else if (a2 > zzafVar.B()) {
                    a2 = zzafVar.B();
                }
                int B2 = zzafVar.B();
                zzaf zzafVar6 = new zzaf();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) zzg.a(zzhVar.b(list.get(1)).d().doubleValue()));
                    if (max > 0) {
                        for (int i = a2; i < Math.min(B2, a2 + max); i++) {
                            zzafVar6.r(zzafVar.l(a2));
                            zzafVar.F(a2);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i2 = 2; i2 < list.size(); i2++) {
                            zzaq b4 = zzhVar.b(list.get(i2));
                            if (!(b4 instanceof zzaj)) {
                                zzafVar.p((a2 + i2) - 2, b4);
                            } else {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                        }
                    }
                } else {
                    while (a2 < B2) {
                        zzafVar6.r(zzafVar.l(a2));
                        zzafVar.G(a2, null);
                        a2++;
                    }
                }
                return zzafVar6;
            case 5:
                zzg.g("forEach", 1, list);
                zzaq b5 = zzhVar.b(list.get(0));
                if (b5 instanceof zzar) {
                    if (zzafVar.k() == 0) {
                        return zzaq.i;
                    }
                    a(zzafVar, zzhVar, (zzar) b5);
                    return zzaq.i;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 6:
                zzg.n("lastIndexOf", 2, list);
                zzaq zzaqVar2 = zzaq.i;
                if (!list.isEmpty()) {
                    zzaqVar2 = zzhVar.b(list.get(0));
                }
                double B3 = zzafVar.B() - 1;
                if (list.size() > 1) {
                    zzaq b6 = zzhVar.b(list.get(1));
                    if (Double.isNaN(b6.d().doubleValue())) {
                        a = zzafVar.B() - 1;
                    } else {
                        a = zzg.a(b6.d().doubleValue());
                    }
                    B3 = a;
                    if (B3 < 0.0d) {
                        B3 += zzafVar.B();
                    }
                }
                if (B3 < 0.0d) {
                    return new zzai(valueOf);
                }
                for (int min2 = (int) Math.min(zzafVar.B(), B3); min2 >= 0; min2--) {
                    if (zzafVar.H(min2) && zzg.h(zzafVar.l(min2), zzaqVar2)) {
                        return new zzai(Double.valueOf(min2));
                    }
                }
                return new zzai(valueOf);
            case 7:
                if (!list.isEmpty()) {
                    zzaf zzafVar7 = new zzaf();
                    for (zzaq zzaqVar3 : list) {
                        zzaq b7 = zzhVar.b(zzaqVar3);
                        if (!(b7 instanceof zzaj)) {
                            zzafVar7.r(b7);
                        } else {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                    }
                    int B4 = zzafVar7.B();
                    Iterator<Integer> J3 = zzafVar.J();
                    while (J3.hasNext()) {
                        Integer next2 = J3.next();
                        zzafVar7.G(next2.intValue() + B4, zzafVar.l(next2.intValue()));
                    }
                    zzafVar.L();
                    Iterator<Integer> J4 = zzafVar7.J();
                    while (J4.hasNext()) {
                        Integer next3 = J4.next();
                        zzafVar.G(next3.intValue(), zzafVar7.l(next3.intValue()));
                    }
                }
                return new zzai(Double.valueOf(zzafVar.B()));
            case '\b':
                zzg.g("map", 1, list);
                zzaq b8 = zzhVar.b(list.get(0));
                if (b8 instanceof zzar) {
                    if (zzafVar.B() == 0) {
                        return new zzaf();
                    }
                    return a(zzafVar, zzhVar, (zzar) b8);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\t':
                zzg.g("pop", 0, list);
                int B5 = zzafVar.B();
                if (B5 == 0) {
                    return zzaq.i;
                }
                int i3 = B5 - 1;
                zzaq l = zzafVar.l(i3);
                zzafVar.F(i3);
                return l;
            case '\n':
                zzg.n("join", 1, list);
                if (zzafVar.B() == 0) {
                    return zzaq.p;
                }
                if (!list.isEmpty()) {
                    zzaq b9 = zzhVar.b(list.get(0));
                    if (!(b9 instanceof zzao) && !(b9 instanceof zzax)) {
                        str2 = b9.e();
                    } else {
                        str2 = "";
                    }
                } else {
                    str2 = ",";
                }
                return new zzas(zzafVar.D(str2));
            case 11:
                if (!list.isEmpty()) {
                    for (zzaq zzaqVar4 : list) {
                        zzafVar.r(zzhVar.b(zzaqVar4));
                    }
                }
                return new zzai(Double.valueOf(zzafVar.B()));
            case '\f':
                zzg.g("some", 1, list);
                zzaq b10 = zzhVar.b(list.get(0));
                if (b10 instanceof zzal) {
                    if (zzafVar.B() != 0) {
                        zzal zzalVar2 = (zzal) b10;
                        Iterator<Integer> J5 = zzafVar.J();
                        while (J5.hasNext()) {
                            int intValue = J5.next().intValue();
                            if (zzafVar.H(intValue) && zzalVar2.a(zzhVar, Arrays.asList(zzafVar.l(intValue), new zzai(Double.valueOf(intValue)), zzafVar)).f().booleanValue()) {
                                return zzaq.n;
                            }
                        }
                    }
                    return zzaq.f304o;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\r':
                zzg.n("sort", 1, list);
                if (zzafVar.B() >= 2) {
                    List<zzaq> K = zzafVar.K();
                    if (!list.isEmpty()) {
                        zzaq b11 = zzhVar.b(list.get(0));
                        if (b11 instanceof zzal) {
                            zzalVar = (zzal) b11;
                        } else {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                    } else {
                        zzalVar = null;
                    }
                    Collections.sort(K, new zzbh(zzalVar, zzhVar));
                    zzafVar.L();
                    int i4 = 0;
                    for (zzaq zzaqVar5 : K) {
                        zzafVar.G(i4, zzaqVar5);
                        i4++;
                    }
                }
                return zzafVar;
            case 14:
                zzg.g("every", 1, list);
                zzaq b12 = zzhVar.b(list.get(0));
                if (b12 instanceof zzar) {
                    if (zzafVar.B() != 0 && b(zzafVar, zzhVar, (zzar) b12, Boolean.FALSE, Boolean.TRUE).B() != zzafVar.B()) {
                        return zzaq.f304o;
                    }
                    return zzaq.n;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 15:
                zzg.g("shift", 0, list);
                if (zzafVar.B() == 0) {
                    return zzaq.i;
                }
                zzaq l2 = zzafVar.l(0);
                zzafVar.F(0);
                return l2;
            case 16:
                zzg.n("slice", 2, list);
                if (list.isEmpty()) {
                    return zzafVar.c();
                }
                double B6 = zzafVar.B();
                double a3 = zzg.a(zzhVar.b(list.get(0)).d().doubleValue());
                if (a3 < 0.0d) {
                    min = Math.max(a3 + B6, 0.0d);
                } else {
                    min = Math.min(a3, B6);
                }
                if (list.size() == 2) {
                    double a4 = zzg.a(zzhVar.b(list.get(1)).d().doubleValue());
                    if (a4 < 0.0d) {
                        B6 = Math.max(B6 + a4, 0.0d);
                    } else {
                        B6 = Math.min(B6, a4);
                    }
                }
                zzaf zzafVar8 = new zzaf();
                for (int i5 = (int) min; i5 < B6; i5++) {
                    zzafVar8.r(zzafVar.l(i5));
                }
                return zzafVar8;
            case 17:
                return c(zzafVar, zzhVar, list, false);
            case 18:
                zzg.g("reverse", 0, list);
                int B7 = zzafVar.B();
                if (B7 != 0) {
                    for (int i6 = 0; i6 < B7 / 2; i6++) {
                        if (zzafVar.H(i6)) {
                            zzaq l3 = zzafVar.l(i6);
                            zzafVar.G(i6, null);
                            int i7 = (B7 - 1) - i6;
                            if (zzafVar.H(i7)) {
                                zzafVar.G(i6, zzafVar.l(i7));
                            }
                            zzafVar.G(i7, l3);
                        }
                    }
                }
                return zzafVar;
            case 19:
                zzg.n("indexOf", 2, list);
                zzaq zzaqVar6 = zzaq.i;
                if (!list.isEmpty()) {
                    zzhVar2 = zzhVar;
                    zzaqVar6 = zzhVar2.b(list.get(0));
                } else {
                    zzhVar2 = zzhVar;
                }
                if (list.size() > 1) {
                    double a5 = zzg.a(zzhVar2.b(list.get(1)).d().doubleValue());
                    if (a5 >= zzafVar.B()) {
                        return new zzai(valueOf);
                    }
                    d = valueOf;
                    if (a5 < 0.0d) {
                        d2 = zzafVar.B() + a5;
                    } else {
                        d2 = a5;
                    }
                } else {
                    d = valueOf;
                }
                Iterator<Integer> J6 = zzafVar.J();
                while (J6.hasNext()) {
                    int intValue2 = J6.next().intValue();
                    double d3 = intValue2;
                    if (d3 >= d2 && zzg.h(zzafVar.l(intValue2), zzaqVar6)) {
                        return new zzai(Double.valueOf(d3));
                    }
                }
                return new zzai(d);
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }
}
