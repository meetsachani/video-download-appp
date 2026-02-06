package o;

/* loaded from: classes.dex */
public final class BA0 {

    @FV(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", i = {0}, l = {173}, m = "reportWhenComplete", n = {"$this$reportWhenComplete"}, s = {"L$0"}, v = 1)
    /* loaded from: classes.dex */
    public static final class a extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public int a1;

        public a(HM<? super a> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            this.Z0 = obj;
            this.a1 |= Integer.MIN_VALUE;
            return BA0.a(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, o.kA2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(AA0 aa0, HA0<? super HM<? super C7458kA2>, ? extends Object> ha0, HM<? super C7458kA2> hm) {
        a aVar;
        int i;
        AA0 aa02;
        try {
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.a1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.a1 = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.Z0;
                    Object l = C7289jT0.l();
                    i = aVar.a1;
                    if (i == 0) {
                        if (i == 1) {
                            AA0 aa03 = (AA0) aVar.Y0;
                            RT1.n(obj);
                            aa02 = aa03;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        aa0.c();
                        if (aa0.e()) {
                            return C7458kA2.a;
                        }
                        aVar.Y0 = aa0;
                        aVar.a1 = 1;
                        aa02 = aa0;
                        if (ha0.invoke(aVar) == l) {
                            return l;
                        }
                    }
                    UP0.d(1);
                    aa02.h();
                    UP0.c(1);
                    aa0 = C7458kA2.a;
                    return aa0;
                }
            }
            if (i == 0) {
            }
            UP0.d(1);
            aa02.h();
            UP0.c(1);
            aa0 = C7458kA2.a;
            return aa0;
        } catch (Throwable th) {
            UP0.d(1);
            aa0.h();
            UP0.c(1);
            throw th;
        }
        aVar = new a(hm);
        Object obj2 = aVar.Z0;
        Object l2 = C7289jT0.l();
        i = aVar.a1;
    }

    public static final Object b(AA0 aa0, HA0<? super HM<? super C7458kA2>, ? extends Object> ha0, HM<? super C7458kA2> hm) {
        aa0.c();
        if (aa0.e()) {
            return C7458kA2.a;
        }
        try {
            ha0.invoke(hm);
            UP0.d(1);
            aa0.h();
            UP0.c(1);
            return C7458kA2.a;
        } catch (Throwable th) {
            UP0.d(1);
            aa0.h();
            UP0.c(1);
            throw th;
        }
    }
}
