package o;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.AbstractC4609Wh2;

/* renamed from: o.Nj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3738Nj0 implements InterfaceC10688xL1 {
    public static final Map<String, Range<Integer>> a;

    /* renamed from: o.Nj0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AbstractC4609Wh2.b.values().length];
            a = iArr;
            try {
                iArr[AbstractC4609Wh2.b.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AbstractC4609Wh2.b.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AbstractC4609Wh2.b.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("SM-T580", null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", null);
        hashMap.put("SM-G570M", null);
        hashMap.put("SM-G610F", null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    public static boolean e() {
        if (D71.b.equalsIgnoreCase(Build.BRAND)) {
            Map<String, Range<Integer>> map = a;
            String str = Build.MODEL;
            Locale locale = Locale.US;
            if (map.containsKey(str.toUpperCase(locale))) {
                Range<Integer> range = map.get(str.toUpperCase(locale));
                if (range == null) {
                    return true;
                }
                return range.contains((Range<Integer>) Integer.valueOf(Build.VERSION.SDK_INT));
            }
            return false;
        }
        return false;
    }

    public static boolean f() {
        return e();
    }

    public Size d(AbstractC4609Wh2.b bVar) {
        if (!e()) {
            return null;
        }
        int i = a.a[bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return new Size(3264, 1836);
            }
            return new Size(com.facebook.internal.q0.q1, 720);
        }
        return new Size(1920, FC.u);
    }
}
