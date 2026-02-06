package o;

import java.security.PrivilegedAction;

/* loaded from: classes4.dex */
public final class W31 implements PrivilegedAction {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public W31(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return System.getProperty(this.a, this.b);
    }
}
