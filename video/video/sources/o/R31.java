package o;

import java.io.IOException;
import java.security.PrivilegedAction;

/* loaded from: classes4.dex */
public final class R31 implements PrivilegedAction {
    public final /* synthetic */ ClassLoader a;
    public final /* synthetic */ String b;

    public R31(ClassLoader classLoader, String str) {
        this.a = classLoader;
        this.b = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        try {
            ClassLoader classLoader = this.a;
            if (classLoader != null) {
                return classLoader.getResources(this.b);
            }
            return ClassLoader.getSystemResources(this.b);
        } catch (IOException e) {
            if (U31.z()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Exception while trying to find configuration file ");
                stringBuffer.append(this.b);
                stringBuffer.append(":");
                stringBuffer.append(e.getMessage());
                U31.B(stringBuffer.toString());
            }
            return null;
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }
}
