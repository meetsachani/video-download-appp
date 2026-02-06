package o;

import java.util.Objects;

/* renamed from: o.ty2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9864ty2 implements InterfaceC8886py2 {
    public final Appendable X;

    public C9864ty2(Appendable appendable) {
        Objects.requireNonNull(appendable, "appendable");
        this.X = appendable;
    }

    public String toString() {
        return this.X.toString();
    }

    @Override // o.InterfaceC8886py2, java.lang.Appendable
    public InterfaceC8886py2 append(char c) {
        final Appendable appendable = this.X;
        Objects.requireNonNull(appendable);
        C8643oy2.f(new RJ0() { // from class: o.qy2
            @Override // o.RJ0
            public final Object apply(Object obj) {
                return appendable.append(((Character) obj).charValue());
            }
        }, Character.valueOf(c));
        return this;
    }

    @Override // o.InterfaceC8886py2, java.lang.Appendable
    public InterfaceC8886py2 append(CharSequence charSequence) {
        final Appendable appendable = this.X;
        Objects.requireNonNull(appendable);
        C8643oy2.f(new RJ0() { // from class: o.sy2
            @Override // o.RJ0
            public final Object apply(Object obj) {
                return appendable.append((CharSequence) obj);
            }
        }, charSequence);
        return this;
    }

    @Override // o.InterfaceC8886py2, java.lang.Appendable
    public InterfaceC8886py2 append(CharSequence charSequence, int i, int i2) {
        final Appendable appendable = this.X;
        Objects.requireNonNull(appendable);
        C8643oy2.h(new InterfaceC5305bL0() { // from class: o.ry2
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                return appendable.append((CharSequence) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        }, charSequence, Integer.valueOf(i), Integer.valueOf(i2));
        return this;
    }
}
