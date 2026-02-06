package o;

import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.Pd0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3909Pd0<T extends Enum<T>> extends AbstractC8387nv2<T> {
    public static final InterfaceC8631ov2 d = new a();
    public final Map<String, T> a;
    public final Map<String, T> b;
    public final Map<T, String> c;

    /* renamed from: o.Pd0$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC8631ov2 {
        @Override // o.InterfaceC8631ov2
        public <T> AbstractC8387nv2<T> b(C5523cF0 c5523cF0, Rv2<T> rv2) {
            Class<? super Object> f = rv2.f();
            if (!Enum.class.isAssignableFrom(f) || f == Enum.class) {
                return null;
            }
            if (!f.isEnum()) {
                f = f.getSuperclass();
            }
            return new C3909Pd0(f, null);
        }
    }

    public /* synthetic */ C3909Pd0(Class cls, a aVar) {
        this(cls);
    }

    @Override // o.AbstractC8387nv2
    /* renamed from: j */
    public T e(OV0 ov0) throws IOException {
        if (ov0.I() == XV0.NULL) {
            ov0.E();
            return null;
        }
        String G = ov0.G();
        T t = this.a.get(G);
        if (t == null) {
            return this.b.get(G);
        }
        return t;
    }

    @Override // o.AbstractC8387nv2
    /* renamed from: k */
    public void i(C5589cW0 c5589cW0, T t) throws IOException {
        String str;
        if (t == null) {
            str = null;
        } else {
            str = this.c.get(t);
        }
        c5589cW0.R(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3909Pd0(Class<T> cls) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String name = r4.name();
                String str = r4.toString();
                A12 a12 = (A12) field2.getAnnotation(A12.class);
                if (a12 != null) {
                    name = a12.value();
                    for (String str2 : a12.alternate()) {
                        this.a.put(str2, r4);
                    }
                }
                this.a.put(name, r4);
                this.b.put(str, r4);
                this.c.put(r4, name);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
