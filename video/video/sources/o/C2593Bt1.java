package o;

import java.util.Arrays;

@InterfaceC10420wF0
@InterfaceC8301na0
/* renamed from: o.Bt1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2593Bt1 extends AbstractC3836Oj0 {
    public static boolean a(@MB Object obj, @MB Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static int b(@MB Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
