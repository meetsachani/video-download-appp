package o;

import java.util.concurrent.Executor;
import o.C6396fr;
import o.C6794hQ1;

/* renamed from: o.oD1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8459oD1 {
    @InterfaceC10571ws1
    public static final Executor a;
    public static final C6794hQ1 b;
    public static final C6396fr c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (!property.equals("RoboVM")) {
            if (!property.equals("Dalvik")) {
                a = null;
                b = new C6794hQ1.b();
                c = new C6396fr.a();
                return;
            }
            a = new ExecutorC5256b9();
            b = new C6794hQ1.a();
            c = new C6396fr.a();
            return;
        }
        a = null;
        b = new C6794hQ1();
        c = new C6396fr();
    }
}
