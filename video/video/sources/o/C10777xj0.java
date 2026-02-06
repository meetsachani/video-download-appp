package o;

import java.util.HashMap;
import java.util.Map;

/* renamed from: o.xj0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10777xj0 {
    public static final Object a = new Object();
    public static final Map<Object, InterfaceC8875pw> b = new HashMap();

    public static void a(Object obj, InterfaceC8875pw interfaceC8875pw) {
        synchronized (a) {
            b.put(obj, interfaceC8875pw);
        }
    }

    public static void b() {
        synchronized (a) {
            b.clear();
        }
    }

    public static InterfaceC8875pw c(Object obj) {
        InterfaceC8875pw interfaceC8875pw;
        synchronized (a) {
            interfaceC8875pw = b.get(obj);
        }
        if (interfaceC8875pw == null) {
            return InterfaceC8875pw.a;
        }
        return interfaceC8875pw;
    }
}
