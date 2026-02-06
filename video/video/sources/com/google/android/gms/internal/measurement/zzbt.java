package com.google.android.gms.internal.measurement;

import java.util.List;
import o.InterfaceC8148mw2;

/* loaded from: classes3.dex */
public final class zzbt extends zzay {
    public zzbt() {
        this.a.add(zzbv.ASSIGN);
        this.a.add(zzbv.CONST);
        this.a.add(zzbv.CREATE_ARRAY);
        this.a.add(zzbv.CREATE_OBJECT);
        this.a.add(zzbv.EXPRESSION_LIST);
        this.a.add(zzbv.GET);
        this.a.add(zzbv.GET_INDEX);
        this.a.add(zzbv.GET_PROPERTY);
        this.a.add(zzbv.NULL);
        this.a.add(zzbv.SET_PROPERTY);
        this.a.add(zzbv.TYPEOF);
        this.a.add(zzbv.UNDEFINED);
        this.a.add(zzbv.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq b(String str, zzh zzhVar, List<zzaq> list) {
        String str2;
        int i = 0;
        switch (zzbs.a[zzg.c(str).ordinal()]) {
            case 1:
                zzg.f(zzbv.ASSIGN, 2, list);
                zzaq b = zzhVar.b(list.get(0));
                if (b instanceof zzas) {
                    if (zzhVar.g(b.e())) {
                        zzaq b2 = zzhVar.b(list.get(1));
                        zzhVar.h(b.e(), b2);
                        return b2;
                    }
                    throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", b.e()));
                }
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", b.getClass().getCanonicalName()));
            case 2:
                zzg.j(zzbv.CONST, 2, list);
                if (list.size() % 2 == 0) {
                    while (i < list.size() - 1) {
                        zzaq b3 = zzhVar.b(list.get(i));
                        if (b3 instanceof zzas) {
                            zzhVar.f(b3.e(), zzhVar.b(list.get(i + 1)));
                            i += 2;
                        } else {
                            throw new IllegalArgumentException(String.format("Expected string for const name. got %s", b3.getClass().getCanonicalName()));
                        }
                    }
                    return zzaq.i;
                }
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            case 3:
                if (list.isEmpty()) {
                    return new zzaf();
                }
                zzaf zzafVar = new zzaf();
                for (zzaq zzaqVar : list) {
                    zzaq b4 = zzhVar.b(zzaqVar);
                    if (!(b4 instanceof zzaj)) {
                        zzafVar.G(i, b4);
                        i++;
                    } else {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                }
                return zzafVar;
            case 4:
                if (list.isEmpty()) {
                    return new zzap();
                }
                if (list.size() % 2 == 0) {
                    zzap zzapVar = new zzap();
                    while (i < list.size() - 1) {
                        zzaq b5 = zzhVar.b(list.get(i));
                        zzaq b6 = zzhVar.b(list.get(i + 1));
                        if (!(b5 instanceof zzaj) && !(b6 instanceof zzaj)) {
                            zzapVar.j(b5.e(), b6);
                            i += 2;
                        } else {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                    }
                    return zzapVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            case 5:
                zzg.j(zzbv.EXPRESSION_LIST, 1, list);
                zzaq zzaqVar2 = zzaq.i;
                while (i < list.size()) {
                    zzaqVar2 = zzhVar.b(list.get(i));
                    if (zzaqVar2 instanceof zzaj) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i++;
                }
                return zzaqVar2;
            case 6:
                zzg.f(zzbv.GET, 1, list);
                zzaq b7 = zzhVar.b(list.get(0));
                if (b7 instanceof zzas) {
                    return zzhVar.c(b7.e());
                }
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", b7.getClass().getCanonicalName()));
            case 7:
            case 8:
                zzg.f(zzbv.GET_PROPERTY, 2, list);
                zzaq b8 = zzhVar.b(list.get(0));
                zzaq b9 = zzhVar.b(list.get(1));
                if ((b8 instanceof zzaf) && zzg.l(b9)) {
                    return ((zzaf) b8).l(b9.d().intValue());
                }
                if (b8 instanceof zzak) {
                    return ((zzak) b8).w(b9.e());
                }
                if (b8 instanceof zzas) {
                    if ("length".equals(b9.e())) {
                        return new zzai(Double.valueOf(b8.e().length()));
                    }
                    if (zzg.l(b9) && b9.d().doubleValue() < b8.e().length()) {
                        return new zzas(String.valueOf(b8.e().charAt(b9.d().intValue())));
                    }
                }
                return zzaq.i;
            case 9:
                zzg.f(zzbv.NULL, 0, list);
                return zzaq.j;
            case 10:
                zzg.f(zzbv.SET_PROPERTY, 3, list);
                zzaq b10 = zzhVar.b(list.get(0));
                zzaq b11 = zzhVar.b(list.get(1));
                zzaq b12 = zzhVar.b(list.get(2));
                if (b10 != zzaq.i && b10 != zzaq.j) {
                    if ((b10 instanceof zzaf) && (b11 instanceof zzai)) {
                        ((zzaf) b10).G(b11.d().intValue(), b12);
                        return b12;
                    }
                    if (b10 instanceof zzak) {
                        ((zzak) b10).j(b11.e(), b12);
                    }
                    return b12;
                }
                throw new IllegalStateException(String.format("Can't set property %s of %s", b11.e(), b10.e()));
            case 11:
                zzg.f(zzbv.TYPEOF, 1, list);
                zzaq b13 = zzhVar.b(list.get(0));
                if (b13 instanceof zzax) {
                    str2 = "undefined";
                } else if (b13 instanceof zzag) {
                    str2 = InterfaceC8148mw2.b.f;
                } else if (b13 instanceof zzai) {
                    str2 = "number";
                } else if (b13 instanceof zzas) {
                    str2 = "string";
                } else if (b13 instanceof zzar) {
                    str2 = "function";
                } else if ((b13 instanceof zzat) || (b13 instanceof zzaj)) {
                    throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b13));
                } else {
                    str2 = "object";
                }
                return new zzas(str2);
            case 12:
                zzg.f(zzbv.UNDEFINED, 0, list);
                return zzaq.i;
            case 13:
                zzg.j(zzbv.VAR, 1, list);
                for (zzaq zzaqVar3 : list) {
                    zzaq b14 = zzhVar.b(zzaqVar3);
                    if (b14 instanceof zzas) {
                        zzhVar.e(b14.e(), zzaq.i);
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", b14.getClass().getCanonicalName()));
                    }
                }
                return zzaq.i;
            default:
                return super.a(str);
        }
    }
}
