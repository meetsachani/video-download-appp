package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class U10 {
    @NotNull
    public static final U10 a = new U10();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AbstractC3486Kt1<T> {
        public final /* synthetic */ XA0<TW0<?>, T, T, C7458kA2> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(T t, XA0<? super TW0<?>, ? super T, ? super T, C7458kA2> xa0) {
            super(t);
            this.b = xa0;
        }

        @Override // o.AbstractC3486Kt1
        public void c(TW0<?> tw0, T t, T t2) {
            C6562gT0.p(tw0, "property");
            this.b.P(tw0, t, t2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class b<T> extends AbstractC3486Kt1<T> {
        public final /* synthetic */ XA0<TW0<?>, T, T, Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(T t, XA0<? super TW0<?>, ? super T, ? super T, Boolean> xa0) {
            super(t);
            this.b = xa0;
        }

        @Override // o.AbstractC3486Kt1
        public boolean d(TW0<?> tw0, T t, T t2) {
            C6562gT0.p(tw0, "property");
            return this.b.P(tw0, t, t2).booleanValue();
        }
    }

    @NotNull
    public final <T> BO1<Object, T> a() {
        return new C10567wr1();
    }

    @NotNull
    public final <T> BO1<Object, T> b(T t, @NotNull XA0<? super TW0<?>, ? super T, ? super T, C7458kA2> xa0) {
        C6562gT0.p(xa0, "onChange");
        return new a(t, xa0);
    }

    @NotNull
    public final <T> BO1<Object, T> c(T t, @NotNull XA0<? super TW0<?>, ? super T, ? super T, Boolean> xa0) {
        C6562gT0.p(xa0, "onChange");
        return new b(t, xa0);
    }
}
