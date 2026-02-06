package o;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* renamed from: o.Yl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4816Yl implements B80, Serializable {
    public static Class<?>[] b1 = {B80.class};
    public transient Constructor<?> X;
    public Object[] Y;
    public String Y0;
    public Class<?> Z;
    public C80[] Z0;
    public HashMap<String, C80> a1;

    public C4816Yl() {
        this(null, null, null);
    }

    @Override // o.B80
    public InterfaceC10878y80 b() throws IllegalAccessException, InstantiationException {
        try {
            if (this.X == null) {
                d(this.Z);
            }
            return (InterfaceC10878y80) this.X.newInstance(this.Y);
        } catch (InvocationTargetException e) {
            throw new InstantiationException(e.getTargetException().getMessage());
        }
    }

    public Class<?> c() {
        return this.Z;
    }

    public void d(Class<?> cls) {
        if (!cls.isInterface()) {
            if (InterfaceC10878y80.class.isAssignableFrom(cls)) {
                try {
                    this.X = cls.getConstructor(b1);
                    this.Z = cls;
                    return;
                } catch (NoSuchMethodException unused) {
                    throw new IllegalArgumentException("Class " + cls.getName() + " does not have an appropriate constructor");
                }
            }
            throw new IllegalArgumentException("Class " + cls.getName() + " does not implement DynaBean");
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is an interface, not a class");
    }

    @Override // o.B80
    public C80[] e() {
        return this.Z0;
    }

    public void f(C80[] c80Arr) {
        this.Z0 = c80Arr;
        this.a1.clear();
        for (C80 c80 : c80Arr) {
            this.a1.put(c80.b(), c80);
        }
    }

    @Override // o.B80
    public String getName() {
        return this.Y0;
    }

    @Override // o.B80
    public C80 p(String str) {
        if (str != null) {
            return this.a1.get(str);
        }
        throw new IllegalArgumentException("No property name specified");
    }

    public C4816Yl(String str, Class<?> cls) {
        this(str, cls, null);
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class, for r4v0, types: [java.lang.Class<?>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4816Yl(String str, Class cls, C80[] c80Arr) {
        this.X = null;
        this.Y = new Object[]{this};
        this.Z = C4719Xl.class;
        this.Y0 = getClass().getName();
        this.Z0 = new C80[0];
        this.a1 = new HashMap<>();
        if (str != null) {
            this.Y0 = str;
        }
        d(cls == null ? C4719Xl.class : cls);
        if (c80Arr != null) {
            f(c80Arr);
        }
    }
}
