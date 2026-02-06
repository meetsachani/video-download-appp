package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C10504wb2;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzald {
    public static final Pattern c = Pattern.compile("\\{([^}]*)\\}");
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public final int a;
    @InterfaceC11300zs1
    public final PointF b;

    static {
        Object[] objArr = {C10504wb2.b.e};
        String str = zzeu.a;
        Locale locale = Locale.US;
        d = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", objArr));
        e = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", C10504wb2.b.e));
        f = Pattern.compile("\\\\an(\\d+)");
    }

    public zzald(int i, @InterfaceC11300zs1 PointF pointF) {
        this.a = i;
        this.b = pointF;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[Catch: RuntimeException -> 0x000a, TryCatch #1 {RuntimeException -> 0x000a, blocks: (B:23:0x0082, B:25:0x008e, B:27:0x0094, B:28:0x0099), top: B:37:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x000a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzald a(String str) {
        Matcher matcher;
        int i;
        Matcher matcher2;
        Matcher matcher3;
        boolean find;
        boolean find2;
        PointF pointF;
        String str2;
        String str3;
        Matcher matcher4 = c.matcher(str);
        PointF pointF2 = null;
        int i2 = -1;
        while (matcher4.find()) {
            String group = matcher4.group(1);
            group.getClass();
            try {
                matcher2 = d.matcher(group);
                matcher3 = e.matcher(group);
                find = matcher2.find();
                find2 = matcher3.find();
            } catch (RuntimeException unused) {
            }
            if (find) {
                if (find2) {
                    zzdx.e(C10504wb2.b.c, "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + group + "'");
                }
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            } else if (find2) {
                String group2 = matcher3.group(1);
                String group3 = matcher3.group(2);
                str2 = group2;
                str3 = group3;
            } else {
                pointF = null;
                if (pointF != null) {
                    pointF2 = pointF;
                }
                try {
                    matcher = f.matcher(group);
                    if (!matcher.find()) {
                        String group4 = matcher.group(1);
                        if (group4 != null) {
                            i = zzale.d(group4);
                        } else {
                            throw null;
                            break;
                        }
                    } else {
                        i = -1;
                    }
                    if (i == -1) {
                        i2 = i;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            if (str2 != null) {
                float parseFloat = Float.parseFloat(str2.trim());
                if (str3 != null) {
                    pointF = new PointF(parseFloat, Float.parseFloat(str3.trim()));
                    if (pointF != null) {
                    }
                    matcher = f.matcher(group);
                    if (!matcher.find()) {
                    }
                    if (i == -1) {
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        return new zzald(i2, pointF2);
    }

    public static String b(String str) {
        return c.matcher(str).replaceAll("");
    }
}
