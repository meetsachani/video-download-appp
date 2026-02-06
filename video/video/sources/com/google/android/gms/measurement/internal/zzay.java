package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzih;
import java.util.EnumMap;
import java.util.Map;
import o.C3503Kz;

/* loaded from: classes3.dex */
public final class zzay {
    public static final zzay f = new zzay((Boolean) null, 100);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap<zzih.zza, Boolean> e;

    public zzay(Boolean bool, int i) {
        this(bool, i, (Boolean) null, (String) null);
    }

    public static zzay b(Bundle bundle, int i) {
        zzih.zza[] e;
        Boolean bool = null;
        if (bundle == null) {
            return new zzay((Boolean) null, i);
        }
        EnumMap enumMap = new EnumMap(zzih.zza.class);
        for (zzih.zza zzaVar : zzig.DMA.e()) {
            enumMap.put((EnumMap) zzaVar, (zzih.zza) zzih.q(bundle.getString(zzaVar.X)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new zzay(enumMap, i, bool, bundle.getString("cps_display_str"));
    }

    public static zzay c(String str) {
        if (str != null && str.length() > 0) {
            String[] split = str.split(":");
            int parseInt = Integer.parseInt(split[0]);
            EnumMap enumMap = new EnumMap(zzih.zza.class);
            zzih.zza[] e = zzig.DMA.e();
            int length = e.length;
            int i = 1;
            int i2 = 0;
            while (i2 < length) {
                enumMap.put((EnumMap) e[i2], (zzih.zza) zzih.g(split[i].charAt(0)));
                i2++;
                i++;
            }
            return new zzay(enumMap, parseInt);
        }
        return f;
    }

    public static Boolean d(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return zzih.q(bundle.getString("ad_personalization"));
    }

    public final int a() {
        return this.a;
    }

    public final Bundle e() {
        Bundle bundle = new Bundle();
        for (Map.Entry<zzih.zza, Boolean> entry : this.e.entrySet()) {
            Boolean value = entry.getValue();
            if (value != null) {
                bundle.putString(entry.getKey().X, zzih.j(value.booleanValue()));
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzay)) {
            return false;
        }
        zzay zzayVar = (zzay) obj;
        if (!this.b.equalsIgnoreCase(zzayVar.b) || !zzax.a(this.c, zzayVar.c)) {
            return false;
        }
        return zzax.a(this.d, zzayVar.d);
    }

    public final Boolean f() {
        return this.e.get(zzih.zza.AD_USER_DATA);
    }

    public final Boolean g() {
        return this.c;
    }

    public final String h() {
        return this.d;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        Boolean bool = this.c;
        if (bool == null) {
            i = 3;
        } else if (bool == Boolean.TRUE) {
            i = 7;
        } else {
            i = 13;
        }
        String str = this.d;
        if (str == null) {
            hashCode = 17;
        } else {
            hashCode = str.hashCode();
        }
        return this.b.hashCode() + (i * 29) + (hashCode * C3503Kz.a0);
    }

    public final String i() {
        return this.b;
    }

    public final boolean j() {
        for (Boolean bool : this.e.values()) {
            if (bool != null) {
                return true;
            }
        }
        return false;
    }

    public final String k() {
        zzih.zza[] e;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (zzih.zza zzaVar : zzig.DMA.e()) {
            sb.append(":");
            sb.append(zzih.a(this.e.get(zzaVar)));
        }
        return sb.toString();
    }

    public final String toString() {
        zzih.zza[] e;
        String str;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzih.h(this.a));
        for (zzih.zza zzaVar : zzig.DMA.e()) {
            sb.append(",");
            sb.append(zzaVar.X);
            sb.append("=");
            Boolean bool = this.e.get(zzaVar);
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
        if (this.c != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.c);
        }
        if (this.d != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.d);
        }
        return sb.toString();
    }

    public zzay(EnumMap<zzih.zza, Boolean> enumMap, int i) {
        this(enumMap, i, (Boolean) null, (String) null);
    }

    public zzay(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap<zzih.zza, Boolean> enumMap = new EnumMap<>(zzih.zza.class);
        this.e = enumMap;
        enumMap.put((EnumMap<zzih.zza, Boolean>) zzih.zza.AD_USER_DATA, (zzih.zza) bool);
        this.a = i;
        this.b = k();
        this.c = bool2;
        this.d = str;
    }

    public zzay(EnumMap<zzih.zza, Boolean> enumMap, int i, Boolean bool, String str) {
        EnumMap<zzih.zza, Boolean> enumMap2 = new EnumMap<>(zzih.zza.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = k();
        this.c = bool;
        this.d = str;
    }
}
