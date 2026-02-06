package o;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.vd2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10266vd2 {
    public static final String f = "StreamConfigurationMapCompat";
    public final a a;
    public final C5694cx1 b;
    public final Map<Integer, Size[]> c = new HashMap();
    public final Map<Integer, Size[]> d = new HashMap();
    public final Map<Class<?>, Size[]> e = new HashMap();

    /* renamed from: o.vd2$a */
    /* loaded from: classes.dex */
    public interface a {
        Size[] a(int i);

        <T> Size[] b(Class<T> cls);

        Size[] c(int i);

        StreamConfigurationMap e();
    }

    public C10266vd2(StreamConfigurationMap streamConfigurationMap, C5694cx1 c5694cx1) {
        this.a = new C10512wd2(streamConfigurationMap);
        this.b = c5694cx1;
    }

    public static C10266vd2 e(StreamConfigurationMap streamConfigurationMap, C5694cx1 c5694cx1) {
        return new C10266vd2(streamConfigurationMap, c5694cx1);
    }

    public Size[] a(int i) {
        if (this.d.containsKey(Integer.valueOf(i))) {
            if (this.d.get(Integer.valueOf(i)) == null) {
                return null;
            }
            return (Size[]) this.d.get(Integer.valueOf(i)).clone();
        }
        Size[] c = this.a.c(i);
        if (c != null && c.length > 0) {
            c = this.b.c(c, i);
        }
        this.d.put(Integer.valueOf(i), c);
        if (c == null) {
            return null;
        }
        return (Size[]) c.clone();
    }

    public Size[] b(int i) {
        if (this.c.containsKey(Integer.valueOf(i))) {
            if (this.c.get(Integer.valueOf(i)) == null) {
                return null;
            }
            return (Size[]) this.c.get(Integer.valueOf(i)).clone();
        }
        Size[] a2 = this.a.a(i);
        if (a2 != null && a2.length != 0) {
            Size[] c = this.b.c(a2, i);
            this.c.put(Integer.valueOf(i), c);
            return (Size[]) c.clone();
        }
        C7433k41.p(f, "Retrieved output sizes array is null or empty for format " + i);
        return a2;
    }

    public <T> Size[] c(Class<T> cls) {
        if (this.e.containsKey(cls)) {
            if (this.e.get(cls) == null) {
                return null;
            }
            return (Size[]) this.e.get(cls).clone();
        }
        Size[] b = this.a.b(cls);
        if (b != null && b.length != 0) {
            Size[] d = this.b.d(b, cls);
            this.e.put(cls, d);
            return (Size[]) d.clone();
        }
        C7433k41.p(f, "Retrieved output sizes array is null or empty for class " + cls);
        return b;
    }

    public StreamConfigurationMap d() {
        return this.a.e();
    }
}
