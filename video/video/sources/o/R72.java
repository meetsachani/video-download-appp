package o;

import java.security.PrivilegedAction;

/* loaded from: classes4.dex */
public final class R72 implements PrivilegedAction {
    public final /* synthetic */ String a;

    public R72(String str) {
        this.a = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        ClassLoader v;
        v = S72.v();
        if (v != null) {
            return v.getResourceAsStream(this.a);
        }
        return ClassLoader.getSystemResourceAsStream(this.a);
    }
}
