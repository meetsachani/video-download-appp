package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n37#2:231\n36#2,3:232\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n*L\n190#1:231\n190#1:232,3\n*E\n"})
@InterfaceC4912Zi0
/* renamed from: o.cy1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5698cy1 implements ParameterizedType, InterfaceC11070yv2 {
    @NotNull
    public final Class<?> X;
    @Nullable
    public final Type Y;
    @NotNull
    public final Type[] Z;

    /* renamed from: o.cy1$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a extends C7964mB0 implements HA0<Type, String> {
        public static final a e1 = new a();

        public a() {
            super(1, Gw2.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // o.HA0
        /* renamed from: u0 */
        public final String invoke(Type type) {
            String j;
            C6562gT0.p(type, "p0");
            j = Gw2.j(type);
            return j;
        }
    }

    public C5698cy1(@NotNull Class<?> cls, @Nullable Type type, @NotNull List<? extends Type> list) {
        C6562gT0.p(cls, "rawType");
        C6562gT0.p(list, "typeArguments");
        this.X = cls;
        this.Y = type;
        this.Z = (Type[]) list.toArray(new Type[0]);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (C6562gT0.g(this.X, parameterizedType.getRawType()) && C6562gT0.g(this.Y, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public Type[] getActualTypeArguments() {
        return this.Z;
    }

    @Override // java.lang.reflect.ParameterizedType
    @Nullable
    public Type getOwnerType() {
        return this.Y;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public Type getRawType() {
        return this.X;
    }

    @Override // java.lang.reflect.Type, o.InterfaceC11070yv2
    @NotNull
    public String getTypeName() {
        String j;
        boolean z;
        String j2;
        StringBuilder sb = new StringBuilder();
        Type type = this.Y;
        if (type != null) {
            j2 = Gw2.j(type);
            sb.append(j2);
            sb.append("$");
            sb.append(this.X.getSimpleName());
        } else {
            j = Gw2.j(this.X);
            sb.append(j);
        }
        Type[] typeArr = this.Z;
        if (typeArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C7330jf.dh(typeArr, sb, null, "<", ">", 0, null, a.e1, 50, null);
        }
        return sb.toString();
    }

    public int hashCode() {
        int i;
        int hashCode = this.X.hashCode();
        Type type = this.Y;
        if (type != null) {
            i = type.hashCode();
        } else {
            i = 0;
        }
        return (hashCode ^ i) ^ Arrays.hashCode(getActualTypeArguments());
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
