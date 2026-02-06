package o;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.tK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9707tK extends AbstractC9882u3 {
    public static final char d = '.';
    public static final ConcurrentHashMap<String, String> c = new ConcurrentHashMap<>();
    public static final C9707tK e = new C9707tK();

    public static void g() {
        c.clear();
    }

    public Class<?> h(String str) throws ClassNotFoundException {
        return C8457oD.q(str);
    }

    public Object i(String str, String str2) throws ReflectiveOperationException {
        Class<?> h = h(str);
        if (h == null) {
            return null;
        }
        return h.getField(str2).get(null);
    }

    @Override // o.InterfaceC10759xe2
    public synchronized String lookup(String str) {
        if (str == null) {
            return null;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = c;
        String str2 = concurrentHashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return null;
        }
        try {
            Object i = i(str.substring(0, lastIndexOf), str.substring(lastIndexOf + 1));
            if (i != null) {
                str2 = Objects.toString(i, null);
                concurrentHashMap.put(str, str2);
            }
            return str2;
        } catch (Exception unused) {
            return null;
        }
    }
}
