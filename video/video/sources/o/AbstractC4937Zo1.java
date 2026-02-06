package o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* renamed from: o.Zo1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4937Zo1 {
    public static final a a = new a(null);
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = -1;

    /* renamed from: o.Zo1$a */
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    @Target({ElementType.METHOD, ElementType.PARAMETER})
    @InterfaceC7780lU1(EnumC7796la.X)
    @Retention(RetentionPolicy.SOURCE)
    @InterfaceC2758Dl2(allowedTargets = {EnumC8057ma.Y0, EnumC8057ma.b1, EnumC8057ma.e1, EnumC8057ma.f1})
    /* renamed from: o.Zo1$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* renamed from: o.Zo1$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC4937Zo1 {
        public static final c e = new c();

        public c() {
            super(null);
        }

        public String toString() {
            return "Idle()";
        }
    }

    /* renamed from: o.Zo1$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC4937Zo1 {
        public final C4148Ro1 e;
        public final int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C4148Ro1 c4148Ro1, int i) {
            super(null);
            C6562gT0.p(c4148Ro1, "latestEvent");
            this.e = c4148Ro1;
            this.f = i;
        }

        public final int a() {
            return this.f;
        }

        public final C4148Ro1 b() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f == dVar.f && C6562gT0.g(this.e, dVar.e)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f * 31) + this.e.hashCode();
        }

        public String toString() {
            return "InProgress(latestEvent=" + this.e + ", direction=" + this.f + ')';
        }
    }

    public /* synthetic */ AbstractC4937Zo1(C9516sY c9516sY) {
        this();
    }

    public AbstractC4937Zo1() {
    }
}
