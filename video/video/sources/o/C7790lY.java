package o;

import java.beans.IndexedPropertyDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: o.lY  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7790lY implements InterfaceC10056um {
    public static final InterfaceC10056um b = new C7790lY();
    public static final Class<?>[] c = new Class[0];
    public static final Class<?>[] d = {List.class};
    public final J31 a = U31.q(getClass());

    @Override // o.InterfaceC10056um
    public void a(InterfaceC7532kT0 interfaceC7532kT0) {
        try {
            PropertyDescriptor[] propertyDescriptors = Introspector.getBeanInfo(interfaceC7532kT0.e()).getPropertyDescriptors();
            if (propertyDescriptors == null) {
                propertyDescriptors = new PropertyDescriptor[0];
            }
            b(interfaceC7532kT0.e(), propertyDescriptors);
            interfaceC7532kT0.j(propertyDescriptors);
        } catch (IntrospectionException e) {
            J31 j31 = this.a;
            j31.g("Error when inspecting class " + interfaceC7532kT0.e(), e);
        }
    }

    public final void b(Class<?> cls, PropertyDescriptor[] propertyDescriptorArr) {
        String str;
        String str2;
        for (PropertyDescriptor propertyDescriptor : propertyDescriptorArr) {
            if (propertyDescriptor instanceof IndexedPropertyDescriptor) {
                IndexedPropertyDescriptor indexedPropertyDescriptor = (IndexedPropertyDescriptor) propertyDescriptor;
                String str3 = indexedPropertyDescriptor.getName().substring(0, 1).toUpperCase() + indexedPropertyDescriptor.getName().substring(1);
                if (indexedPropertyDescriptor.getReadMethod() == null) {
                    if (indexedPropertyDescriptor.getIndexedReadMethod() != null) {
                        str2 = indexedPropertyDescriptor.getIndexedReadMethod().getName();
                    } else {
                        str2 = "get" + str3;
                    }
                    Method k = C3250Ij1.k(cls, str2, c);
                    if (k != null) {
                        try {
                            indexedPropertyDescriptor.setReadMethod(k);
                        } catch (Exception e) {
                            this.a.g("Error setting indexed property read method", e);
                        }
                    }
                }
                if (indexedPropertyDescriptor.getWriteMethod() == null) {
                    if (indexedPropertyDescriptor.getIndexedWriteMethod() != null) {
                        str = indexedPropertyDescriptor.getIndexedWriteMethod().getName();
                    } else {
                        str = C10829xw0.c + str3;
                    }
                    Method k2 = C3250Ij1.k(cls, str, d);
                    if (k2 == null) {
                        Method[] methods = cls.getMethods();
                        int length = methods.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            Method method = methods[i];
                            if (method.getName().equals(str)) {
                                Class<?>[] parameterTypes = method.getParameterTypes();
                                if (parameterTypes.length == 1 && List.class.isAssignableFrom(parameterTypes[0])) {
                                    k2 = method;
                                    break;
                                }
                            }
                            i++;
                        }
                    }
                    if (k2 != null) {
                        try {
                            indexedPropertyDescriptor.setWriteMethod(k2);
                        } catch (Exception e2) {
                            this.a.g("Error setting indexed property write method", e2);
                        }
                    }
                }
            }
        }
    }
}
