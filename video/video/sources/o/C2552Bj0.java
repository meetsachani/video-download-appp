package o;

import java.security.PrivilegedAction;

/* renamed from: o.Bj0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2552Bj0 implements PrivilegedAction {
    public final /* synthetic */ C2650Cj0 a;

    public C2552Bj0(C2650Cj0 c2650Cj0) {
        this.a = c2650Cj0;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return System.getProperty("file.separator");
    }
}
