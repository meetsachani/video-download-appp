package o;

/* loaded from: classes.dex */
public final class AG1 {

    @FV(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", i = {}, l = {329}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4225Si2 implements VA0<AbstractC10668xG1, HM<? super AbstractC10668xG1>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ VA0<C2972Fn1, HM<? super C7458kA2>, Object> b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(VA0<? super C2972Fn1, ? super HM<? super C7458kA2>, ? extends Object> va0, HM<? super a> hm) {
            super(2, hm);
            this.b1 = va0;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i == 1) {
                    C2972Fn1 c2972Fn1 = (C2972Fn1) this.a1;
                    RT1.n(obj);
                    return c2972Fn1;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RT1.n(obj);
            C2972Fn1 d = ((AbstractC10668xG1) this.a1).d();
            VA0<C2972Fn1, HM<? super C7458kA2>, Object> va0 = this.b1;
            this.a1 = d;
            this.Z0 = 1;
            if (va0.i(d, this) == l) {
                return l;
            }
            return d;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(AbstractC10668xG1 abstractC10668xG1, HM<? super AbstractC10668xG1> hm) {
            return ((a) t(abstractC10668xG1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            a aVar = new a(this.b1, hm);
            aVar.a1 = obj;
            return aVar;
        }
    }

    public static final Object a(PU<AbstractC10668xG1> pu, VA0<? super C2972Fn1, ? super HM<? super C7458kA2>, ? extends Object> va0, HM<? super AbstractC10668xG1> hm) {
        return pu.a(new a(va0, null), hm);
    }
}
