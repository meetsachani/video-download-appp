package o;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class O82 implements InterfaceC5492c71 {
    public static final int d = 8;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;
    public static final Bitmap.Config[] i;
    public final c a = new c();
    public final TE0<b, Bitmap> b = new TE0<>();
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> c = new HashMap();

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends AbstractC7597kl<b> {
        @Override // o.AbstractC7597kl
        /* renamed from: d */
        public b a() {
            return new b(this);
        }

        public b e(int i, Bitmap.Config config) {
            b b = b();
            b.b(i, config);
            return b;
        }
    }

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            config = Bitmap.Config.RGBA_F16;
            configArr[configArr.length - 1] = config;
        }
        e = configArr;
        f = configArr;
        g = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        h = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        i = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String h(int i2, Bitmap.Config config) {
        return C6566gU0.f + i2 + "](" + config + C9811tl1.d;
    }

    public static Bitmap.Config[] i(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                return f;
            }
        }
        int i2 = a.a[config.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return new Bitmap.Config[]{config};
                    }
                    return i;
                }
                return h;
            }
            return g;
        }
        return e;
    }

    @Override // o.InterfaceC5492c71
    public String a(Bitmap bitmap) {
        return h(SD2.i(bitmap), bitmap.getConfig());
    }

    @Override // o.InterfaceC5492c71
    public String b(int i2, int i3, Bitmap.Config config) {
        return h(SD2.h(i2, i3, config), config);
    }

    @Override // o.InterfaceC5492c71
    public int c(Bitmap bitmap) {
        return SD2.i(bitmap);
    }

    @Override // o.InterfaceC5492c71
    public void d(Bitmap bitmap) {
        b e2 = this.a.e(SD2.i(bitmap), bitmap.getConfig());
        this.b.d(e2, bitmap);
        NavigableMap<Integer, Integer> j = j(bitmap.getConfig());
        Integer num = j.get(Integer.valueOf(e2.b));
        Integer valueOf = Integer.valueOf(e2.b);
        int i2 = 1;
        if (num != null) {
            i2 = 1 + num.intValue();
        }
        j.put(valueOf, Integer.valueOf(i2));
    }

    public final void e(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> j = j(bitmap.getConfig());
        Integer num2 = j.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                j.remove(num);
                return;
            } else {
                j.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + a(bitmap) + ", this: " + this);
    }

    @Override // o.InterfaceC5492c71
    public Bitmap f(int i2, int i3, Bitmap.Config config) {
        b g2 = g(SD2.h(i2, i3, config), config);
        Bitmap a2 = this.b.a(g2);
        if (a2 != null) {
            e(Integer.valueOf(g2.b), a2);
            a2.reconfigure(i2, i3, config);
        }
        return a2;
    }

    public final b g(int i2, Bitmap.Config config) {
        b e2 = this.a.e(i2, config);
        Bitmap.Config[] i3 = i(config);
        int length = i3.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = i3[i4];
            Integer ceilingKey = j(config2).ceilingKey(Integer.valueOf(i2));
            if (ceilingKey != null && ceilingKey.intValue() <= i2 * 8) {
                if (ceilingKey.intValue() != i2 || (config2 != null ? !config2.equals(config) : config != null)) {
                    this.a.c(e2);
                    return this.a.e(ceilingKey.intValue(), config2);
                }
            } else {
                i4++;
            }
        }
        return e2;
    }

    public final NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.c.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // o.InterfaceC5492c71
    public Bitmap removeLast() {
        Bitmap f2 = this.b.f();
        if (f2 != null) {
            e(Integer.valueOf(SD2.i(f2)), f2);
        }
        return f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.b);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    /* loaded from: classes.dex */
    public static final class b implements InterfaceC11146zE1 {
        public final c a;
        public int b;
        public Bitmap.Config c;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // o.InterfaceC11146zE1
        public void a() {
            this.a.c(this);
        }

        public void b(int i, Bitmap.Config config) {
            this.b = i;
            this.c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.b == bVar.b && SD2.e(this.c, bVar.c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = this.b * 31;
            Bitmap.Config config = this.c;
            if (config != null) {
                i = config.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return O82.h(this.b, this.c);
        }

        public b(c cVar, int i, Bitmap.Config config) {
            this(cVar);
            b(i, config);
        }
    }
}
