package o;

import java.util.HashSet;
import java.util.Set;

/* renamed from: o.vz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10354vz {
    public static String a(String str, boolean z, char... cArr) {
        if (C4500Ve2.I0(str)) {
            return str;
        }
        String lowerCase = str.toLowerCase();
        int length = lowerCase.length();
        int[] iArr = new int[length];
        Set<Integer> b = b(cArr);
        boolean z2 = z;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int codePointAt = lowerCase.codePointAt(i);
            if (b.contains(Integer.valueOf(codePointAt))) {
                if (i2 != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i += Character.charCount(codePointAt);
            } else if (!z2 && (i2 != 0 || !z)) {
                iArr[i2] = codePointAt;
                i += Character.charCount(codePointAt);
                i2++;
            } else {
                int titleCase = Character.toTitleCase(codePointAt);
                iArr[i2] = titleCase;
                i += Character.charCount(titleCase);
                z2 = false;
                i2++;
            }
        }
        return new String(iArr, 0, i2);
    }

    public static Set<Integer> b(char[] cArr) {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(Character.codePointAt(new char[]{' '}, 0)));
        if (!C4206Se.i1(cArr)) {
            for (int i = 0; i < cArr.length; i++) {
                hashSet.add(Integer.valueOf(Character.codePointAt(cArr, i)));
            }
        }
        return hashSet;
    }
}
