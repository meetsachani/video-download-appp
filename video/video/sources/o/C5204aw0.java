package o;

import o.RP1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.aw0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C5204aw0 {

    @FV(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {13}, m = "count", n = {"i"}, s = {"L$0"})
    /* renamed from: o.aw0$a */
    /* loaded from: classes4.dex */
    public static final class a<T> extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public int a1;

        public a(HM<? super a> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Z0 = obj;
            this.a1 |= Integer.MIN_VALUE;
            return C4467Uv0.Y(null, this);
        }
    }

    /* renamed from: o.aw0$b */
    /* loaded from: classes4.dex */
    public static final class b<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ RP1.f X;

        public b(RP1.f fVar) {
            this.X = fVar;
        }

        @Override // o.InterfaceC4076Qv0
        public final Object c(T t, HM<? super C7458kA2> hm) {
            this.X.X++;
            return C7458kA2.a;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {25}, m = "count", n = {"i"}, s = {"L$0"})
    /* renamed from: o.aw0$c */
    /* loaded from: classes4.dex */
    public static final class c<T> extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public int a1;

        public c(HM<? super c> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Z0 = obj;
            this.a1 |= Integer.MIN_VALUE;
            return C4467Uv0.Z(null, null, this);
        }
    }

    /* renamed from: o.aw0$d */
    /* loaded from: classes4.dex */
    public static final class d<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ VA0<T, HM<? super Boolean>, Object> X;
        public final /* synthetic */ RP1.f Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", f = "Count.kt", i = {0}, l = {26}, m = "emit", n = {"this"}, s = {"L$0"})
        /* renamed from: o.aw0$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public Object Y0;
            public /* synthetic */ Object Z0;
            public final /* synthetic */ d<T> a1;
            public int b1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, HM<? super a> hm) {
                super(hm);
                this.a1 = dVar;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Z0 = obj;
                this.b1 |= Integer.MIN_VALUE;
                return this.a1.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0, RP1.f fVar) {
            this.X = va0;
            this.Y = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
        @Override // o.InterfaceC4076Qv0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(T t, HM<? super C7458kA2> hm) {
            a aVar;
            Object obj;
            int i;
            d<T> dVar;
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.b1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.b1 = i2 - Integer.MIN_VALUE;
                    obj = aVar.Z0;
                    Object l = C7289jT0.l();
                    i = aVar.b1;
                    if (i == 0) {
                        if (i == 1) {
                            dVar = (d) aVar.Y0;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        VA0<T, HM<? super Boolean>, Object> va0 = this.X;
                        aVar.Y0 = this;
                        aVar.b1 = 1;
                        obj = va0.i(t, aVar);
                        if (obj == l) {
                            return l;
                        }
                        dVar = this;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        dVar.Y.X++;
                    }
                    return C7458kA2.a;
                }
            }
            aVar = new a(this, hm);
            obj = aVar.Z0;
            Object l2 = C7289jT0.l();
            i = aVar.b1;
            if (i == 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
            return C7458kA2.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object a(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HM<? super Integer> hm) {
        a aVar;
        int i;
        RP1.f fVar;
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
                        fVar = (RP1.f) aVar.Y0;
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    RP1.f fVar2 = new RP1.f();
                    InterfaceC4076Qv0<? super Object> bVar = new b<>(fVar2);
                    aVar.Y0 = fVar2;
                    aVar.a1 = 1;
                    if (interfaceC3882Ov0.a(bVar, aVar) == l) {
                        return l;
                    }
                    fVar = fVar2;
                }
                return C10557wp.f(fVar.X);
            }
        }
        aVar = new a(hm);
        Object obj2 = aVar.Z0;
        Object l2 = C7289jT0.l();
        i = aVar.a1;
        if (i == 0) {
        }
        return C10557wp.f(fVar.X);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object b(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0, @NotNull HM<? super Integer> hm) {
        c cVar;
        int i;
        RP1.f fVar;
        if (hm instanceof c) {
            cVar = (c) hm;
            int i2 = cVar.a1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.a1 = i2 - Integer.MIN_VALUE;
                Object obj = cVar.Z0;
                Object l = C7289jT0.l();
                i = cVar.a1;
                if (i == 0) {
                    if (i == 1) {
                        fVar = (RP1.f) cVar.Y0;
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    RP1.f fVar2 = new RP1.f();
                    InterfaceC4076Qv0<? super Object> dVar = new d<>(va0, fVar2);
                    cVar.Y0 = fVar2;
                    cVar.a1 = 1;
                    if (interfaceC3882Ov0.a(dVar, cVar) == l) {
                        return l;
                    }
                    fVar = fVar2;
                }
                return C10557wp.f(fVar.X);
            }
        }
        cVar = new c(hm);
        Object obj2 = cVar.Z0;
        Object l2 = C7289jT0.l();
        i = cVar.a1;
        if (i == 0) {
        }
        return C10557wp.f(fVar.X);
    }
}
