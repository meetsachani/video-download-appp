package o;

import java.security.PrivilegedAction;

/* loaded from: classes4.dex */
public final class P31 implements PrivilegedAction {
    public final /* synthetic */ String a;
    public final /* synthetic */ ClassLoader b;

    public P31(String str, ClassLoader classLoader) {
        this.a = str;
        this.b = classLoader;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return U31.d(this.a, this.b);
    }
}
