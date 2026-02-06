package o;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* renamed from: o.Se2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4209Se2 {
    public static final String[] a = new String[0];

    public static void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static String b(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        if (size == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(Integer.toString(list.get(i).intValue()));
            if (i < size - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static StringBuilder c() {
        return new StringBuilder();
    }

    public static List<Integer> d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreElements()) {
            try {
                arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
            } catch (NumberFormatException e) {
                Log.e(UU1.a, "Malformed integer list", e);
            }
        }
        return arrayList;
    }
}
