package o;

import java.security.PrivilegedAction;

/* loaded from: classes4.dex */
public final class Q31 implements PrivilegedAction {
    public final /* synthetic */ ClassLoader a;
    public final /* synthetic */ String b;

    public Q31(ClassLoader classLoader, String str) {
        this.a = classLoader;
        this.b = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        ClassLoader classLoader = this.a;
        if (classLoader != null) {
            return classLoader.getResourceAsStream(this.b);
        }
        return ClassLoader.getSystemResourceAsStream(this.b);
    }
}
