package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC4912Zi0
/* loaded from: classes3.dex */
public final class KC0 implements GenericArrayType, InterfaceC11070yv2 {
    @NotNull
    public final Type X;

    public KC0(@NotNull Type type) {
        C6562gT0.p(type, "elementType");
        this.X = type;
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof GenericArrayType) && C6562gT0.g(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    @NotNull
    public Type getGenericComponentType() {
        return this.X;
    }

    @Override // java.lang.reflect.Type, o.InterfaceC11070yv2
    @NotNull
    public String getTypeName() {
        String j;
        StringBuilder sb = new StringBuilder();
        j = Gw2.j(this.X);
        sb.append(j);
        sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        return sb.toString();
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
