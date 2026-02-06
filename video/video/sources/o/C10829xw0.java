package o;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: o.xw0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10829xw0 implements InterfaceC10056um {
    public static final String c = "set";
    public final J31 a;
    public final String b;

    public C10829xw0(String str) {
        this.a = U31.q(getClass());
        if (str != null) {
            this.b = str;
            return;
        }
        throw new IllegalArgumentException("Prefix for write methods must not be null!");
    }

    @Override // o.InterfaceC10056um
    public void a(InterfaceC7532kT0 interfaceC7532kT0) throws IntrospectionException {
        Method[] methods;
        for (Method method : interfaceC7532kT0.e().getMethods()) {
            if (method.getName().startsWith(c())) {
                String d = d(method);
                PropertyDescriptor g = interfaceC7532kT0.g(d);
                if (g == null) {
                    try {
                        interfaceC7532kT0.k(b(method, d));
                    } catch (IntrospectionException e) {
                        this.a.e("Error when creating PropertyDescriptor for " + method + "! Ignoring this property.");
                        this.a.l("Exception is:", e);
                    }
                } else if (g.getWriteMethod() == null) {
                    g.setWriteMethod(method);
                }
            }
        }
    }

    public final PropertyDescriptor b(Method method, String str) throws IntrospectionException {
        return new PropertyDescriptor(d(method), (Method) null, method);
    }

    public String c() {
        return this.b;
    }

    public final String d(Method method) {
        String substring = method.getName().substring(c().length());
        if (substring.length() > 1) {
            return Introspector.decapitalize(substring);
        }
        return substring.toLowerCase(Locale.ENGLISH);
    }

    public C10829xw0() {
        this(c);
    }
}
