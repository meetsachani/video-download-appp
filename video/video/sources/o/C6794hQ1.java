package o;

import android.annotation.TargetApi;
import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: o.hQ1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6794hQ1 {

    @TargetApi(24)
    @IgnoreJRERequirement
    /* renamed from: o.hQ1$a */
    /* loaded from: classes4.dex */
    public static final class a extends C6794hQ1 {
        @Override // o.C6794hQ1
        public Object b(Method method, Class<?> cls, Object obj, @InterfaceC10571ws1 Object[] objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return UZ.a(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        @Override // o.C6794hQ1
        public boolean c(Method method) {
            return method.isDefault();
        }
    }

    @IgnoreJRERequirement
    /* renamed from: o.hQ1$b */
    /* loaded from: classes4.dex */
    public static class b extends C6794hQ1 {
        @Override // o.C6794hQ1
        public String a(Method method, int i) {
            Parameter[] parameters;
            boolean isNamePresent;
            String name;
            parameters = method.getParameters();
            Parameter parameter = parameters[i];
            isNamePresent = parameter.isNamePresent();
            if (isNamePresent) {
                StringBuilder sb = new StringBuilder();
                sb.append("parameter '");
                name = parameter.getName();
                sb.append(name);
                sb.append('\'');
                return sb.toString();
            }
            return super.a(method, i);
        }

        @Override // o.C6794hQ1
        public Object b(Method method, Class<?> cls, Object obj, @InterfaceC10571ws1 Object[] objArr) throws Throwable {
            return UZ.a(method, cls, obj, objArr);
        }

        @Override // o.C6794hQ1
        public boolean c(Method method) {
            return method.isDefault();
        }
    }

    public String a(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    @InterfaceC10571ws1
    public Object b(Method method, Class<?> cls, Object obj, @InterfaceC10571ws1 Object[] objArr) throws Throwable {
        throw new AssertionError();
    }

    public boolean c(Method method) {
        return false;
    }
}
