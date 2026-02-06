package o;

import java.util.Map;
import java.util.Set;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.jL1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7258jL1 {
    public static Map<Integer, Integer> a(int[] iArr, int i) {
        Set<Integer> keySet = new C8248nL1().a(iArr, i).a.keySet();
        int[] iArr2 = new int[keySet.size()];
        int i2 = 0;
        for (Integer num : keySet) {
            iArr2[i2] = num.intValue();
            i2++;
        }
        return C8005mL1.a(iArr, iArr2, i);
    }
}
