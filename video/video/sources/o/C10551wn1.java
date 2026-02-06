package o;

import java.io.Serializable;

/* renamed from: o.wn1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10551wn1<T> implements InterfaceC3360Jm1<T>, Serializable {
    private static final long serialVersionUID = 86241875189L;
    public T X;

    public C10551wn1() {
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return this.X.equals(((C10551wn1) obj).X);
    }

    @Override // o.InterfaceC3360Jm1
    public T getValue() {
        return this.X;
    }

    public int hashCode() {
        T t = this.X;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    @Override // o.InterfaceC3360Jm1
    public void setValue(T t) {
        this.X = t;
    }

    public String toString() {
        T t = this.X;
        if (t == null) {
            return "null";
        }
        return t.toString();
    }

    public C10551wn1(T t) {
        this.X = t;
    }
}
