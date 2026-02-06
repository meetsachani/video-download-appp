package o;

import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: o.sZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9519sZ implements InterfaceC7532kT0 {
    public static final PropertyDescriptor[] c = new PropertyDescriptor[0];
    public final Class<?> a;
    public final Map<String, PropertyDescriptor> b = new HashMap();

    public C9519sZ(Class<?> cls) {
        this.a = cls;
    }

    public PropertyDescriptor[] a() {
        return (PropertyDescriptor[]) this.b.values().toArray(c);
    }

    @Override // o.InterfaceC7532kT0
    public Class<?> e() {
        return this.a;
    }

    @Override // o.InterfaceC7532kT0
    public Set<String> f() {
        return this.b.keySet();
    }

    @Override // o.InterfaceC7532kT0
    public PropertyDescriptor g(String str) {
        return this.b.get(str);
    }

    @Override // o.InterfaceC7532kT0
    public boolean h(String str) {
        return this.b.containsKey(str);
    }

    @Override // o.InterfaceC7532kT0
    public void i(String str) {
        this.b.remove(str);
    }

    @Override // o.InterfaceC7532kT0
    public void j(PropertyDescriptor[] propertyDescriptorArr) {
        if (propertyDescriptorArr != null) {
            for (PropertyDescriptor propertyDescriptor : propertyDescriptorArr) {
                k(propertyDescriptor);
            }
            return;
        }
        throw new IllegalArgumentException("Array with descriptors must not be null!");
    }

    @Override // o.InterfaceC7532kT0
    public void k(PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor != null) {
            this.b.put(propertyDescriptor.getName(), propertyDescriptor);
            return;
        }
        throw new IllegalArgumentException("Property descriptor must not be null!");
    }
}
