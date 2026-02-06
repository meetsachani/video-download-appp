package o;

/* renamed from: o.fm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6376fm implements InterfaceC6439g11 {
    public static final int a1 = 0;
    public static final int b1 = 1;
    public static final int c1 = 2;
    public static final int d1 = 3;
    public final InterfaceC6439g11 X;
    public int Y = 0;
    public int Z = -1;
    public int Y0 = -1;
    public Object Z0 = null;

    public C6376fm(InterfaceC6439g11 interfaceC6439g11) {
        this.X = interfaceC6439g11;
    }

    @Override // o.InterfaceC6439g11
    public void a(int i, int i2) {
        int i3;
        if (this.Y == 1 && i >= (i3 = this.Z)) {
            int i4 = this.Y0;
            if (i <= i3 + i4) {
                this.Y0 = i4 + i2;
                this.Z = Math.min(i, i3);
                return;
            }
        }
        e();
        this.Z = i;
        this.Y0 = i2;
        this.Y = 1;
    }

    @Override // o.InterfaceC6439g11
    public void b(int i, int i2) {
        int i3;
        if (this.Y == 2 && (i3 = this.Z) >= i && i3 <= i + i2) {
            this.Y0 += i2;
            this.Z = i;
            return;
        }
        e();
        this.Z = i;
        this.Y0 = i2;
        this.Y = 2;
    }

    @Override // o.InterfaceC6439g11
    public void c(int i, int i2, Object obj) {
        int i3;
        if (this.Y == 3) {
            int i4 = this.Z;
            int i5 = this.Y0;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.Z0 == obj) {
                this.Z = Math.min(i, i4);
                this.Y0 = Math.max(i5 + i4, i3) - this.Z;
                return;
            }
        }
        e();
        this.Z = i;
        this.Y0 = i2;
        this.Z0 = obj;
        this.Y = 3;
    }

    @Override // o.InterfaceC6439g11
    public void d(int i, int i2) {
        e();
        this.X.d(i, i2);
    }

    public void e() {
        int i = this.Y;
        if (i == 0) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.X.c(this.Z, this.Y0, this.Z0);
                }
            } else {
                this.X.b(this.Z, this.Y0);
            }
        } else {
            this.X.a(this.Z, this.Y0);
        }
        this.Z0 = null;
        this.Y = 0;
    }
}
