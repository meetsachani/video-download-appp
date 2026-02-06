package o;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import java.util.Map;

@ES1(api = 30)
/* loaded from: classes3.dex */
public final class BT1 {
    public static boolean a(Context context, Map<Integer, Integer> map) {
        ResourcesLoader a = C7983mG.a(context, map);
        if (a != null) {
            context.getResources().addLoaders(a);
            return true;
        }
        return false;
    }

    public static boolean b(int i) {
        if (28 <= i && i <= 31) {
            return true;
        }
        return false;
    }
}
