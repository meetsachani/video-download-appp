package o;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;

@InterfaceC10420wF0
@InterfaceC6584ga0
/* renamed from: o.be  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5374be {
    public static final char[][] b = (char[][]) Array.newInstance(Character.TYPE, 0, 0);
    public final char[][] a;

    public C5374be(char[][] cArr) {
        this.a = cArr;
    }

    public static C5374be a(Map<Character, String> map) {
        return new C5374be(b(map));
    }

    @InterfaceC5299bJ2
    public static char[][] b(Map<Character, String> map) {
        C10664xF1.E(map);
        if (map.isEmpty()) {
            return b;
        }
        char[][] cArr = new char[((Character) Collections.max(map.keySet())).charValue() + 1];
        for (Character ch : map.keySet()) {
            cArr[ch.charValue()] = map.get(ch).toCharArray();
        }
        return cArr;
    }

    public char[][] c() {
        return this.a;
    }
}
