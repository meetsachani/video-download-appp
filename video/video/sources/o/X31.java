package o;

import java.security.PrivilegedAction;

/* loaded from: classes4.dex */
public class X31 implements PrivilegedAction {
    public final /* synthetic */ ClassLoader a;
    public final /* synthetic */ Y31 b;

    public X31(Y31 y31, ClassLoader classLoader) {
        this.b = y31;
        this.a = classLoader;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return this.a.getParent();
    }
}
