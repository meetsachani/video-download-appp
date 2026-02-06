package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;
import o.C10015ub2;
import o.C10504wb2;
import o.InterfaceC11300zs1;
import o.JF;

/* loaded from: classes2.dex */
final class zzale {
    public final String a;
    public final int b;
    @InterfaceC11300zs1
    @JF
    public final Integer c;
    @InterfaceC11300zs1
    @JF
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public zzale(String str, int i, @InterfaceC11300zs1 @JF Integer num, @InterfaceC11300zs1 @JF Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = f;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i2;
    }

    @InterfaceC11300zs1
    public static zzale b(String str, zzalc zzalcVar) {
        zzale zzaleVar;
        int i;
        Integer num;
        Integer num2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int parseInt;
        zzdc.d(str.startsWith(C10015ub2.w));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i3 = zzalcVar.k;
        if (length != i3) {
            String str2 = zzeu.a;
            zzdx.f(C10504wb2.k, String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i3), Integer.valueOf(length), str));
            return null;
        }
        try {
            String trim = split[zzalcVar.a].trim();
            int i4 = zzalcVar.b;
            if (i4 != -1) {
                i = d(split[i4].trim());
            } else {
                i = -1;
            }
            int i5 = zzalcVar.c;
            if (i5 != -1) {
                num = c(split[i5].trim());
            } else {
                num = null;
            }
            int i6 = zzalcVar.d;
            if (i6 != -1) {
                num2 = c(split[i6].trim());
            } else {
                num2 = null;
            }
            int i7 = zzalcVar.e;
            float f = -3.4028235E38f;
            if (i7 != -1) {
                String trim2 = split[i7].trim();
                try {
                    f = Float.parseFloat(trim2);
                } catch (NumberFormatException e) {
                    StringBuilder sb = new StringBuilder();
                    zzaleVar = null;
                    try {
                        sb.append("Failed to parse font size: '");
                        sb.append(trim2);
                        sb.append("'");
                        zzdx.g(C10504wb2.k, sb.toString(), e);
                    } catch (RuntimeException e2) {
                        e = e2;
                        zzdx.g(C10504wb2.k, "Skipping malformed 'Style:' line: '" + str + "'", e);
                        return zzaleVar;
                    }
                }
            }
            zzaleVar = null;
            int i8 = zzalcVar.f;
            boolean z5 = false;
            if (i8 != -1 && e(split[i8].trim())) {
                z = false;
                z5 = true;
            } else {
                z = false;
            }
            int i9 = zzalcVar.g;
            if (i9 != -1 && e(split[i9].trim())) {
                z2 = true;
            } else {
                z2 = z;
            }
            int i10 = zzalcVar.h;
            if (i10 != -1 && e(split[i10].trim())) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i11 = zzalcVar.i;
            if (i11 != -1 && e(split[i11].trim())) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i12 = zzalcVar.j;
            if (i12 != -1) {
                String trim3 = split[i12].trim();
                try {
                    parseInt = Integer.parseInt(trim3.trim());
                } catch (NumberFormatException unused) {
                }
                if (parseInt == 1 || parseInt == 3) {
                    i2 = parseInt;
                    return new zzale(trim, i, num, num2, f, z5, z2, z3, z4, i2);
                }
                zzdx.f(C10504wb2.k, "Ignoring unknown BorderStyle: ".concat(String.valueOf(trim3)));
            }
            i2 = -1;
            return new zzale(trim, i, num, num2, f, z5, z2, z3, z4, i2);
        } catch (RuntimeException e3) {
            e = e3;
            zzaleVar = null;
        }
    }

    @InterfaceC11300zs1
    @JF
    public static Integer c(String str) {
        long parseLong;
        boolean z;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z = true;
            } else {
                z = false;
            }
            zzdc.d(z);
            int b = zzgbf.b(((parseLong >> 24) & 255) ^ 255);
            int b2 = zzgbf.b((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(b, zzgbf.b(parseLong & 255), zzgbf.b((parseLong >> 8) & 255), b2));
        } catch (IllegalArgumentException e) {
            zzdx.g(C10504wb2.k, "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    public static int d(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        zzdx.f(C10504wb2.k, "Ignoring unknown alignment: ".concat(String.valueOf(str)));
        return -1;
    }

    public static boolean e(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            zzdx.g(C10504wb2.k, "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
