package o;

@Deprecated
/* renamed from: o.z20  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11097z20 {
    public final String a;
    @InterfaceC11300zs1
    public final String b;
    @InterfaceC11300zs1
    public final String c;

    public C11097z20(String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11097z20.class == obj.getClass()) {
            C11097z20 c11097z20 = (C11097z20) obj;
            if (TD2.g(this.a, c11097z20.a) && TD2.g(this.b, c11097z20.b) && TD2.g(this.c, c11097z20.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }
}
