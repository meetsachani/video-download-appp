package o;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.Tf0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4308Tf0 implements InterfaceC8631ov2, Cloneable {
    public static final double b1 = -1.0d;
    public static final C4308Tf0 c1 = new C4308Tf0();
    public boolean Y0;
    public List<InterfaceC4502Vf0> Z0;
    public List<InterfaceC4502Vf0> a1;
    public double X = -1.0d;
    public int Y = 136;
    public boolean Z = true;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.Tf0$a */
    /* loaded from: classes3.dex */
    public class a<T> extends AbstractC8387nv2<T> {
        public volatile AbstractC8387nv2<T> a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ C5523cF0 d;
        public final /* synthetic */ Rv2 e;

        public a(boolean z, boolean z2, C5523cF0 c5523cF0, Rv2 rv2) {
            this.b = z;
            this.c = z2;
            this.d = c5523cF0;
            this.e = rv2;
        }

        @Override // o.AbstractC8387nv2
        public T e(OV0 ov0) throws IOException {
            if (this.b) {
                ov0.Z();
                return null;
            }
            return j().e(ov0);
        }

        @Override // o.AbstractC8387nv2
        public void i(C5589cW0 c5589cW0, T t) throws IOException {
            if (this.c) {
                c5589cW0.u();
            } else {
                j().i(c5589cW0, t);
            }
        }

        public final AbstractC8387nv2<T> j() {
            AbstractC8387nv2<T> abstractC8387nv2 = this.a;
            if (abstractC8387nv2 == null) {
                AbstractC8387nv2<T> v = this.d.v(C4308Tf0.this, this.e);
                this.a = v;
                return v;
            }
            return abstractC8387nv2;
        }
    }

    public C4308Tf0() {
        List<InterfaceC4502Vf0> list = Collections.EMPTY_LIST;
        this.Z0 = list;
        this.a1 = list;
    }

    public static boolean h(Class<?> cls) {
        if (cls.isMemberClass() && !C8268nQ1.n(cls)) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC8631ov2
    public <T> AbstractC8387nv2<T> b(C5523cF0 c5523cF0, Rv2<T> rv2) {
        Class<? super T> f = rv2.f();
        boolean e = e(f, true);
        boolean e2 = e(f, false);
        if (!e && !e2) {
            return null;
        }
        return new a(e2, e, c5523cF0, rv2);
    }

    /* renamed from: c */
    public C4308Tf0 clone() {
        try {
            return (C4308Tf0) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public C4308Tf0 d() {
        C4308Tf0 clone = clone();
        clone.Z = false;
        return clone;
    }

    public boolean e(Class<?> cls, boolean z) {
        List<InterfaceC4502Vf0> list;
        if (this.X != -1.0d && !k((InterfaceC6225f82) cls.getAnnotation(InterfaceC6225f82.class), (InterfaceC8456oC2) cls.getAnnotation(InterfaceC8456oC2.class))) {
            return true;
        }
        if (!this.Z && h(cls)) {
            return true;
        }
        if (!z && !Enum.class.isAssignableFrom(cls) && C8268nQ1.l(cls)) {
            return true;
        }
        if (z) {
            list = this.Z0;
        } else {
            list = this.a1;
        }
        for (InterfaceC4502Vf0 interfaceC4502Vf0 : list) {
            if (interfaceC4502Vf0.b(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(Field field, boolean z) {
        List<InterfaceC4502Vf0> list;
        InterfaceC8094mj0 interfaceC8094mj0;
        if ((this.Y & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.X != -1.0d && !k((InterfaceC6225f82) field.getAnnotation(InterfaceC6225f82.class), (InterfaceC8456oC2) field.getAnnotation(InterfaceC8456oC2.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.Y0 && ((interfaceC8094mj0 = (InterfaceC8094mj0) field.getAnnotation(InterfaceC8094mj0.class)) == null || (!z ? !interfaceC8094mj0.deserialize() : !interfaceC8094mj0.serialize()))) || e(field.getType(), z)) {
            return true;
        }
        if (z) {
            list = this.Z0;
        } else {
            list = this.a1;
        }
        if (!list.isEmpty()) {
            C4728Xn0 c4728Xn0 = new C4728Xn0(field);
            for (InterfaceC4502Vf0 interfaceC4502Vf0 : list) {
                if (interfaceC4502Vf0.a(c4728Xn0)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public C4308Tf0 g() {
        C4308Tf0 clone = clone();
        clone.Y0 = true;
        return clone;
    }

    public final boolean i(InterfaceC6225f82 interfaceC6225f82) {
        if (interfaceC6225f82 == null) {
            return true;
        }
        if (this.X >= interfaceC6225f82.value()) {
            return true;
        }
        return false;
    }

    public final boolean j(InterfaceC8456oC2 interfaceC8456oC2) {
        if (interfaceC8456oC2 == null) {
            return true;
        }
        if (this.X < interfaceC8456oC2.value()) {
            return true;
        }
        return false;
    }

    public final boolean k(InterfaceC6225f82 interfaceC6225f82, InterfaceC8456oC2 interfaceC8456oC2) {
        if (i(interfaceC6225f82) && j(interfaceC8456oC2)) {
            return true;
        }
        return false;
    }

    public C4308Tf0 l(InterfaceC4502Vf0 interfaceC4502Vf0, boolean z, boolean z2) {
        C4308Tf0 clone = clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.Z0);
            clone.Z0 = arrayList;
            arrayList.add(interfaceC4502Vf0);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.a1);
            clone.a1 = arrayList2;
            arrayList2.add(interfaceC4502Vf0);
        }
        return clone;
    }

    public C4308Tf0 m(int... iArr) {
        C4308Tf0 clone = clone();
        clone.Y = 0;
        for (int i : iArr) {
            clone.Y = i | clone.Y;
        }
        return clone;
    }

    public C4308Tf0 n(double d) {
        C4308Tf0 clone = clone();
        clone.X = d;
        return clone;
    }
}
