package o;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* renamed from: o.lQ1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7764lQ1<T> implements InterfaceC4943Zq<C7428k30<T>> {
    public final Object X;
    public final Object Y;
    public final C7185j30<T> Z;

    public C7764lQ1(T t, T t2, AbstractC4253Sp2 abstractC4253Sp2) {
        this.X = t;
        this.Y = t2;
        this.Z = new C7185j30<>(t, t2, abstractC4253Sp2);
    }

    private boolean a(Field field) {
        if (field.getName().indexOf(36) != -1 || Modifier.isTransient(field.getModifiers())) {
            return false;
        }
        return !Modifier.isStatic(field.getModifiers());
    }

    public final void b(Class<?> cls) {
        Field[] a;
        for (Field field : C2474Ao0.a(cls)) {
            if (a(field)) {
                try {
                    this.Z.g(field.getName(), C2474Ao0.p(field, this.X, true), C2474Ao0.p(field, this.Y, true));
                } catch (IllegalAccessException e) {
                    throw new InternalError("Unexpected IllegalAccessException: " + e.getMessage());
                }
            }
        }
    }

    @Override // o.InterfaceC4943Zq
    /* renamed from: c */
    public C7428k30<T> build() {
        if (this.X.equals(this.Y)) {
            return this.Z.build();
        }
        b(this.X.getClass());
        return this.Z.build();
    }
}
