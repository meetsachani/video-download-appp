package o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
/* renamed from: o.hW1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6816hW1 {
    public static final C6816hW1 c = new C6816hW1(0, C10323vs.b);
    public static final Pattern d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");
    public static final String e = "npt=%.3f-";
    public static final long f = 0;
    public final long a;
    public final long b;

    public C6816hW1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static String b(long j) {
        return TD2.M(e, Double.valueOf(j / 1000.0d));
    }

    public static C6816hW1 d(String str) throws C3989Py1 {
        boolean z;
        long parseFloat;
        long parseFloat2;
        Matcher matcher = d.matcher(str);
        com.google.android.exoplayer2.source.rtsp.h.a(matcher.matches(), str);
        boolean z2 = true;
        String group = matcher.group(1);
        if (group != null) {
            z = true;
        } else {
            z = false;
        }
        com.google.android.exoplayer2.source.rtsp.h.a(z, str);
        if (((String) TD2.o(group)).equals("now")) {
            parseFloat = 0;
        } else {
            parseFloat = Float.parseFloat(group) * 1000.0f;
        }
        String group2 = matcher.group(2);
        if (group2 != null) {
            try {
                parseFloat2 = Float.parseFloat(group2) * 1000.0f;
                if (parseFloat2 < parseFloat) {
                    z2 = false;
                }
                com.google.android.exoplayer2.source.rtsp.h.a(z2, str);
            } catch (NumberFormatException e2) {
                throw C3989Py1.c(group2, e2);
            }
        } else {
            parseFloat2 = C10323vs.b;
        }
        return new C6816hW1(parseFloat, parseFloat2);
    }

    public long a() {
        return this.b - this.a;
    }

    public boolean c() {
        if (this.b == C10323vs.b) {
            return true;
        }
        return false;
    }
}
