package o;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC4912Zi0
/* renamed from: o.hL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6775hL2 implements WildcardType, InterfaceC11070yv2 {
    @Nullable
    public final Type X;
    @Nullable
    public final Type Y;
    @NotNull
    public static final a Z = new a(null);
    @NotNull
    public static final C6775hL2 Y0 = new C6775hL2(null, null);

    /* renamed from: o.hL2$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final C6775hL2 a() {
            return C6775hL2.Y0;
        }

        public a() {
        }
    }

    public C6775hL2(@Nullable Type type, @Nullable Type type2) {
        this.X = type;
        this.Y = type2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public Type[] getLowerBounds() {
        Type type = this.Y;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type, o.InterfaceC11070yv2
    @NotNull
    public String getTypeName() {
        String j;
        String j2;
        if (this.Y != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("? super ");
            j2 = Gw2.j(this.Y);
            sb.append(j2);
            return sb.toString();
        }
        Type type = this.X;
        if (type != null && !C6562gT0.g(type, Object.class)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("? extends ");
            j = Gw2.j(this.X);
            sb2.append(j);
            return sb2.toString();
        }
        return "?";
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public Type[] getUpperBounds() {
        Type type = this.X;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
