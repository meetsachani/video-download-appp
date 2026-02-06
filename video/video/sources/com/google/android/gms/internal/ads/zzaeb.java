package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.BC0;

/* loaded from: classes2.dex */
public final class zzaeb {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a() {
        return (this.a == -1 || this.b == -1) ? false : true;
    }

    public final boolean b(zzav zzavVar) {
        for (int i = 0; i < zzavVar.a(); i++) {
            zzau b = zzavVar.b(i);
            if (b instanceof zzags) {
                zzags zzagsVar = (zzags) b;
                if (BC0.d.equals(zzagsVar.c) && c(zzagsVar.d)) {
                    return true;
                }
            } else if (b instanceof zzagz) {
                zzagz zzagzVar = (zzagz) b;
                if (BC0.c.equals(zzagzVar.b) && BC0.d.equals(zzagzVar.c) && c(zzagzVar.d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final boolean c(String str) {
        Matcher matcher = c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                String str2 = zzeu.a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.a = parseInt;
                    this.b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }
}
