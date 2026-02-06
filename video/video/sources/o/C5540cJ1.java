package o;

@Deprecated
/* renamed from: o.cJ1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5540cJ1 {
    @InterfaceC11300zs1
    public final String a;
    @InterfaceC11300zs1
    public final String b;
    @InterfaceC11300zs1
    public final String c;
    @InterfaceC11300zs1
    public final String d;
    @InterfaceC11300zs1
    public final String e;

    public C5540cJ1(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3, @InterfaceC11300zs1 String str4, @InterfaceC11300zs1 String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5540cJ1)) {
            return false;
        }
        C5540cJ1 c5540cJ1 = (C5540cJ1) obj;
        if (TD2.g(this.a, c5540cJ1.a) && TD2.g(this.b, c5540cJ1.b) && TD2.g(this.c, c5540cJ1.c) && TD2.g(this.d, c5540cJ1.d) && TD2.g(this.e, c5540cJ1.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.a;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = (527 + i) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str4 = this.d;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str5 = this.e;
        if (str5 != null) {
            i5 = str5.hashCode();
        }
        return i9 + i5;
    }
}
