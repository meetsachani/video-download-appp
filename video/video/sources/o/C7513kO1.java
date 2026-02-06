package o;

/* renamed from: o.kO1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7513kO1 implements InterfaceC3344Ji1 {
    public final InterfaceC3540Li1 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public C7513kO1(InterfaceC3540Li1 interfaceC3540Li1, String str, Object[] objArr) {
        this.a = interfaceC3540Li1;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.d = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // o.InterfaceC3344Ji1
    public boolean a() {
        if ((this.d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC3344Ji1
    public InterfaceC3540Li1 b() {
        return this.a;
    }

    public Object[] c() {
        return this.c;
    }

    public String d() {
        return this.b;
    }

    @Override // o.InterfaceC3344Ji1
    public WJ1 f() {
        if ((this.d & 1) == 1) {
            return WJ1.PROTO2;
        }
        return WJ1.PROTO3;
    }
}
