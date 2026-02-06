package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzba extends zzay {
    public zzba() {
        this.a.add(zzbv.EQUALS);
        this.a.add(zzbv.GREATER_THAN);
        this.a.add(zzbv.GREATER_THAN_EQUALS);
        this.a.add(zzbv.IDENTITY_EQUALS);
        this.a.add(zzbv.IDENTITY_NOT_EQUALS);
        this.a.add(zzbv.LESS_THAN);
        this.a.add(zzbv.LESS_THAN_EQUALS);
        this.a.add(zzbv.NOT_EQUALS);
    }

    public static boolean c(zzaq zzaqVar, zzaq zzaqVar2) {
        zzaq zzaiVar;
        zzaq zzaiVar2;
        while (!zzaqVar.getClass().equals(zzaqVar2.getClass())) {
            if (((zzaqVar instanceof zzax) || (zzaqVar instanceof zzao)) && ((zzaqVar2 instanceof zzax) || (zzaqVar2 instanceof zzao))) {
                return true;
            }
            boolean z = zzaqVar instanceof zzai;
            if (z && (zzaqVar2 instanceof zzas)) {
                zzaiVar2 = new zzai(zzaqVar2.d());
            } else {
                boolean z2 = zzaqVar instanceof zzas;
                if (z2 && (zzaqVar2 instanceof zzai)) {
                    zzaiVar = new zzai(zzaqVar.d());
                } else if (zzaqVar instanceof zzag) {
                    zzaiVar = new zzai(zzaqVar.d());
                } else if (zzaqVar2 instanceof zzag) {
                    zzaiVar2 = new zzai(zzaqVar2.d());
                } else if ((z2 || z) && (zzaqVar2 instanceof zzak)) {
                    zzaiVar2 = new zzas(zzaqVar2.e());
                } else if (!(zzaqVar instanceof zzak) || (!(zzaqVar2 instanceof zzas) && !(zzaqVar2 instanceof zzai))) {
                    return false;
                } else {
                    zzaiVar = new zzas(zzaqVar.e());
                }
                zzaqVar = zzaiVar;
            }
            zzaqVar2 = zzaiVar2;
        }
        if ((zzaqVar instanceof zzax) || (zzaqVar instanceof zzao)) {
            return true;
        }
        if (zzaqVar instanceof zzai) {
            if (Double.isNaN(zzaqVar.d().doubleValue()) || Double.isNaN(zzaqVar2.d().doubleValue()) || zzaqVar.d().doubleValue() != zzaqVar2.d().doubleValue()) {
                return false;
            }
            return true;
        } else if (zzaqVar instanceof zzas) {
            return zzaqVar.e().equals(zzaqVar2.e());
        } else {
            if (zzaqVar instanceof zzag) {
                return zzaqVar.f().equals(zzaqVar2.f());
            }
            if (zzaqVar != zzaqVar2) {
                return false;
            }
            return true;
        }
    }

    public static boolean d(zzaq zzaqVar, zzaq zzaqVar2) {
        if (zzaqVar instanceof zzak) {
            zzaqVar = new zzas(zzaqVar.e());
        }
        if (zzaqVar2 instanceof zzak) {
            zzaqVar2 = new zzas(zzaqVar2.e());
        }
        if ((zzaqVar instanceof zzas) && (zzaqVar2 instanceof zzas)) {
            if (zzaqVar.e().compareTo(zzaqVar2.e()) < 0) {
                return true;
            }
            return false;
        }
        double doubleValue = zzaqVar.d().doubleValue();
        double doubleValue2 = zzaqVar2.d().doubleValue();
        if (!Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && ((doubleValue != 0.0d || doubleValue2 != -0.0d) && ((doubleValue != -0.0d || doubleValue2 != 0.0d) && Double.compare(doubleValue, doubleValue2) < 0))) {
            return true;
        }
        return false;
    }

    public static boolean e(zzaq zzaqVar, zzaq zzaqVar2) {
        if (zzaqVar instanceof zzak) {
            zzaqVar = new zzas(zzaqVar.e());
        }
        if (zzaqVar2 instanceof zzak) {
            zzaqVar2 = new zzas(zzaqVar2.e());
        }
        if (((!(zzaqVar instanceof zzas) || !(zzaqVar2 instanceof zzas)) && (Double.isNaN(zzaqVar.d().doubleValue()) || Double.isNaN(zzaqVar2.d().doubleValue()))) || d(zzaqVar2, zzaqVar)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq b(String str, zzh zzhVar, List<zzaq> list) {
        boolean c;
        boolean h;
        zzg.f(zzg.c(str), 2, list);
        zzaq b = zzhVar.b(list.get(0));
        zzaq b2 = zzhVar.b(list.get(1));
        switch (zzbd.a[zzg.c(str).ordinal()]) {
            case 1:
                c = c(b, b2);
                break;
            case 2:
                c = d(b2, b);
                break;
            case 3:
                c = e(b2, b);
                break;
            case 4:
                c = zzg.h(b, b2);
                break;
            case 5:
                h = zzg.h(b, b2);
                c = !h;
                break;
            case 6:
                c = d(b, b2);
                break;
            case 7:
                c = e(b, b2);
                break;
            case 8:
                h = c(b, b2);
                c = !h;
                break;
            default:
                return super.a(str);
        }
        if (c) {
            return zzaq.n;
        }
        return zzaq.f304o;
    }
}
