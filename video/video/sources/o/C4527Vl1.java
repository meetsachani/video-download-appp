package o;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: o.Vl1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4527Vl1 implements Serializable {
    private static final long serialVersionUID = 4465448607415788805L;
    public final Object[] X;
    public transient int Y;

    public C4527Vl1(Object obj, Object obj2) {
        this(new Object[]{obj, obj2}, false);
    }

    private Object readResolve() {
        a(this.X);
        return this;
    }

    public final void a(Object[] objArr) {
        int i = 0;
        for (Object obj : objArr) {
            if (obj != null) {
                i ^= obj.hashCode();
            }
        }
        this.Y = i;
    }

    public Object b(int i) {
        return this.X[i];
    }

    public Object[] c() {
        return (Object[]) this.X.clone();
    }

    public int d() {
        return this.X.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4527Vl1) {
            return Arrays.equals(this.X, ((C4527Vl1) obj).X);
        }
        return false;
    }

    public int hashCode() {
        return this.Y;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("MultiKey");
        stringBuffer.append(Arrays.asList(this.X).toString());
        return stringBuffer.toString();
    }

    public C4527Vl1(Object obj, Object obj2, Object obj3) {
        this(new Object[]{obj, obj2, obj3}, false);
    }

    public C4527Vl1(Object obj, Object obj2, Object obj3, Object obj4) {
        this(new Object[]{obj, obj2, obj3, obj4}, false);
    }

    public C4527Vl1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this(new Object[]{obj, obj2, obj3, obj4, obj5}, false);
    }

    public C4527Vl1(Object[] objArr) {
        this(objArr, true);
    }

    public C4527Vl1(Object[] objArr, boolean z) {
        if (objArr != null) {
            if (z) {
                this.X = (Object[]) objArr.clone();
            } else {
                this.X = objArr;
            }
            a(objArr);
            return;
        }
        throw new IllegalArgumentException("The array of keys must not be null");
    }
}
