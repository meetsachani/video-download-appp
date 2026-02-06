package o;

import java.util.Map;
import o.O71;

/* loaded from: classes.dex */
public class S71 implements R71 {
    public static <K, V> int i(int i, Object obj, Object obj2) {
        Q71 q71 = (Q71) obj;
        O71 o71 = (O71) obj2;
        int i2 = 0;
        if (q71.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : q71.entrySet()) {
            i2 += o71.a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    public static <K, V> Q71<K, V> j(Object obj, Object obj2) {
        Q71<K, V> q71 = (Q71) obj;
        Q71<K, V> q712 = (Q71) obj2;
        if (!q712.isEmpty()) {
            if (!q71.l()) {
                q71 = q71.o();
            }
            q71.n(q712);
        }
        return q71;
    }

    @Override // o.R71
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // o.R71
    public O71.b<?, ?> b(Object obj) {
        return ((O71) obj).d();
    }

    @Override // o.R71
    public Map<?, ?> c(Object obj) {
        return (Q71) obj;
    }

    @Override // o.R71
    public Object d(Object obj) {
        return Q71.g().o();
    }

    @Override // o.R71
    public Map<?, ?> e(Object obj) {
        return (Q71) obj;
    }

    @Override // o.R71
    public Object f(Object obj) {
        ((Q71) obj).m();
        return obj;
    }

    @Override // o.R71
    public int g(int i, Object obj, Object obj2) {
        return i(i, obj, obj2);
    }

    @Override // o.R71
    public boolean h(Object obj) {
        return !((Q71) obj).l();
    }
}
