package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@InterfaceC9150r20(message = "Replaced by the androidx.resourceinpsection package.")
@InterfaceC7780lU1(EnumC7796la.X)
@Retention(RetentionPolicy.SOURCE)
@InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.d1, EnumC8057ma.e1, EnumC8057ma.f1})
/* renamed from: o.tQ0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public @interface InterfaceC9732tQ0 {

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @InterfaceC7780lU1(EnumC7796la.X)
    @Retention(RetentionPolicy.SOURCE)
    @InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.Y, EnumC8057ma.X})
    /* renamed from: o.tQ0$a */
    /* loaded from: classes.dex */
    public @interface a {
        String name();

        int value();
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @InterfaceC7780lU1(EnumC7796la.X)
    @Retention(RetentionPolicy.SOURCE)
    @InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.Y, EnumC8057ma.X})
    /* renamed from: o.tQ0$b */
    /* loaded from: classes.dex */
    public @interface b {
        int mask() default 0;

        String name();

        int target();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.tQ0$c */
    /* loaded from: classes.dex */
    public static final class c {
        public static final /* synthetic */ c[] c1;
        public static final /* synthetic */ InterfaceC3127Hd0 d1;
        public static final c X = new c(XH0.M, 0);
        public static final c Y = new c("INFERRED", 1);
        public static final c Z = new c("INT_ENUM", 2);
        public static final c Y0 = new c("INT_FLAG", 3);
        public static final c Z0 = new c("COLOR", 4);
        public static final c a1 = new c("GRAVITY", 5);
        public static final c b1 = new c("RESOURCE_ID", 6);

        static {
            c[] e = e();
            c1 = e;
            d1 = C3323Jd0.c(e);
        }

        public c(String str, int i) {
        }

        public static final /* synthetic */ c[] e() {
            return new c[]{X, Y, Z, Y0, Z0, a1, b1};
        }

        public static InterfaceC3127Hd0<c> g() {
            return d1;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) c1.clone();
        }
    }

    int attributeId() default 0;

    a[] enumMapping() default {};

    b[] flagMapping() default {};

    boolean hasAttributeId() default true;

    String name() default "";

    c valueType() default c.Y;
}
