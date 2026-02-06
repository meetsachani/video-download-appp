package o;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class Bv2<T> implements Xv2<T> {
    public static final TypeVariable<Class<Bv2>> c = Bv2.class.getTypeParameters()[0];
    public final Type a;
    public final String b;

    public Bv2() {
        Map<TypeVariable<?>, Type> D = Uv2.D(getClass(), Bv2.class);
        TypeVariable<Class<Bv2>> typeVariable = c;
        Type type = (Type) C11147zE2.V(D.get(typeVariable), "%s does not assign type parameter %s", getClass(), Uv2.W(typeVariable));
        this.a = type;
        this.b = String.format("%s<%s>", Bv2.class.getSimpleName(), Uv2.Y(type));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Bv2)) {
            return false;
        }
        return Uv2.m(this.a, ((Bv2) obj).a);
    }

    @Override // o.Xv2
    public Type getType() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode() | 592;
    }

    public String toString() {
        return this.b;
    }
}
