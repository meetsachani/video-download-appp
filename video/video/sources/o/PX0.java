package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public class PX0 {
    public void a(StringBuilder sb, String str, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(":");
        sb.append(f);
        sb.append(",\n");
    }

    public void b(StringBuilder sb, String str, int i) {
        if (i != Integer.MIN_VALUE) {
            sb.append(str);
            sb.append(":'");
            sb.append(i);
            sb.append("',\n");
        }
    }

    public void c(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(str);
            sb.append(":'");
            sb.append(str2);
            sb.append("',\n");
        }
    }

    public void d(StringBuilder sb, String str, float[] fArr) {
        if (fArr != null) {
            sb.append(str);
            sb.append("percentWidth:");
            sb.append(Arrays.toString(fArr));
            sb.append(",\n");
        }
    }

    public void e(StringBuilder sb, String str, String[] strArr) {
        if (strArr != null) {
            sb.append(str);
            sb.append(":");
            sb.append(f(strArr));
            sb.append(",\n");
        }
    }

    public String f(String[] strArr) {
        String str;
        StringBuilder sb = new StringBuilder(C6566gU0.f);
        for (int i = 0; i < strArr.length; i++) {
            if (i == 0) {
                str = "'";
            } else {
                str = ",'";
            }
            sb.append(str);
            sb.append(strArr[i]);
            sb.append("'");
        }
        sb.append(C6566gU0.g);
        return sb.toString();
    }
}
