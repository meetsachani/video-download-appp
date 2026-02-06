package o;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final class QN1<T> implements Serializable {
    private static final long serialVersionUID = 1;
    public final Comparator<T> X;
    public transient int Y;
    public final T Y0;
    public final T Z;
    public transient String Z0;

    /* loaded from: classes4.dex */
    public enum a implements Comparator {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public QN1(T t, T t2, Comparator<T> comparator) {
        if (t != null && t2 != null) {
            if (comparator == null) {
                this.X = a.INSTANCE;
            } else {
                this.X = comparator;
            }
            if (this.X.compare(t, t2) < 1) {
                this.Y0 = t;
                this.Z = t2;
                return;
            }
            this.Y0 = t2;
            this.Z = t;
            return;
        }
        throw new IllegalArgumentException("Elements in a range must not be null: element1=" + t + ", element2=" + t2);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<TT;>;>(TT;TT;)Lo/QN1<TT;>; */
    public static QN1 a(Comparable comparable, Comparable comparable2) {
        return b(comparable, comparable2, null);
    }

    public static <T> QN1<T> b(T t, T t2, Comparator<T> comparator) {
        return new QN1<>(t, t2, comparator);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<TT;>;>(TT;)Lo/QN1<TT;>; */
    public static QN1 k(Comparable comparable) {
        return b(comparable, comparable, null);
    }

    public static <T> QN1<T> l(T t, Comparator<T> comparator) {
        return b(t, t, comparator);
    }

    public boolean c(T t) {
        if (t == null || this.X.compare(t, this.Y0) <= -1 || this.X.compare(t, this.Z) >= 1) {
            return false;
        }
        return true;
    }

    public boolean d(QN1<T> qn1) {
        if (qn1 == null || !c(qn1.Y0) || !c(qn1.Z)) {
            return false;
        }
        return true;
    }

    public int e(T t) {
        C11147zE2.V(t, "element", new Object[0]);
        if (m(t)) {
            return -1;
        }
        if (!o(t)) {
            return 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == QN1.class) {
            QN1 qn1 = (QN1) obj;
            if (this.Y0.equals(qn1.Y0) && this.Z.equals(qn1.Z)) {
                return true;
            }
        }
        return false;
    }

    public T f(T t) {
        C11147zE2.V(t, "element", new Object[0]);
        if (m(t)) {
            return this.Y0;
        }
        if (o(t)) {
            return this.Z;
        }
        return t;
    }

    public Comparator<T> g() {
        return this.X;
    }

    public T h() {
        return this.Z;
    }

    public int hashCode() {
        int i = this.Y;
        if (i == 0) {
            int hashCode = ((((629 + QN1.class.hashCode()) * 37) + this.Y0.hashCode()) * 37) + this.Z.hashCode();
            this.Y = hashCode;
            return hashCode;
        }
        return i;
    }

    public T i() {
        return this.Y0;
    }

    public QN1<T> j(QN1<T> qn1) {
        T t;
        T t2;
        if (s(qn1)) {
            if (equals(qn1)) {
                return this;
            }
            if (g().compare(this.Y0, qn1.Y0) < 0) {
                t = qn1.Y0;
            } else {
                t = this.Y0;
            }
            if (g().compare(this.Z, qn1.Z) < 0) {
                t2 = this.Z;
            } else {
                t2 = qn1.Z;
            }
            return b(t, t2, g());
        }
        throw new IllegalArgumentException(String.format("Cannot calculate intersection with non-overlapping range %s", qn1));
    }

    public boolean m(T t) {
        if (t == null || this.X.compare(t, this.Y0) >= 0) {
            return false;
        }
        return true;
    }

    public boolean n(QN1<T> qn1) {
        if (qn1 == null) {
            return false;
        }
        return m(qn1.Z);
    }

    public boolean o(T t) {
        if (t == null || this.X.compare(t, this.Z) <= 0) {
            return false;
        }
        return true;
    }

    public boolean p(QN1<T> qn1) {
        if (qn1 == null) {
            return false;
        }
        return o(qn1.Y0);
    }

    public boolean q(T t) {
        if (t == null || this.X.compare(t, this.Z) != 0) {
            return false;
        }
        return true;
    }

    public boolean r() {
        if (this.X == a.INSTANCE) {
            return true;
        }
        return false;
    }

    public boolean s(QN1<T> qn1) {
        if (qn1 == null) {
            return false;
        }
        if (!qn1.c(this.Y0) && !qn1.c(this.Z) && !c(qn1.Y0)) {
            return false;
        }
        return true;
    }

    public boolean t(T t) {
        if (t == null || this.X.compare(t, this.Y0) != 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        if (this.Z0 == null) {
            this.Z0 = C6566gU0.f + this.Y0 + ".." + this.Z + C6566gU0.g;
        }
        return this.Z0;
    }

    public String u(String str) {
        return String.format(str, this.Y0, this.Z, this.X);
    }
}
