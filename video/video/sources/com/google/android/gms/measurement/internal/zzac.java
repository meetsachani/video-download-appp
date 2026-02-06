package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzew;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import o.InterfaceC5056aJ2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzac {
    public String a;
    public int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;

    public zzac(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static Boolean b(double d, zzew.zzd zzdVar) {
        try {
            return h(new BigDecimal(d), zzdVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean c(long j, zzew.zzd zzdVar) {
        try {
            return h(new BigDecimal(j), zzdVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @InterfaceC5056aJ2
    public static Boolean d(Boolean bool, boolean z) {
        boolean z2;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public static Boolean e(String str, zzew.zzd zzdVar) {
        if (!zzmz.f0(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), zzdVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean f(String str, zzew.zzf.zza zzaVar, boolean z, String str2, List<String> list, String str3, zzfr zzfrVar) {
        int i;
        if (str == null) {
            return null;
        }
        if (zzaVar == zzew.zzf.zza.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && zzaVar != zzew.zzf.zza.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (zzw.a[zzaVar.ordinal()]) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                if (z) {
                    i = 0;
                } else {
                    i = 66;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (zzfrVar != null) {
                        zzfrVar.L().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    @InterfaceC5056aJ2
    public static Boolean g(String str, zzew.zzf zzfVar, zzfr zzfrVar) {
        String I;
        List<String> list;
        String str2;
        Preconditions.r(zzfVar);
        if (str == null || !zzfVar.N() || zzfVar.F() == zzew.zzf.zza.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        zzew.zzf.zza F = zzfVar.F();
        zzew.zzf.zza zzaVar = zzew.zzf.zza.IN_LIST;
        if (F == zzaVar) {
            if (zzfVar.m() == 0) {
                return null;
            }
        } else if (!zzfVar.M()) {
            return null;
        }
        zzew.zzf.zza F2 = zzfVar.F();
        boolean K = zzfVar.K();
        if (!K && F2 != zzew.zzf.zza.REGEXP && F2 != zzaVar) {
            I = zzfVar.I().toUpperCase(Locale.ENGLISH);
        } else {
            I = zzfVar.I();
        }
        String str3 = I;
        if (zzfVar.m() == 0) {
            list = null;
        } else {
            List<String> J = zzfVar.J();
            if (!K) {
                ArrayList arrayList = new ArrayList(J.size());
                for (String str4 : J) {
                    arrayList.add(str4.toUpperCase(Locale.ENGLISH));
                }
                J = Collections.unmodifiableList(arrayList);
            }
            list = J;
        }
        if (F2 == zzew.zzf.zza.REGEXP) {
            str2 = str3;
        } else {
            str2 = null;
        }
        return f(str, F2, K, str3, list, str2, zzfrVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
        if (r3 != null) goto L24;
     */
    @InterfaceC5056aJ2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Boolean h(BigDecimal bigDecimal, zzew.zzd zzdVar, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.r(zzdVar);
        if (zzdVar.M() && zzdVar.F() != zzew.zzd.zzb.UNKNOWN_COMPARISON_TYPE) {
            zzew.zzd.zzb F = zzdVar.F();
            zzew.zzd.zzb zzbVar = zzew.zzd.zzb.BETWEEN;
            if (F == zzbVar) {
                if (!zzdVar.Q() || !zzdVar.P()) {
                    return null;
                }
            } else if (!zzdVar.N()) {
                return null;
            }
            zzew.zzd.zzb F2 = zzdVar.F();
            if (zzdVar.F() == zzbVar) {
                if (zzmz.f0(zzdVar.K()) && zzmz.f0(zzdVar.J())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(zzdVar.K());
                        bigDecimal4 = new BigDecimal(zzdVar.J());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            } else if (!zzmz.f0(zzdVar.I())) {
                return null;
            } else {
                try {
                    bigDecimal2 = new BigDecimal(zzdVar.I());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
            }
            if (F2 == zzbVar) {
                if (bigDecimal3 == null) {
                    return null;
                }
            }
            int i = zzw.b[F2.ordinal()];
            boolean z = false;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4 || bigDecimal3 == null) {
                            return null;
                        }
                        if (bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    } else if (bigDecimal2 != null) {
                        if (d != 0.0d) {
                            if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0) {
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        }
                        if (bigDecimal.compareTo(bigDecimal2) == 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                } else if (bigDecimal2 != null) {
                    if (bigDecimal.compareTo(bigDecimal2) > 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            } else if (bigDecimal2 != null) {
                if (bigDecimal.compareTo(bigDecimal2) < 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    public abstract int a();

    public abstract boolean i();

    public abstract boolean j();
}
