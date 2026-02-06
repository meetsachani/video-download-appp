package o;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.uu0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10089uu0<T> implements Comparator<T>, Serializable {
    private static final long serialVersionUID = 82794675842863201L;
    public final Map<T, Integer> X = new HashMap();
    public int Y = 0;
    public boolean Z = false;
    public b Y0 = b.EXCEPTION;

    /* renamed from: o.uu0$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.AFTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: o.uu0$b */
    /* loaded from: classes4.dex */
    public enum b {
        BEFORE,
        AFTER,
        EXCEPTION
    }

    public C10089uu0() {
    }

    public boolean a(T t) {
        c();
        Map<T, Integer> map = this.X;
        int i = this.Y;
        this.Y = i + 1;
        if (map.put(t, Integer.valueOf(i)) == null) {
            return true;
        }
        return false;
    }

    public boolean b(T t, T t2) {
        c();
        Integer num = this.X.get(t);
        if (num != null) {
            if (this.X.put(t2, num) == null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException(t + " not known to " + this);
    }

    public void c() {
        if (!e()) {
            return;
        }
        throw new UnsupportedOperationException("Cannot modify a FixedOrderComparator after a comparison");
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        this.Z = true;
        Integer num = this.X.get(t);
        Integer num2 = this.X.get(t2);
        if (num != null && num2 != null) {
            return num.compareTo(num2);
        }
        int i = a.a[this.Y0.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (num != null) {
                        t = t2;
                    }
                    throw new IllegalArgumentException("Attempting to compare unknown object " + t);
                }
                throw new UnsupportedOperationException("Unknown unknownObjectBehavior: " + this.Y0);
            } else if (num != null) {
                return -1;
            } else {
                if (num2 != null) {
                    return 1;
                }
                return 0;
            }
        } else if (num != null) {
            return 1;
        } else {
            if (num2 != null) {
                return -1;
            }
            return 0;
        }
    }

    public b d() {
        return this.Y0;
    }

    public boolean e() {
        return this.Z;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        b bVar;
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass().equals(getClass())) {
            C10089uu0 c10089uu0 = (C10089uu0) obj;
            Map<T, Integer> map = this.X;
            if (map != null ? map.equals(c10089uu0.X) : c10089uu0.X == null) {
                b bVar2 = this.Y0;
                if (bVar2 != null ? !(bVar2 != (bVar = c10089uu0.Y0) || this.Y != c10089uu0.Y || this.Z != c10089uu0.Z || bVar2 != bVar) : c10089uu0.Y0 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(b bVar) {
        c();
        if (bVar != null) {
            this.Y0 = bVar;
            return;
        }
        throw new NullPointerException("Unknown object behavior must not be null");
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (629 + this.X.hashCode()) * 37;
        b bVar = this.Y0;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        return ((((hashCode2 + hashCode) * 37) + this.Y) * 37) + (!this.Z ? 1 : 0);
    }

    public C10089uu0(T... tArr) {
        if (tArr != null) {
            for (T t : tArr) {
                a(t);
            }
            return;
        }
        throw new NullPointerException("The list of items must not be null");
    }

    public C10089uu0(List<T> list) {
        if (list != null) {
            for (T t : list) {
                a(t);
            }
            return;
        }
        throw new NullPointerException("The list of items must not be null");
    }
}
