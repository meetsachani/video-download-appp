package o;

/* renamed from: o.rG1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9207rG1 implements PU<AbstractC10668xG1> {
    public final PU<AbstractC10668xG1> a;

    @FV(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.rG1$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4225Si2 implements VA0<AbstractC10668xG1, HM<? super AbstractC10668xG1>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ VA0<AbstractC10668xG1, HM<? super AbstractC10668xG1>, Object> b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(VA0<? super AbstractC10668xG1, ? super HM<? super AbstractC10668xG1>, ? extends Object> va0, HM<? super a> hm) {
            super(2, hm);
            this.b1 = va0;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i == 1) {
                    RT1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
                VA0<AbstractC10668xG1, HM<? super AbstractC10668xG1>, Object> va0 = this.b1;
                this.Z0 = 1;
                obj = va0.i((AbstractC10668xG1) this.a1, this);
                if (obj == l) {
                    return l;
                }
            }
            AbstractC10668xG1 abstractC10668xG1 = (AbstractC10668xG1) obj;
            ((C2972Fn1) abstractC10668xG1).h();
            return abstractC10668xG1;
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

    public C9207rG1(PU<AbstractC10668xG1> pu) {
        C6562gT0.p(pu, "delegate");
        this.a = pu;
    }

    @Override // o.PU
    public Object a(VA0<? super AbstractC10668xG1, ? super HM<? super AbstractC10668xG1>, ? extends Object> va0, HM<? super AbstractC10668xG1> hm) {
        return this.a.a(new a(va0, null), hm);
    }

    @Override // o.PU
    public InterfaceC3882Ov0<AbstractC10668xG1> getData() {
        return this.a.getData();
    }
}
