package o;

import android.util.Pair;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public final class SK2 {
    public static final String a = "LicenseDurationRemaining";
    public static final String b = "PlaybackDurationRemaining";

    public static long a(Map<String, String> map, String str) {
        if (map != null) {
            try {
                String str2 = map.get(str);
                if (str2 != null) {
                    return Long.parseLong(str2);
                }
                return C10323vs.b;
            } catch (NumberFormatException unused) {
                return C10323vs.b;
            }
        }
        return C10323vs.b;
    }

    @InterfaceC11300zs1
    public static Pair<Long, Long> b(InterfaceC7201j70 interfaceC7201j70) {
        Map<String, String> g = interfaceC7201j70.g();
        if (g == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(g, a)), Long.valueOf(a(g, b)));
    }
}
