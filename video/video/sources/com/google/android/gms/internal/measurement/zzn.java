package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzn extends zzap {
    public final zzac Y;

    public zzn(zzac zzacVar) {
        this.Y = zzacVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzap, com.google.android.gms.internal.measurement.zzaq
    public final zzaq i(String str, zzh zzhVar, List<zzaq> list) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c = 0;
                    break;
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c = 1;
                    break;
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c = 2;
                    break;
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c = 3;
                    break;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c = 4;
                    break;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                zzg.g("getEventName", 0, list);
                return new zzas(this.Y.d().e());
            case 1:
                zzg.g("getTimestamp", 0, list);
                return new zzai(Double.valueOf(this.Y.d().a()));
            case 2:
                zzg.g("getParamValue", 1, list);
                return zzj.b(this.Y.d().b(zzhVar.b(list.get(0)).e()));
            case 3:
                zzg.g("getParams", 0, list);
                Map<String, Object> g = this.Y.d().g();
                zzap zzapVar = new zzap();
                for (String str2 : g.keySet()) {
                    zzapVar.j(str2, zzj.b(g.get(str2)));
                }
                return zzapVar;
            case 4:
                zzg.g("setParamValue", 2, list);
                String e = zzhVar.b(list.get(0)).e();
                zzaq b = zzhVar.b(list.get(1));
                this.Y.d().d(e, zzg.d(b));
                return b;
            case 5:
                zzg.g("setEventName", 1, list);
                zzaq b2 = zzhVar.b(list.get(0));
                if (!zzaq.i.equals(b2) && !zzaq.j.equals(b2)) {
                    this.Y.d().f(b2.e());
                    return new zzas(b2.e());
                }
                throw new IllegalArgumentException("Illegal event name");
            default:
                return super.i(str, zzhVar, list);
        }
    }
}
