package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: o.yw2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11074yw2 {
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final ThreadLocal<C5881dj1> g = new ThreadLocal<>();
    public final int a;
    public final androidx.emoji2.text.f b;
    public volatile int c = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.yw2$a */
    /* loaded from: classes.dex */
    public @interface a {
    }

    public C11074yw2(androidx.emoji2.text.f fVar, int i) {
        this.b = fVar;
        this.a = i;
    }

    public void a(Canvas canvas, float f2, float f3, Paint paint) {
        Typeface j = this.b.j();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(j);
        canvas.drawText(this.b.f(), this.a * 2, 2, f2, f3, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i) {
        return h().F(i);
    }

    public int c() {
        return h().I();
    }

    public short d() {
        return h().L();
    }

    public int e() {
        return this.c & 3;
    }

    public int f() {
        return h().S();
    }

    public int g() {
        return h().T();
    }

    public final C5881dj1 h() {
        ThreadLocal<C5881dj1> threadLocal = g;
        C5881dj1 c5881dj1 = threadLocal.get();
        if (c5881dj1 == null) {
            c5881dj1 = new C5881dj1();
            threadLocal.set(c5881dj1);
        }
        this.b.g().J(c5881dj1, this.a);
        return c5881dj1;
    }

    public short i() {
        return h().U();
    }

    public Typeface j() {
        return this.b.j();
    }

    public int k() {
        return h().X();
    }

    public boolean l() {
        return h().O();
    }

    public boolean m() {
        if ((this.c & 4) > 0) {
            return true;
        }
        return false;
    }

    public void n() {
        if (m()) {
            this.c = 4;
        } else {
            this.c = 0;
        }
    }

    public void o(boolean z) {
        int e2 = e();
        if (z) {
            this.c = e2 | 4;
        } else {
            this.c = e2;
        }
    }

    public void p(boolean z) {
        int i;
        int i2 = this.c & 4;
        if (z) {
            i = i2 | 2;
        } else {
            i = i2 | 1;
        }
        this.c = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(g()));
        sb.append(", codepoints:");
        int c = c();
        for (int i = 0; i < c; i++) {
            sb.append(Integer.toHexString(b(i)));
            sb.append(C4500Ve2.b);
        }
        return sb.toString();
    }
}
