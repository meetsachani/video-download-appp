package o;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: o.kH  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7483kH<T> implements KF1<T>, Serializable {
    private static final long serialVersionUID = -1863209236504077399L;
    public final T X;
    public final Comparator<T> Y;
    public final b Z;

    /* renamed from: o.kH$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.EQUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.GREATER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.LESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.GREATER_OR_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.LESS_OR_EQUAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: o.kH$b */
    /* loaded from: classes4.dex */
    public enum b {
        EQUAL,
        GREATER,
        LESS,
        GREATER_OR_EQUAL,
        LESS_OR_EQUAL
    }

    public C7483kH(T t, Comparator<T> comparator, b bVar) {
        this.X = t;
        this.Y = comparator;
        this.Z = bVar;
    }

    public static <T> KF1<T> b(T t, Comparator<T> comparator) {
        return c(t, comparator, b.EQUAL);
    }

    public static <T> KF1<T> c(T t, Comparator<T> comparator, b bVar) {
        if (comparator != null) {
            if (bVar != null) {
                return new C7483kH(t, comparator, bVar);
            }
            throw new NullPointerException("Criterion must not be null.");
        }
        throw new NullPointerException("Comparator must not be null.");
    }

    @Override // o.KF1
    public boolean evaluate(T t) {
        int compare = this.Y.compare(this.X, t);
        int i = a.a[this.Z.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            if (compare > 0) {
                                return false;
                            }
                            return true;
                        }
                        throw new IllegalStateException("The current criterion '" + this.Z + "' is invalid.");
                    } else if (compare < 0) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (compare >= 0) {
                    return false;
                } else {
                    return true;
                }
            } else if (compare <= 0) {
                return false;
            } else {
                return true;
            }
        } else if (compare != 0) {
            return false;
        } else {
            return true;
        }
    }
}
