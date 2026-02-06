package o;

import android.os.Build;
import java.util.Collections;
import java.util.Set;

/* renamed from: o.Da0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2712Da0 {

    /* renamed from: o.Da0$a */
    /* loaded from: classes.dex */
    public static class a {
        public static Set<int[]> a() {
            return b.a();
        }
    }

    /* renamed from: o.Da0$b */
    /* loaded from: classes.dex */
    public static class b {
        public static Set<int[]> a() {
            try {
                Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
                if (invoke == null) {
                    return Collections.EMPTY_SET;
                }
                Set<int[]> set = (Set) invoke;
                for (int[] iArr : set) {
                    if (!(iArr instanceof int[])) {
                        return Collections.EMPTY_SET;
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.EMPTY_SET;
            }
        }
    }

    public static Set<int[]> a() {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a();
        }
        return b.a();
    }
}
