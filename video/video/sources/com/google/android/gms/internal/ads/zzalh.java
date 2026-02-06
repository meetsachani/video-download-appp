package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;
import o.C5445bv2;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzalh {
    public static final Pattern d = Pattern.compile("\\s+");
    public static final zzfyh e = zzfyh.H("auto", "none");
    public static final zzfyh f = zzfyh.J(C5445bv2.x0, C5445bv2.y0, C5445bv2.z0);
    public static final zzfyh g = zzfyh.H(C5445bv2.A0, "open");
    public static final zzfyh h = zzfyh.J(C5445bv2.d0, C5445bv2.c0, C5445bv2.e0);
    public final int a;
    public final int b;
    public final int c;

    public zzalh(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @InterfaceC11300zs1
    public static zzalh a(@InterfaceC11300zs1 String str) {
        boolean z;
        int i;
        int i2;
        if (str != null) {
            String a = zzfui.a(str.trim());
            if (!a.isEmpty()) {
                zzfyh D = zzfyh.D(TextUtils.split(a, d));
                String str2 = (String) zzfyi.a(zzgae.b(h, D), C5445bv2.e0);
                int hashCode = str2.hashCode();
                int i3 = -1;
                int i4 = 0;
                if (hashCode != -1106037339) {
                    if (hashCode == 92734940 && str2.equals(C5445bv2.d0)) {
                        z = false;
                    }
                    z = true;
                } else {
                    if (str2.equals(C5445bv2.e0)) {
                        z = true;
                    }
                    z = true;
                }
                if (z) {
                    if (!z) {
                        i = 1;
                    } else {
                        i = -2;
                    }
                } else {
                    i = 2;
                }
                zzgac b = zzgae.b(e, D);
                if (!b.isEmpty()) {
                    String str3 = (String) b.iterator().next();
                    if (str3.hashCode() == 3387192 && str3.equals("none")) {
                        i3 = 0;
                    }
                } else {
                    zzgac b2 = zzgae.b(g, D);
                    zzgac b3 = zzgae.b(f, D);
                    if (!b2.isEmpty() || !b3.isEmpty()) {
                        String str4 = (String) zzfyi.a(b2, C5445bv2.A0);
                        if (str4.hashCode() == 3417674 && str4.equals("open")) {
                            i2 = 2;
                        } else {
                            i2 = 1;
                        }
                        String str5 = (String) zzfyi.a(b3, C5445bv2.z0);
                        int hashCode2 = str5.hashCode();
                        if (hashCode2 != -905816648) {
                            if (hashCode2 == 99657 && str5.equals(C5445bv2.x0)) {
                                i3 = 0;
                            }
                        } else if (str5.equals(C5445bv2.y0)) {
                            i3 = 1;
                        }
                        if (i3 != 0) {
                            if (i3 != 1) {
                                i4 = i2;
                                i3 = 1;
                            } else {
                                i3 = 3;
                            }
                        } else {
                            i3 = 2;
                        }
                        i4 = i2;
                    }
                }
                return new zzalh(i3, i4, i);
            }
            return null;
        }
        return null;
    }
}
