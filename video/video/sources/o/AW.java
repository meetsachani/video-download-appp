package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@OT1
@InterfaceC6480g82(version = "1.7")
@InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
/* loaded from: classes3.dex */
public abstract class AW<T, R> {
    public /* synthetic */ AW(C9516sY c9516sY) {
        this();
    }

    @Nullable
    public abstract Object a(T t, @NotNull HM<? super R> hm);

    @Nullable
    public abstract <U, S> Object b(@NotNull C10971yW<U, S> c10971yW, U u, @NotNull HM<? super S> hm);

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @IR1(expression = "this.callRecursive(value)", imports = {}))
    @NotNull
    public final Void c(@NotNull C10971yW<?, ?> c10971yW, @Nullable Object obj) {
        C6562gT0.p(c10971yW, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }

    public AW() {
    }
}
