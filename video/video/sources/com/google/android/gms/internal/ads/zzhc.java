package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C6566gU0;
import o.HI0;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzhc {
    public static final Pattern a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    public static final Pattern b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long a(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2) {
        long j = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                zzdx.c(HI0.a, "Unexpected Content-Length [" + str + C6566gU0.g);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            Matcher matcher = a.matcher(str2);
            if (matcher.matches()) {
                try {
                    String group = matcher.group(2);
                    if (group != null) {
                        long parseLong = Long.parseLong(group);
                        String group2 = matcher.group(1);
                        if (group2 != null) {
                            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                            long parseLong2 = (parseLong - Long.parseLong(group2)) + 1;
                            if (i < 0) {
                                return parseLong2;
                            }
                            if (j != parseLong2) {
                                zzdx.f(HI0.a, "Inconsistent headers [" + str + "] [" + str2 + C6566gU0.g);
                                return Math.max(j, parseLong2);
                            }
                            return j;
                        }
                        throw null;
                    }
                    throw null;
                } catch (NumberFormatException unused2) {
                    zzdx.c(HI0.a, "Unexpected Content-Range [" + str2 + C6566gU0.g);
                    return j;
                }
            }
            return j;
        }
        return j;
    }

    public static long b(@InterfaceC11300zs1 String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = b.matcher(str);
            if (matcher.matches()) {
                String group = matcher.group(1);
                group.getClass();
                return Long.parseLong(group);
            }
            return -1L;
        }
        return -1L;
    }
}
