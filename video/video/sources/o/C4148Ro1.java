package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* renamed from: o.Ro1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4148Ro1 {
    public static final a f = new a(null);
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    /* renamed from: o.Ro1$a */
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @InterfaceC7780lU1(EnumC7796la.X)
    @Retention(RetentionPolicy.SOURCE)
    @InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.X, EnumC8057ma.Y0, EnumC8057ma.Z0, EnumC8057ma.a1, EnumC8057ma.b1, EnumC8057ma.c1, EnumC8057ma.d1, EnumC8057ma.e1, EnumC8057ma.f1, EnumC8057ma.g1})
    /* renamed from: o.Ro1$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    public C4148Ro1() {
        this(0, 0.0f, 0.0f, 0.0f, 0L, 31, null);
    }

    public final long a() {
        return this.e;
    }

    public final float b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final float d() {
        return this.c;
    }

    public final float e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4148Ro1.class == obj.getClass()) {
            C4148Ro1 c4148Ro1 = (C4148Ro1) obj;
            if (this.c == c4148Ro1.c && this.d == c4148Ro1.d && this.b == c4148Ro1.b && this.a == c4148Ro1.a && this.e == c4148Ro1.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.c) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.b)) * 31) + Integer.hashCode(this.a)) * 31) + Long.hashCode(this.e);
    }

    public String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }

    public C4148Ro1(int i2) {
        this(i2, 0.0f, 0.0f, 0.0f, 0L, 30, null);
    }

    public C4148Ro1(int i2, float f2) {
        this(i2, f2, 0.0f, 0.0f, 0L, 28, null);
    }

    public C4148Ro1(int i2, float f2, float f3) {
        this(i2, f2, f3, 0.0f, 0L, 24, null);
    }

    public C4148Ro1(int i2, float f2, float f3, float f4) {
        this(i2, f2, f3, f4, 0L, 16, null);
    }

    public C4148Ro1(int i2, float f2, float f3, float f4, long j) {
        this.a = i2;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
    }

    public /* synthetic */ C4148Ro1(int i2, float f2, float f3, float f4, long j, int i3, C9516sY c9516sY) {
        this((i3 & 1) != 0 ? 2 : i2, (i3 & 2) != 0 ? 0.0f : f2, (i3 & 4) != 0 ? 0.0f : f3, (i3 & 8) != 0 ? 0.0f : f4, (i3 & 16) != 0 ? 0L : j);
    }
}
