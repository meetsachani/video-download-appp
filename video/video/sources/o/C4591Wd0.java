package o;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.StringTokenizer;

/* renamed from: o.Wd0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4591Wd0 {
    public static <T> T a(Enumeration<T> enumeration, int i) {
        C6748hF.g(i);
        while (enumeration.hasMoreElements()) {
            i--;
            if (i == -1) {
                return enumeration.nextElement();
            }
            enumeration.nextElement();
        }
        throw new IndexOutOfBoundsException("Entry does not exist: " + i);
    }

    public static <E> List<E> b(Enumeration<? extends E> enumeration) {
        return C6566gU0.e0(new C4397Ud0(enumeration));
    }

    public static List<String> c(StringTokenizer stringTokenizer) {
        ArrayList arrayList = new ArrayList(stringTokenizer.countTokens());
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        return arrayList;
    }
}
