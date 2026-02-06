package o;

import java.lang.reflect.Type;

/* renamed from: o.i30  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6944i30<T> extends AbstractC4280Sx1<T, T> {
    private static final long serialVersionUID = 1;
    public final Type Y = (Type) C11304zt1.t(Uv2.D(getClass(), AbstractC6944i30.class).get(AbstractC6944i30.class.getTypeParameters()[0]), Object.class);
    public final String Z;

    public AbstractC6944i30(String str) {
        this.Z = str;
    }

    public final String n() {
        return this.Z;
    }

    public final Type o() {
        return this.Y;
    }

    @Override // java.util.Map.Entry
    public final T setValue(T t) {
        throw new UnsupportedOperationException("Cannot alter Diff object.");
    }

    @Override // o.AbstractC4280Sx1
    public final String toString() {
        return String.format("[%s: %s, %s]", this.Z, h(), i());
    }
}
