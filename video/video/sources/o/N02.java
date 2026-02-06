package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class N02 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SequenceBuilder.kt\nkotlin/sequences/SequencesKt__SequenceBuilderKt\n*L\n1#1,22:1\n26#2:23\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a<T> implements B02<T> {
        public final /* synthetic */ VA0 a;

        public a(VA0 va0) {
            this.a = va0;
        }

        @Override // o.B02
        public Iterator<T> iterator() {
            return N02.a(this.a);
        }
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static <T> Iterator<T> a(@InterfaceC5183ar @NotNull VA0<? super F02<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        C6562gT0.p(va0, "block");
        C02 c02 = new C02();
        c02.k(C7048iT0.c(va0, c02, c02));
        return c02;
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static <T> B02<T> b(@InterfaceC5183ar @NotNull VA0<? super F02<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        C6562gT0.p(va0, "block");
        return new a(va0);
    }
}
