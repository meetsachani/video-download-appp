package o;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

/* renamed from: o.lm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7844lm<T> implements Comparator<T>, Serializable {
    public String X;
    public final Comparator<?> Y;

    public C7844lm() {
        this(null);
    }

    public Comparator<?> a() {
        return this.Y;
    }

    public String b() {
        return this.X;
    }

    public final int c(Object obj, Object obj2) {
        return this.Y.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        String str = this.X;
        if (str == null) {
            return c(t, t2);
        }
        try {
            return c(MJ1.m(t, str), MJ1.m(t2, this.X));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("IllegalAccessException: " + e.toString());
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("NoSuchMethodException: " + e2.toString());
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("InvocationTargetException: " + e3.toString());
        }
    }

    public void d(String str) {
        this.X = str;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7844lm)) {
            return false;
        }
        C7844lm c7844lm = (C7844lm) obj;
        if (!this.Y.equals(c7844lm.Y)) {
            return false;
        }
        String str = this.X;
        if (str != null) {
            if (str.equals(c7844lm.X)) {
                return true;
            }
            return false;
        } else if (c7844lm.X == null) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.Y.hashCode();
    }

    public C7844lm(String str) {
        this(str, WG.a());
    }

    public C7844lm(String str, Comparator<?> comparator) {
        d(str);
        if (comparator != null) {
            this.Y = comparator;
        } else {
            this.Y = WG.a();
        }
    }
}
