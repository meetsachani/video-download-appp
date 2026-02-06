package o;

import android.util.Size;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class WS1 {
    public static final WS1 c = new WS1();
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 4;
    public Size a;
    public int b;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    public WS1() {
        this.a = null;
        this.b = 0;
    }

    public Size a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public WS1(Size size, int i) {
        this.a = size;
        this.b = i;
    }
}
