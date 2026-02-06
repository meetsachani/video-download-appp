package o;

/* renamed from: o.o00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8406o00 implements InterfaceC8528oU1 {
    public static final int e = 2500;
    public static final int f = 1;
    public static final float g = 1.0f;
    public int a;
    public int b;
    public final int c;
    public final float d;

    public C8406o00() {
        this(2500, 1, 1.0f);
    }

    @Override // o.InterfaceC8528oU1
    public int a() {
        return this.b;
    }

    @Override // o.InterfaceC8528oU1
    public int b() {
        return this.a;
    }

    @Override // o.InterfaceC8528oU1
    public void c(C6524gJ2 c6524gJ2) throws C6524gJ2 {
        this.b++;
        int i = this.a;
        this.a = i + ((int) (i * this.d));
        if (e()) {
            return;
        }
        throw c6524gJ2;
    }

    public float d() {
        return this.d;
    }

    public boolean e() {
        if (this.b <= this.c) {
            return true;
        }
        return false;
    }

    public C8406o00(int i, int i2, float f2) {
        this.a = i;
        this.c = i2;
        this.d = f2;
    }
}
