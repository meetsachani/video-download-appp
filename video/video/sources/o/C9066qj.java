package o;

import java.util.List;
import o.T12;

/* renamed from: o.qj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9066qj extends T12.e {
    public final D10 b;
    public final List<D10> c;
    public final String d;
    public final int e;
    public final N80 f;

    /* renamed from: o.qj$b */
    /* loaded from: classes.dex */
    public static final class b extends T12.e.a {
        public D10 a;
        public List<D10> b;
        public String c;
        public Integer d;
        public N80 e;

        @Override // o.T12.e.a
        public T12.e a() {
            String str = "";
            if (this.a == null) {
                str = " surface";
            }
            if (this.b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.d == null) {
                str = str + " surfaceGroupId";
            }
            if (this.e == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new C9066qj(this.a, this.b, this.c, this.d.intValue(), this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.T12.e.a
        public T12.e.a b(N80 n80) {
            if (n80 != null) {
                this.e = n80;
                return this;
            }
            throw new NullPointerException("Null dynamicRange");
        }

        @Override // o.T12.e.a
        public T12.e.a c(String str) {
            this.c = str;
            return this;
        }

        @Override // o.T12.e.a
        public T12.e.a d(List<D10> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null sharedSurfaces");
        }

        @Override // o.T12.e.a
        public T12.e.a e(D10 d10) {
            if (d10 != null) {
                this.a = d10;
                return this;
            }
            throw new NullPointerException("Null surface");
        }

        @Override // o.T12.e.a
        public T12.e.a f(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }
    }

    @Override // o.T12.e
    public N80 b() {
        return this.f;
    }

    @Override // o.T12.e
    public String c() {
        return this.d;
    }

    @Override // o.T12.e
    public List<D10> d() {
        return this.c;
    }

    @Override // o.T12.e
    public D10 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof T12.e) {
            T12.e eVar = (T12.e) obj;
            if (this.b.equals(eVar.e()) && this.c.equals(eVar.d()) && ((str = this.d) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.e == eVar.f() && this.f.equals(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.T12.e
    public int f() {
        return this.e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((hashCode2 ^ hashCode) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.b + ", sharedSurfaces=" + this.c + ", physicalCameraId=" + this.d + ", surfaceGroupId=" + this.e + ", dynamicRange=" + this.f + "}";
    }

    public C9066qj(D10 d10, List<D10> list, String str, int i, N80 n80) {
        this.b = d10;
        this.c = list;
        this.d = str;
        this.e = i;
        this.f = n80;
    }
}
