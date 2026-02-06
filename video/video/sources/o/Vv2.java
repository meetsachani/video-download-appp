package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n1563#2:231\n1634#2,3:232\n37#3:235\n36#3,3:236\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n*L\n116#1:231\n116#1:232,3\n116#1:235\n116#1:236,3\n*E\n"})
@InterfaceC4912Zi0
/* loaded from: classes3.dex */
public final class Vv2 implements TypeVariable<GenericDeclaration>, InterfaceC11070yv2 {
    @NotNull
    public final ZW0 X;

    public Vv2(@NotNull ZW0 zw0) {
        C6562gT0.p(zw0, "typeParameter");
        this.X = zw0;
    }

    @Nullable
    public final <T extends Annotation> T a(@NotNull Class<T> cls) {
        C6562gT0.p(cls, "annotationClass");
        return null;
    }

    @NotNull
    public final Annotation[] b() {
        return new Annotation[0];
    }

    @NotNull
    public final Annotation[] c() {
        return new Annotation[0];
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (C6562gT0.g(getName(), typeVariable.getName()) && C6562gT0.g(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public Type[] getBounds() {
        Type c;
        List<XW0> upperBounds = this.X.getUpperBounds();
        ArrayList arrayList = new ArrayList(C8466oF.b0(upperBounds, 10));
        for (XW0 xw0 : upperBounds) {
            c = Gw2.c(xw0, true);
            arrayList.add(c);
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public GenericDeclaration getGenericDeclaration() {
        throw new C9592sr1("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.X));
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public String getName() {
        return this.X.getName();
    }

    @Override // java.lang.reflect.Type, o.InterfaceC11070yv2
    @NotNull
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
