package o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C4224Si1;

@Deprecated
/* loaded from: classes2.dex */
public final class BC0 {
    public static final String c = "com.apple.iTunes";
    public static final String d = "iTunSMPB";
    public static final Pattern e = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public boolean a() {
        if (this.a != -1 && this.b != -1) {
            return true;
        }
        return false;
    }

    public final boolean b(String str) {
        Matcher matcher = e.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt((String) TD2.o(matcher.group(1)), 16);
                int parseInt2 = Integer.parseInt((String) TD2.o(matcher.group(2)), 16);
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

    public boolean c(C4224Si1 c4224Si1) {
        for (int i = 0; i < c4224Si1.e(); i++) {
            C4224Si1.b d2 = c4224Si1.d(i);
            if (d2 instanceof KG) {
                KG kg = (KG) d2;
                if (d.equals(kg.Z) && b(kg.Y0)) {
                    return true;
                }
            } else if (d2 instanceof C11201zS0) {
                C11201zS0 c11201zS0 = (C11201zS0) d2;
                if (c.equals(c11201zS0.Y) && d.equals(c11201zS0.Z) && b(c11201zS0.Y0)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.a = i2;
        this.b = i3;
        return true;
    }
}
