package o;

import android.graphics.Bitmap;

/* renamed from: o.t61  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9653t61 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public Bitmap f;

    public C9653t61(int i, int i2, String str, String str2, String str3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public C9653t61 a(float f) {
        C9653t61 c9653t61 = new C9653t61((int) (this.a * f), (int) (this.b * f), this.c, this.d, this.e);
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            c9653t61.i(Bitmap.createScaledBitmap(bitmap, c9653t61.a, c9653t61.b, true));
        }
        return c9653t61;
    }

    public Bitmap b() {
        return this.f;
    }

    public String c() {
        return this.e;
    }

    public String d() {
        return this.d;
    }

    public int e() {
        return this.b;
    }

    public String f() {
        return this.c;
    }

    public int g() {
        return this.a;
    }

    public boolean h() {
        if (this.f == null) {
            if (!this.d.startsWith("data:") || this.d.indexOf("base64,") <= 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void i(Bitmap bitmap) {
        this.f = bitmap;
    }
}
