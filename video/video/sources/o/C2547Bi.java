package o;

import o.HJ;

/* renamed from: o.Bi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2547Bi<T> extends HJ.a<T> {
    public final String a;
    public final Class<T> b;
    public final Object c;

    public C2547Bi(String str, Class<T> cls, Object obj) {
        if (str != null) {
            this.a = str;
            if (cls != null) {
                this.b = cls;
                this.c = obj;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }

    @Override // o.HJ.a
    public String c() {
        return this.a;
    }

    @Override // o.HJ.a
    public Object d() {
        return this.c;
    }

    @Override // o.HJ.a
    public Class<T> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof HJ.a) {
            HJ.a aVar = (HJ.a) obj;
            if (this.a.equals(aVar.c()) && this.b.equals(aVar.e()) && ((obj2 = this.c) != null ? obj2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Object obj = this.c;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "Option{id=" + this.a + ", valueClass=" + this.b + ", token=" + this.c + "}";
    }
}
