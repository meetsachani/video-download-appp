package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzj {
    public static zzaq a(zzfp.zzd zzdVar) {
        if (zzdVar == null) {
            return zzaq.i;
        }
        int i = zzi.a[zzdVar.G().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            String valueOf = String.valueOf(zzdVar);
                            throw new IllegalStateException("Invalid entity: " + valueOf);
                        }
                        throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                    }
                    List<zzfp.zzd> K = zzdVar.K();
                    ArrayList arrayList = new ArrayList();
                    for (zzfp.zzd zzdVar2 : K) {
                        arrayList.add(a(zzdVar2));
                    }
                    return new zzat(zzdVar.I(), arrayList);
                } else if (zzdVar.M()) {
                    return new zzag(Boolean.valueOf(zzdVar.L()));
                } else {
                    return new zzag(null);
                }
            } else if (zzdVar.N()) {
                return new zzai(Double.valueOf(zzdVar.F()));
            } else {
                return new zzai(null);
            }
        } else if (zzdVar.O()) {
            return new zzas(zzdVar.J());
        } else {
            return zzaq.p;
        }
    }

    public static zzaq b(Object obj) {
        if (obj == null) {
            return zzaq.j;
        }
        if (obj instanceof String) {
            return new zzas((String) obj);
        }
        if (obj instanceof Double) {
            return new zzai((Double) obj);
        }
        if (obj instanceof Long) {
            return new zzai(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new zzai(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new zzag((Boolean) obj);
        }
        if (obj instanceof Map) {
            zzap zzapVar = new zzap();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                zzaq b = b(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    zzapVar.j((String) obj2, b);
                }
            }
            return zzapVar;
        } else if (obj instanceof List) {
            zzaf zzafVar = new zzaf();
            for (Object obj3 : (List) obj) {
                zzafVar.r(b(obj3));
            }
            return zzafVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
