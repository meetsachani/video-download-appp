package o;

import android.util.SparseArray;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class DH1 {
    public static SparseArray<EnumC10429wH1> a = new SparseArray<>();
    public static HashMap<EnumC10429wH1, Integer> b;

    static {
        HashMap<EnumC10429wH1, Integer> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put(EnumC10429wH1.DEFAULT, 0);
        b.put(EnumC10429wH1.VERY_LOW, 1);
        b.put(EnumC10429wH1.HIGHEST, 2);
        for (EnumC10429wH1 enumC10429wH1 : b.keySet()) {
            a.append(b.get(enumC10429wH1).intValue(), enumC10429wH1);
        }
    }

    public static int a(@InterfaceC5670cr1 EnumC10429wH1 enumC10429wH1) {
        Integer num = b.get(enumC10429wH1);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC10429wH1);
    }

    @InterfaceC5670cr1
    public static EnumC10429wH1 b(int i) {
        EnumC10429wH1 enumC10429wH1 = a.get(i);
        if (enumC10429wH1 != null) {
            return enumC10429wH1;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
