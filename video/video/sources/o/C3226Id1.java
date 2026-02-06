package o;

/* renamed from: o.Id1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3226Id1 {
    public float a;
    public int b;

    public void a(float f) {
        float f2 = this.a + f;
        this.a = f2;
        int i = this.b + 1;
        this.b = i;
        if (i == Integer.MAX_VALUE) {
            this.a = f2 / 2.0f;
            this.b = i / 2;
        }
    }

    public float b() {
        int i = this.b;
        if (i == 0) {
            return 0.0f;
        }
        return this.a / i;
    }
}
