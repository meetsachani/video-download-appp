package o;

/* renamed from: o.Jl1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3356Jl1 {
    public Class<?> a;
    public Class<?> b;
    public Class<?> c;

    public C3356Jl1() {
    }

    public void a(Class<?> cls, Class<?> cls2) {
        b(cls, cls2, null);
    }

    public void b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3356Jl1 c3356Jl1 = (C3356Jl1) obj;
        if (this.a.equals(c3356Jl1.a) && this.b.equals(c3356Jl1.b) && SD2.e(this.c, c3356Jl1.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Class<?> cls = this.c;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }

    public C3356Jl1(Class<?> cls, Class<?> cls2) {
        a(cls, cls2);
    }

    public C3356Jl1(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        b(cls, cls2, cls3);
    }
}
