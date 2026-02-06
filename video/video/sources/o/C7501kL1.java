package o;

import java.util.LinkedHashMap;
import java.util.Map;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.kL1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7501kL1 implements InterfaceC7017iL1 {
    public Map<Integer, Integer> a;

    @Override // o.InterfaceC7017iL1
    public C7744lL1 a(int[] iArr, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i2));
            int i3 = 1;
            if (num != null) {
                i3 = 1 + num.intValue();
            }
            linkedHashMap.put(Integer.valueOf(i2), Integer.valueOf(i3));
        }
        this.a = linkedHashMap;
        return new C7744lL1(linkedHashMap);
    }

    public Map<Integer, Integer> b() {
        return this.a;
    }
}
