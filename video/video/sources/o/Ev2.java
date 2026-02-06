package o;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

@InterfaceC5359ba0
/* loaded from: classes3.dex */
public abstract class Ev2<T> extends AbstractC10095uv2<T> {
    public final TypeVariable<?> X;

    public Ev2() {
        Type a = a();
        C10664xF1.u(a instanceof TypeVariable, "%s should be a type variable.", a);
        this.X = (TypeVariable) a;
    }

    public final boolean equals(@MB Object obj) {
        if (obj instanceof Ev2) {
            return this.X.equals(((Ev2) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public String toString() {
        return this.X.toString();
    }
}
