package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Map;
import o.C3599Ly1;

/* loaded from: classes3.dex */
public final class zzih {
    public static final zzih c = new zzih(null, null, 100);
    public final EnumMap<zza, Boolean> a;
    public final int b;

    /* loaded from: classes3.dex */
    public enum zza {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");
        
        public final String X;

        zza(String str) {
            this.X = str;
        }
    }

    public zzih(EnumMap<zza, Boolean> enumMap, int i) {
        EnumMap<zza, Boolean> enumMap2 = new EnumMap<>(zza.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }

    public static char a(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        if (bool.booleanValue()) {
            return '1';
        }
        return C3599Ly1.j;
    }

    public static zzih c(Bundle bundle, int i) {
        zza[] zzaVarArr;
        if (bundle == null) {
            return new zzih(null, null, i);
        }
        EnumMap enumMap = new EnumMap(zza.class);
        zzaVarArr = zzig.STORAGE.X;
        for (zza zzaVar : zzaVarArr) {
            enumMap.put((EnumMap) zzaVar, (zza) q(bundle.getString(zzaVar.X)));
        }
        return new zzih(enumMap, i);
    }

    public static zzih e(String str) {
        return f(str, 100);
    }

    public static zzih f(String str, int i) {
        EnumMap enumMap = new EnumMap(zza.class);
        if (str != null) {
            zza[] e = zzig.STORAGE.e();
            for (int i2 = 0; i2 < e.length; i2++) {
                zza zzaVar = e[i2];
                int i3 = i2 + 2;
                if (i3 < str.length()) {
                    enumMap.put((EnumMap) zzaVar, (zza) g(str.charAt(i3)));
                }
            }
        }
        return new zzih(enumMap, i);
    }

    public static Boolean g(char c2) {
        if (c2 != '0') {
            if (c2 != '1') {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static String h(int i) {
        if (i != -20) {
            if (i != -10) {
                if (i != 0) {
                    if (i != 30) {
                        if (i != 90) {
                            if (i != 100) {
                                return "OTHER";
                            }
                            return "UNKNOWN";
                        }
                        return "REMOTE_CONFIG";
                    }
                    return "1P_INIT";
                }
                return "1P_API";
            }
            return "MANIFEST";
        }
        return "API";
    }

    public static String i(Bundle bundle) {
        zza[] zzaVarArr;
        String string;
        zzaVarArr = zzig.STORAGE.X;
        for (zza zzaVar : zzaVarArr) {
            if (bundle.containsKey(zzaVar.X) && (string = bundle.getString(zzaVar.X)) != null && q(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static String j(boolean z) {
        if (z) {
            return "granted";
        }
        return "denied";
    }

    public static boolean k(int i, int i2) {
        return i <= i2;
    }

    public static int n(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        if (bool.booleanValue()) {
            return 1;
        }
        return 2;
    }

    public static Boolean q(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (!str.equals("denied")) {
            return null;
        }
        return Boolean.FALSE;
    }

    public final int b() {
        return this.b;
    }

    public final zzih d(zzih zzihVar) {
        zza[] zzaVarArr;
        boolean z;
        EnumMap enumMap = new EnumMap(zza.class);
        zzaVarArr = zzig.STORAGE.X;
        for (zza zzaVar : zzaVarArr) {
            Boolean bool = this.a.get(zzaVar);
            Boolean bool2 = zzihVar.a.get(zzaVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                if (bool.booleanValue() && bool2.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
            enumMap.put((EnumMap) zzaVar, (zza) bool);
        }
        return new zzih(enumMap, 100);
    }

    public final boolean equals(Object obj) {
        zza[] zzaVarArr;
        if (!(obj instanceof zzih)) {
            return false;
        }
        zzih zzihVar = (zzih) obj;
        zzaVarArr = zzig.STORAGE.X;
        for (zza zzaVar : zzaVarArr) {
            if (n(this.a.get(zzaVar)) != n(zzihVar.a.get(zzaVar))) {
                return false;
            }
        }
        if (this.b != zzihVar.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.b * 17;
        for (Boolean bool : this.a.values()) {
            i = (i * 31) + n(bool);
        }
        return i;
    }

    public final boolean l(zza zzaVar) {
        Boolean bool = this.a.get(zzaVar);
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean m(zzih zzihVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            if (!zzihVar.l(zzaVar) && l(zzaVar)) {
                return true;
            }
        }
        return false;
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        for (Map.Entry<zza, Boolean> entry : this.a.entrySet()) {
            Boolean value = entry.getValue();
            if (value != null) {
                bundle.putString(entry.getKey().X, j(value.booleanValue()));
            }
        }
        return bundle;
    }

    public final zzih p(zzih zzihVar) {
        zza[] zzaVarArr;
        EnumMap enumMap = new EnumMap(zza.class);
        zzaVarArr = zzig.STORAGE.X;
        for (zza zzaVar : zzaVarArr) {
            Boolean bool = this.a.get(zzaVar);
            if (bool == null) {
                bool = zzihVar.a.get(zzaVar);
            }
            enumMap.put((EnumMap) zzaVar, (zza) bool);
        }
        return new zzih(enumMap, this.b);
    }

    public final boolean r(zzih zzihVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            Boolean bool = this.a.get(zzaVar);
            Boolean bool2 = zzihVar.a.get(zzaVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final Boolean s() {
        return this.a.get(zza.AD_STORAGE);
    }

    public final boolean t(zzih zzihVar) {
        return r(zzihVar, (zza[]) this.a.keySet().toArray(new zza[0]));
    }

    public final String toString() {
        zza[] zzaVarArr;
        String str;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(h(this.b));
        zzaVarArr = zzig.STORAGE.X;
        for (zza zzaVar : zzaVarArr) {
            sb.append(",");
            sb.append(zzaVar.X);
            sb.append("=");
            Boolean bool = this.a.get(zzaVar);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                if (bool.booleanValue()) {
                    str = "granted";
                } else {
                    str = "denied";
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public final Boolean u() {
        return this.a.get(zza.ANALYTICS_STORAGE);
    }

    public final String v() {
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzig.STORAGE.e()) {
            sb.append(a(this.a.get(zzaVar)));
        }
        return sb.toString();
    }

    public final String w() {
        char c2;
        StringBuilder sb = new StringBuilder("G2");
        for (zza zzaVar : zzig.STORAGE.e()) {
            Boolean bool = this.a.get(zzaVar);
            if (bool == null) {
                c2 = 'g';
            } else if (bool.booleanValue()) {
                c2 = 'G';
            } else {
                c2 = 'D';
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final boolean x() {
        return l(zza.AD_STORAGE);
    }

    public final boolean y() {
        return l(zza.ANALYTICS_STORAGE);
    }

    public final boolean z() {
        for (Boolean bool : this.a.values()) {
            if (bool != null) {
                return true;
            }
        }
        return false;
    }

    public zzih(Boolean bool, Boolean bool2, int i) {
        EnumMap<zza, Boolean> enumMap = new EnumMap<>(zza.class);
        this.a = enumMap;
        enumMap.put((EnumMap<zza, Boolean>) zza.AD_STORAGE, (zza) bool);
        enumMap.put((EnumMap<zza, Boolean>) zza.ANALYTICS_STORAGE, (zza) bool2);
        this.b = i;
    }
}
