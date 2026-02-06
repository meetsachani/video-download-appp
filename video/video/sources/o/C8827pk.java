package o;

import android.os.Build;
import android.window.BackEvent;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* renamed from: o.pk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8827pk {
    public static final a f = new a(null);
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    /* renamed from: o.pk$a */
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    @Target({ElementType.TYPE_USE})
    @InterfaceC7780lU1(EnumC7796la.X)
    @Retention(RetentionPolicy.SOURCE)
    @InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.g1})
    /* renamed from: o.pk$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    public C8827pk(float f2, float f3, float f4, int i2) {
        this(f2, f3, f4, i2, 0L, 16, null);
    }

    public final long a() {
        return this.e;
    }

    public final float b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final float d() {
        return this.a;
    }

    public final float e() {
        return this.b;
    }

    public final BackEvent f() {
        if (Build.VERSION.SDK_INT >= 36) {
            C8584ok.a();
            return C8097mk.a(this.a, this.b, this.c, this.d, this.e);
        }
        C8584ok.a();
        return C8340nk.a(this.a, this.b, this.c, this.d);
    }

    public final C4148Ro1 g() {
        float f2 = this.a;
        float f3 = this.b;
        return new C4148Ro1(this.d, this.c, f2, f3, this.e);
    }

    public String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }

    public C8827pk(float f2, float f3, float f4, int i2, long j) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = i2;
        this.e = j;
    }

    public /* synthetic */ C8827pk(float f2, float f3, float f4, int i2, long j, int i3, C9516sY c9516sY) {
        this(f2, f3, f4, i2, (i3 & 16) != 0 ? 0L : j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C8827pk(BackEvent backEvent) {
        this(r2, r3, r4, r5, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        C6562gT0.p(backEvent, "backEvent");
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8827pk(C4148Ro1 c4148Ro1) {
        this(c4148Ro1.d(), c4148Ro1.e(), c4148Ro1.b(), c4148Ro1.c(), c4148Ro1.a());
        C6562gT0.p(c4148Ro1, "navigationEvent");
    }
}
