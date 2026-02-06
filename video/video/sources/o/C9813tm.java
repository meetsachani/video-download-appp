package o;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.tm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9813tm {
    public final PropertyDescriptor[] a;
    public final Map<String, String> b;

    public C9813tm(PropertyDescriptor[] propertyDescriptorArr) {
        this(propertyDescriptorArr, d(propertyDescriptorArr));
    }

    public static Map<String, String> d(PropertyDescriptor[] propertyDescriptorArr) {
        HashMap hashMap = new HashMap();
        for (PropertyDescriptor propertyDescriptor : propertyDescriptorArr) {
            Method writeMethod = propertyDescriptor.getWriteMethod();
            if (writeMethod != null) {
                hashMap.put(propertyDescriptor.getName(), writeMethod.getName());
            }
        }
        return hashMap;
    }

    public PropertyDescriptor a(String str) {
        PropertyDescriptor[] b;
        for (PropertyDescriptor propertyDescriptor : b()) {
            if (str.equals(propertyDescriptor.getName())) {
                return propertyDescriptor;
            }
        }
        return null;
    }

    public PropertyDescriptor[] b() {
        return this.a;
    }

    public Method c(Class<?> cls, PropertyDescriptor propertyDescriptor) {
        String str;
        Method writeMethod = propertyDescriptor.getWriteMethod();
        if (writeMethod == null && (str = this.b.get(propertyDescriptor.getName())) != null) {
            Method d = C3250Ij1.d(cls, str, propertyDescriptor.getPropertyType());
            if (d != null) {
                try {
                    propertyDescriptor.setWriteMethod(d);
                } catch (IntrospectionException unused) {
                }
            }
            return d;
        }
        return writeMethod;
    }

    public C9813tm(PropertyDescriptor[] propertyDescriptorArr, Map<String, String> map) {
        this.a = propertyDescriptorArr;
        this.b = map;
    }
}
