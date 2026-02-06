package o;

import android.content.Context;
import android.os.Build;
import java.util.Map;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.nG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC8226nG {
    @InterfaceC11300zs1
    static InterfaceC8226nG a() {
        int i = Build.VERSION.SDK_INT;
        if (30 <= i && i <= 33) {
            return C11206zT1.a();
        }
        if (i >= 34) {
            return C11206zT1.a();
        }
        return null;
    }

    @InterfaceC5670cr1
    Context b(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Map<Integer, Integer> map);

    boolean c(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Map<Integer, Integer> map);
}
